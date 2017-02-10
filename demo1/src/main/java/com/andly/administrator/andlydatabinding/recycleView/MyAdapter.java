package com.andly.administrator.andlydatabinding.recycleView;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Administrator on 2016/10/2 0002.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<DataInfo> list;//数据集合
    private int layoutId;//布局文件的ID
    private int variable;//用来为Adapter和DataInfo绑定的属性变量

    public MyAdapter(List<DataInfo> list, int layoutId, int variable) {
        this.list = list;
        this.layoutId = layoutId;
        this.variable = variable;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewDataBinding viewDataBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), layoutId, parent, false);
        return new ViewHolder(viewDataBinding);
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.binding.setVariable(variable, list.get(position));
        holder.binding.executePendingBindings();
        //当然这里你也可以为其设置点击如：
        //holder.binding.getRoot.setOnclickListener()
    }
    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ViewDataBinding binding;

        public ViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
