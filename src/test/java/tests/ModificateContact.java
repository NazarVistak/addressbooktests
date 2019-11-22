package tests;


import org.testng.annotations.Test;

public class ModificateContact extends TestBase {

  @Test(enabled = false)
  public void testContactModification(){
    if(! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().CreateContact();
    }
    app.getContactHelper().EditContactClick();
    app.getContactHelper().FillAllRequiredFields("123","1234","123456790","vbffg@grsg.com", null,false);
    app.getContactHelper().UpdateContactCreationClick();
    app.getContactHelper().ReturnToHomePage();
  }
}
