package supersample;

public class SuperChild extends SuperDem {
int age=4;

	public static void main(String[] args) {
		SuperChild obj=new SuperChild();
		obj.print();
		obj.display1();
		
		
	
	}
	public void print() {
		System.out.println(age);
		System.out.println(super.age);//refer instance variable
	}
	
	public void display() {//refer instance method
		System.out.println("iam new method");
	}
	public void display1() {
		super.display();
		this.display();
	}

}
