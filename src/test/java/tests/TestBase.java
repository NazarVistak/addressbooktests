package tests;

import appmanager.ApplicationManager;


import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class TestBase {

  protected static final ApplicationManager app = new ApplicationManager(BrowserType.FIREFOX);

  @BeforeSuite
  public static void setUp() {
    app.init();
  }

  @AfterSuite
  public static void tearDown() {
    app.stop();
  }

}
