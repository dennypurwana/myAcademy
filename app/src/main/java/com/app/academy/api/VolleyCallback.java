package com.app.academy.api;

import org.json.JSONException;
import org.json.JSONObject;

public interface VolleyCallback {

    void onSuccess(JSONObject result) throws JSONException;
    void onError(String result) throws Exception;
}
