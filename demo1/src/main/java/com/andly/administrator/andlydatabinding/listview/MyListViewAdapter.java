package com.andly.administrator.andlydatabinding.listview;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/10/1 0001.
 */
public class MyListViewAdapter extends BaseAdapter {
    private Context context;
    private List<UserInfo> list;
    private int variable;
    private int layoutId;

    public MyListViewAdapter(Context context, List<UserInfo> list, int layoutId, int variable) {
        this.context = context;
        this.list = list;
        this.variable = variable;
        this.layoutId = layoutId;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewDataBinding viewDataBinding = null;
        if (convertView == null) {
            viewDataBinding = DataBindingUtil.inflate(LayoutInflater.from(context), layoutId, parent, false);
        } else {
            viewDataBinding = DataBindingUtil.getBinding(convertView);
        }
        //为ViewDataBinding设置变量，这个变量唯一标示UserInfo类。
        viewDataBinding.setVariable(variable,list.get(position));
        return viewDataBinding.getRoot();
    }
}
