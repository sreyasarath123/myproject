package Pro1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Prolog {
	WebDriver driver;
	By titile=By.xpath("//*[@id=\"SiteHeader\"]/div[1]/div/div[1]/h1/a/img[2]");
	
By btn=By.xpath("//*[@id=\"SiteHeader\"]/div[1]/div/div[3]/div[2]/div/a[2]");
By create=By.xpath("//*[@id=\"customer_register_link\"]");
By name=By.xpath("//*[@id=\"FirstName\"]");
By last=By.xpath("//*[@id=\"LastName\"]");
By email=By.xpath("//*[@id=\"Email\"]");
By num=By.xpath("//*[@id=\"customer_phone\"]");
By psw=By.xpath("//*[@id=\"CreatePassword\"]");
By button=By.xpath("//*[@id=\"create_customer\"]/p/input[1]");

public Prolog(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}
public void img()
{
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
String actualtitle=driver.getTitle();
System.out.println("TITLE OF THE PAGE" +actualtitle);
String excepted="Buy Eyeshadow Brush Online At Best Prices Online - Swiss Beauty";
Assert.assertEquals(actualtitle, excepted);
System.out.println("assertion passed logo is present on the website");


}

public void login()
{
	driver.findElement(btn).click();
	
}
public void create() {
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	driver.findElement(create).click();
}
public void setvalue(String value,String lname,String mail,String number,String pass)
{
	driver.findElement(name).sendKeys(value);
	driver.findElement(last).sendKeys(lname);
	driver.findElement(email).sendKeys(mail);
	driver.findElement(num).sendKeys(number);
	driver.findElement(psw).sendKeys(pass);
}
public void buttonclick()
{
	driver.findElement(button).click();
}

//}

		
	}



