package cordova-plugin-authenticate-product-barcode;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class AuthProduct extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("authenticate")) {
            String message = args.getString(0);
            this.authenticate(message, callbackContext);
            return true;
        }
        return false;
    }

    private void authenticate(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            // retrieve by http product infos
                /* API CODe TO BE INCLUDED HERE */
            if ( true ){
                JSONObject returnObject = new JSONObject();
                returnObject.put("message", "success");
                callbackContext.success(returnObject);
            } else {
                callbackContext.success("");
            }
            
        } else {
            callbackContext.error("No code were given.");
        }
    }
}
