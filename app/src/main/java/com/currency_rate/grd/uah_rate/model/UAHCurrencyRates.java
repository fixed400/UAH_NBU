package com.currency_rate.grd.uah_rate.model;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by grd on 11/17/16.
 */

public class UAHCurrencyRates {

    private static final String TAG = "myLogs";


    ArrayList<HashMap<String, String>> mCurrencyList = new ArrayList<>();
//===========================================   filds DEFAULT   ====================================

    public String currencyNumber;
    public String currencyName;
    public String currencyRate;
    public String currencyCharCode;
    public String currencyExchangeData;



    public String  getCurrencyNumber() {
        return currencyNumber;
    }

    public void setCurrencyNumber(String currencyNumber) {
        this.currencyNumber = currencyNumber;
    }
    //.......................................................
    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }
    //.......................................................
    public String getCurrencyRate() {
        return currencyRate;
    }

    public void setCurrencyRate(String currencyRate) {
        this.currencyRate = currencyRate;
    }
    //.......................................................
    public String getCurrencyCharCode() {
        return currencyCharCode;
    }

    public void setCurrencyCharCode(String currencyCharCode) {
        this.currencyCharCode = currencyCharCode;
    }
    //.......................................................
    public String getCurrencyExchangeData() {
        return currencyExchangeData;
    }

    public void setCurrencyExchangeData(String currencyExchangeData) {
        this.currencyExchangeData = currencyExchangeData;
    }

//------------------------------------- 1 USD ------------------------------------------------------

    public String numberUAHUSD;
    public String nameUAHUSD;
    public String rateUAHUSD;
    public String charCodeUAHUSD;
    public String exchangeDataUAHUSD;

    public String getNumberUAHUSD() {
        return numberUAHUSD;
    }

    public void setNumberUAHUSD(String numberUAHUSD) {
        this.numberUAHUSD = numberUAHUSD;
    }

    //..............................................

    public String getNameUAHUSD() {
        return nameUAHUSD;
    }

    public void setNameUAHUSD(String nameUAHUSD) {
        this.nameUAHUSD = nameUAHUSD;
    }


    //..............................................

    public String getRateUAHUSD() {
        return rateUAHUSD;
    }

    public void setRateUAHUSD(String rateUAHUSD) {
        this.rateUAHUSD = rateUAHUSD;
    }


    //..............................................

    public String getCharCodeUAHUSD() {
        return charCodeUAHUSD;
    }

    public void setCharCodeUAHUSD(String charCodeUAHUSD) {
        this.charCodeUAHUSD = charCodeUAHUSD;
    }


    //..............................................

    public String getExchangeDataUAHUSD() {
        return exchangeDataUAHUSD;
    }

    public void setExchangeDataUAHUSD(String exchangeDataUAHUSD) {
        this.exchangeDataUAHUSD = exchangeDataUAHUSD;
    }


    //------------------------------------- 2 EUR  -------------------------------------------------

    public String numberUAHEUR;
    public String nameUAHEUR;
    public String rateUAHEUR;
    public String charCodeUAHEUR;
    public String exchangeDataUAHEUR;


    public String getNumberUAHEUR() {
        return numberUAHEUR;
    }

    public void setNumberUAHEUR(String numberUAHEUR) {
        this.numberUAHEUR = numberUAHEUR;
    }

    //.......................................................

    public String getNameUAHEUR() {
        return nameUAHEUR;
    }

    public void setNameUAHEUR(String nameUAHEUR) {
        this.nameUAHEUR = nameUAHEUR;
    }

    //.......................................................

    public String getRateUAHEUR() {
        return rateUAHEUR;
    }

    public void setRateUAHEUR(String rateUAHEUR) {
        this.rateUAHEUR = rateUAHEUR;
    }

    //.......................................................

    public String getCharCodeUAHEUR() {
        return charCodeUAHEUR;
    }

    public void setCharCodeUAHEUR(String charCodeUAHEUR) {
        this.charCodeUAHEUR = charCodeUAHEUR;
    }

    //.......................................................
    public String getExchangeDataUAHEUR() {
        return exchangeDataUAHEUR;
    }

    public void setExchangeDataUAHEUR(String exchangeDataUAHEUR) {
        this.exchangeDataUAHEUR = exchangeDataUAHEUR;
    }


    //------------------------------------- 3 RUB  --------------------------------------------------

    public String numberUAHRUB;
    public String nameUAHRUB;
    public String rateUAHRUB;
    public String charCodeUAHRUB;
    public String exchangeDataUAHRUB;

    public String getNumberUAHRUB() {
        return numberUAHRUB;
    }

    public void setNumberUAHRUB(String numberUAHRUB) {
        this.numberUAHRUB = numberUAHRUB;
    }

    //.......................................................

    public String getNameUAHRUB() {
        return nameUAHRUB;
    }

    public void setNameUAHRUB(String nameUAHRUB) {
        this.nameUAHRUB = nameUAHRUB;
    }
    //.......................................................

    public String getRateUAHRUB() {
        return rateUAHRUB;
    }

    public void setRateUAHRUB(String rateUAHRUB) {
        this.rateUAHRUB = rateUAHRUB;
    }

    //.......................................................

    public String getCharCodeUAHRUB() {
        return charCodeUAHRUB;
    }

    public void setCharCodeUAHRUB(String charCodeUAHRUB) {
        this.charCodeUAHRUB = charCodeUAHRUB;
    }

    //.......................................................

    public String getExchangeDataUAHRUB() {
        return exchangeDataUAHRUB;
    }

    public void setExchangeDataUAHRUB(String exchangeDataUAHRUB) {
        this.exchangeDataUAHRUB = exchangeDataUAHRUB;
    }


    //------------------------------------- 4  GBP  ------------------------------------------------
    public String numberUAHGBP;
    public String nameUAHGBP;
    public String rateUAHGBP;
    public String charCodeUAHGBP;
    public String exchangeDataUAHGBP;

    //.......................................

    public String getNumberUAHGBP() {
        return numberUAHGBP;
    }

    public void setNumberUAHGBP(String numberUAHGBP) {
        this.numberUAHGBP = numberUAHGBP;
    }

    //.......................................


    public String getNameUAHGBP() {
        return nameUAHGBP;
    }

    public void setNameUAHGBP(String nameUAHGBP) {
        this.nameUAHGBP = nameUAHGBP;
    }


    //.......................................
    public String getRateUAHGBP() {
        return rateUAHGBP;
    }

    public void setRateUAHGBP(String rateUAHGBP) {
        this.rateUAHGBP = rateUAHGBP;
    }


    //.......................................
    public String getCharCodeUAHGBP() {
        return charCodeUAHGBP;
    }

    public void setCharCodeUAHGBP(String charCodeUAHGBP) {
        this.charCodeUAHGBP = charCodeUAHGBP;
    }


    //.......................................
    public String getExchangeDataUAHGBP() {
        return exchangeDataUAHGBP;
    }

    public void setExchangeDataUAHGBP(String exchangeDataUAHGBP) {
        this.exchangeDataUAHGBP = exchangeDataUAHGBP;
    }


    //------------------------------------- 5 PLN  -------------------------------------------------

    public String numberUAHPLN;
    public String nameUAHPLN;
    public String rateUAHPLN;
    public String charCodeUAHPLN;
    public String exchangeDataUAHPLN;

    public String getNumberUAHPLN() {
        return numberUAHPLN;
    }

    public void setNumberUAHPLN(String numberUAHPLN) {
        this.numberUAHPLN = numberUAHPLN;
    }

    //..................................

    public String getNameUAHPLN() {
        return nameUAHPLN;
    }

    public void setNameUAHPLN(String nameUAHPLN) {
        this.nameUAHPLN = nameUAHPLN;
    }


    //..................................

    public String getRateUAHPLN() {
        return rateUAHPLN;
    }

    public void setRateUAHPLN(String rateUAHPLN) {
        this.rateUAHPLN = rateUAHPLN;
    }


    //..................................

    public String getCharCodeUAHPLN() {
        return charCodeUAHPLN;
    }

    public void setCharCodeUAHPLN(String charCodeUAHPLN) {
        this.charCodeUAHPLN = charCodeUAHPLN;
    }


    //..................................

    public String getExchangeDataUAHPLN() {
        return exchangeDataUAHPLN;
    }

    public void setExchangeDataUAHPLN(String exchangeDataUAHPLN) {
        this.exchangeDataUAHPLN = exchangeDataUAHPLN;
    }

    //-------------------------------------BYN-------------------------------------------------------
    public String numberUAHBYN;
    public String nameUAHBYN;
    public String rateUAHBYN;
    public String charCodeUAHBYN;
    public String exchangeDataUAHBYN;


    public String getNumberUAHBYN() {
        return numberUAHBYN;
    }

    public void setNumberUAHBYN(String numberUAHBYN) {
        this.numberUAHBYN = numberUAHBYN;
    }

    //.......................................
    public String getNameUAHBYN() {
        return nameUAHBYN;
    }

    public void setNameUAHBYN(String nameUAHBYN) {
        this.nameUAHBYN = nameUAHBYN;
    }


    //.......................................

    public String getRateUAHBYN() {
        return rateUAHBYN;
    }

    public void setRateUAHBYN(String rateUAHBYN) {
        this.rateUAHBYN = rateUAHBYN;
    }

    //.......................................

    public String getCharCodeUAHBYN() {
        return charCodeUAHBYN;
    }

    public void setCharCodeUAHBYN(String charCodeUAHBYN) {
        this.charCodeUAHBYN = charCodeUAHBYN;
    }

    //.......................................

    public String getExchangeDataUAHBYN() {
        return exchangeDataUAHBYN;
    }

    public void setExchangeDataUAHBYN(String exchangeDataUAHBYN) {
        this.exchangeDataUAHBYN = exchangeDataUAHBYN;
    }


    //----------------------------------------------------------------------------------------------

    //=============================== METALs =======================================================


    //------------------------------------- 5 GOLD XAU ---------------------------------------------

    public String numberUAHGoldXAU;
    public String nameUAHGoldXAU;
    public String rateUAHGoldXAU;
    public String charCodeUAHGoldXAU;
    public String exchangeDataUAHGoldXAU;
    //.......................................
    public String getNumberUAHGoldXAU() {
        return numberUAHGoldXAU;
    }

    public void setNumberUAHGoldXAU(String numberUAHGoldXAU) {
        this.numberUAHGoldXAU = numberUAHGoldXAU;
    }


    //.......................................

    public String getNameUAHGoldXAU() {
        return nameUAHGoldXAU;
    }

    public void setNameUAHGoldXAU(String nameUAHGoldXAU) {
        this.nameUAHGoldXAU = nameUAHGoldXAU;
    }


    //.......................................

    public String getRateUAHGoldXAU() {
        return rateUAHGoldXAU;
    }

    public void setRateUAHGoldXAU(String rateUAHGoldXAU) {
        this.rateUAHGoldXAU = rateUAHGoldXAU;
    }


    //.......................................

    public String getCharCodeUAHGoldXAU() {
        return charCodeUAHGoldXAU;
    }

    public void setCharCodeUAHGoldXAU(String charCodeUAHGoldXAU) {
        this.charCodeUAHGoldXAU = charCodeUAHGoldXAU;
    }


    //.......................................

    public String getExchangeDataUAHGoldXAU() {
        return exchangeDataUAHGoldXAU;
    }

    public void setExchangeDataUAHGoldXAU(String exchangeDataUAHGoldXAU) {
        this.exchangeDataUAHGoldXAU = exchangeDataUAHGoldXAU;
    }


    //.......................................

    //------------------------------------- 5 Silver XAU -------------------------------------------

    public String numberUAHSilverXAG;
    public String rateUAHSilverXAG;
    public String nameUAHSilverXAG;
    public String charCodeUAHSilverXAG;
    public String exchangeDataUAHSilverXAG;


    public String getNumberUAHSilverXAG() {
        return numberUAHSilverXAG;
    }

    public void setNumberUAHSilverXAG(String numberUAHSilverXAG) {
        this.numberUAHSilverXAG = numberUAHSilverXAG;
    }


    //.......................................

    public String getNameUAHSilverXAG() {
        return nameUAHSilverXAG;
    }

    public void setNameUAHSilverXAG(String nameUAHSilverXAG) {
        this.nameUAHSilverXAG = nameUAHSilverXAG;
    }

    //.......................................


    public String getRateUAHSilverXAG() {
        return rateUAHSilverXAG;
    }

    public void setRateUAHSilverXAG(String rateUAHSilverXAG) {
        this.rateUAHSilverXAG = rateUAHSilverXAG;
    }


    //.......................................

    public String getCharCodeUAHSilverXAG() {
        return charCodeUAHSilverXAG;
    }

    public void setCharCodeUAHSilverXAG(String charCodeUAHSilverXAG) {
        this.charCodeUAHSilverXAG = charCodeUAHSilverXAG;
    }


    //.......................................

    public String getExchangeDataUAHSilverXAG() {
        return exchangeDataUAHSilverXAG;
    }

    public void setExchangeDataUAHSilverXAG(String exchangeDataUAHSilverXAG) {
        this.exchangeDataUAHSilverXAG = exchangeDataUAHSilverXAG;
    }

    //============================================ Constructor =====================================
    public UAHCurrencyRates(ArrayList<HashMap<String, String>> myListArray) {
        this.mCurrencyList = myListArray;

        ParseDataTwoArray();
    }

    //============================================ Methods =========================================

    private void ParseDataTwoArray() {

        Log.w(TAG, "--ParseDataTwoArray");
        int loopList=0;

        for(HashMap cell : mCurrencyList){
            loopList++;

            Log.d(TAG, " ---loopOne "+ loopList);

            //-------------------------------------
            // HashMap<String, String> hMap = new HashMap<String, String>();
            Map<String, String> hMap = new HashMap<String, String>();
            hMap = cell;
            int loopMap =0;
            // -- sour out 0 key: value
            for (Map.Entry content : hMap.entrySet()) {
                loopMap++;
                Log.d(TAG, " ---====## loop====Two "+ loopMap+"##===---- ");

                String key1,key2,key3,key4,key5;
                key1 = "r030";
                key2 = "txt";
                key3 = "rate";
                key4 = "cc";
                key5 = "exchangedate";

                //------------ перременные для перехода на следующий цикл---------------------------

                String valueContent = new String(String.valueOf(content.getValue()));

                switch (valueContent)
                {
                    case "UAH1" :
                        for(Map.Entry entry1 : hMap.entrySet()) {
                            Log.d(TAG, "±±±±±±±±±± UAH ±±±±±±±±±±");
                            if ( 0  == key1.compareTo(String.valueOf(entry1.getKey()))) {
                                setCurrencyNumber(String.valueOf(entry1.getValue()));
                            }
                            if ( 0  == key2.compareTo(String.valueOf(entry1.getKey()))) {
                                setCurrencyName(String.valueOf(entry1.getValue()));
                            }

                            if ( 0  == key3.compareTo(String.valueOf(entry1.getKey()))) {
                                setCurrencyCharCode(String.valueOf(entry1.getValue()));
                            }

                            if ( 0  == key4.compareTo(String.valueOf(entry1.getKey()))) {
                                setCurrencyCharCode(String.valueOf(entry1.getValue()));
                            }
                            if ( 0  == key5.compareTo(String.valueOf(entry1.getKey()))) {
                                setCurrencyExchangeData(String.valueOf(entry1.getValue()));
                            }
                        }

                        break;
                    case  "USD":
                        for(Map.Entry entry2 : hMap.entrySet()) {
                            Log.d(TAG, "±±±±±±±±±± USD ±±±±±±±±±±");
                            if ( 0  == key1.compareTo(String.valueOf(entry2.getKey()))) {
                                setNumberUAHUSD(String.valueOf(entry2.getValue()));
                            }
                            if ( 0  == key2.compareTo(String.valueOf(entry2.getKey()))) {
                                setNameUAHUSD(String.valueOf(entry2.getValue()));
                            }

                            if ( 0  == key3.compareTo(String.valueOf(entry2.getKey()))) {
                                setRateUAHUSD(String.valueOf(entry2.getValue()));
                            }

                            if ( 0  == key4.compareTo(String.valueOf(entry2.getKey()))) {
                                setCharCodeUAHUSD(String.valueOf(entry2.getValue()));
                            }
                            if ( 0  == key5.compareTo(String.valueOf(entry2.getKey()))) {
                                setExchangeDataUAHUSD(String.valueOf(entry2.getValue()));
                            }
                        }
                        break;
                    case  "EUR":
                        for(Map.Entry entry : hMap.entrySet()) {
                            Log.d(TAG, "±±±±±±±±±± EUR ±±±±±±±±±±");
                            if ( 0  == key1.compareTo(String.valueOf(entry.getKey()))) {
                                setNumberUAHEUR(String.valueOf(entry.getValue()));
                            }
                            if ( 0  == key2.compareTo(String.valueOf(entry.getKey()))) {
                                setNameUAHEUR(String.valueOf(entry.getValue()));
                            }

                            if ( 0  == key3.compareTo(String.valueOf(entry.getKey()))) {
                                setRateUAHEUR(String.valueOf(entry.getValue()));
                            }

                            if ( 0  == key4.compareTo(String.valueOf(entry.getKey()))) {
                                setCharCodeUAHEUR(String.valueOf(entry.getValue()));
                            }
                            if ( 0  == key5.compareTo(String.valueOf(entry.getKey()))) {
                                setExchangeDataUAHEUR(String.valueOf(entry.getValue()));
                            }
                        }
                        break;
                    case "RUB":
                        for(Map.Entry entry : hMap.entrySet()) {
                            Log.d(TAG, "±±±±±±±±±± RUB ±±±±±±±±±±");
                            if ( 0  == key1.compareTo(String.valueOf(entry.getKey()))) {
                                setNumberUAHRUB(String.valueOf(entry.getValue()));
                            }
                            if ( 0  == key2.compareTo(String.valueOf(entry.getKey()))) {
                                setNameUAHRUB(String.valueOf(entry.getValue()));
                            }

                            if ( 0  == key3.compareTo(String.valueOf(entry.getKey()))) {
                                setRateUAHRUB(String.valueOf(entry.getValue()));
                            }

                            if ( 0  == key4.compareTo(String.valueOf(entry.getKey()))) {
                                setCharCodeUAHRUB(String.valueOf(entry.getValue()));
                            }
                            if ( 0  == key5.compareTo(String.valueOf(entry.getKey()))) {
                                setExchangeDataUAHRUB(String.valueOf(entry.getValue()));
                            }
                        }
                        break;
                    case "GBP":
                        for(Map.Entry entry : hMap.entrySet()) {
                            Log.d(TAG, "±±±±±±±±±± GBP ±±±±±±±±±±");
                            if ( 0  == key1.compareTo(String.valueOf(entry.getKey()))) {
                                setNumberUAHGBP(String.valueOf(entry.getValue()));
                            }
                            if ( 0  == key2.compareTo(String.valueOf(entry.getKey()))) {
                                setNameUAHGBP(String.valueOf(entry.getValue()));
                            }

                            if ( 0  == key3.compareTo(String.valueOf(entry.getKey()))) {
                                setRateUAHGBP(String.valueOf(entry.getValue()));
                            }

                            if ( 0  == key4.compareTo(String.valueOf(entry.getKey()))) {
                                setCharCodeUAHGBP(String.valueOf(entry.getValue()));
                            }
                            if ( 0  == key5.compareTo(String.valueOf(entry.getKey()))) {
                                setExchangeDataUAHGBP(String.valueOf(entry.getValue()));
                            }
                        }
                        break;
                    case "PLN":
                        for(Map.Entry entry : hMap.entrySet()) {
                            Log.d(TAG, "±±±±±±±±±± PLN ±±±±±±±±±±");
                            if ( 0  == key1.compareTo(String.valueOf(entry.getKey()))) {
                                setNumberUAHPLN(String.valueOf(entry.getValue()));
                            }
                            if ( 0  == key2.compareTo(String.valueOf(entry.getKey()))) {
                                setNameUAHPLN(String.valueOf(entry.getValue()));
                            }

                            if ( 0  == key3.compareTo(String.valueOf(entry.getKey()))) {
                                setRateUAHPLN(String.valueOf(entry.getValue()));
                            }

                            if ( 0  == key4.compareTo(String.valueOf(entry.getKey()))) {
                                setCharCodeUAHPLN(String.valueOf(entry.getValue()));
                            }
                            if ( 0  == key5.compareTo(String.valueOf(entry.getKey()))) {
                                setExchangeDataUAHPLN(String.valueOf(entry.getValue()));
                            }
                        }
                        break;
                    case "BYN":
                        for(Map.Entry entry : hMap.entrySet()) {
                            Log.d(TAG, "±±±±±±±±±± BYN ±±±±±±±±±±");
                            if ( 0  == key1.compareTo(String.valueOf(entry.getKey()))) {
                                setNumberUAHBYN(String.valueOf(entry.getValue()));
                            }
                            if ( 0  == key2.compareTo(String.valueOf(entry.getKey()))) {
                                setNameUAHBYN(String.valueOf(entry.getValue()));
                            }

                            if ( 0  == key3.compareTo(String.valueOf(entry.getKey()))) {
                                setRateUAHBYN(String.valueOf(entry.getValue()));
                            }

                            if ( 0  == key4.compareTo(String.valueOf(entry.getKey()))) {
                                setCharCodeUAHBYN(String.valueOf(entry.getValue()));
                            }
                            if ( 0  == key5.compareTo(String.valueOf(entry.getKey()))) {
                                setExchangeDataUAHBYN(String.valueOf(entry.getValue()));
                            }
                        }
                        break;
                    case "XAU":
                        for(Map.Entry entry : hMap.entrySet()) {
                            Log.d(TAG, "±±±±±±±±±± XAU gold ±±±±±±±±±±");
                            if ( 0  == key1.compareTo(String.valueOf(entry.getKey()))) {
                                setNumberUAHGoldXAU(String.valueOf(entry.getValue()));
                            }
                            if ( 0  == key2.compareTo(String.valueOf(entry.getKey()))) {
                                setNameUAHGoldXAU(String.valueOf(entry.getValue()));
                            }

                            if ( 0  == key3.compareTo(String.valueOf(entry.getKey()))) {
                                setRateUAHGoldXAU(String.valueOf(entry.getValue()));
                            }

                            if ( 0  == key4.compareTo(String.valueOf(entry.getKey()))) {
                                setCharCodeUAHGoldXAU(String.valueOf(entry.getValue()));
                            }
                            if ( 0  == key5.compareTo(String.valueOf(entry.getKey()))) {
                                setExchangeDataUAHGoldXAU(String.valueOf(entry.getValue()));
                            }
                        }
                        break;
                    case "XAG":
                        for(Map.Entry entry : hMap.entrySet()) {
                            Log.d(TAG, "±±±±±±±±±± XAG silver ±±±±±±±±±±");
                            if ( 0  == key1.compareTo(String.valueOf(entry.getKey()))) {
                                setNumberUAHSilverXAG(String.valueOf(entry.getValue()));
                            }
                            if ( 0  == key2.compareTo(String.valueOf(entry.getKey()))) {
                                setNameUAHSilverXAG(String.valueOf(entry.getValue()));
                            }

                            if ( 0  == key3.compareTo(String.valueOf(entry.getKey()))) {
                                setRateUAHSilverXAG(String.valueOf(entry.getValue()));
                            }

                            if ( 0  == key4.compareTo(String.valueOf(entry.getKey()))) {
                                setCharCodeUAHSilverXAG(String.valueOf(entry.getValue()));
                            }
                            if ( 0  == key5.compareTo(String.valueOf(entry.getKey()))) {
                                setExchangeDataUAHSilverXAG(String.valueOf(entry.getValue()));
                            }
                        }
                        break;
                    // default: monthString = "Не знаем такого";
                    //break;

                } // END switch

            }

        }

    }

}
