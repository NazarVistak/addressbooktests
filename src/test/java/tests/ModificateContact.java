package tests;

import org.junit.Test;

public class ModificateContact extends TestBase {
  @Test
  public void testContactModification(){

    app.getContactHelper().EditContactClick();
    app.getContactHelper().FillAllRequiredFields("123","1234","123456790","vbffg@grsg.com", null,false);
    app.getContactHelper().UpdateContactCreationClick();
    app.getContactHelper().ReturnToHomePage();
  }
}
