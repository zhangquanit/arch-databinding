package com.andly.administrator.andlydatabinding.dataObj;

import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * Created by Administrator on 2016/9/28 0028.
 */
public class DataUser1 {
    //它们内部包含Observable对象，使用时要去创建public final类型的
    //为其赋值和取值操作：user.firstName.set("Google");  int age = user.age.get();
    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableInt age = new ObservableInt();
    public final ObservableField<String> info = new ObservableField<>();
}
