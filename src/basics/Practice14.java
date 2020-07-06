package basics;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice14 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
				driver.get("http://www.newtours.demoaut.com");						
				System.out.println(driver.findElement(By.xpath("//form/table/tbody/tr[1]/td[1]")).getText());			
		
				driver.quit();    
			    			
			}

}
