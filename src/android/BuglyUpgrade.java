package com.mljsgto222.cordova.bugly;

import com.tencent.bugly.Bugly;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
/**
 * This class echoes a string called from JavaScript.
 */
public class BuglyUpgrade extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("init")) {
            this.init(args.getBoolean(0), callbackContext);
            return true;
        }
        return false;
    }

    private void init(boolean isDebug, CallbackContext callbackContext) {
        Bugly.init(this.cordova.getActivity(), this.preferences.getString("BuglyAppId", ""), isDebug);
        callbackContext.success();
    }
}
