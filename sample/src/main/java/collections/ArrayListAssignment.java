package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAssignment {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList();{
			ar.add("red");
			ar.add("blue");
			ar.add("green");
			ar.add("black");
		}
		System.out.println(ar);
		System.out.println();
		
		String j=ar.get(2);
		System.out.println(j);
		System.out.println();
		
		Iterator<String> ik=ar.iterator();
		while(ik.hasNext()) {
			System.out.println(ik.next());
		}
		
		System.out.println();
		String m=ar.remove(2);
		System.out.println(m);
		
		System.out.println();
		boolean r=ar.contains("blue");
		System.out.println(r);

	}

}
