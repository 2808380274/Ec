package com.ycb.ec;

import android.app.Application;

import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.ycb.latte_core.app.Latte;
import com.ycb.latte_ec.icons.FontEcModule;

public class ExampleApp extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withApiHost("")
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .configure();


    }

//    private void initStetho() {
//        Stetho.initialize(
//                Stetho.newInitializerBuilder(this)
//                        .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
//                        .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
//                        .build());
//    }
}
