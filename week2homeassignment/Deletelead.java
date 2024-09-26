package week2homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Deletelead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		WebElement login= driver.findElement(By.className("decorativeSubmit"));
		login.click();
		driver.findElement(By.partialLinkText("M/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Find Leads")).click();
		driver.findElement(By.partialLinkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("90423");
		WebElement button= driver.findElement(By.className("x-btn-text"));
		button.click();
		
		

	}

}
