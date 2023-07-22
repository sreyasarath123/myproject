package Pro1;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Indexpage {
	WebDriver driver;
	By loginbutton=By.xpath("//*[@id=\"SiteHeader\"]/div[1]/div/div[3]/div[2]/div/a[2]");
	By namelogin=By.xpath("//*[@id=\"CustomerEmail\"]");
	By pswlogin=By.xpath("//*[@id=\"CustomerPassword\"]");
	By loginclick=By.xpath("//*[@id=\"customer_login\"]/p[1]/button");
	By face=By.xpath("//*[@id=\"SiteHeader\"]/div[1]/div/div[2]/ul/li[1]/a");
	By foun=By.xpath("//*[@id=\"SiteHeader\"]/div[1]/div/div[2]/ul/li[1]/div/div/div/div[1]/div[1]/div[1]/a");
	By addcart=By.xpath("//*[@id=\"CollectionAjaxContent\"]/div[2]/div/div[3]/div[2]/div[1]/div[1]/a/div[2]/div[1]");
	By sort=By.xpath("//*[@id=\"SortBy\"]");
	By add=By.xpath("//*[@id=\"CollectionAjaxContent\"]/div[2]/div/div[3]/div[2]/div[1]/div[1]/a/div[1]/div[10]");
	//By ince=By.xpath("//*[@id=\"ProductSection-template--17222493307195__main-8132367352123\"]/div/div/div/div[2]/div/div[2]/div[6]/div/div/button[2]");
	By cartbtn=By.xpath("//*[@id=\"CollectionAjaxContent\"]/div[2]/div/div[3]/div[2]/div[1]/form/button");
	By home=By.xpath("//*[@id=\"shopify-section-template--17222493307195__main\"]/nav/ol/li[1]/a");
	By log=By.xpath("//*[@id=\"SiteHeader\"]/div[1]/div/div[3]/div[2]/div/a[2]/span");
	By exit=By.xpath("//*[@id=\"MainContent\"]/div/ul/ul/li[5]/a");
	public Indexpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void loginpage()
	{
		driver.findElement(loginbutton).click();
	}
	public void settingvalues(String email,String password)
	{
		driver.findElement(namelogin).sendKeys(email);
		driver.findElement(pswlogin).sendKeys(password);
	}
	public void clicking() 
	{
		
		
		driver.findElement(loginclick).click();
	}
public void selectvalues() throws InterruptedException
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//Actions act=new Actions(driver);
	WebElement d=driver.findElement(face);
	WebElement menu=driver.findElement(foun);
	Actions act=new Actions(driver);
	act.moveToElement(d).perform();
	menu.click();
	
	WebElement drop=driver.findElement(sort);
	Select se=new Select(drop);
	List<WebElement> list=se.getOptions();
	System.out.println("THE DROP DOWN OPTION ARE");
	for(WebElement options:list)
	{
		System.out.println(options.getText());
	}
	se.selectByVisibleText("New");
	//WebElement addtocart=driver.findElement(add);
	//addtocart.click();
	
	//driver.findElement(ince).click();
	//Thread.sleep(2000);
	driver.findElement(cartbtn).click();
}
	public void logoutpage() {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(log).click();
		
		
		//driver.get("https://swissbeauty.in/account");	

		driver.findElement(exit).click();
	}
}
