package polymorphism;

public class MethodChild extends MethodOver {

	public static void main(String[] args) {
		MethodChild obj=new MethodChild();
		obj.display();
		
	}
		public void display(){
			super.display();
			System.out.println("another sample text");
		}

	}


