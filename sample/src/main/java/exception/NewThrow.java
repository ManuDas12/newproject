 package exception;

public class NewThrow {
int age=18; 

	public static void main(String[] args) {
		NewThrow obj= new NewThrow();
		obj.voting();

	}
	public void voting() {
		if(age>=18) {
			throw new ArithmeticException("eligible for voting");
		 }
		else {
			System.out.println("not eligible");
		  }
		}
	}


