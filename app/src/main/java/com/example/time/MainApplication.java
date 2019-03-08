package com.example.time;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SDKInitializer.initialize(this);
    }
}
