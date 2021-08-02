package com.example.animalsdetails_recycler;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class viewHolder extends RecyclerView.ViewHolder {
    private ImageView mIvAnimalImage;
    private TextView mTvName,mTvSound;
    public viewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);

    }

    private void initViews(View itemView) {
        mIvAnimalImage = itemView.findViewById(R.id.img_animal_pic);
        mTvName = itemView.findViewById(R.id.tv_name);
        mTvSound = itemView.findViewById(R.id.tv_sound);
    }

    public void setData(Model model){
        mIvAnimalImage.setImageResource(model.getImageId());
        mTvName.setText(model.getName());
        mTvSound.setText(model.getSound());
    }
}
