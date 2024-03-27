package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Generic1 {

	public static void main(String[] args) {
		List <String> s=new ArrayList<String>();
		{
			s.add("hi");
			s.add("hello");
			s.add("heeeee");
			s.remove(1);
			s.remove("hi");
	}
	System.out.println(s);

//	set 
	s.set(1, "welcome");
	System.out.println(s);

	List <Integer> m =new ArrayList<Integer>();
	{
		m.add(2);
		m.add(3);
		System.out.println(m);
		
		//set
		m.set(1, 5);
		System.out.println(m);
	
}
	}
}
