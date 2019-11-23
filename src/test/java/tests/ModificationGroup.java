package tests;
import appmanager.GroupData;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class ModificationGroup extends TestBase {
  @BeforeTest
  public void ensurePreconditions() {
    app.goTo().groupPage();
    if (app.group().all().size() == 0) {
      app.group().create(new GroupData().withName("test1"));
    }
  }
  @Test
  public void testGroupModification(){

  Set<GroupData> before = app.group().all();
  GroupData modifiedGroup = before.iterator().next();
  GroupData group = new GroupData()
          .withId(modifiedGroup.getId()).withName("test").withHeader(null).withFooter(null);
  app.group().modify(group);
  Set<GroupData> after = app.group().all();
  Assert.assertEquals(after.size() ,  before.size());
  System.out.println("Number of groups BEFORE = " + before);
  System.out.println("Number of groups AFTER = " + after);

  before.remove(modifiedGroup);
  before.add(group);
  Assert.assertEquals(before, after);
}

}
