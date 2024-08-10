package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/abhis/OneDrive/Desktop/HTML/Siblings.html");
		String collection = driver.findElement(By.xpath("//td[contains(text(),'KGF')]/following-sibling::td[1]")).getText();
		System.out.println(collection);
	}
}