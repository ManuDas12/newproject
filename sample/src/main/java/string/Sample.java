package string;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="hello world";
		String str2="welcome";
		System.out.println(str1==str2);
		int l= str1.length();// built in function
		System.out.println(l);
		
		System.out.println(str1.charAt(1));
		
		
		System.out.println(str1.concat(str2));
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.contains("worl"));
		
		System.out.println(str1.replace('h', 'k'));
		
		System.out.println(str1.toUpperCase());
		
		System.out.println(str1.toLowerCase());
		
		System.out.println(str1.substring(0, 4));
		
		String arr[]=str1.split("e");
		for (String i:arr){
			System.out.println(i);
		}
		
		
	}

}

