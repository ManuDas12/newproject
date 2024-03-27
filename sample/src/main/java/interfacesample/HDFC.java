package interfacesample;
import java.util.Scanner;

public class HDFC implements Rbi {

	@Override
	public void recurringdeposit(int amount,int duration) {
		System.out.println("recurring deposit");
		int total=amount*rate*duration;
		System.out.println("The total amount of " +amount+ " for the  "+duration+ " time with intrest rate of " +rate+ " is "+total);
		

	} 

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		HDFC bank=new HDFC();
		System.out.println("enter the principle amount");
		int amount=input.nextInt();
		System.out.println("enter the duration or time period");
		int duration=input.nextInt();
		bank.recurringdeposit(amount, duration);

	}

}
