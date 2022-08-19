package ExcelReadNew.ExcelReadNew;

import java.io.IOException;
import java.util.Map;



public class GetCell {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		ExcelPractice obj = new ExcelPractice();
		Map<String, String> map= 	obj.getdata("datadriven.xlsx", "testdata");
		System.out.println(map.get("testnew12"));

	}

}
