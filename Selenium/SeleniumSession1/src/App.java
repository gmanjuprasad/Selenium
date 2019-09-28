import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Element;


public class App {

	public static void main(String[] args) {
		
		
		List<WebElement> allElements = new ArrayList<>();
		
		// System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");  
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.toolsqa.com/automation-practice-form/?firstname=&photo=&continents=AS&submit=");
        driver.manage().window().maximize();
        //Maximize the browser  
        
        
        WebElement element1 = driver.findElement(By.xpath("//input[@name='firstname']"));
        element1.clear();
        element1.sendKeys("Manju");
        
        allElements = driver.findElements(By.xpath("//button[@name='submit']"));
        
        for(WebElement element: allElements) {
        	String S = element.getText();
        	if(S.equalsIgnoreCase("Button4")){
        		element.click();
        	}
        }
        
        
        
        
	}
}
