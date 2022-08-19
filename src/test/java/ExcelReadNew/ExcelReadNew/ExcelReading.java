package ExcelReadNew.ExcelReadNew;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {


	public Map<String ,String > getdata(String FileName, String sheetname ) throws IOException {
	
		Map<String ,String > map=new HashMap<String ,String >();
		
	FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Downloads\\DatadriverExcel - Copy\\"+FileName );
	
	
	XSSFWorkbook workbook  = new XSSFWorkbook(fis);
	
	
	XSSFSheet sheet = workbook.getSheet(sheetname);
	

	
	Row r1=   sheet.getRow(0);
	
	Row r2= sheet.getRow(1);
	
	int last= r2.getLastCellNum();
	System.out.println(last);
		
	  for (int j = 0; j < last ; j++)  
//      {
//        	//System.out.print(row.getCell(j).getStringCellValue()+"|| ");
//    	//System.out.print(row1.getCell(j).getStringCellValue()+" "+row2.getCell(j).getStringCellValue()); 
//    	Cell cell = r2.getCell(j);
//    	
//    	//System.out.println(cell);
//    	if(cell.getCellType() ==CellType.NUMERIC)
//    	{
//    		String value=String.valueOf(r2.getCell(j).getNumericCellValue()); 
//    		String cellValue[]=value.split("\\.");
//    		//System.out.println(cellValue[0]);
//    		map.put(r1.getCell(j).getStringCellValue(),cellValue[0]);	
//    	}
//    	else
//    		if(cell.getCellType() ==CellType.STRING)
    	{
    			map.put(r1.getCell(j).getStringCellValue(),r2.getCell(j).getStringCellValue());
    	}
    	  	    		          
     

		
		return map;
	 }
	

	



}
