package co.com.screenplay.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserInterface {

    public static final Target CANDIDATOS_BUTTON = Target.the("botón Candidatos")
            .located(By.xpath("/html/body/app-root/app-home-layout/app-home/div/div[1]/div[1]"));

    public static final Target EDITAR_CANDIDATO_BUTTON = Target.the("botón editar del candidato Daniel Peña")
            .located(By.xpath("/html/body/app-root/app-default-layout/app-lista-candidatos/div[2]/div/app-card-candidato[4]/div/button"));

    public static final Target NOMBRE_INPUT = Target.the("campo de nombre")
            .located(By.xpath("//*[@id=\"nombre\"]"));

    public static final Target APELLIDO_INPUT = Target.the("campo de apellido")
            .located(By.xpath("//*[@id=\"apellido\"]"));

    public static final Target GUARDAR_BUTTON = Target.the("botón guardar")
            .located(By.xpath("/html/body/app-root/app-default-layout/app-lista-candidatos/div[2]/div/app-form-editar-candidato/div/div/form/button"));
}









