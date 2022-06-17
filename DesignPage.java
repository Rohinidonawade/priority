package com.pageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.generic.BaseTest;
import com.generic.Pojo;

import io.netty.util.internal.ObjectPool;

public class DesignPage extends BaseTest{
	
	private Pojo objPojo;
	
	public DesignPage(Pojo pojo) {
		this.objPojo = pojo;
	}
	
	By Loc_butDesign = By.xpath("//a[@href='/FormDesign/Index#']");
	By Loc_selectDesignType = By.xpath("//select[@id='documentDesignTypeDDL']");
	By Loc_butClickFolder = By.xpath("//a[@href='/FormDesignGroup/Index']");
	By Loc_searchDesignNameInFolder = By.xpath("//input[@name='FormDesignName']");
	By Loc_butDesignCompiler = By.xpath("//a[@href='/FormDesignCompiler/Index']");
	By Loc_butDesignMaintenance= By.xpath("//a[text()='Design Maintenance']");


	
	public void clickDesig() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().click(Loc_butDesign));
	}
	
	public void selectType(String strType) {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().slectDropDown(Loc_butDesign, strType));
	}
	
	public void cleckOnFolder() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().click(Loc_butClickFolder));
	}
	
	public void searchDesignName(String strValue) {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().searchElement(Loc_searchDesignNameInFolder, strValue));
	}
	
	public void clickDesigCompile() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().click(Loc_butDesignCompiler));
	}
	
	public void clickDesigMaintenance() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunction().click(Loc_butDesignMaintenance));
	}
}
