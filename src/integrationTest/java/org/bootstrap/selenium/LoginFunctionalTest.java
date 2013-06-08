package org.bootstrap.selenium;

import org.bootstrap.selenium.page.LoginPage;
import org.fluentlenium.adapter.FluentTest;
import org.fluentlenium.core.annotation.Page;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class LoginFunctionalTest extends FluentTest {
	
	public WebDriver webDriver = new HtmlUnitDriver();

    @Page
    public LoginPage page;

	    
	@Test
	public void testLoginExibicaoDePaginaInicial(){
		goTo( page );
		
		page.isAt();		
	}
	
	@Override
	public WebDriver getDefaultDriver() {
		return webDriver;
	}
}
