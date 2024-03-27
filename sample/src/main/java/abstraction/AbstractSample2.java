package abstraction;

public class AbstractSample2 extends AbstractSample1 {

	public static void main(String[] args) {
	AbstractSample2 obj=new AbstractSample2();
	obj.hi();
	obj.sum(20);

	}

	@Override
	public void sum(int n) {
		System.out.println(n*20);
		
	}

}
