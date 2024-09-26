package week2homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbacccreation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("vinithasri");
	    driver.findElement(By.name("lastname")).sendKeys("kasi");
	    driver.findElement(By.name("reg_email__")).sendKeys("vinitha.sri@gmail.com");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("9043228787");
        Select s = new Select(driver.findElement(By.id("day")));
        Thread.sleep(1000);
        s.selectByVisibleText("22");
        
        Select s1 = new Select(driver.findElement(By.id("month")));
        Thread.sleep(1000);
        s1.selectByValue("1");

        Select s2 = new Select(driver.findElement(By.id("year")));
        Thread.sleep(1000);
        s2.selectByValue("1994");
        
        driver.findElement(By.xpath("//input[@value='1']")).click();

        driver.findElement(By.name("websubmit")).click();


	}

}
