package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RanfordHP
{
     //EP
	
	@FindBy(id="txtuId")
	WebElement Uname;
	
	@FindBy(id="txtPword")
	WebElement Pswd;
	
	@FindBy(xpath="//*[@id=\"login\"]")
	WebElement Lgn;
	
	
	//EM
	
	public void Login() throws InterruptedException 
	{
	Uname.sendKeys("Admin");
	Pswd.sendKeys("Testing@Mq");
	Thread.sleep(3000);
	Lgn.click();
	;
	}
	
}
