package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\TESTING study Meterial\\crome driver\\chromedriver.exe");

		WebDriver d = new ChromeDriver();

		d.get("https://ksrtc.in/oprs-web/");
		
		d.manage().window().maximize();
		
        d.findElement(By.xpath("//*[@id='bookingsForm']/div/div/div[2]/div[3]/button")).click();
        Thread.sleep(2000);
        
        String text = d.switchTo().alert().getText();
        System.out.println(text);
        
        d.switchTo().alert().accept();
        
		
	}

}
