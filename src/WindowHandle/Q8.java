package WindowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mask");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Nea N95 / KN95 FFP2 5 Layer Reusable Anti - Pollution ,...']"))
				.click();
		String par = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String x : child) {
			if (!x.equals(x)) {
				driver.switchTo().window(x);
			}

		}
		Thread.sleep(5000);
		WebElement pi = driver.findElement(By.xpath("//input[@class='_36yFo0']"));
		pi.click();
		pi.sendKeys("605108");


	}
}
