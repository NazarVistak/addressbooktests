package tests;

import org.testng.annotations.Test;

public class DeleteContact extends TestBase {

  @Test(enabled = false)
  public void testContactDeletion(){
    if(! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().CreateContact();
    }
   app.getContactHelper().CheckMarkContact();
   app.getContactHelper().DeleteContactClick();
    app.getContactHelper().AcceptContactDeleting();

  }

}
