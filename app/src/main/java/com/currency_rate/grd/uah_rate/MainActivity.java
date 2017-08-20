package com.currency_rate.grd.uah_rate;

//источники:
// https://bank.gov.ua/control/uk/publish/article?art_id=38441973   (ночью нету данных - пусто)
// http://webstrannik.ru/poluchit-kurs-dollara-evro-grivny-na-PHP.html
// http://finance.yahoo.com/webservice/v1/symbols/allcurrencies/quote
// https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20csv%20where%20url%3D%22http%3A%2F%2Ffinance.yahoo.com%2Fd%2Fquotes.csv%3Fe%3D.csv%26f%3Dnl1d1t1%26s%3Dusdeur%3DX%22%3B&format=json&callback=
// http://content.finance.ua/ru/xml/currency-cash
// http://meumobi.github.io/stocks%20apis/2016/03/13/get-realtime-stock-quotes-yahoo-finance-api.html

import android.app.DialogFragment;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.currency_rate.grd.uah_rate.model.UAHCurrencyRates;
import com.currency_rate.grd.uah_rate.utils.DataHelper;
import com.currency_rate.grd.uah_rate.view.InfoDialog;
import com.google.gson.Gson;


import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

// !!! может вылетать при первой установке - не обновляется список
public class MainActivity extends AppCompatActivity {

    TextView textView,textView2,textView3;
    Timer timer,timeRecords;
    // TimerTask taskRecordingTelemetry1;
    public static String LOG_TAG = "my_log";
    private static final String TAG = "myLogs";
    private final static String FILENAME = "my_sample.txt"; // имя файла
    //ArrayList<String> JSONList = new ArrayList<>();
    ArrayList<HashMap<String, String>> JSONList = new ArrayList<HashMap<String, String>>();
    String[] myDataset;

    boolean readyData = false;
    Context context;



    String urlData = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json";

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private SwipeRefreshLayout mSwipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        //context=getBaseContext();
        context = getApplicationContext();
        //context =MainActivity.this;

        //-----------------------------------


        // поток выполняется паралельно и программа идет дальше!!! но не успевает list  прочитать данные
        timer = new Timer();
        TimerTask task = new TimerTask() {

                    @Override
                    public void run() {
                        //  showInfo();
                        //showInfo2();
                        //showInfo3();
                        // showInfo4();
                        // showInfo5_JSON();

                           // CreateSensorArrayJSON();
                           // textView3.setText(" JSON Parse ");


                        //CreateSensorArrayJSON();

                       // new ParseTask().execute();


                       // showDatainGSON();

                      //  loadJSONOfWeb(urlData);
                        //  readJSONOfFile(FILENAME);
                        // convertJSONToMap(JSON_STRING3);
                      //  convertJSONToMap(readJSONOfFile(FILENAME));

                        //---------------purge in file ----------------------
                        /*
                        // отрываем поток для записи
                        BufferedWriter bw = null;
                        try {
                            bw = new BufferedWriter(new OutputStreamWriter(
                                    openFileOutput(FILENAME, MODE_PRIVATE)));
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                        // пишем данные
                        try {
                            bw.write("");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        // закрываем поток
                        try {
                            bw.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        */
                        //---------------------------------------------------
/*
                        new Thread(new Runnable() {
                            public void run() {
                                loadJSONOfWeb(urlData);
                                //  readJSONOfFile(FILENAME);
                                // convertJSONToMap(JSON_STRING3);
                                // convertJSONToMap(readJSONOfFile(FILENAME)); // dont work here !!!!!! becouse it it is thread local
                                // myDataset = showDataPrepareAll();



                            }
                        }).start();
                        */
                        // в асинхроннгом пежиме
                        new ParseTask().execute();



                       // startData();





                    }
        };
        timer.schedule(task, 0, 3_600_000);


        /*
        // //не потогает
        Thread t = new Thread(new Runnable() {
            @Override
            public void run(){

               // new ParseTask().execute();

            }
        });
        t.start();
        try {
            t.join();//wait till load data
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       // fillData();
       */


        //-----------------------------------

        /*
        if(readyData==true) {
           // fillData();//!!!Only the original thread that created a view hierarchy can touch its views.
        }
        else {
     //непотогает
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run(){

                    new ParseTask().execute();

                }
            });
            thread.start();
            try {
                thread.join();//wait till load data
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

           // fillData();
        }
        */


        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);
        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mSwipeRefreshLayout.setRefreshing(true);
                ( new Handler()).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(),"Refresh",Toast.LENGTH_SHORT).show();
                        //showAttention();
                        //startData();

                        // НЕ ОБНОВЛЯЕТСЯ
                         new ParseTask().execute();
                        fillData();

                        mSwipeRefreshLayout.setRefreshing(false);
                    }
                }, 4500);
            }
        });

        //-------------- recycle view ----------------------
        /*


        //String[] myDataset = getDataSet();
        // myDataset = showDataPrepareAll();
        //String[] myDataset = showDataPrepareCurrency();
        //String[] myDataset = showDataPrepareMetal();

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // если мы уверены, что изменения в контенте не изменят размер layout-а RecyclerView
        // передаем параметр true - это увеличивает производительность
        mRecyclerView.setHasFixedSize(true);

        // используем linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        // создаем адаптер
        mAdapter = new RecyclerAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
        */


        //--------------------------------------------------


    }//--End onCreate()

    public void startData() {

        new Thread(new Runnable() {
            public void run() {

                new ParseTask().execute();

                //loadJSONOfWeb(urlData);
                //  readJSONOfFile(FILENAME);
                // convertJSONToMap(JSON_STRING3);
                // convertJSONToMap(readJSONOfFile(FILENAME)); // dont work here !!!!!! becouse it it is thread local
                // myDataset = showDataPrepareAll();



            }
        }).start();
    }

    public void fillData(){



            mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

            // если мы уверены, что изменения в контенте не изменят размер layout-а RecyclerView
            // передаем параметр true - это увеличивает производительность
            mRecyclerView.setHasFixedSize(true);

            // используем linear layout manager
            mLayoutManager = new LinearLayoutManager(this);
            mRecyclerView.setLayoutManager(mLayoutManager);
            // создаем адаптер
            mAdapter = new RecyclerAdapter(myDataset);
            mRecyclerView.setAdapter(mAdapter);


    }


    //================================ AsynTask ================================
    //-------------------------------------------------------
    private class ParseTask extends AsyncTask<Void, Void, String> {

        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;
        String resultJson = "";

        DataHelper dataHelper = new DataHelper(context);

       // асихронное загрузка то есть последователно
        @Override
        protected String doInBackground(Void... params) {
            // получаем данные с внешнего ресурса

            dataHelper.loadJSONOfWeb(urlData);
            dataHelper.convertJSONToMap(dataHelper.readJSONOfFile(FILENAME));
            myDataset = dataHelper.showDataPrepareAll();



            return null;
        }

        @Override
        protected void onPostExecute(String strJson) {
            super.onPostExecute(strJson);
            fillData();


        }

        //-------------------------------------------------------
    }

    //---------------------menu_main---------------

    //Create menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        DialogFragment infoDialog = new InfoDialog();
        infoDialog.show(getFragmentManager(), "InfoApp");
        return true;

    }





}
