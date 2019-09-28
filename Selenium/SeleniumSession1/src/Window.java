import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver_win32\\chromedriver.exe");  
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();
        
        WebElement clickHereWebElement = driver.findElement(By.xpath("//*[@id='content']/div/a"));
        clickHereWebElement.click();
        
        Set<String> windowHandlesID = driver.getWindowHandles();
        int n = windowHandlesID.size();
        List<String> windowHandleList = new ArrayList<String>(n); 
        for (String id : windowHandlesID) 
        	windowHandleList.add(id); 
        
        driver.switchTo().window(windowHandleList.get(1));
        
        WebElement newWindowText = driver.findElement(By.xpath("//h3"));
        String textToBeValidated = newWindowText.getText();
        
        if(textToBeValidated.contains("New Window")){
        	System.out.println("Text Validated and Passed");
        }
        
        driver.close();
        driver.quit();
        
        

	}

}
