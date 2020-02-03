package com.toolsqa.step_definitions;

import java.util.List;

import com.toolsqa.models.Usuario;
import com.toolsqa.question.RegistroExitoso;
import com.toolsqa.tasks.RegistroPage;
import com.toolsqa.user_interfaces.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;

public class RegistroSteps {

	@Given("^Me encuentro en la pagina automationpractice$")
	public void meEncuentroEnLaPaginaAutomationpractice() {
		OnStage.theActorInTheSpotlight().attemptsTo(Click.on(HomePage.SIGN_IN));
	}

	@When("^digilencio en formulario$")
	public void digilencioEnFormulario(List<Usuario>dato) {
		Usuario.GuardarDatosDelUsuario(dato.get(0));
		OnStage.theActorInTheSpotlight().attemptsTo(RegistroPage.dato());
	}

	@Then("^Se visualiza el registro exitoso$")
	public void seVisualizaElRegistroExitoso() {
		OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(RegistroExitoso.pagina()));;
	}

}
