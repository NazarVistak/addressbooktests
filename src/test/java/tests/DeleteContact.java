package tests;


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
