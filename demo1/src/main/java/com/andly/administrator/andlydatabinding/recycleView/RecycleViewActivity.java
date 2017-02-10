package com.andly.administrator.andlydatabinding.recycleView;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.andly.administrator.andlydatabinding.BR;
import com.andly.administrator.andlydatabinding.R;
import com.andly.administrator.andlydatabinding.databinding.ActivityRecycleViewBinding;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewActivity extends AppCompatActivity {
    private String url = "https://ss0.baidu.com/7Po3dSag_xI4khGko9WTAnF6hhy/image/h%3D200/sign=efacf10b073b5bb5a1d727fe06d2d523/cf1b9d16fdfaaf513446711f885494eef11f7aed.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_recycle_view);
        ActivityRecycleViewBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_recycle_view);


        List<DataInfo> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            DataInfo info = new DataInfo();
            info.setImageUrl(url);
            info.setInfo("DataInfo" + i);
            list.add(info);
        }

        //这里注意的是一定要是BR.dataInfo不能是其它的常数
        MyAdapter adapter = new MyAdapter(list, R.layout.rv_item, BR.dataInfo);
        binding.setAdapter(adapter);
        binding.rv.setLayoutManager(new LinearLayoutManager(this));
    }
}
