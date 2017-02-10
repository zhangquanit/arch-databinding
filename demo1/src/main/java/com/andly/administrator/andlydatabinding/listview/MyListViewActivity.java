package com.andly.administrator.andlydatabinding.listview;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.andly.administrator.andlydatabinding.BR;
import com.andly.administrator.andlydatabinding.R;
import com.andly.administrator.andlydatabinding.databinding.ActivityMyListViewBinding;

import java.util.ArrayList;
import java.util.List;

public class MyListViewActivity extends AppCompatActivity {
    private String url = "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2033765348,1346395611&fm=116&gp=0.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_my_list_view);
        //第一种方式
        //DataBindingUtil.setDefaultComponent(new MyComponent());
        //第二种方式
        ActivityMyListViewBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_my_list_view,new MyComponent());
        //第三种方式
        //DataBindingUtil.bind(root,new MyComponent());
        List<UserInfo> infos = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            UserInfo info = new UserInfo();
            info.setImageUrl(url);
            info.setInfo("userInfo" + i);
            infos.add(info);
        }

        //这里要传入BR.userInfo变量，因为这个变量是和UserInfo绑定的
        MyListViewAdapter adapter = new MyListViewAdapter(this, infos, R.layout.listview_item, BR.userInfo);
        binding.setAdapter(adapter);
    }
}
