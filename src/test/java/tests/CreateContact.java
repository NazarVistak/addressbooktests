package tests;

import org.junit.Test;
import org.openqa.selenium.By;

public class CreateContact extends TestBase {
  @Test
  public void testContactCreation(){
    app.getContactHelper().CreateContactClick();
    app.getContactHelper().FillFirstNameField("TestNazar");
    app.getContactHelper().FillLastNameField("TestVistak");
    app.getContactHelper().FillMobilePhoneField("+390425454254");
    app.getContactHelper().FillEmailField("testvistak@gmail.com");
    app.getContactHelper().SubmitContactCreation();
    app.getContactHelper().ReturnToHomePage();

  }
}


