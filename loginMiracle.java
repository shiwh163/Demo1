package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class loginMiracle {
  @Test
  public void login() throws Exception {
	  
	  //等待和调用login
	  LoginPackage login = new LoginPackage();
	  
	  login.loginMiracle();
	  
	  WebDriver driver = login.driver();
	  
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  WebDriverWait wait = new WebDriverWait(driver,10);//先定义最长等待时间为10s
	  
	  wait.until(ExpectedConditions.titleContains("首页"));
	  WebElement xtwh;
	  xtwh = driver.findElement(By.id("624858e9-dba7-4732-a120-d0df7d587cda"));
	  
	  wait.until(ExpectedConditions.elementToBeClickable(xtwh));
	  
	  driver.findElement(By.id("624858e9-dba7-4732-a120-d0df7d587cda")).click();
  }
}


//此处添加一个内容测试github