package tests;
import appmanager.GroupData;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ModificationGroup extends TestBase {
@Test
  public void testGroupModification(){
  app.getNavigationHelper().groupsOpening();


    if(! app.getGroupHelper().isThereAGroup()){
  app.getGroupHelper().createGroup(null);

    }
  List<GroupData> before = app.getGroupHelper().getGroupList();
  app.getGroupHelper().selectGroup(before.size() - 1);
  app.getGroupHelper().initGroupModification();
  app.getGroupHelper().fillingGroupName("test");
  app.getGroupHelper().submitGroupModification();
  app.getGroupHelper().returnToGroupPage();
  List<GroupData> after = app.getGroupHelper().getGroupList();
  Assert.assertEquals(after.size() ,  before.size());
  System.out.println("Number of groups BEFORE = " + before);
  System.out.println("Number of groups AFTER = " + after);
}
}
