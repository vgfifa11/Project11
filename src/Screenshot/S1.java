package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class S1 
{
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","E:\\CS World\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://wwww.facebook.com");
		
		driver.manage().window().maximize();
		
		//typecast, downcast
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("E:\\CS World\\Workspace\\Screenshot\\s1.jpg");
		FileHandler.copy(source, destination);
	}

}
