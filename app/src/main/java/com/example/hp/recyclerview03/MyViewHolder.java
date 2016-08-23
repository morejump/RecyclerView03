package com.example.hp.recyclerview03;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by HP on 8/23/2016.
 */
public class MyViewHolder extends RecyclerView.ViewHolder{
    private ImageView imageView;
    private TextView textView;

    public MyViewHolder(View itemView) {
        super(itemView);
        imageView= (ImageView) itemView.findViewById(R.id.img_avatar);
        textView= (TextView) itemView.findViewById(R.id.txt_description);
    }


    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public TextView getTextView() {
        return textView;
    }

    public void setTextView(TextView textView) {
        this.textView = textView;
    }
}
