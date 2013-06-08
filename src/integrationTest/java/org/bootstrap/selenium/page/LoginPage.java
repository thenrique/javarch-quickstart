package org.bootstrap.selenium.page;

import org.fluentlenium.core.FluentPage;

import static org.fest.assertions.Assertions.assertThat;

public class LoginPage extends FluentPage {
	
	@Override
	public String getUrl() {
		return "http://localhost:8080/javarchQuickstart"; 
	}
	
	@Override
	public void isAt() {
		assertThat(title()).isEqualTo("Login Page");
	}

	public void fillAndSubmitForm(String login, String password){
		fill("input[name=j_username]").with( login );
		fill("input[name=j_password]").with( password );
		click("input[name=submit]");
	}
}
