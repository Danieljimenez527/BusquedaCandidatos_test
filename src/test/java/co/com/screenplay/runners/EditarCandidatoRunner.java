package co.com.screenplay.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/buscarcandidato.feature",
        glue = "co.com.screenplay.stepdefinitionsgit status",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty"}

)
public class EditarCandidatoRunner {
}