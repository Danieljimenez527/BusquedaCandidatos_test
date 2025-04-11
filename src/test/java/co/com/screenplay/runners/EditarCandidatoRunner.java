package co.com.screenplay.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features ={
                "src/test/resources/features/buscarcandidato.feature",
                "src/test/resources/features/editarcandidato.feature"},
        glue ={
                "co.com.screenplay.stepdefinitions",
                "co.com.screenplay.stepdefinitions2"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty"}

)
public class EditarCandidatoRunner {
}