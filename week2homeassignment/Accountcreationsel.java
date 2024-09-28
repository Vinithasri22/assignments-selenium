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
		//login
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		WebElement login= driver.findElement(By.className("decorativeSubmit"));
		login.click();
		//account
		driver.findElement(By.partialLinkText("M/SFA")).click();
		driver.findElement(By.partialLinkText("Accounts")).click();
		//create Account
		driver.findElement(By.partialLinkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("newaccou222");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		Select select =new Select(driver.findElement(By.name("industryEnumId")));
		select.selectByVisibleText("Computer Software");
		//ownership
		Select select1 =new Select(driver.findElement(By.name("ownershipEnumId")));
		select1.selectByVisibleText("S-Corporation");
		//source
		Select select2 =new Select(driver.findElement(By.name("dataSourceId")));
		select2.selectByVisibleText("Employee");
		//marketing
		Select select3 =new Select(driver.findElement(By.name("marketingCampaignId")));
		select3.selectByValue("9000");
		//state
		Select select4 =new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		select4.selectByValue("TX");

		//Create Button
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.close();

	}		
		
	}


