package selenium_myproject1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
	public static void main(String[] args) throws IOException {
		/*
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		*/
		Testing t = new Testing();
		File f = new File("C:\\Users\\user\\eclipse-workspace\\selenium_myproject1\\excel\\testing.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.createSheet("data");

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.createCell(j);
			CellType type = c.getCellType();
			switch (type) {
			case STRING:
				String text = c.getStringCellValue();
				System.out.println(text);
				break;
			case NUMERIC:
				double d = c.getNumericCellValue();
				BigDecimal b = BigDecimal.valueOf(d);
				String numeric = b.toString();
				System.out.println(numeric);
			default:
				break;
			}
			System.out.println(c);
		}	
		}
		
	}

}
