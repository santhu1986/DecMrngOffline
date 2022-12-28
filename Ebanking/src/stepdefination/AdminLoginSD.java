package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminLoginSD 

{

	WebDriver driver;

@Given("^Tester Should on RanfordHP$")
public void tester_Should_on_RanfordHP() throws Throwable 
{
  driver=new FirefoxDriver();
  driver.manage().window().maximize();
  driver.get("http://103.211.39.246/ranford2");
}

@When("^Tester Enter \"(.*)\" and \"(.*)\" and click on Login$")
public void tester_Enter_Username_Password_and_click_on_Login(String Un,String Pwd) throws Throwable 
{
	driver.findElement(By.id("txtuId")).sendKeys(Un);
	driver.findElement(By.id("txtPword")).sendKeys(Pwd);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
	
}

@Then("^Tester Validates Admin Login Functionality$")
public void tester_Validates_Admin_Login_Functionality() throws Throwable 
{
	String Expval="Welcome to Admin";
	
	String Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
	
	//Comaparision
	
			if (Expval.equalsIgnoreCase(Actval)) 
			{
				System.out.println("Admin login Succ");
			}
			else
			{
				System.out.println("Admin Login Failed");
			}
			
	
	
}


}
