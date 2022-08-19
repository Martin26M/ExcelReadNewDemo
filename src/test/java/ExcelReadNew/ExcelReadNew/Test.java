package ExcelReadNew.ExcelReadNew;

import java.io.IOException;
import java.util.Map;

public class Test {

	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		ExcelReading excelread = new ExcelReading ();
		
		  Map<String,String>map = excelread.getdata("datadriven.xlsx", "testdata");
		 System.out.println(map.get("testdatanew")); 
		 
		 

	}

}
