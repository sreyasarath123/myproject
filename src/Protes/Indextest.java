package Protes;

import java.time.Duration;

import org.testng.annotations.Test;

import Pro1.Indexpage;

public class Indextest extends Base {

	@Test
	public void testing() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Indexpage in=new Indexpage(driver);
		//in.img();
		in.loginpage();
		in.settingvalues("sreyapsethu94@gmail.com", "sreya123");
		in.clicking();
		//Thread.sleep(3000);
		in.selectvalues();
		in.logoutpage();
	}

}

