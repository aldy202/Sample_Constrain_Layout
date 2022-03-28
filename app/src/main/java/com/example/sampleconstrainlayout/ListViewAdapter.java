package com.example.sampleconstrainlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    //Deklarasi variabel dengan jenis data context
    Context mContext;

    //deklarasi variabel dengan jenis data layout inflater
    LayoutInflater inflater;

    //deklarasi variabel dengan jenis data arraylist
    private ArrayList<ClassNama> arrayList;


    //membuat konstruktor listviewadapter
    public ListViewAdapter(Context context){

        //Mmeberi nilai mContext dengan context
        mContext = context;

        //mengatur layaoutinflater dari context yang diberikan
        inflater = LayoutInflater.from(mContext);

        //memberikan nilai arraylist dari class classNama
        this.arrayList = new ArrayList<ClassNama>();

        //menambahkan semua elemen ke arraylist
        this.arrayList.addAll(Activity_Home.classNamaArrayList);



    }

    public class  ViewHolder{
        TextView name;
    }

    @Override
    public int getCount() {
        return Activity_Home.classNamaArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return Activity_Home.classNamaArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        final ViewHolder holder;

        if (view == null){
            holder = new ViewHolder();

            view = inflater.inflate(R.layout.item_listview, null);

            holder.name = (TextView) view.findViewById(R.id.tvnama_item);

            view.setTag(holder);
        }else
        {
            holder = (ViewHolder) view.getTag();
        }

        holder.name.setText(Activity_Home.classNamaArrayList.get(i).getNama());

        return view;
    }
}
