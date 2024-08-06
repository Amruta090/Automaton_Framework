package Automation_Framework.Automation_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		String text = driver.findElement(By.xpath("//h2[text()='TRENDING OFFERS']")).getText();
		System.out.println(text);
		String str1 = driver.findElement(By.xpath("//b[contains(text(),'GET MORE THAN JUST')]")).getText();
		System.out.println(str1);
		String str2 = driver.getCurrentUrl();
		System.out.println(str2);
		System.out.println(driver.getTitle());
}
}