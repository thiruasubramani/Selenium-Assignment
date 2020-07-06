package basics;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice6 {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		
		WebElement userName, password;
		
		userName = driver.findElement(By.name("user_login"));
		password = driver.findElement(By.name("user_password"));
		
		userName.sendKeys("Admin");
		userName.sendKeys(Keys.CONTROL,"a");
		userName.sendKeys(Keys.CONTROL,"c");
		password.sendKeys(Keys.CONTROL, "v");
		
		driver.close();
	}

}



