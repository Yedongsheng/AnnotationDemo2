package com.example.compiler;


import com.example.annotation.BindingSuffix;

/**
 * Created by yds
 * on 2020/3/5.
 */
public final class NameStore {
    private NameStore(){}

    public static String getGeneratedClassName(String clsName){
        return clsName+ BindingSuffix.GENERATED_CLASS_SUFFIX;
    }

    public static class Package{
        public static final String ANDROID_VIEW = "android.view";
    }
    public static class Class {
        // Android
        public static final String ANDROID_VIEW = "View";
        public static final String ANDROID_VIEW_ON_CLICK_LISTENER = "OnClickListener";
    }
    public static class Variable{
        public static final String ANDROID_ACTIVITY = "activity";
        public static final String ANDROID_VIEW = "view";
    }

    public static class Method{
        public static final String ANDROID_VIEW_ON_CLICK = "onClick";

        // Binder
        public static final String BIND_VIEWS = "bindViews";
        public static final String BIND_ON_CLICKS = "bindOnClicks";
        public static final String BIND = "bind";
    }
}
