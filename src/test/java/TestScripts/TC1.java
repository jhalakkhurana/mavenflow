package TestScripts;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TC1 extends Base.BaseClass{
	
@Test
public void tc1() throws InterruptedException, IOException
	{
	//ChromeDriver d 	= new ChromeDriver();
	Thread.sleep(5000);
pages.Login l = new pages.Login(d, pr);

l.signup("jhalakkhurana06@gmail.com", "Attra@555");
Logs.CaptureLogs.takeLogs("TC1", "Logs captured for first case");

	//d.findElement(By.name("email")).sendKeys("jhalakkhurana06@gmail.com");
	//d.findElement(By.name("pass")).sendKeys("Attra@555");
	d.findElement(By.name(pr.getProperty("Login"))).click();

	//d.findElement(By.name("login")).click();
	d.findElement(By.xpath("//div[@aria-label ='Account']")).click();
	asserations.Asseration.assert1("https://www.facebook.cm/", d.getCurrentUrl());
	Logs.CaptureLogs.takeLogs("TC1", "Logs captured for first test case");
	asserations.Asseration.assert1("https://www.facebook.cm/", d.getCurrentUrl());

	screenshots.CaptureScreenshots.takeScreenshot(d, "C:\\Users\\Ishan\\Desktop\\Java_Selenium_setup\\Screenshots\\ScreenShot1.png");	
	}
}
