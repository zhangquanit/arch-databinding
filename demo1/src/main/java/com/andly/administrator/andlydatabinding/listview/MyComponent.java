package com.andly.administrator.andlydatabinding.listview;

/**
 * Created by Administrator on 2016/10/1 0001.
 */
public class MyComponent implements android.databinding.DataBindingComponent {
    private Utils utils;
    @Override
    public Utils getUtils() {
        if (utils == null) {
            utils = new Utils();
        }
        return utils;
    }
}
