package abstraction;

public class AbstractChild extends AbstractSample {

	public static void main(String[] args) {
		AbstractChild obj=new AbstractChild();
		obj.display();
		obj.display1();

	}

	@Override
	public void display1() {
		System.out.println("iam printing");
		
	}

}
