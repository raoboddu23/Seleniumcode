package com.launch;

import org.openqa.selenium.By;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");
		
		navigateUrl("hdfcurl");
		
		driver.manage().window().maximize();
		
		/*String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().deleteAllCookies();
		
		driver.navigate().back();
		
		Thread.sleep(4000);
		
		driver.navigate().forward();
		
		Thread.sleep(4000);
		
		driver.navigate().refresh();*/
		
		driver.findElement(By.linkText("APPLY ONLINE")).click();
		
		driver.close();
		
		//driver.quit();

	}

}
