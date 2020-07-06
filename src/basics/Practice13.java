package basics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Practice13 {
	public void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);			
				driver.get("http://www.newtours.demoaut.com");		
				String ActualTitle = driver.getTitle();
				String ExpectedTitle = "Welcome: Mercury Tours";
				Assert.assertEquals(ExpectedTitle, ActualTitle);	
				driver.quit();    
		
			}
}
