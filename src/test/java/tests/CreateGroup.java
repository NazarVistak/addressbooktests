package tests;// Generated by Selenium IDE
import appmanager.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class CreateGroup extends TestBase{

  @Test
  public void groupCreation() {
    app.goTo().groupPage();
    Set<GroupData> before = app.group().all();
    GroupData group = new GroupData().withName("test1");
    app.group().create(group);
    Set<GroupData> after = app.group().all();
    Assert.assertEquals(after.size() ,  before.size() + 1);
      System.out.println("Number of groups BEFORE = " + before);
      System.out.println("Number of groups AFTER = " + after);

    group.withId(after.stream().mapToInt((g) -> g.getId()).max().getAsInt());
    before.add(group);

    Assert.assertEquals(before,after);
  }

}
