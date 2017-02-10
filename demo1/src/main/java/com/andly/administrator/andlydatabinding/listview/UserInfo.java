package com.andly.administrator.andlydatabinding.listview;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;

import com.andly.administrator.andlydatabinding.BR;

/**
 * Created by Administrator on 2016/10/1 0001.
 */
public class UserInfo extends BaseObservable {
    private String imageUrl;
    private String info;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Bindable
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
        notifyPropertyChanged(BR.info);
    }

    public void click(View view) {
        setInfo("（点击）" + info);
    }
}
