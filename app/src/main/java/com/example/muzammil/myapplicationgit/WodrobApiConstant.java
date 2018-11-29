package com.example.muzammil.myapplicationgit;


public interface WodrobApiConstant {

    /*
     * Production URL, client id and client_secret
     */

    String BASE_URL = "https://app.wodrob.com/api/v1.1/";
    String client_id = "JYMYuccsqmJ1b9ZWMHLH";
    String client_secret = "kyMTCYjrHUDnKkqnp3TFvOT5QYZmrNTTMUS52PNe";

    /**
     * Development URL, client id and client_secret
     */

//    String BASE_URL = "https://app.wodrob.net/api/v1.2/";
//    String client_id = "testClient";
//    String client_secret = "secret";

    //version v1.0
    String PROFILE_CLOSET = BASE_URL + "profile/closet";
    String PROFILE_INFLUENCER = BASE_URL + "profile/influencers";
    String CALENDAR = BASE_URL + "calendar";
    String CLOSET_VIEW = BASE_URL + "closet/view";
    String CLOSET_ADD = BASE_URL + "closet/add";
    String CLOSET_UPDATE = BASE_URL + "closet/update";
    String CLOSET_BUILD = BASE_URL + "closet/build";
    String STORY_CREATE = BASE_URL + "story/create";
    String STORY_SHARE = BASE_URL + "story/share";
    String CANVAS_IMAGE_SAVE = BASE_URL + "canvas/image/save";
    String CANVAS_SAVE = BASE_URL + "canvas/save";
    String STORY_ADD = BASE_URL + "story/add";
    String OUTFIT = BASE_URL + "outfits";
    String OUTFIT_VIEW = BASE_URL + "outfit/view";
    String OUTFIT_OF_THE_DAY = BASE_URL + "ootd";
    String OUTFIT_OF_THE_DAY_ADD = BASE_URL + "ootd/add";
    String OUTFIT_OF_THE_DAY_REMOVE = BASE_URL + "ootd/remove";
    String OUTFIT_LIKE = BASE_URL + "outfit/like";
    String OUTFIT_ADD = BASE_URL + "outfit/add";
    String OUTFIT_REMOVE = BASE_URL + "outfit/remove";
    String OUTFIT_SAVE = BASE_URL + "outfit/save";
    String OUTFIT_PUBLISH = BASE_URL + "outfit/publish";
    String PROFILE_SETTINGS_UPDATE = BASE_URL + "profile/settings/update";

    String OUTFIT_RESPOND = BASE_URL + "outfit/respond";

    String CATELOG = BASE_URL + "catalog";
    String DEVICE_REGISTER = BASE_URL + "device/register";
    String PRODUCT_HANG = "product/hang";
    String VOUCHER_VALIDATE = BASE_URL + "voucher-code/validate";
    String MASTERS_TAGS = BASE_URL + "masters/tags?search=";
    String MASTERS_STORES = BASE_URL + "masters/stores?search=";
    String ADD_TO_WISHLIST = BASE_URL + "product/wish";
    String CANVAS_REQUEST = BASE_URL + "canvas/request";


    //upcoming version
    String PRODUCTS = BASE_URL + "product";
    String PRODUCT_VIEW = BASE_URL + "product/view";
    String OTP_PHONE = "";
    String OTP_GENERATE = BASE_URL + "profile/otp/generate";
    String OTP_VERIFY = BASE_URL + "profile/otp/verify";
    String LOOKOOK = BASE_URL + "lookbook";
    String LOOKBOOK_VIEW = BASE_URL + "lookbook/view";
    String STYLE_REQUEST = BASE_URL + "request";
    String ACCOUNT_GET_OTP = BASE_URL + "account/getotp";
    String ACCOUNT_VERIFY_OTP = BASE_URL + "account/verify_otp";
    String WEATHER = BASE_URL + "weather";
    String CANVAS_OBJECTS = BASE_URL + "canvas/objects";


    /* GCM constants */
    String GCM_PROJECT_ID = "1023513032563";
    String GCM_API_KEY = "AIzaSyCgEx0Gr9Ub-DhHA5isOXDdohUPV4QuCHY";

    /* AppsFlyer constants */
    String APPSFLYER_CUST_ID = "KndP9FVY436fNNS5SMX2mh";

    /* SharedPreference Constants */
    String TEMP_IMAGE_STRING = "wodrob_temp_image";

    /* Instagram Constants */
    String INSTAGRAM_AUTH_URL = "https://api.instagram.com/oauth/authorize/";
    String INSTAGRAM_TOKEN_URL = "https://api.instagram.com/oauth/access_token";
    String INSTAGRAM_API_URL = "https://api.instagram.com/v1";
    String INSTAGRAM_CALLBACK_URL = "https://app.wodrob.com/callback/instagram";
    //String INSTAGRAM_API_KEY = "e451039891104d2fa22fafbfbb10f18c";
    //String INSTAGRAM_API_SECRET = "1fe8a3e2fc9440f3af5490d7d60bc299";
    String INSTAGRAM_API_KEY = "a85a6c61cef842a3833baa73d53b3a0c";
    String INSTAGRAM_API_SECRET = "719428dc5a014e649ed3e3804ccfd67c";

    /* Twitter Constants */
    //String TWITTER_CONSUMER_KEY = "CwzKBOyPwBxGEHV9KTEefAJT4";
    //String TWITTER_CONSUMER_SECRET = "HRmKmfa0KjQeLfJsKEsF3zki5iI3VQbZviqQgpSUNjOA0mFMIH";
    //String TWITTER_CALLBACK_URL = "http://www.tacto.in/";
    String TWITTER_CONSUMER_KEY = "CFHr9rME8mpdJrzI66L3tGdQX";
    String TWITTER_CONSUMER_SECRET = "g4ErbnSPqkuLwCwHXgxeIpA7ZsRgugoesg1FXYBvwXgjnB4m0e";
    String TWITTER_CALLBACK_URL = "https://app.wodrob.com/callback/twitter";

    String oAuthVerifier = "oauth_verifier";

    /* Shared preference keys */
    String PREF_NAME = "twitter_pref";
    String PREF_KEY_OAUTH_TOKEN = "oauth_token";
    String PREF_KEY_OAUTH_SECRET = "oauth_token_secret";
    String PREF_KEY_TWITTER_LOGIN = "is_twitter_loggedin";

}
