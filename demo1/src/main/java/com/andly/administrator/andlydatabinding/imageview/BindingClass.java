package com.andly.administrator.andlydatabinding.imageview;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Administrator on 2016/10/1 0001.
 */
public class BindingClass {
    @BindingAdapter({"imageUrl", "error"})
    public static void loadImage(ImageView iv, String url, Drawable error) {
        Glide.with(iv.getContext()).load(url).error(error).into(iv);
    }

    @BindingAdapter("imageUrlStr")
    public static void loadImage(ImageView iv, String url) {
        Glide.with(iv.getContext()).load(url).into(iv);
    }

    //对set方法重命名
    @BindingAdapter("android:paddingL")
    public static void setPaddingLeft(View v, int padding) {
        v.setPadding(padding, v.getPaddingTop(), v.getPaddingRight(), v.getPaddingBottom());
    }

}
