package com.pageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;
import com.generic.Pojo;

public class RuleManager extends BaseTest{

    private Pojo objPojo;
	
	public RuleManager(Pojo pojo) {
		this.objPojo = pojo;
	}
	
	By Loc_selectDocumentDesign = By.xpath("//select[@id='drpFormDesign']");
	By Loc_selectDocumentDesignversion = By.xpath("//select[@id='drpFormDesignVersion']");

	
	public void selectDocumentDesignType(String strValue) {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().slectDropDown(Loc_selectDocumentDesign, strValue));
	}
	
	public void selectDocumentDesignversion(String strValue) {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().slectDropDown(Loc_selectDocumentDesignversion, strValue));
	}
}
