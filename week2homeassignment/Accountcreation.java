package week2homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Accountcreation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//login
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//submit
		WebElement login= driver.findElement(By.className("decorativeSubmit"));
		login.click();
		driver.findElement(By.partialLinkText("M/SFA")).click();
		driver.findElement(By.partialLinkText("Accounts")).click();
		//create Account
		driver.findElement(By.partialLinkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("newacc222");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("10");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		//submit
		WebElement button = driver.findElement(By.className("smallSubmit"));
		button.click();
		Thread.sleep(6000);
		driver.close();
		
		
	}

}
