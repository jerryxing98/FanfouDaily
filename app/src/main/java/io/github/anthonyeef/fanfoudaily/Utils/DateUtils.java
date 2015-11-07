package io.github.anthonyeef.fanfoudaily.Utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by anthonyeef on 11/7/15.
 */
public class DateUtils {


    public static String getCurrentDate() {
        SimpleDateFormat formator = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
//        int hour = c.get(Calendar.HOUR);
        int hour = c.get(Calendar.HOUR_OF_DAY);

        if (hour < 8 && hour > 0) {
            c.add(Calendar.DATE, -1);
        }
        return formator.format(c.getTime());
    }

    public static String getCurrentMonday() {
        SimpleDateFormat formator = new SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();
//        int hour = c.get(Calendar.HOUR);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        if (hour < 8 && hour > 0) {
            c.add(Calendar.DAY_OF_WEEK, -7);
        }

        return formator.format(c.getTime());
    }
}
