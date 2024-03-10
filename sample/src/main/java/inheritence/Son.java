package inheritence;

public class Son extends Father {

	
	
	public static void main(String[] args) {
		Son obj1=new Son();
		obj1.familyname();
		System.out.println(obj1.name);
		obj1.fath();
		obj1.buds();
		System.out.println();
		obj1.sson();
		

	}
	public void sson() {
		System.out.println("Hi iam rony his son ");
	}

}