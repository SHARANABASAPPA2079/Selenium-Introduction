package Locators_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selintroduction

{

	public static void main(String[] args)

	{
		// Invoking the Browser
		// Chrome -- ChromeDriver --methods--close
		// Firefox --FirefoxDriver
		// ChromeDriver driver = new ChromeDriver();
		// diver object has to access all the methods of chromeDriver
		// webdriver methods +classmethods

		// ChromeDriver.exe is 3rd party library which is provided chrome Browser
		// webdriver.chrome.driver-->value of path
		// System.setProperty("webdriver.chrome.driver",
		// "E:\\JavaPracticeLatest\\Introduction\\Drivers\\chromedriver.exe");

		// this is a intermediate step which will help us to invoke actual chrome
		// browser
		// if u don't provide this path selenium Manager feature will get on and all
		// work it does in the back end
		// This step is optional in selenium Version 4.6.0 Above
		// Package Name is Selenium Manager(Beta Phase)
		WebDriver driver = new ChromeDriver();
		// Driver object here access to the methods of chrome driver which are defined
		// in webDriver interface
		driver.get("https://rahulshettyacademy.com/#/practice-project");
		// System.out.println(driver.getTitle());
		String BwName = driver.getTitle();
		System.out.println(BwName);
		System.out.println(driver.getCurrentUrl());
		driver.close();

		// firefox
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "G:\\one drive\\OneDrive\\Desktop\\Selenium-2024\\Selenium_Practice2024\\Introduction\\src\\BrowserDrivers\\geckodriver.exe"
		 * ); WebDriver driver12 = new FirefoxDriver();
		 * driver.get("https://rahulshettyacademy.com/#/practice-project"); String
		 * BwName1 = driver12.getTitle(); System.out.println(BwName1);
		 * System.out.println(driver12.getCurrentUrl()); driver.close();
		 * 
		 */

		// Edge
		/*
		 * System.setProperty("webdriver.edge.driver",
		 * "G:\\one drive\\OneDrive\\Desktop\\Selenium-2024\\Selenium_Practice2024\\Introduction\\src\\BrowserDrivers\\msedgedriver.exe"
		 * ); WebDriver driver13 = new EdgeDriver();
		 * driver.get("https://rahulshettyacademy.com/#/practice-project"); String
		 * BwName2 = driver.getTitle(); System.out.println(BwName2);
		 * System.out.println(driver13.getCurrentUrl()); driver.close();
		 */
	}

}
