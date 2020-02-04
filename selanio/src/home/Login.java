package home;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class Login {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\TESTING study Meterial\\crome driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");
		d.findElement(By.id("email")).sendKeys("Chethanprakash8@gmail.com");
		d.findElement(By.name("pass")).sendKeys("darshanm");
		// d.findElement(By.id("u_0_b")).click();
		d.findElement(By.linkText("Forgotten account?")).click();
		Thread.sleep(5000);
		// System.out.println(d.findElement(By.xpath("//*[@id='identify_yourself_flow']/div/div[2]/div/table/tbody/tr[1]/td[2]/div")));
		WebElement c = d
				.findElement(By.xpath("//*[@id='identify_yourself_flow']/div/div[2]/div/table/tbody/tr[1]/td[2]/div"));
		System.out.println(c.getText());
		Thread.sleep(1000);
		d.navigate().to("https://www.facebook.com/");
		// d.navigate().forward();
		Thread.sleep(1000);
		c = d.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[1]/div/img"));
		System.out.println(c.isDisplayed());

		// this for scroll-down the page===============
		JavascriptExecutor js = (JavascriptExecutor) d;

		d.get("https://www.facebook.com/");

		js.executeScript("window.scrollBy(0,1000)");

		// action mouse
		//
		//
		// Actions a= new Actions(d);
		//
		// a.moveToElement(d.findElement(By.className("nav-a "))).perform();

		/*
		 * String handle = d.getWindowHandle(); d.switchTo().window(handle);
		 */

	}

}
