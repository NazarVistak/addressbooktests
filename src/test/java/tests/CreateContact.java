package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;


public class CreateContact extends TestBase {

  @Test(enabled = false)
  public void testContactCreation(){
    app.getContactHelper().CreateContactClick();
    app.getContactHelper().FillAllRequiredFields("TestNazar","TestVistak","+390425454254","testvistak@gmail.com","test1", true);
    app.getContactHelper().SubmitContactCreation();
    app.getContactHelper().ReturnToHomePage();

  }
}


