package tests;// Generated by Selenium IDE
import org.junit.Test;

public class CreateGroup extends TestBase{

  @Test
  public void groupCreation() {

    app.getNavigationHelper().groupsOpening();
    app.getGroupHelper().createGroupClick();
    app.getGroupHelper().fillingGroupName(null);
    app.getGroupHelper().submitGroupCreation();
    app.getGroupHelper().returnToGroupPage();
  }

}
