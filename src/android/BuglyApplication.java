package com.mljsgto222.cordova.bugly;

import android.app.Application;

import com.tencent.bugly.Bugly;

import org.apache.cordova.CordovaPreferences;


public class BuglyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        CordovaPreferences preferences = new CordovaPreferences();
        Bugly.init(this, preferences.getString("BuglyAppId", ""), false);
    }
}
