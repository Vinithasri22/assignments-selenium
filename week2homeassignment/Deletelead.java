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
		//login
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//submit
		WebElement login= driver.findElement(By.className("decorativeSubmit"));
		login.click();
		driver.findElement(By.partialLinkText("M/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		//Find Leads
		driver.findElement(By.partialLinkText("Find Leads")).click();
		driver.findElement(By.partialLinkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("90423");
		//Find leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//del leads
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
        driver.findElement(By.name("id")).sendKeys("leadID");
        driver.findElement(By.xpath("//div[text()='No records to display']"));
        driver.quit();
		
		

	}

}
