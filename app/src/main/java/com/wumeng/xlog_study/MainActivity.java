package com.wumeng.xlog_study;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.tencent.mars.xlog.Log;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkPermissions();
        initView();
    }

    /**
     * 初始化视图
     */
    private void initView() {
        tv = findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 100; i++) {
                    Log.d("WuMeng","asdjaosdjasodjasldj");
                }
            }
        });
    }

    /**
     * 检查权限
     */
    private void checkPermissions() {
        int hasPermission = ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        // 未获取
        if (hasPermission != PackageManager.PERMISSION_GRANTED) {
            requestPermission();
        }
    }

    /**
     * 请求权限
     */
    private void requestPermission() {
        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},0);
    }

}