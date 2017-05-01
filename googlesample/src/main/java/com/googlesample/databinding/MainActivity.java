package com.googlesample.databinding;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.googlesample.databinding.databinding.ActivityMainBinding;
import com.googlesample.databinding.entity.User;

public class MainActivity extends Activity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("Test", "User");
        /**
         * 绑定UI：setXX或setVariable
         */
        binding.setUser(user);
//        或者
//        binding.setVariable(BR.user,user);

        binding.setPresenter(new Presenter());

        //不需要findViewById ,直接将layout中有id的view获取
        EditText et_firstName = binding.firstName;
    }

    public class Presenter {

        /**
         * 方法绑定
         * @param v
         */
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "点击", Toast.LENGTH_SHORT).show();

            User user = binding.getUser();
            user.firstName=binding.firstName.getText().toString()+System.currentTimeMillis();
            binding.setUser(user); //更新数据
        }

        /**
         * 监听器绑定: 在xml中使用lambada表达式，可以回传参数
         * @param user
         */
        public void onClickListenerBinding(User user){
            Toast.makeText(MainActivity.this, "点击->"+user.firstName, Toast.LENGTH_SHORT).show();
        }
    }
}
