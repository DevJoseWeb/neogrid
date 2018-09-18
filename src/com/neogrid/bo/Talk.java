package com.neogrid.bo;

/**
 * Created by Jose RF Junior
 */
public class Talk {

    private int durationInMinutes;
    private String title;

    public Talk(String title, int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
        this.title = title;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public String getTitle() {
        return title;
    }

}
