package basics;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
public class Practice15 {
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
								
				driver.get("http://demowebshop.tricentis.com");		
				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, new File("C:\\Projects\\Selenium\\Screenshots\\Step_1.jpg"));

								
				driver.findElement(By.linkText("Log in")).click();
				File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile1, new File("C:\\Projects\\Selenium\\Screenshots\\Step_2.jpg"));
				
				driver.findElement(By.id("Email")).sendKeys("testing@test123.com");
				driver.findElement(By.id("Password")).sendKeys("Pass123$");
				File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile2, new File("C:\\Projects\\Selenium\\Screenshots\\Step_3.jpg"));
				
				driver.findElement(By.className("login-button")).click();
				File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile3, new File("C:\\Projects\\Selenium\\Screenshots\\Step_4.jpg"));
				
				driver.findElement(By.linkText("Log out")).click();
				File scrFile4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile4, new File("C:\\Projects\\Selenium\\Screenshots\\Step_5.jpg"));
					
				driver.quit();    
			    	
		
				
			}


}
