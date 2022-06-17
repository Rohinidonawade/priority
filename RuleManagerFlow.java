package com.flows;

import com.generic.Pojo;
import com.pageFactory.DashboardPage;
import com.pageFactory.RuleManager;

    public class RuleManagerFlow {

	private Pojo objPojo;
	private RuleManager objRuleManager;
	
	public RuleManagerFlow(Pojo pojo) {
		this.objPojo = pojo;
		objRuleManager = new RuleManager(objPojo);
	}
	
	public void checkRuleManagerMenu() {
		objRuleManager.selectDocumentDesignType("Admin");
		objRuleManager.selectDocumentDesignversion("1.0");
	}
}
