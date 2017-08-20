package com.currency_rate.grd.uah_rate.utils;

import android.util.Log;

import com.currency_rate.grd.uah_rate.model.UAHCurrencyRates;

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


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.currency_rate.grd.uah_rate.model.UAHCurrencyRates;

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


import android.annotation.TargetApi;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Build;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by grd on 7/30/17.
 */

public class DataHelper extends ContextWrapper {


    public static String LOG_TAG = "log_DataHelper";
    private final static String FILENAME = "my_sample.txt"; // имя файла
    String urlData = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json";
    boolean readyData = false;
    ArrayList<HashMap<String, String>> JSONList = new ArrayList<HashMap<String, String>>();

    public DataHelper(Context base) {
        super(base);
    }


    //-----------------------------------------------

    public void loadJSONOfWeb(String hostData){
        //public String loadJSONOfWeb(String hostData){

        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;
        String resultJson = "";

        try {
            //URL url = new URL("http://androiddocs.ru/api/friends.json");


            URL url = new URL(hostData);
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            //...............................................................
            InputStream inputStream = urlConnection.getInputStream();
            StringBuffer buffer = new StringBuffer();

            reader = new BufferedReader(new InputStreamReader(inputStream));

            //...............................................................

            //StringBuffer buffer = new StringBuffer();
            String line;
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
                //resultJson = line;
                Log.d(LOG_TAG,"%%%%%%%%###=line is  = "+line);

            }

            resultJson = buffer.toString();



            //temp
            // resultJson = NBUParse();

            // plus    +
            //---------------save in file ----------------------
            // отрываем поток для записи
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                    openFileOutput(FILENAME, MODE_PRIVATE)));
            // пишем данные
            bw.write(resultJson.toString());
            // закрываем поток
            bw.close();
            readyData = true;
            //---------------------------------------------------


        } catch (MalformedURLException e) {
            Log.e(LOG_TAG, "MalformedURLException: " + e.getMessage());
        } catch (ProtocolException e) {
            Log.e(LOG_TAG, "ProtocolException: " + e.getMessage());
        } catch (IOException e) {
            Log.e(LOG_TAG, "IOException: " + e.getMessage());
        } catch (Exception e) {
            Log.e(LOG_TAG, "Exception: " + e.getMessage());
            Log.d(LOG_TAG,"!!!!!!!!!!!!! ------ catch (Exception e) = "+e.getMessage());//test
            Log.d(LOG_TAG,"!!!!!!!!!!!!! ------ Соединение и запись должно проходить в не   UI потоке"+e.getMessage());//test
        }

        Log.d(LOG_TAG,"@@@@@@@@@=File contain  = "+resultJson);

        //  return resultJson;

    } //--End loadJSONOfWeb();

    //-----------------------------------------------
    public String readJSONOfFile(String file_data) {

        String res ="Something...";
        //проверка на существование записи в файле
        File f = getFileStreamPath(file_data);//some FILENAME
        if (f.length() != 0) {

            try {
                //Открыть поток для для открытия файла - физически
                InputStream inputStream = openFileInput(FILENAME);
                //t reads bytes and decodes them into characters using a specified charset - он читает байты и декодирует их в символы, используя указанную кодировку.
                InputStreamReader isr = new InputStreamReader(inputStream);
                //Использование буфера призвано увеличить производительность чтения данных из потока.
                BufferedReader bfReader = new BufferedReader(isr);

                //потокобезопасный  буферстрок
                StringBuilder builder = new StringBuilder();
                StringBuffer buffer = new StringBuffer();
                String line ="";

                //читаем содержимое из фаайла
                /*
                while((line = bfReader.readLine()) != null){
                    Log.d(LOG_TAG, line);
                    JSON_STRING = line;

                }
                */
                while ((line = bfReader.readLine()) != null) {
                    buffer.append(line);
                }
                //resultJson = buffer.toString();
                //JSON_STRING = line;
                res = buffer.toString();

            } catch (FileNotFoundException e) {
                //e.getMessage();
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            // обновить данные и записать в файл
            //saveJSONInFile(loadJSONOfWeb(hostData));
            //  Can't create handler inside thread that has not called Looper.prepare()
            // Toast.makeText(this, "Проверте подключение к интернет. \nOбновите данные", Toast.LENGTH_SHORT).show();
            Log.d(LOG_TAG, "Файл пустой ! Обновите данные с сети. ");
            res = null;
        }
        return res;
    }

    //-----------------------------------------------
    public void convertJSONToMap(String j){
        // public void convertJSONToMap(){

        String jsonString  = j;

        if(jsonString != null) {

            try {

                // JSONObject jsonObject = new JSONObject(jsonString);
                JSONArray jsonArray = new JSONArray(jsonString);
                // JSONArray jsonArray = jsonObject.getJSONObject("query").getJSONObject("results").getJSONArray("rate");

                StringBuilder builder = new StringBuilder();
                StringBuilder builder2 = new StringBuilder();
                StringBuffer buffer = new StringBuffer();

                String valueD, valueE;
                for (int i = 0; i < jsonArray.length(); i++) {
                    Log.d(LOG_TAG, "Это цикл " + i);
                    JSONObject objectInArray = jsonArray.getJSONObject(i);
                    Map<String, String> hmap = new HashMap<String, String>();

                    //----------------------------------------------------------------------------------
                    //итератор - пребор элементов объкета,массива,колллекции ...
                    Iterator key = objectInArray.keys();
                    //  Перебрать и записать в колеекцию  например HashMap контенер птом читать с колекции
                    int loop = 0; //-1;
                    while (key.hasNext()) {
                        String k = key.next().toString();
                        loop++;
                        //names[i]
                        hmap.put(k, objectInArray.getString(k));
                        String valueS = "Key : " + k + ", value : " + objectInArray.getString(k);
                        Log.d(LOG_TAG, "Key : " + k + ", value : " + objectInArray.getString(k));
                    }
                    //----------------------------------------------------------------------------------
                    JSONList.add((HashMap<String, String>) hmap);
                    // myList.add(i, (HashMap<String, String>) hmap);

                    // Log.d(TAG, objectInArray.toString());
                    Log.d(LOG_TAG, "=/=/=/=/=/=/=/=/=/=/=/= quantity(amount) List item(s) "+JSONList.size());
                }
                //-------------------------------------------------
            } catch (Exception e) {
                e.printStackTrace();
                // textView3.setText("Ошибка  Конвертации catch ");
                Log.d(LOG_TAG, " Ошибка  Конвертации catch ! ");
            } // !
        }else{
            Log.d(LOG_TAG, " JSON_STRING  - Пустая ! ");
            // textView3.setText("JSON_STRING  - Пустая !");
        }
    }
    // -----------------------------------------------



    //---------------------------------------------------------------------
    public String[] showDataPrepareAll(){

        UAHCurrencyRates parseList = new UAHCurrencyRates(JSONList);

        //.........................USD ..................................
        //numberUAHEUR
        String txtValueUAHUSD =parseList.getNameUAHUSD();
        String rateValueUAHUSD = parseList.getRateUAHUSD();

        String numberValueUAHUSD = parseList.getNumberUAHUSD();
        String ccValueUAHUSD = parseList.getCharCodeUAHUSD();
        String edValueUAHUSD = parseList.getExchangeDataUAHUSD();
        //.........................EUR..................................

        String numberValueUAHEUR = parseList.getNumberUAHEUR();
        String txtValueUAHEUR =parseList.getNameUAHEUR();
        String rateValueUAHEUR = parseList.getRateUAHEUR();

        String ccValueUAHEUR = parseList.getCharCodeUAHEUR();
        String edValueUAHEUR = parseList.getExchangeDataUAHEUR();
        //........................RUB...................................

        String numberValueUAHRUB = parseList.getNumberUAHRUB();
        String txtValueUAHRUB =parseList.getNameUAHRUB();
        String rateValueUAHRUB = parseList.getRateUAHRUB();
        String ccValueUAHRUB = parseList.getCharCodeUAHRUB();
        String edValueUAHRUB = parseList.getExchangeDataUAHRUB();
        //.......................PLN....................................
        String numberValueUAHPLN = parseList.getNumberUAHPLN();
        String txtValueUAHPLN =parseList.getNameUAHPLN();
        String rateValueUAHPLN = parseList.getRateUAHPLN();
        String ccValueUAHPLN = parseList.getCharCodeUAHPLN();
        String edValueUAHPLN = parseList.getExchangeDataUAHPLN();

        //........................GBP...................................
        String numberValueUAHGBP = parseList.getNumberUAHGBP();
        String txtValueUAHGBP =parseList.getNameUAHGBP();
        String rateValueUAHGBP = parseList.getRateUAHGBP();
        String ccValueUAHGBP = parseList.getCharCodeUAHGBP();
        String edValueUAHGBP = parseList.getExchangeDataUAHGBP();

        //........................BYN...................................
        String numberValueUAHBYN = parseList.getNumberUAHBYN();
        String txtValueUAHBYN =parseList.getNameUAHBYN();
        String rateValueUAHBYN = parseList.getRateUAHBYN();
        String ccValueUAHBYN = parseList.getCharCodeUAHBYN();
        String edValueUAHBYN = parseList.getExchangeDataUAHBYN();

        //.........................GOLD XAU..................................
        String numberValueGold = parseList.getNumberUAHGoldXAU();
        String txtValueGold =parseList.getNameUAHGoldXAU();
        String rateValueGold = parseList.getRateUAHGoldXAU();
        String ccValueGold = parseList.getCharCodeUAHGoldXAU();
        String edValueGold = parseList.getExchangeDataUAHGoldXAU();

        //.......................... Silver XAG .................................
        String numberValueSilver = parseList.getNumberUAHSilverXAG();
        String txtValueSilver =parseList.getNameUAHSilverXAG();
        String rateValueSilver = parseList.getRateUAHSilverXAG();
        String ccValueSilver = parseList.getCharCodeUAHSilverXAG();
        String edValueSilver = parseList.getExchangeDataUAHSilverXAG();
        //...........................................................


        //  textView3.setText("Вывод с showDataPrepare " +n+" "+r+"\n"+r2+""+n2);
        //   textView3.setText("Вывод с showDataPrepare " +n+" "+r+" "+cr);

        String uahusdAall = numberValueUAHUSD+" - "+txtValueUAHUSD+" - "+ccValueUAHUSD +" - "+edValueUAHUSD+" - "+rateValueUAHUSD;
        String uahusd = txtValueUAHUSD+" ("+ccValueUAHUSD +") - "+edValueUAHUSD+" - "+rateValueUAHUSD+" UAH";
        String uaheurAll = numberValueUAHUSD+" - "+txtValueUAHUSD+" - "+ccValueUAHUSD +" - "+edValueUAHUSD+" - "+rateValueUAHUSD;
        String uaheur = txtValueUAHEUR+" ("+ccValueUAHEUR +") - "+edValueUAHEUR+" - "+rateValueUAHEUR+" UAH";
        String uahrub = txtValueUAHRUB+" ("+ccValueUAHRUB +") - "+edValueUAHRUB+" - "+rateValueUAHRUB+" UAH";
        String uahpln= txtValueUAHPLN+" ("+ccValueUAHPLN +") - "+edValueUAHPLN+" - "+rateValueUAHPLN+" UAH";
        String uahgbp = txtValueUAHGBP+" ("+ccValueUAHGBP +") - "+edValueUAHGBP+" - "+rateValueUAHGBP+" UAH";
        String uahbyn = txtValueUAHBYN+" ("+ccValueUAHBYN +") - "+edValueUAHBYN+" - "+rateValueUAHBYN+" UAH";

        //  за 10 тройских унций
        String uahgold = txtValueGold+" ("+ccValueGold +") - "+edValueGold+" - "+rateValueGold+" UAH (за 10 тройських унцій)";
        String uahsilver = txtValueSilver+" ("+ccValueSilver +") - "+edValueSilver+" - "+rateValueSilver+" UAH (за 10 тройських унцій)";

        // String [] recycleVievArray = new String[6];
        String [] recycleVievArray = {uahusd,uaheur,uahrub,uahpln,uahgbp,uahbyn};

        String [] recycleVievArrayAll = {uahusd,uaheur,uahrub,uahpln,uahgbp,uahbyn,uahgold,uahsilver};


        return  recycleVievArrayAll;

    }
    // --------------------------------------------------------------------
}
