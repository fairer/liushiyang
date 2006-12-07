package person.liusy;

import java.util.List;

import person.liusy.exception.WuziQiException;

public class User {
	/**
	 * �û���
	 */
	private String userName;
	/**
	 * �Ƿ�ڷ����ڷ�Ϊtrue,�׷�Ϊfalse;
	 */
	private boolean isBlack;
	/**
	 * �û����ڵķ���
	 */
	private Room room;

	/**
	 * ���ӵķ��� �޸�qipan���� 1:�� 0:��
	 * @param x����
	 * @param y����
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
