package exception;

public class UserdefExcep {
int age=18;

	public static void main(String[] args) throws VotingException {
		UserdefExcep obj=new UserdefExcep();
		obj.voting(12);
	}
	
	public void voting(int age) throws VotingException {
		if(age<18) {
			throw new VotingException("not eligible for voting");
		 }
		else {
			System.out.println("eligible");
		  }
		}

}

