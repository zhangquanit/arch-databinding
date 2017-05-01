package com.github.markzhai.sample;

import android.databinding.DataBindingUtil;
import android.databinding.OnRebindCallback;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;

import com.github.markzhai.sample.databinding.ActivityAnimationBinding;

/**
 * @author markzhai on 16/7/7
 * @version 1.0.0
 */
public class AnimationActivity extends AppCompatActivity {

    ActivityAnimationBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_animation);

        //这样，当我们的view发生改变，比如visibility变化的时候，就能看到一些transition动画。
        mBinding.addOnRebindCallback(new OnRebindCallback() {
            @Override
            public boolean onPreBind(ViewDataBinding binding) {
                ViewGroup view = (ViewGroup) binding.getRoot();//获取绑定的root view
                TransitionManager.beginDelayedTransition(view);
                return true;
            }
        });
        mBinding.setPresenter(new Presenter());
    }

    public class Presenter {
        public void onCheckedChanged(View buttonView, boolean isChecked) {
            mBinding.setShowImage(isChecked);
        }
    }
}
