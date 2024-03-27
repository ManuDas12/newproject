package inheritence;

public class Dog extends Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Dog obj=new Dog();
  System.out.println("color is " +obj.color);
  obj.sound();
	}
	public void display() {
		System.out.println("bow bow");
	}
   
	
}
