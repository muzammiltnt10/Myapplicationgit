package com.example.muzammil.myapplicationgit;

import com.google.gson.annotations.SerializedName;

public class DeviceRegistrationModel {

    @SerializedName("device")
    public Device device;

    public class Device {
        @SerializedName("_id")
        public String _id;

        @SerializedName("patron_id")
        public String patron_id;

        @SerializedName("uuid")
        public String uuid;

        @SerializedName("device_type")
        public String device_type;

        @SerializedName("app_version")
        public String app_version;

        @SerializedName("model_number")
        public String model_number;

        @SerializedName("push_notification_key")
        public String push_notification_key;

        @SerializedName("created_by")
        public CreatedBy created_by;

        public class CreatedBy {
            @SerializedName("id")
            public String id;

            @SerializedName("type")
            public String type;


        }

        @SerializedName("device_os")
        public String device_os;

    }

    @SerializedName("token")
    public Token token;

    public class Token {
        @SerializedName("access_token")
        public String access_token;

        @SerializedName("token_type")
        public String token_type;

        @SerializedName("expires_in")
        public String expires_in;


    }


}
