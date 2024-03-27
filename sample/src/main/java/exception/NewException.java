package exception;

public class NewException {
int age;
	public static void main(String[] args) throws VotingExcpetion {
		NewException d=new NewException();
		d.hellovoting(12);
		

	}
	public void hellovoting(int age) throws VotingExcpetion {
		if(age>18) {
			System.out.println("success");
		}
		else {
			throw new VotingExcpetion("failed");
		}
	}

}
