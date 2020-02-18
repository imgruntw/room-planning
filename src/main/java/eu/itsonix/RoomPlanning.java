package eu.itsonix;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/room")
public final class RoomPlanning {

	private final RoomService service;

	public RoomPlanning(RoomService service) {
		this.service = service;
	}

	@GET
	@Path("/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public Room getRoom(@PathParam("name") String name) {
		return service.find(name);
	}
}
