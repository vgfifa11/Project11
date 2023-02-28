package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class L2 
{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\CS World\\Browser\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/vikra/Downloads/MultiselectableListbox.html");
	
	driver.manage().window().maximize();
	WebElement country=driver.findElement(By.xpath("//select[@id='1234']"));
	Select s1=new Select(country);
	
	boolean s2=s1.isMultiple();
	System.out.println(s2);
	boolean s4=true;
	if(s2==s4)
	{
		s1.selectByIndex(0);
		s1.selectByIndex(3);
		
		WebElement s6=s1.getFirstSelectedOption();
		System.out.println(s6.getText()); 
		List<WebElement> s3=s1.getAllSelectedOptions();
		for (WebElement s5:s3)
		{
			System.out.println(s5.getText());  
		}
		
		
	}
	
}

}
