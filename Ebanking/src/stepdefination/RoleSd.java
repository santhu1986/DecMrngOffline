package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RoleSd 
{

	WebDriver driver;
	
	@Given("^Tester should on ranford home page$")
	public void tester_should_on_ranford_home_page() throws Throwable 
	{
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		  driver.get("http://192.168.1.4/ranford2");
    }

	@When("^Tester Enters username password and click on Login$")
	public void tester_Enters_username_password_and_click_on_Login() throws Throwable
	{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
	}

	@Then("^Tester click on Role button$")
	public void tester_click_on_Role_button() throws Throwable 
	{
	Thread.sleep(3000);	
	
	driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
	
	}

	@When("^Tester click on Newrole and Enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void tester_click_on_Newrole_and_Enters_and(String RN, String RT) throws Throwable 
	{
	
		driver.findElement(By.xpath(".//*[@id='btnRoles']")).click();
		driver.findElement(By.id("txtRname")).sendKeys(RN);
		driver.findElement(By.id("lstRtypeN")).click();
		driver.findElement(By.id("lstRtypeN")).sendKeys(RT);
		Thread.sleep(3000);

		driver.findElement(By.xpath(".//*[@id='btninsert']")).click();
		
       Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}

	@Then("^Tester Close the Application$")
	public void tester_Close_the_Application() throws Throwable 
	{
	driver.close();    
	}


}
