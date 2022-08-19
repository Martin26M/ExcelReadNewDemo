package ExcelReadNew.ExcelReadNew;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPractice {
	
	public Map<String, String> getdata(String FileName,String Sheetname) throws IOException {
	Map<String,String>map = new HashMap<String,String>();
	
	FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Downloads\\DatadriverExcel - Copy\\"+FileName);
	
	XSSFWorkbook workbook = new XSSFWorkbook(fis);
	
	XSSFSheet sheet=       workbook.getSheet(Sheetname);
	
	XSSFRow r1= sheet.getRow(0);
	XSSFRow r2= sheet.getRow(1);
	
	int last = r1.getLastCellNum();
	
	for (int i =0; i<last; i++) {
		
		XSSFCell cell =	r1.getCell(i);
		
		
		map.put(r1.getCell(i).getStringCellValue(), r2.getCell(i).getStringCellValue());
		
	}
	
	
	
	
	return map;
	
	
	
	
	
	
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
