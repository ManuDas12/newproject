package collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveCollec {

	
	public static void main(String[]args) {
		List <String> t=new ArrayList<String>();
		{
		t.add("type");
		t.add("typing");
		t.add("hhhhh");
		boolean mm=t.contains("hhhhh");
		String r=t.get(0);
		t.remove(1);
		System.out.println(r);
		System.out.println(mm);
	   
		
	}
		
	System.out.println();
	
	
}
}
