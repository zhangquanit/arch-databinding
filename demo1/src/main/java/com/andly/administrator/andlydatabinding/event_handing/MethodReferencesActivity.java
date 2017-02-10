package com.andly.administrator.andlydatabinding.event_handing;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.andly.administrator.andlydatabinding.R;
import com.andly.administrator.andlydatabinding.databinding.ActivityMethodReferencesBinding;
import com.andly.administrator.andlydatabinding.entry.User;

public class MethodReferencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMethodReferencesBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_method_references);
        User user = new User();
        user.setName("MethodReferences");
        user.setAge(1);
        EventHandler eventHandler = new EventHandler();
        binding.setUser(user);
        binding.setHandle(eventHandler);
        /**
         * 如果这个方法不存在或者签名不正确会在编译的时候出错
         */
    }
}
