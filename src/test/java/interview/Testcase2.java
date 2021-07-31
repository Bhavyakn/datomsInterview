package interview;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.agent.builder.AgentBuilder.Identified;

public class Testcase2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.datoms.io/login");
		
		driver.findElement(By.id("email")).sendKeys("bhavyakn08@gmail.com");
		driver.findElement(By.id("password")).sendKeys("bhavya123*");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		

	}

}
