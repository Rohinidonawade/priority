package com.flows;

import com.generic.Pojo;
import com.pageFactory.DesignPage;
import com.pageFactory.HomePage;

public class DesignPageFlow {

	private Pojo objPojo;
	private DesignPage objDesignPage;
	
	public  DesignPageFlow(Pojo pojo) {
       this.objPojo=pojo;
       objDesignPage = new DesignPage(objPojo);
	}
	
	public void checkDesignPage() {
		objDesignPage.clickDesig();
	//	objDesignPage.selectType("Anchor");
		objDesignPage.cleckOnFolder();
		objDesignPage.searchDesignName("Business");
		objDesignPage.clickDesigCompile();
		objDesignPage.clickDesigMaintenance();
	}
}
