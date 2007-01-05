
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
		us.setBlack(true);
		rooms.add(room);
		return room;
	}
	public static Room joinRoom(User us,String roomId) {
		Room room = null;
		if(rooms.size() > Integer.parseInt(roomId))
			room = (Room)rooms.get(Integer.parseInt(roomId));
		if(room == null)
			return null;
		if(room.getUserB() != null)
			return null;
		room.setUserB(us);
		room.roomStatus =2;
		us.setRoom(room);
		us.queryNum = 0;
		us.setBlack(false);
		return room;
	}
	public static boolean win(int col, int row, int c, int[][] mat) {
		int nh, nv, nd, ni, x, y;

		// ����ͳ��ˮƽ�������������
		x = row;
		nh = 1;
		while (x - 1 > -1 && mat[x - 1][col] == c) {
			nh = nh + 1;
			x = x - 1;
		}
		x = row;
		while (x + 1 < 20 && mat[x + 1][col] == c) {
			nh = nh + 1;
			x = x + 1;
		}
		if (nh >= 5)
			return true;
		// ����ͳ�ƴ�ֱ�������������
		nv = 1;
		y = col;
		while (y - 1 > -1 && mat[row][y - 1] == c) {
			nv = nv + 1;
			y = y - 1;
		}
		y = col;
		while (y + 1 < 20 && mat[row][y + 1] == c) {
			nv = nv + 1;
			y = y + 1;
		}
		if (nv >= 5)
			return true;
		// ����ͳ�����Խ��߷������������
		nd = 1;
		x = row;
		y = col;
		while (x - 1 > -1 && y - 1 > -1 && mat[x - 1][y - 1] == c) {
			nd = nd + 1;
			x = x - 1;
			y = y - 1;
		}
		x = row;
		y = col;
		while (x + 1 < 20 && y + 1 < 20 && mat[x + 1][y + 1] == c) {
			nd = nd + 1;
			x = x + 1;
			y = y + 1;
		}
		if (nd >= 5)
			return true;
		// ����ͳ�Ʒ��Խ��߷������������
		ni = 1;
		x = row;
		y = col;
		while (x - 1 > -1 && y + 1 < 20 && mat[x - 1][y + 1] == c) {
			ni = ni + 1;
			x = x - 1;
			y = y + 1;
		}
		x = row;
		y = col;
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
