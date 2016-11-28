package com.avast.example.android.github.data;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * @author Lukas Prokop (prokop@avast.com)
 */

public class Preferences {

    private static final String PREFERENCES_NAME = "preferences";

    private static final String KEY_APP_LAUNCHES = "app_launches";

    SharedPreferences mPreferences;

    public Preferences(Context context) {
        mPreferences = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE);
    }

    public int getAppLaunches() {
        return mPreferences.getInt(KEY_APP_LAUNCHES, 0);
    }

    public void incremetAppLaunches() {
        int count = getAppLaunches();
        mPreferences.edit().putInt(KEY_APP_LAUNCHES, ++count).apply();
    }
}
