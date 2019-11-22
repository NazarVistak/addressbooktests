package tests;
import appmanager.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.Comparator;
import java.util.HashSet;
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
  GroupData group = new GroupData(before.get(before.size() - 1).getId(),"test",null,null);
  app.getGroupHelper().fillingGroupName(group);
  app.getGroupHelper().submitGroupModification();
  app.getGroupHelper().returnToGroupPage();

  List<GroupData> after = app.getGroupHelper().getGroupList();
  Assert.assertEquals(after.size() ,  before.size());
  System.out.println("Number of groups BEFORE = " + before);
  System.out.println("Number of groups AFTER = " + after);

  before.remove(before.size() - 1);
  before.add(group);

  Comparator<? super GroupData> byId = (g1 , g2) -> Integer.compare(g1.getId() , g2.getId());
  before.sort(byId);
  after.sort(byId);

  Assert.assertEquals(before, after);
}
}
