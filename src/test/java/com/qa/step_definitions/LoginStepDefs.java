package com.qa.step_definitions;

import org.openqa.selenium.By;

import com.qa.utils.SeleniumUtils;
import com.qa.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStepDefs {

	private SeleniumUtils selUtil = new SeleniumUtils();

	@Given("Je me connecte sur l'application")
	public void jeMeConnecteSurLApplication() {

		Setup.getDriver().get("https://www.saucedemo.com/");
	}

	@When("Je saisis le username")
	public void jeSaisisLeUsername() {
		
		selUtil.clearField(Setup.getDriver().findElement(By.id("user-name")));
		selUtil.writeText(Setup.getDriver().findElement(By.id("user-name")), "standard_user");
	}

	@When("Je saisis le mot de passe")
	public void jeSaisisLeMotDePasse() {
		
		selUtil.clearField(Setup.getDriver().findElement(By.name("password")));
		selUtil.writeText(Setup.getDriver().findElement(By.name("password")), "secret_sauce");
	}

	@When("Je clique sur le bouton Login")
	public void jeCliqueSurLeBoutonLogin() {
		
		selUtil.click(Setup.getDriver().findElement(By.id("login-button")));
	}

}
