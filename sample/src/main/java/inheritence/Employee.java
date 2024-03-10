package inheritence;
import java.util.Scanner;

public class Employee {
	
  double bpay=40000;
  double ded=2000;
  double bonus=6000;
  
   public void display() { 
	  Scanner input=new Scanner(System.in);
	  
	  System.out.println("Enter the Basic pay" );
	  	bpay=input.nextDouble();
	  System.out.println("enter Deduction");
	  ded=input.nextDouble();
	  System.out.println(" enter Bonus" );
	  bonus=input.nextDouble();
	  }
}

	

