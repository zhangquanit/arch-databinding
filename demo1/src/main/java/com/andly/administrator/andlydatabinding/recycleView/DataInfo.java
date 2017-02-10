package com.andly.administrator.andlydatabinding.recycleView;

import android.databinding.BaseObservable;

/**
 * Created by Administrator on 2016/10/2 0002.
 */
public class DataInfo extends BaseObservable {
    private String imageUrl;
    private String info;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getInfo() {
        return info;
    }


    public void setInfo(String info) {
        this.info = info;
    }
}
