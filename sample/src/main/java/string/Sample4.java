package string;

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer str=new StringBuffer("hi hello");
		StringBuffer str2=new StringBuffer("welcome");
		
		System.out.println(str.charAt(0));
		System.out.println(str.isEmpty());
		System.out.println(str.reverse());
		System.out.println(str.append(str2));
		System.out.println(str.deleteCharAt(2));
		System.out.println(str.insert(2, "M"));
		
		
		
	}

}
