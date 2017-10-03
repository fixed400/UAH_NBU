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

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mTextView,mTextView2,mTextView3,mTextView4;

        public ImageView imgView;

        public ViewHolder(View v) {
            super(v);
            imgView =(ImageView)v.findViewById(R.id.imageView);
            mTextView = (TextView) v.findViewById(R.id.tv_recycler_item);

        }
    }


    public RecyclerAdapter(String[] dataset) {
        mDataset = dataset;
    }


    public RecyclerAdapter(String[] dataset, String[] dataset2) {
        mDataset = dataset;
        mDataset2 = dataset2;
    }

    public RecyclerAdapter(String[] dataset, String[] dataset2, String[] dataset3) {
        mDataset = dataset;
        mDataset2 = dataset2;
        mDataset3 = dataset3;
    }

    public RecyclerAdapter(String[] dataset, String[] dataset2, String[] dataset3, String[] dataset4) {
        mDataset = dataset;
        mDataset2 = dataset2;
        mDataset3 = dataset3;
        mDataset4 = dataset4;
    }


    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_item, parent, false);

        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.mTextView.setText(mDataset[position]);
        holder.imgView.setImageResource(R.drawable.currencyes);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}