package com.andly.administrator.andlydatabinding.event_handing;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.andly.administrator.andlydatabinding.R;
import com.andly.administrator.andlydatabinding.databinding.ActivityListenerBindingBinding;
import com.andly.administrator.andlydatabinding.entry.User;

public class ListenerBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityListenerBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_listener_binding);
        User user = new User();
        user.setName("DataBinding Data");
        EventHandler eventHandler = new EventHandler();
        binding.setUser(user);
        binding.setHandle(eventHandler);
    }
}
