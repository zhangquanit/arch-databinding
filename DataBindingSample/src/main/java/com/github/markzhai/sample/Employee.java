package com.github.markzhai.sample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableBoolean;

/**
 * 一、BaseObservable+@Bindable
 * 二、Obserable Fields
 *
 * @author markzhai on 16/6/26
 * @version 1.0.0
 */
public class Employee extends BaseObservable {

    private String mLastName;
    @Bindable
    private String mFirstName;

    public ObservableArrayMap<String, String> user = new ObservableArrayMap<>();
    public ObservableArrayList<String> strList=new ObservableArrayList<>();

    private String mAvatar;

    public ObservableBoolean isFired = new ObservableBoolean();

    public Employee(String lastName, String firstName) {
        mLastName = lastName;
        mFirstName = firstName;
        isFired.set(false);
        user.put("key1","map ->value1");
        user.put("key2","map ->value2");
        user.put("key3","map ->value3");

        strList.add("list ->value0");
        strList.add("list ->value1");
        strList.add("list ->value2");

    }

    public Employee(String lastName, String firstName, boolean fired) {
        mLastName = lastName;
        mFirstName = firstName;
        isFired.set(fired);
    }

    @Bindable  //使用@Bindable才会生成BR.lastName
    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
        //通知数据改变  刷新UI
        notifyPropertyChanged(com.github.markzhai.sample.BR.lastName);
    }

//    @Bindable 因为在属性上使用了@Bindable注解
    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
        notifyPropertyChanged(com.github.markzhai.sample.BR.firstName);
    }

    public void setFired(boolean fired) {
        isFired.set(fired);
    }

    @Bindable
    public String getAvatar() {
        return mAvatar;
    }

    public void setAvatar(String avatar) {
        mAvatar = avatar;
    }
}
