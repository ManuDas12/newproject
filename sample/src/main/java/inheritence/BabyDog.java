package inheritence;

public class BabyDog extends Dog {
	String name="spike";

	public static void main(String[] args) {
		BabyDog obj=new BabyDog();
obj.display();
obj.display3();
System.out.println(obj.name);
	}
	
public void display3() {
	System.out.println("hi iam baby dog");
}
}
