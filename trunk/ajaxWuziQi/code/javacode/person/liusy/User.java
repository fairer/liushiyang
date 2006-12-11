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

	public int queryNum ;
	
	public User(String usName){
		this.userName = usName;
	}
	/**
	 * 返回0则继续走，返回1已胜利，棋完
	 * 
	 * 落子的方法 修改qipan数组 1:黑 0:白
	 * @param x坐标
	 * @param y坐标
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
				//返回胜利标志,本局完
				room.roomStatus = 3;
				return 1;
			}else{
				//返回本步已走完，客户端应轮循对方棋子走势
				return 0;
				
			}
		}
		else{
			throw new WuziQiException("");
		}
	}
	/**
	 * 根据步数取的棋谱里的走法
	 * @param i
	 * @return
	 */
	public QiPu getQiPuByNum(int i){
		
		List qipus = room.getQipus();
		if(qipus.get(i)!=null){
			QiPu qipu = (QiPu)qipus.get(i);
			return qipu;
			
		}else{
			//取不到该步棋，返回客户端继续轮询
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
