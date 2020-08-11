package com.esg.executableclasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.esg.testclasses.Certified_Product_List_CPL_TestClass;
import com.esg.utilities.GetScreenShot;
import com.relevantcodes.extentreports.LogStatus;

public class Certified_Product_List_CPL_ExecutableClassTest  extends Certified_Product_List_CPL_TestClass{
	
	
	@BeforeTest
	public static void Initialization() {
		initialization();
	}	
	
	
	@Test
	public static void WaterSense_Toilet_Residential_Mobile_Application() {
		test = Report.startTest("WaterSense Toilet Residential Mobile Application");
		OpenBrowser("helper", "BaseURL");
		WaterSense_Toilet_Residential_MobileOnlineApplication();
		Equipment_Information_WaterSense_Toilet_Residential_Mobile_Application();
		EnrollmentApplication_WaterSense_Toilet_Residential_Mobile_Application();
		Close();
	}
	
	@AfterMethod
	public static void getStatusWithScreenshot(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			String screenShotPath = GetScreenShot.capture(driver);
			test.log(LogStatus.FAIL, result.getThrowable());
			test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture(screenShotPath));
		}
		Report.endTest(test);
	}

	@AfterTest
	public static void Report() {
		generateReport();
	}}