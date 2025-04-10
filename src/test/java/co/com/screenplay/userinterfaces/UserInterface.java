package co.com.screenplay.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserInterface {

    public static final Target CANDIDATOS_BUTTON = Target.the("botón Candidatos")
            .located(By.xpath("/html/body/app-root/app-home-layout/app-home/div/div[1]/div[1]"));

    public static final Target EDITAR_CANDIDATO_BUTTON = Target.the("botón editar del candidato Daniel Peña")
            .located(By.xpath("/html/body/app-root/app-default-layout/app-lista-candidatos/div[2]/div/app-card-candidato[6]/div/button"));

    public static final Target GUARDAR_BUTTON = Target.the("botón guardar")
            .located(By.xpath("//button[contains(text(),'Guardar')]"));
}









