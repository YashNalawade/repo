package com.example.yash.demomaps;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by andrei on 15.06.2015.
 */
public class CityPreference {

    SharedPreferences prefs;

    public CityPreference(Activity activity) {
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    String getCity() {
        return prefs.getString("city", MainActivity.cityname);
    }

    void setCity(String city) {
        prefs.edit().putString("city", city).commit();
    }
}
