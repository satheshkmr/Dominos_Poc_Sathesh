package org.Base_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.description.ModifierReviewable.OfAbstraction;


public class Base_ClassDominos {

	
		public static WebDriver driver;

		public static WebDriver  launch_browser() {
			WebDriver driver = new ChromeDriver();
			return driver;
		}

		public static void TakeScreenshot(WebDriver driver,String pathname) throws IOException {

			TakesScreenshot ts =(TakesScreenshot)driver;
			File n= ts.getScreenshotAs(OutputType.FILE);
			File f = new File(pathname);
			FileUtils.copyFile(n, f);



		}		
		public static void geturl(String path) {

			driver.get(path);
		}

		public static void maximize(WebDriver driver ) {
			driver.manage().window().maximize();

		}

		public static void implicitly_waits() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

		public static void clear(WebElement element) {
			element.clear();

		}
		public static void sleep(int num) throws InterruptedException {

			Thread.sleep(1000);
		}

		public static void move_To_Element(WebDriver d,WebElement element) {
			Actions A = new Actions(d);
			A.moveToElement(element).build().perform();		
		}

		public static void action_click (WebDriver d,WebElement element) {
			Actions A = new Actions(d);
			A.click(element).build().perform();
		}
		public static void action_doubleclick (WebDriver d,WebElement element) {
			Actions A = new Actions(d);
			A.doubleClick(element).build().perform();		
		}

		public static void send_keys (WebElement element,String String ) {
			element.sendKeys(String);

		}

		public static void isdisplayed(WebElement element) {
			isdisplayed(element);
		}


		public static void click(WebElement element) {
			element.click();

		}
		public static void select_By_index(WebElement element,int index) {
			Select s = new Select(element);
			s.selectByIndex(index);
		}
		public static void select_By_value(WebElement element,String value) {
			Select s = new Select(element);
			s.selectByValue(value);
		}
		public static void select_By_visibletext(WebElement element,String text) {
			Select s = new Select(element);
			s.selectByVisibleText(text);
		}

		//public static void javascript(WebDriver driver,String key,WebElement args) {
		//		JavascriptExecutor js=(JavascriptExecutor)driver;
		//		js.executeScript(key,args);

		public void scrollIntoView(WebElement element) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
		public static void alert_Accept(WebDriver d) {
			Alert alert =d.switchTo().alert();
			alert.accept();
		}
		public static void alert_dismiss(WebDriver d) {
			Alert alert =d.switchTo().alert();
			alert.dismiss();
		}
		public static void switch_frame(WebDriver d,WebElement element) {
			WebDriver frame =d.switchTo().frame(element);
			
		}
		public static void downkey() throws AWTException {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		public static void enter_key() throws AWTException {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		public static void control_key() throws AWTException {
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		
		public static void multi_click(WebElement element,int value) {
		
			for(int i=0;i<value;i++) {
				multi_click(element, i);
		
		        }
		    }

		public static void Explicit_wait(int value) {
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(value));
			wait.until(ExpectedConditions.alertIsPresent());
		}
		
	}
















