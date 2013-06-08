package org.bootstrap.selenium;

import org.bootstrap.selenium.page.LoginPage;
import org.bootstrap.selenium.page.PrincipalPage;
import org.fluentlenium.adapter.FluentTest;
import org.fluentlenium.core.annotation.Page;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class LoginFunctionalTest extends FluentTest {
	
	public WebDriver webDriver = new HtmlUnitDriver();

    @Page
    public LoginPage page;

    @Page
	public PrincipalPage principal;    
    
	@Test
	public void testLoginExibicaoDePaginaInicial(){
		goTo( page );
		
		page.isAt();		
		
		page.fillAndSubmitForm("admin", "adminerrado");
		
		page.isAt();		
		
	}
	
	@Test
	public void testLoginComSucesso(){
		goTo(page);
		
		page.fillAndSubmitForm("admin", "admin");
		
		principal.isAt();
		principal.isButaoPaginaAdminPresente();
	}
	
	@Override
	public WebDriver getDefaultDriver() {
		return webDriver;
	}
}
