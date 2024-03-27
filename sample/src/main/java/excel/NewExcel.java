package excel;

import java.io.IOException;

public class NewExcel {

	public static void main(String[] args) throws IOException {
		
		
		String value1=SampleExcel.getStringData(1, 1);
		System.out.println(value1);
		
		String value=SampleExcel.getIntegerData(1, 0);
		System.out.println(value); 
		

	}

}
