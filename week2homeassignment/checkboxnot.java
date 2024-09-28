package week2homeassignment;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;

public class checkboxnot {

	public static void main(String[] args) {
		EdgeDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		// TODO Auto-generated method stub
		//notification
		//Basic Checkbox
		driver.findElement(By.xpath("(//span[normalize-space()='Basic'])[1]")).click();
		//Notification
		driver.findElement(By.xpath("(//span[normalize-space()='Ajax'])[1]")).click();
		//Language
		driver.findElement(By.xpath("(//label[normalize-space()='Java'])[1]")).click();
		//Tri
		driver.findElement(By.xpath("(//div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]'])[1]")).click();
		//Toggle
		driver.findElement(By.xpath("(//div[@class='ui-toggleswitch-slider'])[1]")).click();
		
		
		//is Disabled
		boolean disable= driver.findElement(By.xpath("(//div[@id='j_idt87:j_idt102'])[1]")).isDisplayed();
		System.out.println(disable);
		
		
		//select multiple
		driver.findElement(By.xpath("(//ul[@data-label='Cities'])[1]")).click();
		
		//Multiple values
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[9]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[11]")).click();    

	}

}

