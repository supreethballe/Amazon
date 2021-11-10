package practiceautomation;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("I phone");  
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height'][1]")).click();
     	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
     	Thread.sleep(2000);
     	driver.findElement(By.xpath("//a[@class='nav-a nav-a-2 nav-progressive-attribute']")).click();
     	String product = driver.findElement(By.xpath("//span[@class=\"a-truncate-cut\"]")).getText();
     	String  price = driver.findElement(By.xpath("//p[@class='a-spacing-mini']")).getText();
     	System.out.println(product+" = "+price);
     	
     	 Thread.sleep(2000);
	       driver.close();
	}

}
