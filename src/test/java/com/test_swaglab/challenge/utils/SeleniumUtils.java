package com.test_swaglab.challenge.utils;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Stopwatch;



public class SeleniumUtils {

	
	@SuppressWarnings("deprecation")
	public static WebElement waitElement(String locator,String type,int time) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(Configuration.driver)
				.withTimeout(time,TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		WebElement elementoPagina = wait.until(new Function<WebDriver, WebElement>() 
		{
			public WebElement apply(WebDriver driver) {
				switch (type) {
				case "css":
					return driver.findElement(By.cssSelector(locator));
				case "xpath":
					return driver.findElement(By.xpath(locator));
				case "id":
					return driver.findElement(By.id(locator));
				case "class":
					return driver.findElement(By.className(locator));
				case "name":
					return driver.findElement(By.className(locator));
				default:
					break;
					
				}
				
				return null; 
			}
		});
		return elementoPagina;
	}
	

	@SuppressWarnings("deprecation")
	public static Boolean seEncuentra(String locator,String type,int time) {
		
		Boolean elementPage=false;
		Wait<WebDriver> wait = new FluentWait<WebDriver>(Configuration.driver)
				.withTimeout(time,TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		elementPage = wait.until(new Function<WebDriver, Boolean>() 
		{
			public Boolean apply(WebDriver driver) {
				switch (type) {
				case "css":
					return  driver.findElements(By.cssSelector(locator)).size() > 0;
				case "xpath":
					return driver.findElements(By.xpath(locator)).size() > 0;
				case "id":
					return driver.findElements(By.id(locator)).size() > 0;
				case "class":
					return driver.findElements(By.className(locator)).size() > 0;
				case "name":
					return driver.findElements(By.className(locator)).size() > 0;
				default:
					break;
					
				}
				
				return false; 
			}
		});
		return elementPage;
	}
	

	public static void waitAnimationElement() {
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@SuppressWarnings("deprecation")
	public static String valueTagElement(String locator,String type,int time, String tagName) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(Configuration.driver)
				.withTimeout(time,TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		String valorTag = wait.until(new Function<WebDriver, String>() 
		{
			public String apply(WebDriver driver) {
				switch (type) {
				case "css":
					return driver.findElement(By.cssSelector(locator)).getAttribute(tagName);
				case "xpath":
					return driver.findElement(By.xpath(locator)).getAttribute(tagName);
				case "id":
					return driver.findElement(By.id(locator)).getAttribute(tagName);
				case "class":
					return driver.findElement(By.className(locator)).getAttribute(tagName);
				case "name":
					return driver.findElement(By.className(locator)).getAttribute(tagName);
				default:
					break;
					
				}
				
				return null; 
			}
		});
		return valorTag;
	}
	
	@SuppressWarnings("deprecation")
	public static String getMsgAlert() {
		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(Configuration.driver)
				.withTimeout(3,TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		String valorAlert = wait.until(new Function<WebDriver, String>() {
			public String apply(WebDriver driver) {
				waitAnimationElement();
				waitElement("div[role='alert']", "css", 2).click();
				return driver.switchTo().alert().getText();
			}
		});
		return valorAlert;
		
	}
	
	public static void esconderAlert() {
		
		new Function<WebDriver, String>() {
			public String apply(WebDriver driver) {
				driver.switchTo().alert().dismiss();
				return "";
			}
		};
		
	}
	
	@SuppressWarnings("deprecation")
	public static List<WebElement> waitElements(String locator,String type,int time) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(Configuration.driver)
				.withTimeout(time,TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		List<WebElement> elementPage = wait.until(new Function<WebDriver, List<WebElement>>() 
		{
			public List<WebElement> apply(WebDriver driver) {
				switch (type) {
				case "css":
					return driver.findElements(By.cssSelector(locator));
				case "xpath":
					return driver.findElements(By.xpath(locator));
				case "id":
					return driver.findElements(By.id(locator));
				case "class":
					return driver.findElements(By.className(locator));
				case "name":
					return driver.findElements(By.className(locator));
				default:
					break;
					
				}
				
				return null; 
			}
		});
		
		return elementPage;
	}
	
	public static void clickElement(WebElement elemento, int segundosLimite)
	{
		Stopwatch stopWatch = Stopwatch.createStarted();

		do
		{
			try
			{
				elemento.click();
				break;
			} catch (Exception e)
			{
				Sleep(300);
			}
			
		}while (stopWatch.elapsed(TimeUnit.SECONDS) < segundosLimite);
	}
	
	private static void Sleep(int milliseconds)
	{
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
	
	@SuppressWarnings("deprecation")
	public static int seEncuentraVarios(String locator,String type,int tiempo) {
		
		int elementoPagina;
		Wait<WebDriver> wait = new FluentWait<WebDriver>(Configuration.driver)
				.withTimeout(tiempo,TimeUnit.SECONDS)
				.pollingEvery(1, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		elementoPagina = wait.until(new Function<WebDriver, Integer>() 
		{
			public Integer apply(WebDriver driver) {
				switch (type) {
				case "css":
					return  driver.findElements(By.cssSelector(locator)).size();
				case "xpath":
					return driver.findElements(By.xpath(locator)).size();
				case "id":
					return driver.findElements(By.id(locator)).size();
				case "class":
					return driver.findElements(By.className(locator)).size();
				case "name":
					return driver.findElements(By.className(locator)).size();
				default:
					break;
					
				}
				
				return 0; 
			}
		});
		return elementoPagina;
	}
}
	
	
	
	


