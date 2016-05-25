package com.qcj.common.util;

import android.content.Context;

import com.qcj.common.R;
import com.qcj.common.base.AppContext;

/**
 * 白天和夜间模式切换
 */
public class ThemeSwitchUtils {

    public static void switchTheme(Context context) {
           
    }

    public static int getTitleReadedColor() {
        if (AppContext.getNightModeSwitch()) {
            return R.color.night_infoTextColor;
        } else {
            return R.color.day_infoTextColor;
        }
    }

    public static int getTitleUnReadedColor() {
        if (AppContext.getNightModeSwitch()) {
            return R.color.night_textColor;
        } else {
            return R.color.day_textColor;
        }
    }

    public static String getWebViewBodyString() {
        if (AppContext.getNightModeSwitch()) {
            return "<body class='night'><div class='contentstyle' id='article_body'>";
        } else {
            return "<body ><div class='contentstyle' id='article_body'>";
        }
    }
}
