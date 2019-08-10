package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import resources.Base;

public class FlipHome extends Base {
	@Test 
	public void initiate() throws IOException {
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void logg() {
		Flipkart fp=new Flipkart(driver);
		fp.mail().sendKeys("9990927407");
		fp.password().sendKeys("P@ssword@254");
		fp.login().click();
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
	}

}
