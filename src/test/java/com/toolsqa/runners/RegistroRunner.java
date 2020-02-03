package com.toolsqa.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
features = "src/test/resources/features/Registro.feature", 
glue = "com.toolsqa.step_definitions", 
snippets = SnippetType.CAMELCASE, 
tags = "@Registro")

public class RegistroRunner {

}