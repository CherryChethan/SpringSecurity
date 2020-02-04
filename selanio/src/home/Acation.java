package home;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acation {

	public static void main(String[] args) 
	{
        
System.setProperty("webdriver.chrome.driver", "D:\\TESTING study Meterial\\crome driver\\chromedriver.exe");
	
      WebDriver d= new ChromeDriver();

		d.get("https://www.facebook.com/");
		
		d.manage().window().maximize();
		
		Actions a= new Actions(d);
		
		JavascriptExecutor js= (JavascriptExecutor)d;
		
		js.executeScript("window.scrollBy(0,1000)");
		
		WebElement e= d.findElement(By.xpath("//*[@id='reg_pages_msg']/a"));
		a.moveToElement(e).contextClick().build().perform();
		
		
		
		
		
	}

}
