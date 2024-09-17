package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class faceBookLogin {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("shjbsfkh");
		
		driver.findElement(By.id("pass")).sendKeys("12345");
		
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
	}

}
                       