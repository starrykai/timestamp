package com.ibbubb;

import java.text.SimpleDateFormat;
import java.util.TimeZone;

/**
 * Created by wukai on 2017/3/2.
 */
public class timestamp {

    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        System.out.println("long = " + t);

        SimpleDateFormat sdf_default = new SimpleDateFormat("yyy-MM-dd HH:mm");
        System.out.println(sdf_default.format(t));

        sdf_default.setTimeZone(TimeZone.getTimeZone("GMT+7:00"));
        System.out.println(sdf_default.format(t));

        sdf_default.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        System.out.println(sdf_default.format(t));

    }

}
