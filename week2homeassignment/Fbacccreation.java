package week2homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbacccreation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		//login
		driver.get("https://www.facebook.com/r.php?locale=en_US");
		//Firstname
        driver.findElement(By.name("firstname")).sendKeys("vinithasri");
      //surname
		driver.findElement(By.name("lastname")).sendKeys("kasi");
		//email
	    driver.findElement(By.name("reg_email__")).sendKeys("vinithasri@gmail.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//password
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.name("reg_passwd__")).sendKeys("vinitha@07");
		//dob
		Select month = new Select(driver.findElement(By.id("month")));
		Thread.sleep(1000);
		month.selectByVisibleText("Jan");
		
		Select day = new Select(driver.findElement(By.id("day")));
		Thread.sleep(1000);
		day.selectByVisibleText("22");
		
		Select year = new Select(driver.findElement(By.id("year")));
		Thread.sleep(1000);
		year.selectByVisibleText("1994");
		
		//gender
	
		driver.findElement(By.xpath("//*[contains(text(), 'Female')]")).click();
	    //submit
		driver.findElement(By.name("websubmit")).click();
	}
}