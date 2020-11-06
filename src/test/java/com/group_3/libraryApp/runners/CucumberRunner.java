package com.group_3.libraryApp.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/group_3/libraryApp/step_definitions",
        dryRun = false,
        tags = "@add_user"
)
public class CucumberRunner {
}
