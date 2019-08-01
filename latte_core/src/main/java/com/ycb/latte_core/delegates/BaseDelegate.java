package com.ycb.latte_core.delegates;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.yokeyword.fragmentation_swipeback.SwipeBackFragment;

/**
 * Created by asus on 2019/7/27.
 */
public abstract class BaseDelegate extends SwipeBackFragment {

    private View mView;

    public abstract Object setLayoutId();

    public abstract void onBindView(Bundle savedInstanceState, View view);



    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        if (setLayoutId() instanceof Integer) {
            mView = inflater.inflate((Integer) setLayoutId(), container, false);
        } else if (setLayoutId() instanceof View) {
            mView = (View) setLayoutId();
        }
        if (mView != null) {
            onBindView(savedInstanceState, mView);
        }

        return mView;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
