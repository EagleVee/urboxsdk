package com.urbox.utils;

public class MoMoConfig {
    public static final String URBOX_APP_PACKAGE = "com.toqua.gift.urbox";

    public static final String URBOX_APP_PACKAGE_CLASS_PRODUCTION = "com.toqua.gift.urbox"; //production
    public static final String URBOX_APP_PACKAGE_CLASS_DEBUG = "com.urbox.debug";//debug
    public static final String URBOX_APP_PACKAGE_CLASS_DEVELOPER = "com.urbox.dev";//dev

    public static final String ACTION_SDK = "com.android.momo.SDK";//action mapping
    public static final String ACTION_PAYMENT = "com.android.momo.PAYMENT";//action payment
    public static final int ENVIRONMENT_DEBUG = 0;//Debug
    public static final int ENVIRONMENT_DEVELOPER = 1;//developer
    public static final int ENVIRONMENT_PRODUCTION = 2;//production

    public static final String ACTION_TYPE_GET_TOKEN = "gettoken";//action mapping
    public static final String ACTION_TYPE_LINK = "link";//action payment
}