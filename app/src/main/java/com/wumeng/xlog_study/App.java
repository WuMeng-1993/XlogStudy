package com.wumeng.xlog_study;

import android.app.Application;

import com.tencent.mars.xlog.Log;
import com.tencent.mars.xlog.Xlog;
import com.wumeng.xlog_study.log.LogManager;

/**
 * @author WuMeng
 * @date 2021/6/8
 * desc:
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LogManager.init(this,BuildConfig.DEBUG ? Xlog.LEVEL_DEBUG : Xlog.LEVEL_INFO);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.appenderClose();
    }
}
