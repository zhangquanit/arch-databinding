package com.andly.administrator.andlydatabinding.recycleView;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Administrator on 2016/10/1 0001.
 */
public class BindingUtils {
    //当你在一个方法只需要一个参数的时候可以使用@BindingAdapter("imageUrlStr")，加上之后就可以在布局文件中直接使用imageUrlStr
    //运行之后就会调用loadImage方法
    @BindingAdapter("imageUrlStr")
    public static void loadImage(ImageView iv, String url) {
        Glide.with(iv.getContext()).load(url).into(iv);
    }

    //上面是为loadImage传入一个参数，当传入两个或多个参数的时候应使用@BindingAdapter({"imagePath", "imageError"})
    //这个的ImageView自定义了两个属性一个是imagePath传入的是url,一个是imageError为Drawable
    @BindingAdapter({"imagePath", "imageError"})
    public static void downloadImage(ImageView iv, String url, Drawable error) {
        Glide.with(iv.getContext()).load(url).error(error).into(iv);
    }


    //你也可以
    @BindingAdapter("android:paddingL")
    public static void setPaddingLeft(View v, int padding) {
        v.setPadding(padding, v.getPaddingTop(), v.getPaddingRight(), v.getPaddingBottom());
    }

}
