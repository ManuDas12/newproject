package exception;

public class ExceptionSample {

	public static void main(String[] args) {
		int a=20;
		int b=0;
		
		
		try {
		int c=a/b;
		System.out.println(c);
		}
		/*catch(ArithmeticException s) {
			System.out.println("zero division error");
		}*/
		finally {
			System.out.println("program 1 succesfull");
		}

	}

}
