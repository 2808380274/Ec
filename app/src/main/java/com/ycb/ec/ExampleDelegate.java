package com.ycb.ec;

import android.os.Bundle;
import android.view.View;

import com.ycb.latte_core.delegates.LatteDelegate;

/**
 * Created by asus on 2019/7/27.
 */
public class ExampleDelegate extends LatteDelegate {
    @Override
    public Object setLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onBindView(Bundle savedInstanceState, View view) {

    }
}
