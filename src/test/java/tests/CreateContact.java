package tests;

import org.junit.Test;
import org.openqa.selenium.By;

public class CreateContact extends TestBase {
  @Test
  public void testContactCreation(){
    app.getContactHelper().CreateContactClick();
    app.getContactHelper().FillAllRequiredFields("TestNazar","TestVistak","+390425454254","testvistak@gmail.com","test1", true);
    app.getContactHelper().SubmitContactCreation();
    app.getContactHelper().ReturnToHomePage();

  }
}


