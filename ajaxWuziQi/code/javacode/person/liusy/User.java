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

	public int queryNum ;
	
	public User(String usName){
		this.userName = usName;
	}
	/**
	 * ����0������ߣ�����1��ʤ��������
	 * 
	 * ���ӵķ��� �޸�qipan���� 1:�� 0:��
	 * @param x����
	 * @param y����
	 */
	public int luoZi(int x,int y) throws WuziQiException{
		
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
			if(DaTing.win(y,x,isBlack?1:0,qipan)){
				//����ʤ����־,������
				room.roomStatus = 3;
				return 1;
			}else{
				//���ر��������꣬�ͻ���Ӧ��ѭ�Է���������
				return 0;
				
			}
		}
		else{
			throw new WuziQiException("");
		}
	}
	/**
	 * ���ݲ���ȡ����������߷�
	 * @param i
	 * @return
	 */
	public QiPu getQiPuByNum(int i){
		
		List qipus = room.getQipus();
		if(qipus.get(i)!=null){
			QiPu qipu = (QiPu)qipus.get(i);
			return qipu;
			
		}else{
			//ȡ�����ò��壬���ؿͻ��˼�����ѯ
			return null;
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
