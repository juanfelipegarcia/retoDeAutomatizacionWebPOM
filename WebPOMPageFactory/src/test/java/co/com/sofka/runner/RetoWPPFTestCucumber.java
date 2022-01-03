package co.com.sofka.runner;
import co.com.sofka.setup.WebUI;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/resources/features/reto_wppf.feature"},
        glue ={"co.com.sofka.stepdefinition"},
        tags = "not @Comprador2",
        publish = true
)

public class RetoWPPFTestCucumber {
}
