package com.andly.administrator.andlydatabinding.imageview;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.andly.administrator.andlydatabinding.R;
import com.andly.administrator.andlydatabinding.databinding.ActivityRenameBindingBinding;

public class RenameBindingActivity extends AppCompatActivity {
    private String url = "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=868248776,2327923617&fm=111&gp=0.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_rename_binding);
        ActivityRenameBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_rename_binding);

        binding.setUrl(null);
        binding.setErrorDrawable(getResources().getDrawable(R.mipmap.ic_launcher));

        binding.setBoo(true);
    }
}
