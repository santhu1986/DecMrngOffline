package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RoleSD 
{
     WebDriver driver;
     
	@Given("^User Should on Ranford Home page$")
	public void user_Should_on_Ranford_Home_page() throws Throwable 
	{
	   	 driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("http://103.211.39.246/ranford2");
  
	}

	@When("^User Enters username and Password$")
	public void user_Enters_username_and_Password() throws Throwable 
	{
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Testing@Mq");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		
	}

	@Then("^User Click on Role button$")
	public void user_Click_on_Role_button() throws Throwable 
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
		   
	}

	@When("^User Click on new role and Enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_Click_on_new_role_and_Enters_and(String Rn, String Rt) throws Throwable 
	{
		driver.findElement(By.xpath(".//*[@id='btnRoles']")).click();
		driver.findElement(By.id("txtRname")).sendKeys(Rn);
		driver.findElement(By.id("lstRtypeN")).click();
		driver.findElement(By.id("lstRtypeN")).sendKeys(Rt);
		Thread.sleep(3000);

		driver.findElement(By.xpath(".//*[@id='btninsert']")).click();

		Thread.sleep(3000);
		
		//Alert
		
		driver.switchTo().alert().accept();
	}

	@Then("^User close the Application$")
	public void user_close_the_Application() throws Throwable 
	{
	    driver.close();
	}


}
