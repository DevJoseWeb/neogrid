package com.neogrid.bo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jose RF Junior
 */
public class Conference {
    List <Track> tracks;

    public Conference() {
        this.tracks = new ArrayList <>();
    }

    public List <Track> getTracks() {
        return tracks;
    }

    public void addTrack(Track track) {
        this.tracks.add(track);
    }
}


