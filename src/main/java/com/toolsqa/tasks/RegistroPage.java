package com.toolsqa.tasks;

import com.toolsqa.interactions.WaitElement;
import com.toolsqa.models.Usuario;
import com.toolsqa.user_interfaces.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;

public class RegistroPage implements Task {

	@Override
	@Step("{0} intenta registrarse")
	public <T extends Actor> void performAs(T actor) {

		String dividirFecha[] = Usuario.LeerDatosDelUsuario(0).getFechaNacimient().split("/");
		String day = dividirFecha[0];
		String month = dividirFecha[1];
		String year = dividirFecha[2];
		String gender = Usuario.LeerDatosDelUsuario(0).getSexo();

		actor.attemptsTo(WaitElement.untilAppears(HomePage.NEW_EMAIL), Scroll.to(HomePage.CREATE_AN_ACCOUNT),
				Enter.theValue(Usuario.LeerDatosDelUsuario(0).getCorreo()).into(HomePage.NEW_EMAIL),
				Click.on(HomePage.CREATE_AN_ACCOUNT), WaitElement.untilAppears(HomePage.FIRST_NAME));

		switch (gender) {
		case "masculino":
			actor.attemptsTo(Click.on(HomePage.MALE));
			break;
		case "femenino":
			actor.attemptsTo(Click.on(HomePage.FEMALE));
			break;
		default:
			break;
		}

		actor.attemptsTo(Enter.theValue(Usuario.LeerDatosDelUsuario(0).getNombre()).into(HomePage.FIRST_NAME),
				Enter.theValue(Usuario.LeerDatosDelUsuario(0).getApellido()).into(HomePage.LAST_NAME),
				Enter.theValue(Usuario.LeerDatosDelUsuario(0).getContrasena()).into(HomePage.PASSWORD),
				SelectFromOptions.byValue(day).from(HomePage.DAY),
				SelectFromOptions.byValue(month).from(HomePage.MONTH),
				SelectFromOptions.byValue(year).from(HomePage.YEAR), Scroll.to(HomePage.CITY),
				Enter.keyValues(Usuario.LeerDatosDelUsuario(0).getDireccion()).into(HomePage.ADDRESS),
				Enter.keyValues(Usuario.LeerDatosDelUsuario(0).getCiudad()).into(HomePage.CITY),
				SelectFromOptions.byVisibleText(Usuario.LeerDatosDelUsuario(0).getEstado()).from(HomePage.STATE),
				Enter.keyValues(Usuario.LeerDatosDelUsuario(0).getZip()).into(HomePage.ZIP),
				Enter.keyValues(Usuario.LeerDatosDelUsuario(0).getCelular()).into(HomePage.CELLPHONE),
				Clear.field(HomePage.FUTURE_REFERENCE),
				Enter.keyValues(Usuario.LeerDatosDelUsuario(0).getOtraDireccion()).into(HomePage.FUTURE_REFERENCE),
				Click.on(HomePage.REGISTER));
	}

	public static RegistroPage dato() {
		return Tasks.instrumented(RegistroPage.class);
	}

}
