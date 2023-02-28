package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L1 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\CS World\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://wwww.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a [text()='Create new account']")).click();
		
		Thread.sleep(4000);
		
		WebElement month=driver.findElement(By.xpath("//select[@title='Month']"));
	      Select s1=new Select(month);
	      s1.selectByIndex(5);
	      List<WebElement> s2=s1.getOptions();
	     for(WebElement s3:s2)
	     {
	    	 
	    	 System.out.println(s3.getText());
	     }
		
	}

}
