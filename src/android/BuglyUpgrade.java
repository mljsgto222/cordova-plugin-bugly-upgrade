package com.mljsgto222.cordova.bugly;

import com.tencent.bugly.Bugly;
import com.tencent.bugly.beta.Beta;

import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;
/**
 * This class echoes a string called from JavaScript.
 */
public class BuglyUpgrade extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("checkUpgrade")) {
            this.checkUpgrade(callbackContext);
            return true;
        }
        return false;
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    private void checkUpgrade(CallbackContext callbackContext) {
        Beta.checkUpgrade();
        callbackContext.success();
    }
}
