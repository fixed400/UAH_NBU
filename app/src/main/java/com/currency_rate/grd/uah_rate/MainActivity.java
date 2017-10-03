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

public class MainActivity extends AppCompatActivity {


    Timer timer;
    public static String LOG_TAG = "my_log";
    private static final String TAG = "myLogs";
    private final static String FILENAME = "my_sample.txt";
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
        context = getApplicationContext();
        timer = new Timer();
        TimerTask task = new TimerTask() {

                    @Override
                    public void run() {
                        new ParseTask().execute();
                    }
        };
        timer.schedule(task, 0, 3_600_000);


        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);
        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mSwipeRefreshLayout.setRefreshing(true);
                ( new Handler()).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(),"Refresh",Toast.LENGTH_SHORT).show();

                         new ParseTask().execute();
                        fillData();

                        mSwipeRefreshLayout.setRefreshing(false);
                    }
                }, 4500);
            }
        });



    }//--End onCreate()

    public void fillData(){

            mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
            mRecyclerView.setHasFixedSize(true);
            mLayoutManager = new LinearLayoutManager(this);
            mRecyclerView.setLayoutManager(mLayoutManager);
            mAdapter = new RecyclerAdapter(myDataset);
            mRecyclerView.setAdapter(mAdapter);
    }
    private class ParseTask extends AsyncTask<Void, Void, String> {

        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;
        String resultJson = "";

        DataHelper dataHelper = new DataHelper(context);
        @Override
        protected String doInBackground(Void... params) {
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
    }

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
