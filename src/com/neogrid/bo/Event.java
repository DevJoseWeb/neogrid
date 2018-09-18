package com.neogrid.bo;

import java.util.Calendar;

/**
 * Created by Jose RF Junior
 */
public class Event {

    private Calendar startTime;
    private int durationInMinutes;
    private String title;

    public Event(Calendar startTime, String title, int durationInMinutes) {
        this.startTime = startTime;
        this.title = title;
        this.durationInMinutes = durationInMinutes;
    }

    public Calendar getStartTime() {
        return startTime;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public String getTitle() {
        return title;
    }

}
