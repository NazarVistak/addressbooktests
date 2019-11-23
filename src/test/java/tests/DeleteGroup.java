package tests;// Generated by Selenium IDE

import appmanager.GroupData;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;
import java.util.Set;

public class DeleteGroup extends TestBase{

  @BeforeTest
  public void ensurePreconditions() {
    app.goTo().groupPage();
    if (app.group().all().size() == 0) {
      app.group().create(new GroupData().withName("test1"));
    }
  }

  @Test
  public void groupDeleting() {

    Set<GroupData> before = app.group().all();
    GroupData deletedGroup = before.iterator().next();
    app.group().delete(deletedGroup);
    Set<GroupData> after = app.group().all();
    Assert.assertEquals(after.size() ,  before.size() - 1);
    System.out.println("Number of groups BEFORE = " + before);
    System.out.println("Number of groups AFTER = " + after);

    before.remove(deletedGroup);
    Assert.assertEquals(before, after);

  }



}

