package collections;

import java.util.LinkedList;

public class LinkedColle {

	public static void main(String[] args) {
		LinkedList<String> j=new LinkedList<String>();  
		{
			j.add("hei");
			j.add("hello");
			j.add("haiiii");
			j.add("hei");
			j.add(2, "goodmorning");
			j.addLast("eve");
			String  m=j.get(2);
			int n=j.indexOf("eve");
			int h=j.lastIndexOf(j);
			System.out.println(m);
			System.out.println(n);
			System.out.println(h);
			
			
		}
		
		System.out.println(j);
		
		

	}

}
