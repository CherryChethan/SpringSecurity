package home;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkSeleanium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TESTING study Meterial\\crome driver\\chromedriver.exe");

		WebDriver d = new ChromeDriver();

		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		d.findElement(By.id("u_0_m")).sendKeys("Chethan");
		d.findElement(By.id("u_0_o")).sendKeys("Cherry");
		d.findElement(By.id("u_0_r")).sendKeys("6362003412");
		d.findElement(By.id("u_0_w")).sendKeys("Cherry12365");
		System.out.println(d.getTitle());
		// Click DropDown list
		d.findElement(By.id("u_0_6")).click();

		// Select drop down list
		WebElement drop = d.findElement(By.id("day"));
		Select s = new Select(drop);
		s.selectByIndex(27);
		// System.out.println(drop.getAttribute("index"));

		// ===============================================

		List<WebElement> dd = s.getOptions();
		System.out.println(dd.size());

		for (int i = 0; i < dd.size(); i++) {
			String xx = dd.get(i).getText();
			System.out.println(xx);
		}
		// ================================================

		WebElement drop1 = d.findElement(By.id("month"));
		Select s1 = new Select(drop1);
		s1.selectByIndex(1);

		List<WebElement> l1 = s1.getOptions();
		System.out.println(l1.size());

		for (int i1 = 0; i1 < l1.size(); i1++) {
			String xx1 = l1.get(i1).getText();
			System.out.println(xx1);
		}

		WebElement drop2 = d.findElement(By.id("year"));
		Select s2 = new Select(drop2);
		s2.selectByValue("1996");

		List<WebElement> l3 = s2.getOptions();
		System.out.println(l3.size());
		
	}

}
