
package person.liusy;

import java.util.ArrayList;
import java.util.List;


public class DaTing {

	private static int maxRooms = 100;
	public static List rooms = new ArrayList();

	public static Room createRoom(User us) {
		if (rooms.size() > maxRooms) {
			return null;
		}
		Room room = new Room(us);
		us.setRoom(room);
		us.queryNum = 1;
		rooms.add(room);
		return room;
	}
	public static Room joinRoom(User us,String roomId) {
		Room room = (Room)rooms.get(Integer.parseInt(roomId));
		if(room == null)
			return null;
		if(room.getUserB() != null)
			return null;
		room.setUserB(us);
		room.roomStatus =2;
		us.setRoom(room);
		us.queryNum = 1;
		return room;
	}
	public static boolean win(int col, int row, int c, int[][] mat) {
		int nh, nv, nd, ni, x, y;

		// 以下统计水平方向的连子数：
		x = col;
		nh = 1;
		while (x - 1 > -1 && mat[x - 1][row] == c) {
			nh = nh + 1;
			x = x - 1;
		}
		x = col;
		while (x + 1 < 20 && mat[x + 1][row] == c) {
			nh = nh + 1;
			x = x + 1;
		}
		if (nh >= 5)
			return true;
		// 以下统计垂直方向的连子数：
		nv = 1;
		y = row;
		while (y - 1 > -1 && mat[col][y - 1] == c) {
			nv = nv + 1;
			y = y - 1;
		}
		y = row;
		while (y + 1 < 20 && mat[col][y + 1] == c) {
			nv = nv + 1;
			y = y + 1;
		}
		if (nv >= 5)
			return true;
		// 以下统计正对角线方向的连子数：
		nd = 1;
		x = col;
		y = row;
		while (x - 1 > -1 && y - 1 > -1 && mat[x - 1][y - 1] == c) {
			nd = nd + 1;
			x = x - 1;
			y = y - 1;
		}
		x = col;
		y = row;
		while (x + 1 < 20 && y + 1 < 20 && mat[x + 1][y + 1] == c) {
			nd = nd + 1;
			x = x + 1;
			y = y + 1;
		}
		if (nd >= 5)
			return true;
		// 以下统计反对角线方向的连子数：
		ni = 1;
		x = col;
		y = row;
		while (x - 1 > -1 && y + 1 < 20 && mat[x - 1][y + 1] == c) {
			ni = ni + 1;
			x = x - 1;
			y = y + 1;
		}
		x = col;
		y = row;
		while (x + 1 < 20 && y - 1 > -1 && mat[x + 1][y - 1] == c) {
			ni = ni + 1;
			x = x + 1;
			y = y - 1;
		}
		if (ni >= 5)
			return true;

		return false;

	}
}
