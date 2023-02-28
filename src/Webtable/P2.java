package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver","D:\\Computer\\Velocity\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///E:/CS%20World/Websites%20for%20practice/Table1.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> col=driver.findElements(By.xpath("//table[@id='1234']//tr[2]/td"));
		int s1=col.size();
		System.out.println(s1);
	     
	}

}
