package tests;

import org.junit.Test;

public class ModificateContact extends TestBase {
  @Test
  public void testContactModification(){
    app.getContactHelper().GoToHomePage();
    app.getContactHelper().EditContactClick();
    
  }
}
