package com.andly.administrator.andlydatabinding.viewstub;

import android.databinding.DataBindingUtil;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewStub;

import com.andly.administrator.andlydatabinding.R;
import com.andly.administrator.andlydatabinding.databinding.ActivityStubViewBinding;
import com.andly.administrator.andlydatabinding.databinding.ViewstubBinding;

public class StubViewActivity extends AppCompatActivity {
    private ActivityStubViewBinding binding;
    private ViewStub vs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_stub_view);
        /**
         * 为ViewStub设置监听，当显示的时候为它绑定数据，因为当不显示的ViewStub会在视图中消失
         */
        vs = (ViewStub) findViewById(R.id.viewstub);
        vs.setOnInflateListener(new ViewStub.OnInflateListener() {
            @Override
            public void onInflate(ViewStub stub, View inflated) {
                ViewstubBinding viewstubBinding = ViewstubBinding.bind(inflated);
                Info info = new Info();
                info.setInfo("Andly Info");
                viewstubBinding.setInfo(info);
                Drawable d = getResources().getDrawable(R.mipmap.ic_launcher);
                viewstubBinding.setDrawable(d);
            }
        });

    }

    public void toggleViewStub(View view) {
        vs.inflate();
    }
}
