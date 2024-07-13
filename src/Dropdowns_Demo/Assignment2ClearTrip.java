package Dropdowns_Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment2ClearTrip {

	public static void main(String[] args) {

		

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com/");

		driver.get("https://www.cleartrip.com/");
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#DepartDate")).click();
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[1]/a[1]")).click();
		driver.findElement(By.xpath("(//select[@id='Adults']) //option[@value='2']")).click();
		driver.findElement(By.xpath("(//select[@id='Childrens']) //option[@value='1']")).click();
		driver.findElement(By.xpath("//body/section[@id='Home']/div[1]/div[1]/div[1]/form[1]/div[6]/p[1]/a[1]/strong[1]/i[1]")).click();
		driver.findElement(By.cssSelector("#AirlineAutocomplete")).sendKeys("Turkish Airlines (TK)");
		driver.findElement(By.id("SearchBtn")).click();
		String text=driver.findElement(By.id("homeErrorMessage")).getText();
		System.out.println(text);
}
}