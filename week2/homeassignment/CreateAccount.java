package homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.id("button")).click();
	    driver.findElement(By.xpath("//a[contains(@href, '/crmsfa/control/accountsMain')]")).click();
	    driver.findElement(By.xpath("//a[contains(@href, '/crmsfa/control/createAccountForm')]")).click();
	    driver.findElement(By.id("accountName")).sendKeys("Rohith Raja");
	    driver.findElement(By.id("numberEmployees")).sendKeys("1");
	    driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps"); 
	    //driver.findElement(By.xpath("//input[@value='Create Account']")).click();
	    System.out.println(driver.getTitle());
	    driver.close();
	}

}
