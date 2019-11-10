package tests;


import org.junit.Assert;
import org.junit.Test;

public class ModificationGroup extends TestBase {
@Test
  public void testGroupModification(){
  app.getNavigationHelper().groupsOpening();
  int before = app.getGroupHelper().getGroupCount();
    if(! app.getGroupHelper().isThereAGroup()){
  app.getGroupHelper().createGroup(null);
  }
  app.getGroupHelper().selectGroup();
  app.getGroupHelper().initGroupModification();
  app.getGroupHelper().fillingGroupName("test");
  app.getGroupHelper().submitGroupModification();
  app.getGroupHelper().returnToGroupPage();
  int after = app.getGroupHelper().getGroupCount();
  Assert.assertEquals(after ,  before);
  System.out.println("Number of groups BEFORE = " + before);
  System.out.println("Number of groups AFTER = " + after);
}
}
