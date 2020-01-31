package casestudy6;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class case6 {
	WebDriver driver;

@When("user do launching chrome browser and registration page")
public void user_do_launching_chrome_browser_and_registration_page() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_c2a.04.30\\Desktop\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
}

@When("user do  sigin function")
public void user_do_sigin_function() {
	driver.findElement(By.linkText("SignIn")).click();
    
}

@When("User do enter input username as {string} in un field")
public void user_do_enter_input_username_as_in_un_field(String nm) {
	 driver.findElement(By.name("userName")).sendKeys(nm);
}

@When("user do enter input password as {string} in pw field")
public void user_do_enter_input_password_as_in_pw_field(String ps) {
	driver.findElement(By.name("password")).sendKeys(ps);
	
}

@When("user do click on login button")
public void user_do_click_on_login_button() {
	 driver.findElement(By.xpath("//input[@value='Login']")).click();
}

@When("user do search productname in search menu")
public void user_do_search_productname_in_search_menu() {
	driver.findElement(By.name("products")).sendKeys("Headphone");
}

@When("user do click find details")
public void user_do_click_find_details() {
	
	 driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
}

@Then("user do validate the product")
public void user_do_validate_the_product() {
	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
    driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
    String str=driver.findElement(By.xpath("//*[@id=\"cart\"]/tbody/tr/td[1]/div/div/h4")).getText();
    Assert.assertEquals(str, "Headphone");
}
}
