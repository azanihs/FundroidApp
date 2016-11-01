package com.example.codelightlabs.fundroid;

import android.media.Image;
import android.widget.ImageView;

/**
 * Created by codelightlabs on 11/1/2016.
 */

public class FunOb {

    private int image;
    private String featureText;
    private String backroundCol;

    public FunOb(int image, String featureText, String backroundCol) {
        this.image = image;
        this.featureText = featureText;
        this.backroundCol = backroundCol;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getFeatureText() {
        return featureText;
    }

    public void setFeatureText(String featureText) {
        this.featureText = featureText;
    }

    public String getBackroundCol() {
        return backroundCol;
    }

    public void setBackroundCol(String backroundCol) {
        this.backroundCol = backroundCol;
    }
}
