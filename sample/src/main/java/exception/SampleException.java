package exception;

public class SampleException {

	public static void main(String[] args) {
		String name=null;
		
		try {
			System.out.println(name.length());
		}
		catch(NullPointerException p) {
			System.out.println("string error");
		}
		finally {
			System.out.println("successfully completed");
		}
	}

}
