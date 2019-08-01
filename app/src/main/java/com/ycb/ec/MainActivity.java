package com.ycb.ec;


import com.ycb.latte_core.activities.ProxyActivity;
import com.ycb.latte_core.delegates.LatteDelegate;

public class MainActivity extends ProxyActivity {


    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }
}
