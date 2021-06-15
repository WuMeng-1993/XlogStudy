package com.wumeng.xlog_study.log;

import android.content.Context;
import android.os.Environment;

import com.tencent.mars.xlog.Log;
import com.tencent.mars.xlog.Xlog;

import java.io.File;

/**
 * @author WuMeng
 * @date 2021/6/8
 * desc:
 */
public class LogManager {

    public static void init(Context mContext,int Level) {
        final String logPath = "NaviLog";
        File logDir = new File(mContext.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS).getPath(),logPath);

        Xlog xlog = new Xlog();
        Log.setLogImp(xlog);
        Xlog.open(
                true,
                Level,
                Xlog.AppednerModeAsync,
                "",
                logDir.getPath(),
                "Navi",
                ""
                );
        Xlog.setMaxFileSize(10);
    }

}
