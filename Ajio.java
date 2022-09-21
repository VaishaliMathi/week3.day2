package week3.day2.collections;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dev.failsafe.internal.util.Durations;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
/*1. Launch the URL https://www.ajio.com/
2. In the search box, type as "bags" and press enter
3. To the left  of the screen under " Gender" click the "Men"
4. Under "Category" click "Fashion Bags"
5. Print the count of the items Found. 
6. Get the list of brand of the products displayed in the page and print the list.
7. Get the list of names of the bags and print it*/
		WebDriverManager.chromedriver().setup();
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags");
 		driver.findElement(By.xpath("//button[@type='submit']//span[1]")).click();
 		Thread.sleep(10000);
		 driver.findElement(By.xpath("//label[@for='Men']")).click();	
		 Thread.sleep(10000);
	driver.findElement(By.xpath("(//label[contains(@class,'facet-linkname facet-linkname-l1l3nestedcategory')])[2]")).click();
	WebElement text = driver.findElement(By.xpath("//div[text()=' Items Found']"));
	System.out.println(text.getText());
	List<WebElement> brandlist = driver.findElements(By.xpath("//div[@class='brand']"));
	for (int i = 0; i < brandlist.size(); i++) {
		System.out.println(brandlist.get(i).getText());
	}
	List<WebElement> baglist = driver.findElements(By.xpath("//div[@class='nameCls']"));
			for (int i = 0; i < baglist.size(); i++) {
				System.out.println(baglist.get(i).getText());
	
	}
	}
}
