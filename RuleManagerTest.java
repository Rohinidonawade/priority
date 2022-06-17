package com.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.flows.LoginLogoutFlow;
import com.flows.RuleManagerFlow;
import com.generic.BaseTest;
import com.pageFactory.LoginPage;
import com.pageFactory.RuleManager;

public class RuleManagerTest extends BaseTest{

	private LoginPage objLoginPage;
	private LoginLogoutFlow objLoginLogoutFlow;
	private RuleManager objRuleManager;
	private RuleManagerFlow objRuleManagerFlow;
		
	public void initilizeWebPages() {		
		objRuleManager = new RuleManager(this);
		objLoginLogoutFlow = new LoginLogoutFlow(this);
		objRuleManagerFlow = new RuleManagerFlow(this);	
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
	
	@Test
	public void checkAboutRuleManger() {
		objLoginLogoutFlow.doLogin();
		objLoginPage.checkLHSMenuBar("rulesmanager");
		objRuleManagerFlow.checkRuleManagerMenu();
	}
}
