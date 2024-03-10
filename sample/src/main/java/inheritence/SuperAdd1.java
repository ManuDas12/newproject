package inheritence;

public class SuperAdd1 extends SuperAdd {
	
public void check() {
	super.addition(num1, num2);
	
	if (total %10 ==0) {
		System.out.println("divisible");
	}
	else {
		System.out.println("not ");
	}
	
}
public static void main(String args[]) {
	SuperAdd1 obj2=new SuperAdd1();
	obj2.check();
}
}

 
