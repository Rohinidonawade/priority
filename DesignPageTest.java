package com.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.flows.DashboardFlow;
import com.flows.DesignPageFlow;
import com.flows.LoginLogoutFlow;
import com.generic.BaseTest;
import com.pageFactory.DashboardPage;
import com.pageFactory.DesignPage;
import com.pageFactory.LoginPage;

public class DesignPageTest extends BaseTest{
	
	private LoginPage objLoginPage;
	private DesignPageFlow objDesignPageFlow;
	private LoginLogoutFlow objLoginLogoutFlow;
	private DesignPage objDePage;
		
	public void initilizeWebPages() {		
		objDesignPageFlow = new DesignPageFlow(this);
		objLoginLogoutFlow = new LoginLogoutFlow(this);
		objDePage = new DesignPage(this);	
		objLoginPage = new LoginPage(this);
	}
	
	@BeforeClass
	public void initializeOfWebEnvir() {
		this.initilizeWebPages();
		this.initilizeOfWebDriver();
	}

	@AfterClass
	public void tearDownEnv() {
		this.tearDown();
	}
	
	@Test(priority = 2)
	public void TC_04_VerifyDesignPage() {	
		objLoginPage.checkLHSMenuBar("design");
		objDesignPageFlow.checkDesignPage();
	}
	
	@Test(priority = 1)
	public void TC_05_VerifyDesignPage() {	
		objLoginLogoutFlow.doLogin();
	}	
}
