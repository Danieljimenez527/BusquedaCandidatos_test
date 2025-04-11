package co.com.screenplay.userinterfaces2;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CandidatosPage {

    public static final Target BUSCADOR = Target.the("Campo de búsqueda de candidatos")
            .located(By.xpath("/html/body/app-root//app-lista-candidatos/div[1]/app-search-filter/div/input"));

    public static final Target NOMBRE_CANDIDATO(String nombre) {
        return Target.the("nombre del candidato")
                .located(By.xpath("/html/body/app-root/app-default-layout/app-lista-candidatos/div[2]/div/app-card-candidato[1]/div/div[2]/div[1]"));
    }
}