package com.neogrid.bo;

import com.neogrid.ConferenceManagementConfig;

/**
 * Created by Jose RF Junior
 */
public class Networking extends Event {

    public Networking() {
        super(ConferenceManagementConfig.NETWORKING_START_TIME, "Networking Event", 0);
    }
}
