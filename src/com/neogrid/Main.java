package com.neogrid;

import com.neogrid.bo.Conference;
import com.neogrid.bo.Talk;
import com.neogrid.enums.DataOutputEnum;
import com.neogrid.enums.DataSourceEnum;
import com.neogrid.exceptions.UnsupportedDestinationException;
import com.neogrid.exceptions.UnsupportedSourceException;
import com.neogrid.util.ConferenceUtils;

import java.util.List;

/**
 * Created by Jose RF Junior
 */
public class Main {

    public static void main(String[] args) {

        ConferenceManager conferenceManager = new ConferenceManager();
        List <Talk> talkList = null;
        // Fetch the input talk list.
        try {
            talkList = conferenceManager.fetchTalksListFromSource(DataSourceEnum.FILE);
        } catch (UnsupportedSourceException e) {
            System.err.println(e.getMessage());
        }

        if (talkList == null || talkList.size() == 0)
            return;

        // Print talks.
        ConferenceUtils.printTalks(talkList);

        // Process and schedule talks into events and slots.
        Conference conference = conferenceManager.processAndScheduleTalks(talkList);

        // Output the conference events.
        try {
            conferenceManager.outputConferenceSchedule(conference, DataOutputEnum.CONSOLE);
        } catch (UnsupportedDestinationException e) {
            System.err.println(e.getMessage());
        }

    }
}
