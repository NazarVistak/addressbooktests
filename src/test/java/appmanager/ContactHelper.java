package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver driver) {
    super(driver);
  }
  public void CreateContactClick(){
    click(By.linkText("add new"));
  }
  public void ReturnToHomePage() {
    click(By.linkText("home page"));
  }

  public void FillFirstNameField(String name){
    click(By.name("firstname"));
    type(By.name("firstname"),name);
 }
 public void FillLastNameField(String name){
    click(By.name("lastname"));
    type(By.name("lastname"),name);
 }
  public void FillMobilePhoneField(String name){
    click(By.name("mobile"));
    type(By.name("mobile"),name);
}
  public void FillEmailField(String name){
    click(By.name("email"));
    type(By.name("email"),name);
  }
  public void SubmitContactCreation(){
    click(By.cssSelector("input:nth-child(87)"));
  }
  public void GoToHomePage(){
    click(By.linkText("home"));
  }
  public void EditContactClick(){
    click(By.xpath("//a[@href=\'edit.php?id=4\']"));
  }
}
