package com.wumeng.xlog_study;

import android.app.Application;

import com.tencent.mars.xlog.Xlog;

/**
 * @author WuMeng
 * @date 2021/6/8
 * desc:
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Xlog.open(true,Xlog.LEVEL_DEBUG,
                Xlog.AppednerModeAsync,
                "",
                "",
                "ECARX",
                "");
    }

}
