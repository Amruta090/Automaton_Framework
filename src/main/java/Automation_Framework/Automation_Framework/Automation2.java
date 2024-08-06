package Automation_Framework.Automation_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Amruta");
		driver.findElement(By.xpath("//input[@name='email']")).clear();
driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}

}
