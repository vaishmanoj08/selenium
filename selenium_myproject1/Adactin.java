package selenium_myproject1;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class Adactin  extends BaseClass {
	public static void main(String[] args) throws IOException {
		
		Adactin h = new Adactin();
		h.BrowserConfigChrome();
	    h.openurl("https://adactinhotelapp.com/");
		h.maximizewindow();
		WebElement element = h.findLocatorsbyid("username");
		InputText(element, h.excelread("C:\\Users\\user\\eclipse-workspace\\selenium_myproject1\\excel\\demo.xlsx", "Sheet2", 1,0));
		 WebElement element2 = h.findLocatorsbyid("password");
		 InputText(element2, h.excelread("C:\\Users\\user\\eclipse-workspace\\selenium_myproject1\\excel\\demo.xlsx", "Sheet2", 1,1 ));
		 click(h.findLocatorsbyname("login"));
		 h.Closebrowser();
		 }

}

