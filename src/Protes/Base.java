package Protes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Base {
	WebDriver driver;
	@BeforeClass
	public void set() {
		driver=new ChromeDriver();
		driver.get("https://swissbeauty.in/");
		
	}
	
	

}



