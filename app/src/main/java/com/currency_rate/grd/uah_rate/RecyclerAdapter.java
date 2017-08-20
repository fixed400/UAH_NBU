package com.currency_rate.grd.uah_rate;

/**
 * Created by grd on 11/18/16.
 */

//  http://androiddocs.ru/vidzhet-recyclerview-prostoj-primer/

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private String[] mDataset;
    private String[] mDataset2;
    private String[] mDataset3;
    private String[] mDataset4;

    /*
    public static Integer[] arrayImg={

            R.drawable.eur_usd_flags, //1
            R.drawable.gbp_usd_flags, //2
            R.drawable.btc_usd_flags, //3
            R.drawable.usd_jpy_flags,
            R.drawable.usd_chf_flags,
            R.drawable.aud_usd_flags,
            R.drawable.usd_cad_flags,
            R.drawable.usd_cnh_flags,
            R.drawable.usd_pln_flags,
            R.drawable.usd_rus_flags,
            R.drawable.usd_uah_flags,
            R.drawable.usd_gbp_flags,
            R.drawable.btc_eur_flags,
            R.drawable.eur_pln_flags,
            R.drawable.eur_rub_flags,
            R.drawable.eur_uah_flags,
            R.drawable.btc_pln_flags,
            R.drawable.btc_rus_flags,
            R.drawable.btc_uah_flags

    };
    */


    // класс view holder-а с помощью которого мы получаем ссылку на каждый элемент
    // отдельного пункта списка
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // наш пункт состоит только из одного TextView
        public TextView mTextView,mTextView2,mTextView3,mTextView4;

        public ImageView imgView;

        public ViewHolder(View v) {
            super(v);
            imgView =(ImageView)v.findViewById(R.id.imageView);
            mTextView = (TextView) v.findViewById(R.id.tv_recycler_item);
           // mTextView2 = (TextView) v.findViewById(R.id.tv_recycler_item2);
          //  mTextView3 = (TextView) v.findViewById(R.id.tv_recycler_item3);
          //  mTextView4 = (TextView) v.findViewById(R.id.tv_recycler_item4);
        }
    }

    // Конструктор
    public RecyclerAdapter(String[] dataset) {
        mDataset = dataset;
    }

    // Конструктор 2
    public RecyclerAdapter(String[] dataset, String[] dataset2) {
        mDataset = dataset;
        mDataset2 = dataset2;
    }

    // Конструктор 3
    public RecyclerAdapter(String[] dataset, String[] dataset2, String[] dataset3) {
        mDataset = dataset;
        mDataset2 = dataset2;
        mDataset3 = dataset3;
    }

    // Конструктор 4
    public RecyclerAdapter(String[] dataset, String[] dataset2, String[] dataset3, String[] dataset4) {
        mDataset = dataset;
        mDataset2 = dataset2;
        mDataset3 = dataset3;
        mDataset4 = dataset4;
    }


    // Создает новые views (вызывается layout manager-ом)
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item, parent, false);

        // тут можно программно менять атрибуты лэйаута (size, margins, paddings и др.)

        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    // Заменяет контент отдельного view (вызывается layout manager-ом)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.mTextView.setText(mDataset[position]);
      //  holder.mTextView2.setText(mDataset2[position]);
        //.setImageResource(resImg[position]);
       // holder.imgView.setImageDrawable(getResources().getDrawable( R.drawable.currencyes));
        //holder.imgView.setImageDrawable(getDrawable(R.drawable.currencyes));
        holder.imgView.setImageResource(R.drawable.currencyes);



    }

    // Возвращает размер данных (вызывается layout manager-ом)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}