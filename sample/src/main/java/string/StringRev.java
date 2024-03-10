package string;

public class StringRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StringRev obj=new StringRev();
	obj.palindrome("java");
	obj.palindrome("Malayalam");
	}
	
	
		//StringBuffer sm=new StringBuffer("MALAYALAM");
		public void palindrome(String name) {
			StringBuilder s=new StringBuilder(name);
			String rev=s.reverse().toString();
			boolean flag=rev.equalsIgnoreCase(name);
			if(flag) {
				System.out.println("is palindrome");
			}
			else {
				System.out.println("not palindrome");
			}
		}
		
	//	System.out.println(sm.reverse());
		
		
		

	}


