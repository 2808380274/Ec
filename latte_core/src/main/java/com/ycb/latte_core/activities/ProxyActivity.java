package com.ycb.latte_core.activities;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.widget.ContentFrameLayout;


import com.ycb.latte_core.R;
import com.ycb.latte_core.delegates.LatteDelegate;

import me.yokeyword.fragmentation.SupportActivity;

public abstract class ProxyActivity extends SupportActivity {

    public abstract LatteDelegate setRootDelegate();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initContainer(savedInstanceState);
    }
    private void initContainer(Bundle savedInstanceState){
      @SuppressLint("RestrictedApi") final ContentFrameLayout container = new ContentFrameLayout(this);
      container.setId(R.id.delegate_container);
      setContentView(container);
      if (savedInstanceState==null){
          loadRootFragment(R.id.delegate_container,setRootDelegate());
      }

    }
}
