package collections;
import java.util.*;

public class SetCollect {

	public static void main(String[] args) {
		HashSet<String> s1=new HashSet<String>();{
			s1.add("Manu");
			s1.add("Hello");
			s1.add("welcome");
			s1.add("Hello");
			
			boolean t=s1.contains("welcome"); //check it contains given element.
			System.out.println(t);
			boolean m=s1.isEmpty(); //return true if set contains elements 
			System.out.println(m);
			
			System.out.println(s1);
			
			int c=s1.size();//returns total no of items.
			System.out.println(c);
			
			boolean m2=s1.remove("Hello"); //remove specific item
			System.out.println(m2);
			
			System.out.println(s1);
			
			s1.clear();
			System.out.println();
			
			
			}
		
		Set<String> p= new HashSet<String>();
		{
			p.add("iam1");
			p.add("iam2");
			p.add("iam3");
			p.add("iam4");
			
			boolean u= p.contains("iam4");
			boolean l=p.isEmpty();
			System.out.println(l);
			System.out.println(p);
			System.out.println(u);
			System.out.println(p.size());
		}
		 

		
	}

}
