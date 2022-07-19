package facebooklogin;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login_Test {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Zaigo\\eclipse-workspace\\Facebooklogin\\Chrome driver\\chromedriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	
	
	
	
}

private static Object window() {
	// TODO Auto-generated method stub
	return null;
}
}
