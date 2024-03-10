package inheritence;

public class Daughter extends Father{

	
	public static void main(String[] args) {
		Daughter ob=new Daughter();
		ob.familyname();
		System.out.println(ob.name);
		ob.fath();
		ob.buds();
		System.out.println();
		ob.dau();
		
		
		

	}
	
	public void dau() {
		System.out.println("Hi iam  riya his daughter");
	}

}
