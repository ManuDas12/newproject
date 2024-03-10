package inheritence;

public class SalarySlip extends Salary1 {
	double total;

	public static void main(String[] args) {
		SalarySlip sp=new SalarySlip();
		sp.display();
		sp.sal();
		sp.totalslip();
		sp.genslip();

	}
	
	
	public void totalslip() {
		total= bpay+hra-pf-ded+bonus;
	}
	public void genslip() {
		System.out.println("Salary slip");
		System.out.println("Basicpay is "+bpay);
		System.out.println("Deduction is "+ded);
		System.out.println("Hra is "+hra);
		System.out.println("pf is "+pf);
		System.out.println("bonus is "+bonus);
		System.out.println("total salary is "+total);
		
	}
	

}
