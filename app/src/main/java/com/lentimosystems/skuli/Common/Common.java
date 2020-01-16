package com.lentimosystems.skuli.Common;

import android.location.Location;

import com.lentimosystems.skuli.Model.User;

public class Common {
    public static final String driver_tbl = "Schools";
    public static final String user_driver_tbl = "SchoolInformation";
    public static final String user_rider_tbl = "ParentsInformation";
    public static final String pickup_request_tbl = "PickupRequest";
    public static final String token_tbl = "Tokens";

    public static User currentUser;

    public static Location mLastLocation = null;
}
