package person.liusy;

import java.util.ArrayList;
import java.util.List;

public class Room {
	/**
	 * �ڷ�
	 */
	private User userA;
	/**
	 * �׷�
	 */
	private User userB;
	/**
	 * ����
	 */
	private List qipus;
	/**
	 * ����
	 */
	private int[][] qipan ;
	/**
	 * ��ǰӦ�����ӷ�:trueΪ�ڷ�,falseΪ�׷�;
	 */
	public boolean isBlackGo;
	public Room(User us){
		userA = us;
		qipan= new int[20][20];
		qipus = new ArrayList();
		clearQipan();
	}
	
	private void clearQipan(){
		for(int i = 0;i<qipan.length;i++){
			for(int j=0;j< qipan[i].length;j++){
				qipan[i][j] = -1;
			}
		}
	}

	public int[][] getQipan() {
		return qipan;
	}

	public void setQipan(int[][] qipan) {
		this.qipan = qipan;
	}

	

	public List getQipus() {
		return qipus;
	}

	public void setQipus(List qipus) {
		this.qipus = qipus;
	}

	public User getUserA() {
		return userA;
	}

	public void setUserA(User userA) {
		this.userA = userA;
	}

	public User getUserB() {
		return userB;
	}

	public void setUserB(User userB) {
		this.userB = userB;
	}
}
