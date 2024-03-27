package encapsulation;
import java.util.Scanner;

public class Bank2 {
	
	public static void main(String[] args) {
		Bank1 bm=new Bank1();
		Scanner input=new Scanner(System.in);
		System.out.println("enter the pin number");
		int pin=input.nextInt();
		bm.setPin(pin);
		bm.getPin();
		
	}

	


}

