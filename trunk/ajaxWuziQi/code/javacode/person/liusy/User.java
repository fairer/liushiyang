package person.liusy;

import java.util.List;

import person.liusy.exception.WuziQiException;

public class User {
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 是否黑方，黑方为true,白方为false;
	 */
	private boolean isBlack;
	/**
	 * 用户所在的房间
	 */
	private Room room;

	/**
	 * 落子的方法 修改qipan数组 1:黑 0:白
	 * @param x坐标
	 * @param y坐标
	 */
	public void luoZi(int x,int y) throws WuziQiException{
		
		List qipus = room.getQipus();
		int[][] qipan = room.getQipan();
		if(!(isBlack^room.isBlackGo)){
			qipan[x][y] = isBlack?1:0; 
			QiPu qipu = new QiPu();
			qipu.isBlack = isBlack;
			qipu.x = x;
			qipu.y = y;
			qipus.add(qipu);
			room.isBlackGo = !room.isBlackGo;
		}
		else{
			throw new WuziQiException("");
		}
	}
	
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
