package tests;
import appmanager.GroupData;
import appmanager.Groups;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

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

  Groups before = app.group().all();
  GroupData modifiedGroup = before.iterator().next();
  GroupData group = new GroupData()
          .withId(modifiedGroup.getId()).withName("test").withHeader(null).withFooter(null);
  app.group().modify(group);
  assertThat(app.group().count(), equalTo(before.size()));
  Groups after = app.group().all();
  System.out.println("Number of groups BEFORE = " + before);
  System.out.println("Number of groups AFTER = " + after);
  assertThat(after, equalTo(before.without(modifiedGroup).withAdded(group)));
}

}
