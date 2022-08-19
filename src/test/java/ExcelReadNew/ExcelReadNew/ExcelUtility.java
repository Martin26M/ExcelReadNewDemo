package ExcelReadNew.ExcelReadNew;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtility {

	public static  String getcelldata(String sheetname, int rownum, int colnum) throws IOException {

		File f = new File("C:\\Users\\HP\\Downloads\\DatadriverExcel - Copy\\datadriven.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetname);

		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
	
		int colcount = sheet.getRow(0).getLastCellNum();
		System.out.println(colcount);
		XSSFCell cell  = sheet.getRow(rownum).getCell(colnum);
		DataFormatter data = new DataFormatter();
		String celldata  =data.formatCellValue(cell);

		return celldata;
	}
	
	public static void main(String[] args) throws IOException {
		
		try {
			System.out.println(ExcelUtility.getcelldata("testdata", 4, 2));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
