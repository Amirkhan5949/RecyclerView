package com.example.recycleview.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

public class Common {
    public static int dpToPx(Context c, int dp) {
        Resources r = c.getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }
}
