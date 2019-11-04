package tests;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;

import org.junit.Test;


public class DeleteContact extends TestBase {
  @Test
  public void testContactDeletion(){
    if(! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().CreateContact();
    }
   app.getContactHelper().CheckMarkContact();
   app.getContactHelper().DeleteContactClick();
    app.getContactHelper().AcceptContactDeleting();

  }

}
