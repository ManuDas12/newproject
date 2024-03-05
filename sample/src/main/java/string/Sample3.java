package string;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str=new StringBuilder("hello ");
		StringBuilder str2=new StringBuilder(" welcome to class");
		System.out.println(str.append(str2));
		
		System.out.println(str.charAt(0));
		System.out.println(str.isEmpty());
		System.out.println(str.reverse());
		//System.out.println(str.capacity());
		System.out.println(str.append(str2));
	}
	

}
