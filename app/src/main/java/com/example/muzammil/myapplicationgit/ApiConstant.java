package com.example.muzammil.myapplicationgit;

import java.util.regex.Pattern;

public class ApiConstant {

    public static final String MASTERS_SYNC = "masters/sync";
    public static final String PROFILE_FRIENDS = "profile/friends";
    public static final String PROFILE_FOLLOWS = "profile/follows";
    public static final String PROFILE_FOLLOWERS = "profile/followers";
    public static final String PROFILE_FOLLOW = "profile/follow";
    public static final String PROFILE_UNFOLLOW = "profile/unfollow";
    public static final String PROFILE_BLOCK = "profile/block";
    public static final String PROFILE_UNBLOCK = "profile/unblock";
    public static final String PROFILE = "profile";
    public static final String MASTERS_TAGS = "masters/tags?";
    public static final String MASTERS_CITIES = "masters/cities";
    public static final String STORY_VIEW = "story/view";
    public static final String PROFILE_STORIES = "profile/stories";
    public static final String CANVAS_DELETE = "canvas/delete";
    public static final String PROFILE_NOTIFICATION = "profile/notification";
    public static final String NOTIFICATION_COUNT = "profile/notification/count";
    public static final String STORY_UNLIKE = "story/unlike";
    public static final String STORY_LIKE = "story/like";
    public static final String MASTERS_BRANDS = "masters/brands?";
    public static final String LOG_IN = "account/login";

    public static final String ADD_FRIEND = "profile/friend/add";
    public static final String REMOVE_FRIEND = "profile/friend/remove";
    public static final String ACCEPT_FRIEND = "profile/friend/accept";
    public static final String DECLINE_FRIEND = "profile/friend/decline";
    public static final String RETRACT_FRIEND = "profile/friend/retract";

    public static final String CONNECTIONS_INVITE = "connections/invite";
    public static final String CONNECTIONS_FRIENDS = "connections/friends";
    public static final String CONNECTIONS_FOLLOWS = "connections/follows";
    public static final String CLOSET_VIEW = "closet/view";
    public static final String CLOSET_UPDATE = "closet/update";
    public static final String CLOSET_ADD = "closet/add";
    public static final String CLOSET_STATUS = "closet/status";
    public static final String CANVAS = "canvas";
    public static final String OUTFIT_LIKE = "outfit/like";
    public static final String OUTFIT_ADD = "outfit/add";
    public static final String OUTFIT_REMOVE = "outfit/remove";
    public static final String OUTFIT_UNLIKE = "outfit/unlike";
    public static final String OUTFITS = "outfits";
    public static final String WEATHER = "weather";
    public static final String ADD_OOTD = "ootd/add";


    public static final String STORY_COMMENTS = "story/comments";
    public static final String COMMENT_ON_STORY = "story/comment";
    public static final String OUTFIT_LIKES = "outfit/likes";

    public static final String SEARCH = "search";
    public static final String SEARCH_OUTFIT = "search/outfits";
    public static final String SEARCH_PATRONS = "search/patrons";
    public static final String SEARCH_PRODUCTS = "search/products";
    public static final String SEARCH_STORES = "masters/stores";
    public static final String SEARCH_STORIES = "search/stories";
    public static final String PROFILE_INFLUENCER = "profile/influencers";
    public static final String CHANGE_PASSWORD = "profile/change-password";
    public static final String PROFILE_CLOSET = "profile/closet";
    public static final String CATALOG = "catalog";
    public static final String SETS = "sets";
    public static final String MASTERS_PRICES = "masters/prices";

    public static final String PROFILE_OUTFITS = "profile/outfits";

    public static final String DEVICE_REGISTER = "device/register";
    public static final String PROFILE_EDIT = "profile/edit";
    public static final String PROFILE_HANDLE_CHECK = "profile/handle/check";

    public static final String CANVAS_SUGGESTED = "canvas/suggested";
    public static final String PASSWORD_RESET = "account/password/reset";
    public static final String SOCIAL_LOGIN = "account/login/social";
    public static final String ACCOUNT_REGISTER = "account/register";
    public static final String ACCOUNT_LOGOUT = "account/logout";


    public static final String SEARCH_TAGS = "search/tags";
    public static final String SUGGESTED_FRIENDS = "connections/friends";
    public static final String SUGGESTED_INVITE = "connections/invite";
    public static final String PROFILE_SETTINGS_UPDATE = "profile/settings/update";

    public static final String SUGGESTED_FOLLOW = "connections/follows";
    public static final String FEED = "feed";
    public static final String FEED_SYSTEM = "feed/system";
    public static final String FEED_UPDATE = "feed/update";
    public static final String DECLINE_STYLE_REQUEST = "canvas/request/decline";

    public static final String ARCHIVE_STYLE_REQUEST = "canvas/archive";

    public static final String OOTD_ADD = "ootd/add";
    public static final String CANVAS_RESPONSES = "canvas/responses";
    public static final String OUTFIT_VIEW = "outfit/view";
    public static final String STORY_LIKES = "story/likes";
    public static final String STORY_SHARE = "story/share";
    public static final String CLOSET_REMOVE = "closet/remove";

    public static final String PRODUCT_RATE = "product/rate";

    public static final String DELETE_STORY = "story/delete";
    public static final String OUTFIT_OF_THE_DAY_ADD = "ootd/add";
    public static final String CANVAS_OBJECTS = "canvas/objects";
    public static final String CONNECTION_PROCESS = "connections/process";

    public static final String FLAG_PRODUCT = "product/flag";
    public static final String FLAG_STORY = "story/flag";
    public static final String FLAG_OUTFIT = "outfit/flag";
    public static final String VIEW_OUTFIT = "outfit/view";
    public static final String PROFILE_SETTINGS = "profile/settings";
    public static final String CREATE_CLOSET_PLACEHOLDER = "closet/placeholder/create";
    public static final String UPLOAD_CLOSET_PLACEHOLDER = "closet/placeholder/upload";
    public static final String PRODUCTS = "products";
    public static final String LOOKBOOK = "lookbook";
    public static final String CONTACTS = "contacts";
    public static final String ADD_PHONE_BOOK = "connections/phone-book";
    public static final String ADD_TO_CLOSET = "product/hang";
    public static final String MASTERS_INFLUENCERS = "masters/influencers";
    public static final String OUTFIT_OF_THE_DAY_REMOVE = "ootd/remove";
    public static final String PRODUCT_VIEW = "product/view";
    public static final String OOTD = "ootd";
    public static final String CLOSET = "closet";
    public static final String CLOSET_EXTRACT = "closet/extract";
    public static final String CREATE_STORY = "story/create";
    public static final String DISCOVER_FEED = "feed";
    public static final String LIST_STORES = "product/stores";
    public static final String CALENDAR_PREVIEW = "calendar-data";

    /***
     * Constants used in the app
     **/

    public interface Constants {
        String DELIMITER = ",";

        Pattern EMAIL_PATTERN = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}$", Pattern.CASE_INSENSITIVE);
        int PLAY_STORE_SERVICES = 30;
        int PICK_FROM_CAMERA = 31;
        int PICK_FROM_GALLERY = 32;
        int GOOGLE_SIGN_IN = 33;
        int FACEBOOK_SIGN_IN = 34;
        int PROFILE_EDIT = 35;
        int CANVAS_SELECT_IMAGE = 36;
        int PRODUCT_FILTER = 37;
        int ADD_OOTD = 38;
        int READ_CONTACTS_PERMISSION=39;
        int READ_EXTERNAL_STORAGE_PERMISSION=40;
        int ADD_ITEM=41;
        int ADD_OUTFIT=42;
        int ADD_LINK=43;
        int SEND_STYLE_REQUEST=44;

        String OUTFIT_ID = "OUTFIT_ID";
        String PRODUCT_ID = "PRODUCT_ID";
        String STORY_ID = "STORY_ID";
        String BASE64_PREFIX = "data:image/png;base64,";

        //Contants for filtering


        String CATEGORY_ID = "CATEGORY_ID";
        String CATEGORY_NAME = "CATEGORY_NAME";

        String SUB_CATEGORY_ID = "SUB_CATEGORY_ID";
        String SUB_CATEGORY_NAME = "SUB_CATEGORY_NAME";

        String STYLE_ID = "STYLE_ID";
        String STYLE_NAME = "STYLE_NAME";

        String BRAND_ID = "BRAND_ID";
        String BRAND_NAME = "BRAND_NAME";

        String SIZE_ID = "SIZE_ID";

        String COLOR_ID = "COLOR_ID";

        String STORE_ID = "STORES_ID";
        String STORE_NAME = "STORES_NAME";

        String TAGS_NAME = "TAGS_NAME";

        String OCCASION_ID = "OCCASION_ID";

        String OCCASION_NAME = "OCCASION_NAME";

        String COLLECTION_ID = "COLLECTION_ID";

        String COLLECTION_NAME = "COLLECTION_NAME";

        String TRENDS_NAME = "TRENDS_NAME";
        String NEW_NOTIFICATION_RECEIVED="com.wodrob.app.NEW_NOTIFICATION_RECEIVED";

        String OOTD_DATE="OOTD_DAY";

    }

}

