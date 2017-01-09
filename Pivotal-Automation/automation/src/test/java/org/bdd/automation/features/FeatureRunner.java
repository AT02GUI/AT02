package org.bdd.automation.features;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src\\resource\\login.feature")
public class FeatureRunner extends AbstractTestNGCucumberTests{

}
