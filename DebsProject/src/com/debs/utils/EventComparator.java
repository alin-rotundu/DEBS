package com.debs.utils;

import java.util.Comparator;
import com.debs.model.Event;

public class EventComparator implements Comparator<Event> {

	@Override
    public int compare(Event event1, Event event2) {
        return event1.getTimestamp().compareTo(event2.getTimestamp());
    }
}
