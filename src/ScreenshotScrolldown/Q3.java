package ScreenshotScrolldown;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\seleniunm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://toolsqa.com");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	WebElement path = driver.findElement(By.xpath("//span[text()='Selenium Training Benefit']"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", path);
	String text = path.getText();
	System.out.println(text);
TakesScreenshot tk = (TakesScreenshot)driver;
File sou = tk.getScreenshotAs(OutputType.FILE);
File dest = new File("C:\\Users\\HP\\Desktop\\scree\\Q3.png");
FileUtils.copyFile(sou, dest);

}

}
