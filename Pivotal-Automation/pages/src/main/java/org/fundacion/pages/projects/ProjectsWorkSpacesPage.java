package org.fundacion.pages.projects;

import org.fundacion.model.projects.ProjectsWorkSpacesModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Administrator on 12/13/2016.
 */
public class ProjectsWorkSpacesPage {
  WebDriver driver;
  WebDriverWait wait;
  String nameOfProject;

  public ProjectsWorkSpacesPage(WebDriver driver) {
    this.driver = driver;
    wait = new WebDriverWait(this.driver, 20);
    PageFactory.initElements(driver, this);
  }

  @FindBy(xpath = ProjectsWorkSpacesModel.linkShowProjects)
  private WebElement linkShowProjects;

  @FindBy(xpath = ProjectsWorkSpacesModel.project)
  private WebElement project;


  public boolean existProject(String name) {

    return project.getText().equalsIgnoreCase(name);
    //wait.until(ExpectedConditions.visibilityOf(project)).getText().equalsIgnoreCase(name);
  }

  public void clickLinkShowProjects(String nameOfProject) {
    this.nameOfProject = nameOfProject;
    linkShowProjects.click();
  }
}
