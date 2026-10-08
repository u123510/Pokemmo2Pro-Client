/*
 * Decompiled with CFR 0.152.
 */
package ch.qos.logback.core.util;

import java.util.Calendar;
import java.util.Date;

public class TimeUtil {
    public static long computeStartOfNextSecond(long l) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(l));
        calendar.set(14, 0);
        calendar.add(13, 1);
        return calendar.getTime().getTime();
    }

    public static long computeStartOfNextMinute(long l) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(l));
        calendar.set(14, 0);
        calendar.set(13, 0);
        calendar.add(12, 1);
        return calendar.getTime().getTime();
    }

    public static long computeStartOfNextHour(long l) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(l));
        calendar.set(14, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.add(10, 1);
        return calendar.getTime().getTime();
    }

    public static long computeStartOfNextDay(long l) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(l));
        calendar.add(5, 1);
        calendar.set(14, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(11, 0);
        return calendar.getTime().getTime();
    }

    public static long computeStartOfNextWeek(long l) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(l));
        calendar.set(7, calendar.getFirstDayOfWeek());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(3, 1);
        return calendar.getTime().getTime();
    }

    public static long computeStartOfNextMonth(long l) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(l));
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(2, 1);
        return calendar.getTime().getTime();
    }
}

