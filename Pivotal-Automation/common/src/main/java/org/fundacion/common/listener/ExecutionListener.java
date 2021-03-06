package org.fundacion.common.listener;

import org.fundacion.common.drivers.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.IExecutionListener;


public class ExecutionListener implements IExecutionListener {
  WebDriver driver;

  @Override
  public void onExecutionStart() {

  }

  @Override
  public void onExecutionFinish() {
    driver = Driver.getDriver().getWebDriver();
    if (driver != null) {
      driver.quit();
    }
  }
}