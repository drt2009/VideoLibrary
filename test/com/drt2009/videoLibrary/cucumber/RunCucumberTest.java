package com.drt2009.videoLibrary.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty"
        , features = "test/com/drt2009/videoLibrary/cucumber/resource"
        , snippets =  CucumberOptions.SnippetType.CAMELCASE
        , glue = {"com.drt2009.videoLibrary.cucumber"})
public class RunCucumberTest
{
}