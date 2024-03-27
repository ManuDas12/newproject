package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayCollect {

	public static void main(String[] args) {
		ArrayList<String> y = new ArrayList();
		{
			y.add("hi");
			y.add("hello");
			y.add("kkk");
			y.add("hhh");
			y.add("hyyy");
			
			
		}
		ArrayList<String> h = new ArrayList();{
			h.add("dog");
			h.add("cat");
			h.add("cow");
			h.add("horse");
			
			boolean a=h.contains("cow");
			System.out.println(a);
			
			boolean g=h.isEmpty();
			System.out.println(g);
			
			String p=h.get(1);
			System.out.println(p);
			
			String n1=h.remove(1);
			System.out.println(n1);
			
			Iterator<String> it=h.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
				//System.out.println(it.remove());
			}
			
			
		} 
		
		y.addAll(h);
		
		System.out.println(y);
		System.out.println(h.remove(h.size() -1));
		System.out.println(h.size());
		
		
	}

}
