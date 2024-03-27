package encapsulation;

public class Bank1 {
	
private int a=1001;
private int b=1234;
private int c=1212;
private int pin;



public void getPin() {
	System.out.println(pin);
	
}
public void setPin(int pin) {
	this.pin=pin;
	if(pin==a || pin==b || pin==c) {
		System.out.println("valid pin");
	}
	else {
		System.out.println("invalid");
	}

}
}

