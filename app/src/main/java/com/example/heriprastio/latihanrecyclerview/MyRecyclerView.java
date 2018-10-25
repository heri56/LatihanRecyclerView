package com.example.heriprastio.latihanrecyclerview;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyRecyclerView extends RecyclerView.Adapter<MyRecyclerView.MyViewHolder> {
    public ItemView[] itemViewData;

    public MyRecyclerView(ItemView[] itemViewData) {
        this.itemViewData = itemViewData;
    }

    @NonNull
    @Override
    public MyRecyclerView.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater linflater = LayoutInflater.from(viewGroup.getContext());
        View list = linflater.inflate(R.layout.list_item,viewGroup, false);
        MyViewHolder myViewHolder = new MyViewHolder(list);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerView.MyViewHolder myViewHolder, int i) {
        myViewHolder.myTextview.setText(itemViewData[i].getText());
        myViewHolder.myImageview.setImageResource(itemViewData[i].getImgid());

    }

    @Override
    public int getItemCount() {
        return itemViewData.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
       public ImageView myImageview;
       public TextView myTextview;

       public MyViewHolder(@NonNull View itemView) {
           super(itemView);
           this.myImageview = itemView.findViewById(R.id.imgicon);
           this.myTextview = itemView.findViewById(R.id.txt);

       }
   }
}
