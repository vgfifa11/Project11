package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("Webdriver.chrome.driver","E:\\CS World\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://sakshingp.github.io/assignment/login.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulsharma");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("rs@123");
		driver.findElement(By.xpath("//button[@id='log-in']")).click();
		Thread.sleep(2000);
		
		for(int i=1; i<=2; i++) 
		{	
			System.out.println("========Amounts==========");
			driver.findElement(By.xpath("//th[@id='amount']")).click();
		    List<WebElement> amount1=driver.findElements(By.xpath("//tr/td[5]"));
		    for(WebElement S1:amount1)
		    {
			String text=S1.getText();
	
			System.out.println(text);
			
			
		    }
		   
		}
		
		
		
		
	}

}
