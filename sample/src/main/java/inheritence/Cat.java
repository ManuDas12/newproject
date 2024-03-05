package inheritence;

public class Cat extends Animal {

	public static void main(String[] args) {
		Cat obj=new Cat();
		obj.meow();

	}
	public void meow() {
		System.out.println("iam meow");
	}

}
