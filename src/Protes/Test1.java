package Protes;

import org.testng.annotations.Test;

import Pro1.Prolog;

public class Test1 extends Base {
	@Test
	public void testing()
	{
	Prolog obj=new Prolog(driver);
	obj.img();
	obj.login();
	obj.create();
	obj.setvalue("sreya","sarath","sreayapsethu94@gmail.com","7592006372","sreya123");
	obj.buttonclick();
	
	//obj.lastvalues("sarath");
	
	}
}


