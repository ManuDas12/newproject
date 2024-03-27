package interfacesample;

public class InterfaceHi implements InterfaceSample {

	
	public void hi() {
		System.out.println("sample interface");

	}

	public static void main(String[] args) {
		InterfaceHi obj=new InterfaceHi();
		obj.hi();

	}

}
