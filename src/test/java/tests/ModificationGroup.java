package tests;
import appmanager.GroupData;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;

public class ModificationGroup extends TestBase {
  @BeforeTest
  public void ensurePreconditions() {
    app.goTo().groupPage();
    if (app.group().list().size() == 0) {
      app.group().create(new GroupData().withName("test1"));
    }
  }
  @Test
  public void testGroupModification(){

  List<GroupData> before = app.group().list();
  int index = before.size() - 1;
  GroupData group = new GroupData()
          .withId(before.get(index).getId()).withName("test").withHeader(null).withFooter(null);
  app.group().modify(index, group);
  List<GroupData> after = app.group().list();
  Assert.assertEquals(after.size() ,  before.size());
  System.out.println("Number of groups BEFORE = " + before);
  System.out.println("Number of groups AFTER = " + after);

  before.remove(index);
  before.add(group);

  Comparator<? super GroupData> byId = (g1 , g2) -> Integer.compare(g1.getId() , g2.getId());
  before.sort(byId);
  after.sort(byId);

  Assert.assertEquals(before, after);
}

}
