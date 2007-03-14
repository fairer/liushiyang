package name.xio;

import java.util.ArrayList;
import java.util.Collection;

public class Test {

	static Collection c = new ArrayList();
	
	public static void main(String args[]){
		String a = new String("1");
		c.add(a);
//		String b = "1";
		String b = new String("1");
		System.out.println("====="+c.remove(b));
		System.out.println("====="+c.size());
	}
	
	
}
