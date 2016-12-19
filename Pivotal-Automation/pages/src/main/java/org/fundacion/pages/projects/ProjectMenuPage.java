package org.fundacion.pages.projects;

import org.fundacion.model.projects.ProjectMenuModel;
import org.fundacion.pages.stories.SideBarStoriesPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Topo on 10/12/2016.
 */
public class ProjectMenuPage {

  WebDriver driver;
  WebDriverWait wait;

  @FindBy(xpath = ProjectMenuModel.projectName)
  WebElement projectNameElement;

  @FindBy(css = ProjectMenuModel.settingButton)
  WebElement settingsBtn;

  @FindBy(css = "li.item.epics > a > span")
  WebElement epicsButton;

  @FindBy(xpath = "//div/header/ul/li[3]/div")
  WebElement projectProfileName;

  public ProjectMenuPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
    wait = new WebDriverWait(driver, 10);
  }

  public boolean verifyProjectName(String projectName) {
    return projectNameElement.getText().equalsIgnoreCase(projectName) ? true : false;
  }

  public void clickProfileName(){
    wait.until(ExpectedConditions.elementToBeClickable(projectProfileName));
    projectProfileName.click();
  }

  public SettingsPage clickSettings() {
    wait.until(ExpectedConditions.elementToBeClickable(projectNameElement));
    wait.until(ExpectedConditions.elementToBeClickable(epicsButton));
    settingsBtn.click();
    return new SettingsPage(driver);
  }

  public ProjectsWorkSpacesPage clickProjectsAndWorkSpaces() {
    projectNameElement.click();
    return new ProjectsWorkSpacesPage(driver);
  }

  public SideBarStoriesPage sideBarStories() {
    return new SideBarStoriesPage(driver);
  }
}
