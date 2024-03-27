package excel;

import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class SampleExcel {

public static FileInputStream f;	

public static XSSFWorkbook w;

public static XSSFSheet s;

public static String getStringData(int a,int b) throws IOException{
	//int a and b for rep rows and coloums in excel
	f=new FileInputStream("‪‪C:\\Users\\Manu Das M\\Documents\\manudas.xlsx");
	w= new XSSFWorkbook(f);
	s=w.getSheet("Sheet1");
	
	XSSFRow t= s.getRow(a);
	XSSFCell h=t.getCell(b);
	return h.getStringCellValue();	
	
}

public static String getIntegerData(int a,int b) throws IOException{
	//int a and b for rep rows and coloums in excel
	f=new FileInputStream("‪C:\\Users\\Manu Das M\\Documents\\manudas.xlsx");
	w= new XSSFWorkbook(f);
	s=w.getSheet("Sheet1");
	XSSFRow t= s.getRow(a);    
	XSSFCell h= t.getCell(b);
	int p= (int) h.getNumericCellValue();
	return String.valueOf(p);
}
}
      

