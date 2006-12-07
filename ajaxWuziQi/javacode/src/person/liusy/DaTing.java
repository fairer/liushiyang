package person.liusy;

import java.util.ArrayList;
import java.util.List;

public class DaTing {

	private int maxRooms = 100;
	public static List rooms = new ArrayList();
	
	public Room createRoom(User us){
		
		Room room = new Room(us);
		rooms.add(room);
		return room;
	}
}
