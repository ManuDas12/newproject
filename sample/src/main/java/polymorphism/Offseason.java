package polymorphism;

import java.util.Scanner;

public class Offseason extends Onseason{

	public static void main(String[] args) {
		Onseason m=new Offseason();
		System.out.println("enter the cost");
		Scanner input=new Scanner(System.in);
		double num=input.nextDouble();
		m.discount(num);
		
			
		

	}
	
	public void discount(double num) {
		super.discount(num);
		 double discount=0.15;
		System.out.println("total cost of 15%discount in offseasonis"+num* discount);
	}

}
