package person.liusy;

public class Room {

	private User userA;
	private User userB;
	private int[][] qipan ;
	
	public Room(User us){
		userA = us;
		qipan= new int[20][20];
		clearQipan();
	}
	
	private void clearQipan(){
		for(int i = 0;i<qipan.length;i++){
			for(int j=0;j< qipan[i].length;j++){
				qipan[i][j] = -1;
			}
		}
	}
}
