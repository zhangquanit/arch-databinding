package com.andly.administrator.andlydatabinding.dataObj;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayMap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.andly.administrator.andlydatabinding.R;
import com.andly.administrator.andlydatabinding.databinding.ActivityDataObjBinding;

public class DataObjActivity extends AppCompatActivity {
    DataUser dataUser;
    DataUser1 user1;
    private ObservableArrayMap<String, Object> user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDataObjBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_obj);
        dataUser = new DataUser();
        dataUser.setName("Andly");
        dataUser.setAge(12);
        dataUser.setInfo("Info");
        binding.setDataUser(dataUser);
        binding.setContext(this);

        user1 = new DataUser1();
        user1.name.set("ObservableField Andly");
        user1.age.set(12);
        user1.info.set("ObservableField Info");
        binding.setDataUser1(user1);

        //使用绑定的集合
        /**
         * 如果要使用ObservableArrayMap类需要在layout里面导入 <import type="android.databinding.ObservableMap" />
         */
        user = new ObservableArrayMap<>();
        user.put(Fields.FIRST_NAME, "Google");
        user.put(Fields.LAST_NAME, "Inc.");
        user.put(Fields.AGE, 17);
        binding.setObserableMap(user);
        //在binding类里面得到TextView的字段
        binding.data1.setText("Modify Data1");
        binding.data2.setText("Modify Data2");



    }

    public void modify() {
        dataUser.setName("Modify Name");
        dataUser.setAge(300);
        dataUser.setInfo("Modify Info");
    }

    public void modify2() {
        user1.name.set("Modify ObservableField Andly");
        user1.age.set(400);
        user1.info.set("Modify ObservableField Info");
    }

    public void modify3() {
        user.put(Fields.FIRST_NAME, "Modify Google");
        user.put(Fields.LAST_NAME, "Modify Inc.");
        user.put(Fields.AGE, 500);
    }
}
