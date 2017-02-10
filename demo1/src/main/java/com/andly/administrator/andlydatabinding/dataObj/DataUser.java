package com.andly.administrator.andlydatabinding.dataObj;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.andly.administrator.andlydatabinding.BR;


public class DataUser extends BaseObservable {
    //继承BaseObservable类，想对谁进行监听则需要在get方法上面添加@Bindable注解，在set方法里面使用notifyPropertyChanged
    //注意到的是在这个方法里面要传入BR.name参数，这是Binding类为该字段生成唯一变量进行绑定
    private String name;
    private int age;
    private String info;
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
