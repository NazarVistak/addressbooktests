package tests;

import org.junit.Test;
import org.openqa.selenium.By;

public class CreateContact extends TestBase {
  @Test
  public void testContactCreation(){
    app.findElement(By.linkText("add new")).click();
    app.findElement(By.name("firstname")).click();
    app.findElement(By.name("firstname")).sendKeys("naz");
    app.findElement(By.name("lastname")).click();
    app.findElement(By.name("lastname")).sendKeys("vistakw");
    app.findElement(By.name("mobile")).click();
    app.findElement(By.name("mobile")).sendKeys("34554433");
    app.findElement(By.name("email")).click();
    app.findElement(By.name("email")).sendKeys("waawfggt");
    app.findElement(By.cssSelector("input:nth-child(87)")).click();
    app.findElement(By.linkText("home page")).click();
  }
}
