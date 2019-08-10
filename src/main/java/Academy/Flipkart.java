package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Flipkart {
	public WebDriver driver;
By email=By.xpath("//input[@class='_2zrpKA']");
By pass=By.xpath("//input[@type='password']");
By log=By.xpath("//*[@type='submit']");

public Flipkart(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}
public WebElement mail() {
	return driver.findElement(email);

}
public WebElement password() {
	return driver.findElement(pass);
}
public WebElement login() {
	return driver.findElement(log);
}

}
