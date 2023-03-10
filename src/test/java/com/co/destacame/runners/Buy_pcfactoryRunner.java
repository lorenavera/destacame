package com.co.destacame.runners;

import com.co.destacame.utils.excel.BeforeSuite;
import com.co.destacame.utils.excel.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(CustomRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/buy_pcfactory.feature",
        glue = {"com.co.destacame.stepdefinitions", "com.co.destacame.hooks"},
        snippets = SnippetType.CAMELCASE,
        tags = "@Test"

)

public class Buy_pcfactoryRunner {
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles("src/test/resources/features/buy_pcfactory.feature");
    }
}
