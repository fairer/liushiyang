package jflymessage.util;

import java.net.InetAddress;
import java.util.ArrayList;

public class TableList extends ArrayList{

	public int find (String ip){
		
		for(int i=0;i<this.size();i++){
			InetAddress address = (InetAddress)this.get(i);
			if(address.getHostAddress().equals(ip)){
				return i;
			}
		}
		return -1;
	}
	
}
