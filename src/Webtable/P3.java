package Webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("Webdriver.Chrome.driver","D:\\Computer\\Velocity\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///E:/CS%20World/Websites%20for%20practice/Table1.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//fetch the single dat from particular column
		WebElement s1=driver.findElement(By.xpath("//table[@id='1234']//tr[3]/td[2]"));
		String s2=s1.getText();
		System.out.println(s2);
		
	}

}
