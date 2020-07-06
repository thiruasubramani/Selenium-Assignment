package basics;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;

public class Practice1 {

	public static void main(String[] args) {
				Random rand = new Random();
				WebDriver driver = new ChromeDriver();
				driver.get("http://demowebshop.tricentis.com");
				driver.manage().window().maximize();
				int num = rand.nextInt(100);
				driver.findElement(By.linkText("Register")).click();
				driver.findElement(By.id("gender-male")).click();
				driver.findElement(By.id("FirstName")).sendKeys("Thiru"+num);
				driver.findElement(By.id("LastName")).sendKeys("Subramani");
				driver.findElement(By.id("Email")).sendKeys("Thiru"+num+".testb@mail.com");
				driver.findElement(By.id("Password")).sendKeys("pass123$");
				driver.findElement(By.id("ConfirmPassword")).sendKeys("pass123$");
				driver.findElement(By.id("register-button")).click();
				driver.findElement(By.linkText("Log out")).click();
				driver.quit();
			
			}


	}


