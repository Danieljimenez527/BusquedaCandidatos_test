package co.com.screenplay.userinterfaces2;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CandidatosPage {

    public static final Target BUSCADOR = Target.the("Campo de búsqueda de candidatos")
            .located(By.xpath("/html/body/app-root//app-lista-candidatos/div[1]/app-search-filter/div/input"));

    public static Target NOMBRE_CANDIDATO(String nombre) {
        return Target.the("Nombre del candidato mostrado")
                .located(By.xpath("/html/body/app-root/app-default-layout/app-lista-candidatos/div[1]/app-search-filter/div/input,'Daniel peña')]"));
    }
}