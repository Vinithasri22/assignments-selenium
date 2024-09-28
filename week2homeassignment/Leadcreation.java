package week2homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Leadcreation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		//login
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//submit
		WebElement login= driver.findElement(By.className("decorativeSubmit"));
		login.click();
		driver.findElement(By.partialLinkText("M/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
	    //leadcreation
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Tester");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		WebElement button = driver.findElement(By.className("smallSubmit"));
		button.click();
		Thread.sleep(6000);
		driver.close();
		
	}

}
