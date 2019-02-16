package com.toolsqa.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/PracticeAutomationForm.feature", glue = "com.toolsqa.steps", snippets = SnippetType.CAMELCASE)

public class PracticeAutomationFormRunner {

}
