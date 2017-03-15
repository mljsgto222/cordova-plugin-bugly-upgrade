package com.mljsgto222.cordova.bugly;

import com.tencent.bugly.beta.Beta;
import com.tencent.bugly.beta.UpgradeInfo;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

/**
 * This class echoes a string called from JavaScript.
 */
public class BuglyUpgrade extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("checkUpgrade")) {
            this.checkUpgrade(callbackContext);
            return true;
        } else if (action.equals("getUpgradeInfo")) {
            this.getUpgradeInfo(callbackContext);
            return true;
        }
        return false;
    }

    private void checkUpgrade(CallbackContext callbackContext) {
        Beta.checkUpgrade();
        callbackContext.success();
    }

    private void getUpgradeInfo(CallbackContext callbackContext) {
        UpgradeInfo info = Beta.getUpgradeInfo();
        if(info != null) {
            HashMap<String, Object> hashInfo = new HashMap<String, Object>();
            hashInfo.put("id", info.id);
            hashInfo.put("title", info.title);
            hashInfo.put("newFeature", info.newFeature);
            hashInfo.put("versionCode", info.versionCode);
            hashInfo.put("versionName", info.versionName);
            hashInfo.put("publishTime", info.publishTime);
            hashInfo.put("apkMd5", info.apkMd5);
            hashInfo.put("fileSize", info.fileSize);
            hashInfo.put("popInterval", info.popInterval);
            hashInfo.put("popTimes", info.popTimes);
            hashInfo.put("publishType", info.publishType);
            hashInfo.put("upgradeType", info.upgradeType);
            hashInfo.put("imageUrl", info.imageUrl);

            JSONObject infoJson = new JSONObject(hashInfo);
            callbackContext.success(infoJson);
        } else {
            callbackContext.success();
        }
    }
}
