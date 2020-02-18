package eu.itsonix;

import java.time.ZonedDateTime;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RoomService {

	public Room find(String name) {
		final Room room = new Room();
		room.setName(name);
		room.setBookedStart(ZonedDateTime.now());
		room.setBookedEnd(ZonedDateTime.now().plusHours(1));

		return room;
	}
}
