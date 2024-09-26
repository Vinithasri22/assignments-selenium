package week2homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Accountcreationsel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		WebElement login= driver.findElement(By.className("decorativeSubmit"));
		login.click();
		
		driver.findElement(By.partialLinkText("M/SFA")).click();
		driver.findElement(By.partialLinkText("Accounts")).click();
		
		driver.findElement(By.partialLinkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("newacc222");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	
		
		WebElement ownershipWE = driver.findElement(By.className("createAccountForm_ownershipEnumId"));
		Select industryDD =new Select(ownershipWE);
		industryDD.selectByVisibleText("S-Corporation");
		
		WebElement button = driver.findElement(By.className("smallSubmit"));
		button.click();
		Thread.sleep(6000);
		driver.close();
       

	}

}
