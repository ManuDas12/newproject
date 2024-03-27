package abstraction;
import java.util.Scanner;

public class Contractor extends Employee1 {

	public static void main(String[] args) {
		Contractor obj=new Contractor();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the salary of payment per hour");
		int sal=input.nextInt();
		System.out.println("enter the timeof working hours");
		float time=input.nextFloat();
		obj.calculatesalary(sal, time);
		
		System.out.println("Enter the salary of fulltime employee");
		int salary=input.nextInt();
		obj.Fulltime(salary);

	}
	
	public void calculatesalary(int sal,float time) {
		System.out.println("salary of part time employee");
		System.out.println("the total wage is "+ sal * time);
	}


}
