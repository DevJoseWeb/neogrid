package com.neogrid.bo;

import com.neogrid.ConferenceManagementConfig;

/**
 * Created by Jose RF Junior
 */
public class Lunch extends Event {
    public Lunch() {
        super(ConferenceManagementConfig.LUNCH_START_TIME, "Lunch", ConferenceManagementConfig.LUNCH_DURATION_MINUTES);
    }
}
