package eu.itsonix;

import java.time.ZonedDateTime;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.json.bind.annotation.JsonbProperty;

public final class Room {

	@JsonbProperty
	private String name;
	@JsonbDateFormat("yyyy-MM-dd HH:mm:ss")
	private ZonedDateTime bookedStart;
	@JsonbDateFormat("yyyy-MM-dd HH:mm:ss")
	private ZonedDateTime bookedEnd;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ZonedDateTime getBookedStart() {
		return bookedStart;
	}

	public void setBookedStart(ZonedDateTime bookedStart) {
		this.bookedStart = bookedStart;
	}

	public ZonedDateTime getBookedEnd() {
		return bookedEnd;
	}

	public void setBookedEnd(ZonedDateTime bookedEnd) {
		this.bookedEnd = bookedEnd;
	}
}
