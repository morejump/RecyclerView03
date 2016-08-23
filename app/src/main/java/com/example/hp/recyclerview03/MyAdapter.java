package com.example.hp.recyclerview03;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by HP on 8/23/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    Context context;
    List<Person> list;

    public MyAdapter(Context context, List<Person> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_on_list,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.getImageView().setImageResource(list.get(position).getIdImage());
        holder.getTextView().setText(list.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
