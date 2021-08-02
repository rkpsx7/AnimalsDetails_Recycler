package com.example.animalsdetails_recycler;

import android.widget.ImageView;

public class Model {
    private int ImageId;
    private String Name,Sound;

    public Model(String name, String sound,int ImageId) {
        this.Name = name;
        this.Sound = sound;
        this.ImageId = ImageId;
    }

    public String getName() {
        return Name;
    }

    public int getImageId() {
        return ImageId;
    }

    public String getSound() {
        return Sound;
    }
}
