package com.test_swaglab.challenge.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Configuration {
	public static WebDriver driver;
	public static JavascriptExecutor js; 


	public static void startConfiguration(){

		switch (PATH.NAVEGADOR) {
		case CHROME:
			// Create a new instance
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver80.exe");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--no-sandbox");
			driver = new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();
			driver.get(PATH.URL);
			js = (JavascriptExecutor)driver;
			
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
		case FIREFOX:
			// Create a new instance
			driver.get(PATH.URL);
			driver.manage().window().maximize();
			break;
		case IE:
			// Create a new instance
			driver.get(PATH.URL);
			break;
		default:
			// Create a new instance
			driver.get(PATH.URL);
			break;
		}

	}



}
