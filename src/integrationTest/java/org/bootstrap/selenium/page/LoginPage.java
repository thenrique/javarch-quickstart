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

}
