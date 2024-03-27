package interfacesample;

public class InterfaceChild implements Interface22, Interface23 {

	@Override
	public void display() {
		System.out.println("this is interface");

	}
	
	@Override
	public void display1() {
		System.out.println("new interface");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceChild obj=new InterfaceChild();
		obj.display();
		obj.display1();
	}




}
