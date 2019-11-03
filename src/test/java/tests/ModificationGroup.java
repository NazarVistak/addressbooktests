package tests;


import org.junit.Test;

public class ModificationGroup extends TestBase {
@Test
  public void testGroupModification(){
  app.getNavigationHelper().groupsOpening();
  if(! app.getGroupHelper().isThereAGroup()){
    app.getGroupHelper().createGroup(null);
  }
  app.getGroupHelper().selectGroup();
  app.getGroupHelper().initGroupModification();
  app.getGroupHelper().fillingGroupName("test");
  app.getGroupHelper().submitGroupModification();
  app.getGroupHelper().returnToGroupPage();
}
}
