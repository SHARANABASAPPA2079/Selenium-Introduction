package Action_Class_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.xpath("//a[@href='/nested_frames']")).click();

		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_top']")));

		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_middle']")));

		System.out.println(driver.findElement(By.id("content")).getText());

	}

}
