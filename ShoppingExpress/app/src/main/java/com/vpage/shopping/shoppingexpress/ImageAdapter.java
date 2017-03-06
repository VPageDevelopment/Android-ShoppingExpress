package com.vpage.shopping.shoppingexpress;
 
import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.MyViewHolder> {

    private int[] imageArray;
    private Activity activity;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView image;
        public Button buttonHome;


        public MyViewHolder(View view) {
            super(view);
            image = (ImageView) view.findViewById(R.id.image);
            buttonHome = (Button) view.findViewById(R.id.buttonHome);
        }
    }


    public ImageAdapter(Activity activity,int[] imageArray) {
        this.activity = activity;
        this.imageArray = imageArray;
    }
 
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.image_list_row, parent, false);
 
        return new MyViewHolder(itemView);
    }
 
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Picasso.with(activity).load(imageArray[position]).into(holder.image);

    }
 
    @Override
    public int getItemCount() {
        return imageArray.length;
    }
}