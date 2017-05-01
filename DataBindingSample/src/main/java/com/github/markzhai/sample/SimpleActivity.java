package com.github.markzhai.sample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.github.markzhai.sample.databinding.ActivityDemoBinding;

public class SimpleActivity extends AppCompatActivity {

    Employee employee = new Employee("Zhai", "Mark");

    ActivityDemoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_demo);
        binding.setEmployee(employee);
        binding.setPresenter(new Presenter());

    }

    public class Presenter {
        /**
         * TextView中的onTextChanged定义
         * protected void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter)
         *
         */
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            //1、binding.setXX，会刷新与该model绑定的数据
            //            binding.setEmployee(employee);
            // 2、字段刷新
            employee.setFirstName(s.toString());
            employee.setFired(!employee.isFired.get());

        }

        /**
         *  点击事件,遵循点击事件方法的签名，public void onClick(View view)
         * android:onClick="@{presenter.onClick}"
         * @param view
         */
        public void onClick(View view) {
            Toast.makeText(SimpleActivity.this, "点到了", Toast.LENGTH_SHORT).show();
        }

        /**
         * 监听器绑定（lambda）可以不遵循默认的方法签名
         * android:onClick="@{()->presenter.onClickListenerBinding(employee)}"
         * @param employee
         */
        public void onClickListenerBinding(Employee employee) {
            Toast.makeText(SimpleActivity.this, employee.getLastName(),
                    Toast.LENGTH_SHORT).show();
        }

        /**
         * 显示ViewStub
         * ViewStubProxy
         * @param v
         */
        public void showViewStub(View v){
            boolean isInflated=binding.viewStub.isInflated();
            if(!isInflated){
                binding.viewStub.getViewStub().inflate();
            }

        }
    }
}
