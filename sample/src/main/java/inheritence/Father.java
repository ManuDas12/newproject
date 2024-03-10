package inheritence;

public class Father extends GrandFather {

	
	
	public static void main(String[] args) {
	Father f=new Father();
	f.familyname();
	System.out.println(f.name);
	f.msg();
	f.fath();
	}
	
	
	


public void buds() {
	System.out.println("my childrens");
}
public void fath() {
	System.out.println("hi iam father");
}
}
