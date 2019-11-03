package tests;

import org.junit.Test;

public class DeleteContact extends TestBase {
  @Test
  public void testContactDeletion(){
   app.getContactHelper().CheckMarkContact();
   app.getContactHelper().DeleteContactClick();
    assertThat(driver.switchTo().alert().getText(), is("Delete 1 addresses?"));
  }

}
