package org.bootstrap.selenium.page;

import static org.fest.assertions.Assertions.assertThat;

import org.fluentlenium.core.FluentPage;

public class PrincipalPage extends FluentPage {

	@Override
	public String getUrl() {
		return "http://localhost:8080/javarchQuickstart/principal.jsf";
	}
	
	@Override
	public void isAt() {
		assertThat(title()).isEqualTo("Página adm");
	}
	
	public void isButaoPaginaAdminPresente(){
		assertThat(findFirst("#botaoAcessoAdm").isDisplayed());
	}
}
