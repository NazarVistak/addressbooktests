package appmanager;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver driver) {
    super(driver);
  }
  public void CreateContactClick(){
    click(By.linkText("add new"));
  }
  public void ReturnToHomePage() {
    if (isElementPresent(By.name("maintable"))){
      return;
    }
    click(By.linkText("home"));
  }

 public void FillAllRequiredFields(String name,String name2,String name3,String name4,String group, boolean creation) {
   click(By.name("firstname"));
   type(By.name("firstname"), name);
   click(By.name("lastname"));
   type(By.name("lastname"), name2);
   click(By.name("mobile"));
   type(By.name("mobile"), name3);
   click(By.name("email"));
   type(By.name("email"), name4);

   if(creation){
     new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(group);
   }  else {Assert.assertFalse(isElementPresent(By.name("new_group")));
 }
  }

  public void SubmitContactCreation(){
    click(By.cssSelector("input:nth-child(87)"));
  }
  public void UpdateContactCreationClick(){
    click(By.name("update"));
  }

  public void EditContactClick(){
    click(By.xpath("//img[@alt='Edit']"));
  }

  public void CheckMarkContact(){

    click(By.name("selected[]"));
  }
  public void DeleteContactClick(){
    click(By.cssSelector(".left:nth-child(8) > input"));

  }
  public void AcceptContactDeleting(){

    assertThat(driver.switchTo().alert().getText(), is("Delete 1 addresses?"));
    driver.switchTo().alert().accept();
  }
  public void CreateContact(){
    CreateContactClick();
    FillAllRequiredFields("TestNazar","TestVistak","+390425454254","testvistak@gmail.com","test1", true);
    SubmitContactCreation();
    ReturnToHomePage();
  }
  public boolean isThereAContact() {
    return isElementPresent(By.name("selected[]"));
  }
}
