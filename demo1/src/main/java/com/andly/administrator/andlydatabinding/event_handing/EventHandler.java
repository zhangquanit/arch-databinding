package com.andly.administrator.andlydatabinding.event_handing;

import android.view.View;
import android.widget.Toast;

import com.andly.administrator.andlydatabinding.entry.User;

/**
 * Created by Administrator on 2016/9/24 0024.
 */
public class EventHandler {

    public void Click(View view) {
        Toast.makeText(view.getContext(), "EventHandler Click", Toast.LENGTH_SHORT).show();
    }

    public void eventHandler(User user) {
        System.out.println("getData:" + user.getName());
    }

    public void eventHandlerView(View view, User user) {
        System.out.println("eventHandlerView:" + view + "    " + user.getName());
    }

    public void checkChanged(View view, boolean isCheck) {
        System.out.println("checkChanged:" + view + "    " + isCheck);
    }

    public boolean longClick(View view) {
        System.out.println("longClick:" + view);
        return true;
    }

    public void doSomething() {
        System.out.println("doSomething");
    }

    public boolean isVisible(View view) {
        return view.getVisibility() == View.VISIBLE;
    }

    public void onSearchClick(View view) {
        System.out.println("onSearchClick:" + view);
    }

    public void searchClick(View view) {
        System.out.println("searchClick:" + view);
    }


    public static String getTextString(String str) {
        return str;
    }

    public void control_move(boolean boo) {
        boo = boo ? false : true;
    }
}
