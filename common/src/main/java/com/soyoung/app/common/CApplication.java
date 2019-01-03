package com.soyoung.app.common;
/*
 * create by muanxi
 * 2018/12/18
 */

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;


public class CApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);

    }
}
