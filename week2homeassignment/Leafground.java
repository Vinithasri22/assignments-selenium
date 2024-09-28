package week2homeassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Leafground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Login
		EdgeDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
	    driver.manage().window().maximize();
	    //click and confirm
	    driver.findElement(By.xpath("(//span[normalize-space()='Click'])[1]")).click();
		driver.navigate().back();
	
		
	     //submit position
			WebElement size=driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'][normalize-space()='Submit'])[1]"));
			org.openqa.selenium.Point position = size.getLocation();
			int x = position.getX();
			int y = position.getY();
			//button color
			WebElement color=driver.findElement(By.xpath("(//span[normalize-space()='Save'])[1]"));
			String value=color.getCssValue("color");
			System.out.println(value);
			
			//Button height and width
			WebElement button = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'][normalize-space()='Submit'])[2]"));
	}

}
