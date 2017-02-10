package com.andly.administrator.andlydatabinding.listview;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.andly.administrator.andlydatabinding.R;
import com.bumptech.glide.Glide;

/**
 * Created by Administrator on 2016/10/1 0001.
 * //
 */
public class Utils {
    @BindingAdapter("imageUrl")
    public void download(ImageView view, String url) {
        if (url == null) {
            view.setImageResource(R.mipmap.ic_launcher);
        } else {
            Glide.with(view.getContext()).load(url).into(view);
        }
    }
}
