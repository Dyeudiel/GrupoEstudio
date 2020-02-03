package com.toolsqa.question;

import com.toolsqa.user_interfaces.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class RegistroExitoso implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {

		if (HomePage.REGISTRO_EXITOSO.resolveFor(actor).getText().contains("Welcome to your account.")) {
			return true;
		} else {
			return false;
		}
	}

	public static RegistroExitoso pagina() {
		return new RegistroExitoso();
	}

}
