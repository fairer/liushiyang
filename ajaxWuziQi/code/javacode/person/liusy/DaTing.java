package person.liusy;

import java.util.ArrayList;
import java.util.List;

public class DaTing {

	private int maxRooms = 100;
	public static List rooms = new ArrayList();
	
	public Room createRoom(User us){
		if(rooms.size()>maxRooms){
			return null;
		}
		Room room = new Room(us);
		us.setRoom(room);
		rooms.add(room);
		return room;
	}
}
