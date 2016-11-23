package com.debs.model;

import java.util.Date;

public abstract class Event {

	protected Date timestamp;
	
	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
