package selenium_myproject1;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	public static void main(String[] args) throws IOException {
		File f =new File("C:\\Users\\user\\eclipse-workspace\\selenium_myproject1\\excel\\demo.xlsx");
		FileInputStream stream = new FileInputStream(f);
        Workbook w = new XSSFWorkbook(stream);
        Sheet sheet = w.getSheet("data");
        Row r = sheet.getRow(2);
        Cell c = r.getCell(2);
        CellType type = c.getCellType();
        switch (type) {		
		case STRING: 
			String text = c.getStringCellValue();
			System.out.println(text);
			break;
		case NUMERIC:
			double d = c.getNumericCellValue();
			BigDecimal b = BigDecimal.valueOf(d);
			String n = b.toString();
			break;
			
		default:
			break;
		}
        
        
        
	}
	
	

}
