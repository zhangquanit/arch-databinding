package com.andly.administrator.andlydatabinding.layout_detail;

import android.databinding.DataBindingUtil;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.andly.administrator.andlydatabinding.R;
import com.andly.administrator.andlydatabinding.databinding.ActivityLayoutDetailBinding;
import com.andly.administrator.andlydatabinding.entry.User;
import com.andly.administrator.andlydatabinding.event_handing.EventHandler;
import com.andly.administrator.andlydatabinding.myview.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2015年的Google IO大会上，Android 团队发布了一个数据绑定框架（Data Binding Library），官方原生支持 MVVM 模型。
 * 以后可以直接在 layout 布局 xml 文件中绑定数据了，无需再 findViewById然后手工设置数据了。其语法和使用方式和 JSP 中的 EL 表达式非常类似。
 */
public class LayoutDetailActivity extends AppCompatActivity {
    private boolean boo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLayoutDetailBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_layout_detail);
        User user = new User();
        user.setName("Android");
        EventHandler handler = new EventHandler();
        View view = new View(this);
        binding.setUser(user);
        binding.setHandle(handler);
        binding.setMyView(view);

        binding.setPlaceName(null);
        binding.setPLACEHOLDER("Lollipop");
        //绑定一些Android List Map SpaseArray Drawable
        List<String> list = new ArrayList<>();
        list.add("List Binding Data");
        binding.setStrList(list);

        List<User> users = new ArrayList<>();
        User u = new User();
        u.setName("List User Name Data");
        users.add(u);
        binding.setList(users);

        Map map = new HashMap();
        map.put("one", "Map One Data");
        binding.setMap(map);

        Map intMap = new HashMap();
        intMap.put(1, "Map Int MapData");
        binding.setIntMap(intMap);

        Drawable d = getResources().getDrawable(R.mipmap.ic_launcher);
        binding.setImage(d);

        boo = true;
        binding.setBoo(boo);
    }

}
