package JavaScript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6_Capture_Title {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		// Capture Title
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		
		
		// Capture URL
		String url = js.executeScript("return document.URL").toString();
		System.out.println(url);
	}

}
