package com.esg.testclasses;

import java.awt.event.KeyEvent;
import org.openqa.selenium.WebElement;

import com.esg.utilities.HelperClass;
import com.relevantcodes.extentreports.LogStatus;

public class Certified_Product_List_CPL_TestClass extends HelperClass {

	public static void GreenTickMarkValidation() {
		clickWebelement("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_AHRICertifiedReferenceNumberClick");
		
		WebElement Element = Xpath("Certified_Product_List_CPL", "CheckMarkConfirmation");
		if (Element.isDisplayed()) {
			test.log(LogStatus.PASS, "Green Check Mark is displayed");
		}else
			test.log(LogStatus.FAIL, "Green Check Mark is not displayed");
	}
	public static void OnlineApplication() {
			//Launch online application
		    ExecutingAgainst("helper", "Version");
			openURL("Certified_Product_List_CPL", "OnlineURL");
		}
	
	public static void OpenOnlineApplication() {
		setProperty("helper", "chrome", "Chrome_Path");
		openChrome();
		openURL("Certified_Product_List_CPL", "OnlineApplication");
		maximizeWindow();
		implicitlywait(220);
	}
		
	public static void Step1_Getting_Started_AHRI_Air_Conditioner() {
		WaitForElement(300, "Certified_Product_List_CPL", "GettingStartedPageValidation");
		clickWebelement("Certified_Product_List_CPL", "AccountHolder");
		enterTextboxValue("Certified_Product_List_CPL", "AccountNumber", "ESG Values","CPL", 2, 1);
		threadWait(5000);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("Certified_Product_List_CPL", "ZipCode", "ESG Values","CPL" , 3, 1);
		threadWait(5000);
		scrollToElement("Certified_Product_List_CPL", "NextButton");
		clickWebelement("Certified_Product_List_CPL", "NextButton");
		scrollToElement("Certified_Product_List_CPL", "NextButton");
		clickWebelement("Certified_Product_List_CPL", "NextButton");
		
	}
	public static void Step2_Equipment_Information_AHRI_Air_Conditioner() {
		
		WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_AddEquipmentButton");
		clickWebelement("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_AddEquipmentButton");
		scrollToElement("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_AddEquipmentMeasure");
		clickWebelement("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_AddEquipmentMeasure");
		clickWebelement("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_OkButton");
		enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Quantity", "ESG Values","CPL" , 7, 1);
		enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_AHRICertifiedReferenceNumber", "ESG Values","CPL" , 5, 1);
		clickWebelement("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_AHRICertifiedReferenceNumberClick");
		WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_AHRIType");
		
		//Equipment information Validation
		WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_OldAHRIReferenceNumber");
		threadWait(5000);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_OldAHRIReferenceNumber", "ESG Values","CPL", 9, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_AHRIType", "ESG Values","CPL", 10, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_CoolingCapacity", "ESG Values","CPL", 11, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_DesignatedTestedCombination", "ESG Values","CPL", 12, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_EER", "ESG Values","CPL", 13, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_EligibleforFederalTaxCredit", "ESG Values","CPL", 14, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_EnergyGuideLabel", "ESG Values","CPL", 15, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_EstimatedNationalAverageOperatingCoolingCost", "ESG Values","CPL", 16, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_FurnaceModelNumber", "ESG Values","CPL", 17, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_IEER", "ESG Values","CPL", 18, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_IndoorCoolingIntermediateAirVolumeRate", "ESG Values","CPL", 19, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_IndoorCoolingMinimumAirVolumeRate", "ESG Values","CPL", 20, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_IndoorFullLoadAirVolumeRate", "ESG Values","CPL", 21, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_IndoorUnitModelNumber", "ESG Values","CPL", 22, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_IsRerated", "ESG Values","CPL", 23, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_ManufacturerType", "ESG Values","CPL", 24, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_ModelStatus", "ESG Values","CPL", 25, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_OutdoorUnitBrandName", "ESG Values","CPL", 26, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_OutdoorUnitModelNumberCondenser", "ESG Values","CPL", 27, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Phase", "ESG Values","CPL", 28, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Region", "ESG Values","CPL", 29, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_SEER", "ESG Values","CPL", 30, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_SeriesName", "ESG Values","CPL", 31, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Soldin", "ESG Values","CPL", 32, 1);
		scrollToElement("Certified_Product_List_CPL", "NextButton");
		clickWebelement("Certified_Product_List_CPL", "NextButton");
		
		//Review and Submit Step
		WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_SubmitButton_Wait");
		scrollToElement("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_SubmitButton");
		clickWebelement("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_SubmitButton");
		
		//Confirmation Step
		explicitWaitForClickable(300, "Certified_Product_List_CPL", "Confirmation_Number");
		TrackEnrollmentNumber("Certified_Product_List_CPL", "Confirmation_Number", "ESG Values","CPL", 6, 1);
	}
	
	public static void EnrollmentApplication_AHRI_Air_Conditioner() {
		login2(1, 0, 1, 1);
		WaitForElement(300, "Certified_Product_List_CPL", "MainMenu");
		ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "ESG Values", "CPL", 35, 1);
		enterTextboxValue("Certified_Product_List_CPL", "EnrollmentNumber", "ESG Values","CPL", 6, 1);
		scrollToElement("Certified_Product_List_CPL", "SearchButton");
		clickWebelement("Certified_Product_List_CPL", "SearchButton");
		WaitForElement(300, "Certified_Product_List_CPL", "EnrollmentLink");
		clickWebelement("Certified_Product_List_CPL", "EnrollmentLink");
		WaitForElement(300, "Certified_Product_List_CPL", "EnrollmentApplication");
		clickWebelement("Certified_Product_List_CPL", "EnrollmentApplication");
		scrollToElement("Certified_Product_List_CPL", "MeasureTab");
		clickWebelement("Certified_Product_List_CPL", "MeasureTab");
		WaitForElement(300, "Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_AHRICertifiedReferenceNumber");
		//Enrollment Measures Validation
		
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_AHRICertifiedReferenceNumber", "ESG Values","CPL", 5, 1);
		GreenTickMarkValidation();
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_OldAHRIReferenceNumber", "ESG Values","CPL", 9, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_AHRIType", "ESG Values","CPL", 10, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_CoolingCapacity", "ESG Values","CPL", 11, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_DesignatedTestedCombination", "ESG Values","CPL", 12, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_EER", "ESG Values","CPL", 13, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_EligibleforFederalTaxCredit", "ESG Values","CPL", 14, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_EnergyGuideLabel", "ESG Values","CPL", 15, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_EstimatedNationalAverageOperatingCoolingCost", "ESG Values","CPL", 16, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_FurnaceModelNumber", "ESG Values","CPL", 17, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_IEER", "ESG Values","CPL", 18, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_IndoorCoolingIntermediateAirVolumeRate", "ESG Values","CPL", 19, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_IndoorCoolingMinimumAirVolumeRate", "ESG Values","CPL", 20, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_IndoorFullLoadAirVolumeRate", "ESG Values","CPL", 21, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_IndoorUnitModelNumber", "ESG Values","CPL", 22, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_IsRerated", "ESG Values","CPL", 23, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_ManufacturerType", "ESG Values","CPL", 24, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_ModelStatus", "ESG Values","CPL", 25, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_OutdoorUnitBrandName", "ESG Values","CPL", 26, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_OutdoorUnitModelNumberCondenser", "ESG Values","CPL", 27, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Phase", "ESG Values","CPL", 28, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Region", "ESG Values","CPL", 29, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_SEER", "ESG Values","CPL", 30, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_SeriesName", "ESG Values","CPL", 31, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Soldin", "ESG Values","CPL", 32, 1);
		
		HandleErrorCodeOnProcess("helper", "ProcessButton", "");
	}
	public static void MeasurePropertiesValidationAirConditioner() {
		WaitForElement(300, "Certified_Product_List_CPL", "EnrollmentApplication");
		clickWebelement("Certified_Product_List_CPL", "EnrollmentApplication");
		scrollToElement("Certified_Product_List_CPL", "MeasureTab");
		clickWebelement("Certified_Product_List_CPL", "MeasureTab");
		WaitForElement(300, "Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_AHRICertifiedReferenceNumber");
		
		//Enrollment Measures Validation
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_AHRICertifiedReferenceNumber", "ESG Values","CPL", 5, 1);
		GreenTickMarkValidation();
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_OldAHRIReferenceNumber", "ESG Values","CPL", 9, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_AHRIType", "ESG Values","CPL", 10, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_CoolingCapacity", "ESG Values","CPL", 11, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_DesignatedTestedCombination", "ESG Values","CPL", 12, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_EER", "ESG Values","CPL", 13, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_EligibleforFederalTaxCredit", "ESG Values","CPL", 14, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_EnergyGuideLabel", "ESG Values","CPL", 15, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_EstimatedNationalAverageOperatingCoolingCost", "ESG Values","CPL", 16, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_FurnaceModelNumber", "ESG Values","CPL", 17, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_IEER", "ESG Values","CPL", 18, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_IndoorCoolingIntermediateAirVolumeRate", "ESG Values","CPL", 19, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_IndoorCoolingMinimumAirVolumeRate", "ESG Values","CPL", 20, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_IndoorFullLoadAirVolumeRate", "ESG Values","CPL", 21, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_IndoorUnitModelNumber", "ESG Values","CPL", 22, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_IsRerated", "ESG Values","CPL", 23, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_ManufacturerType", "ESG Values","CPL", 24, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_ModelStatus", "ESG Values","CPL", 25, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_OutdoorUnitBrandName", "ESG Values","CPL", 26, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_OutdoorUnitModelNumberCondenser", "ESG Values","CPL", 27, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Phase", "ESG Values","CPL", 28, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Region", "ESG Values","CPL", 29, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_SEER", "ESG Values","CPL", 30, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_SeriesName", "ESG Values","CPL", 31, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Soldin", "ESG Values","CPL", 32, 1);	
	}
	
	// CPL AHI - Furnace - Residential (Online Application) --------------------------------------------------------------------------------------------------------------------------------------
	
	public static void Step1_Getting_Started_AHRI_Furnace() {
		WaitForElement(300, "Certified_Product_List_CPL", "GettingStartedPageValidation");
		//explicitWait(300, "Certified_Product_List_CPL", "GettingStartedPageValidation");
		clickWebelement("Certified_Product_List_CPL", "AccountHolder");
		enterTextboxValue("Certified_Product_List_CPL", "AccountNumber", "ESG Values","CPL", 2, 1);
		Enter(KeyEvent.VK_TAB);
		enterTextboxValue("Certified_Product_List_CPL", "ZipCode", "ESG Values","CPL" , 3, 1);
		threadWait(5000);
		scrollToElement("Certified_Product_List_CPL", "NextButton");
		clickWebelement("Certified_Product_List_CPL", "NextButton");
		scrollToElement("Certified_Product_List_CPL", "NextButton");
		clickWebelement("Certified_Product_List_CPL", "NextButton");
		
	}
	public static void Step2_Equipment_Information_AHRI_Furnace() {
		WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_AddEquipmentButton");
		clickWebelement("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_AddEquipmentButton");
		WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_AddEquipmentMeasureWait");
		scrollToElement("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_AddEquipmentMeasure");
		clickWebelement("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_AddEquipmentMeasure");
		clickWebelement("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_OkButton");
		enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Quantity", "ESG Values","CPL" , 45, 1);
		enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_AHRICertifiedReferenceNumber", "ESG Values","CPL" , 43, 1);
		clickWebelement("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_AHRICertifiedReferenceNumberClick");
		
		//Equipment information Validation
		test.log(LogStatus.INFO, "Online Application Validation");
		WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_BrandName");
		threadWait(2500);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_BrandName", "ESG Values","CPL", 47, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Configuration", "ESG Values","CPL", 48, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Eae_including_Eso", "ESG Values","CPL",49, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Ef", "ESG Values","CPL", 50, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Electronically_Commutated_Motor", "ESG Values","CPL", 51, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_EligibleforFederalTaxCredit", "ESG Values","CPL", 52, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_EnergyGuideLabel", "ESG Values","CPL", 53, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Fuel_Type", "ESG Values","CPL", 54, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Furnace_Type", "ESG Values","CPL", 55, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Input_Rating", "ESG Values","CPL", 56, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_IsRerated", "ESG Values","CPL", 57, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_Home", "ESG Values","CPL", 58, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Model_Number", "ESG Values","CPL", 59, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Model_Status", "ESG Values","CPL", 60, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Old_AHRI_Reference_Number", "ESG Values","CPL", 61, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Output_Heating_Capacity", "ESG Values","CPL", 62, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_PE", "ESG Values","CPL", 63, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_SeriesName", "ESG Values","CPL", 64, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_AFUE", "ESG Values","CPL", 65, 1);
		scrollToElement("Certified_Product_List_CPL", "NextButton");
		clickWebelement("Certified_Product_List_CPL", "NextButton");
		
		//Review and Submit Step
		WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_SubmitButton_Wait");
		scrollToElement("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_SubmitButton");
		clickWebelement("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_SubmitButton");
		
		//Confirmation Step
		explicitWait(300, "Certified_Product_List_CPL", "Confirmation_Number");
		//WaitForElement(300, "Certified_Product_List_CPL", "Confirmation_Number");
		TrackEnrollmentNumber("Certified_Product_List_CPL", "Confirmation_Number", "ESG Values","CPL", 6, 1);
	}
	
	public static void EnrollmentApplication_AHRI_Furnace() {
		//login("helper", "BaseURL", 1, 0, 1, 1);
		login2(1, 0, 1, 1);
		explicitWait(300, "Certified_Product_List_CPL", "MainMenu");
		ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "ESG Values", "CPL", 35, 1);
		enterTextboxValue("Certified_Product_List_CPL", "EnrollmentNumber", "ESG Values","CPL", 6, 1);
		scrollToElement("Certified_Product_List_CPL", "SearchButton");
		clickWebelement("Certified_Product_List_CPL", "SearchButton");
		WaitForElement(300, "Certified_Product_List_CPL", "EnrollmentLink");
		clickWebelement("Certified_Product_List_CPL", "EnrollmentLink");
		WaitForElement(300, "Certified_Product_List_CPL", "EnrollmentApplication");
		clickWebelement("Certified_Product_List_CPL", "EnrollmentApplication");
		scrollToElement("Certified_Product_List_CPL", "MeasureTab");
		clickWebelement("Certified_Product_List_CPL", "MeasureTab");
		WaitForElement(300, "Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_AHRICertifiedReferenceNumber");
		
		//Enrollment Measures Validation
		test.log(LogStatus.INFO, "Application Measure validation before Process");
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_AHRICertifiedReferenceNumber", "ESG Values","CPL", 43, 1);
		GreenTickMarkValidation();
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_BrandName", "ESG Values","CPL", 47, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Configuration", "ESG Values","CPL", 48, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Eae_including_Eso", "ESG Values","CPL", 49, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Ef", "ESG Values","CPL", 50, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Electronically_Commutated_Motor", "ESG Values","CPL", 51, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_EligibleforFederalTaxCredit", "ESG Values","CPL", 52, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_EnergyGuideLabel", "ESG Values","CPL", 53, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Fuel_Type", "ESG Values","CPL", 54, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Furnace_Type", "ESG Values","CPL", 55, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Input_Rating", "ESG Values","CPL", 56, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_IsRerated", "ESG Values","CPL", 57, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Mobile_Home", "ESG Values","CPL", 58, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Model_Number", "ESG Values","CPL", 59, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Model_Status", "ESG Values","CPL", 60, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Old_AHRI_Reference_Number", "ESG Values","CPL", 61, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Output_Heating_Capacity", "ESG Values","CPL", 62, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_PE", "ESG Values","CPL", 63, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_SeriesName", "ESG Values","CPL", 64, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_AFUE", "ESG Values","CPL", 65, 1);
		HandleErrorCodeOnProcess("helper", "ProcessButton", "");
		
		//clickonProcess();
	}
	public static void MeasurePropertiesValidationFurnace() {
		WaitForElement(300, "Certified_Product_List_CPL", "EnrollmentApplication");
		clickWebelement("Certified_Product_List_CPL", "EnrollmentApplication");
		scrollToElement("Certified_Product_List_CPL", "MeasureTab");
		clickWebelement("Certified_Product_List_CPL", "MeasureTab");
		WaitForElement(300, "Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_AHRICertifiedReferenceNumber");
		
		//Enrollment Measures Validation
		test.log(LogStatus.INFO, "Application Measure validation after the Processing the application");
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_AHRICertifiedReferenceNumber", "ESG Values","CPL", 43, 1);
		GreenTickMarkValidation();
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_BrandName", "ESG Values","CPL", 47, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Configuration", "ESG Values","CPL", 48, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Eae_including_Eso", "ESG Values","CPL", 49, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Ef", "ESG Values","CPL", 50, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Electronically_Commutated_Motor", "ESG Values","CPL", 51, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_EligibleforFederalTaxCredit", "ESG Values","CPL", 52, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_EnergyGuideLabel", "ESG Values","CPL", 53, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Fuel_Type", "ESG Values","CPL", 54, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Furnace_Type", "ESG Values","CPL", 55, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Input_Rating", "ESG Values","CPL", 56, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_IsRerated", "ESG Values","CPL", 57, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Mobile_Home", "ESG Values","CPL", 58, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Model_Number", "ESG Values","CPL", 59, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Model_Status", "ESG Values","CPL", 60, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Old_AHRI_Reference_Number", "ESG Values","CPL", 61, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Output_Heating_Capacity", "ESG Values","CPL", 62, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_PE", "ESG Values","CPL", 63, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_SeriesName", "ESG Values","CPL", 64, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_AFUE", "ESG Values","CPL", 65, 1);
	}
	
	// CPL AHI - Heat Pump - Residential (Online Application) --------------------------------------------------------------------------------------------------------------------------------------
	
			public static void Step1_Getting_Started_AHRI_Heat_Pump_OnlineApplication() {
				
				WaitForElement(300, "Certified_Product_List_CPL", "GettingStartedPageValidation");
				clickWebelement("Certified_Product_List_CPL", "AccountHolder");
				enterTextboxValue("Certified_Product_List_CPL", "AccountNumber", "ESG Values","CPL", 2, 1);
				Enter(KeyEvent.VK_TAB);
				enterTextboxValue("Certified_Product_List_CPL", "ZipCode", "ESG Values","CPL" , 3, 1);
				threadWait(5000);
				scrollToElement("Certified_Product_List_CPL", "NextButton");
				clickWebelement("Certified_Product_List_CPL", "NextButton");
				scrollToElement("Certified_Product_List_CPL", "NextButton");
				clickWebelement("Certified_Product_List_CPL", "NextButton");
				
			}
			public static void Step2_Equipment_Information_AHRI_Heat_Pump_OnlineApplication() {
				WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_AddEquipmentButton");
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_AddEquipmentButton");
				scrollToElement("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_AddEquipmentMeasure");
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_AddEquipmentMeasure");
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_OkButton");
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_Quantity", "ESG Values","CPL" , 45, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_AHRICertifiedReferenceNumber", "ESG Values","CPL" , 76, 1);
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_AHRICertifiedReferenceNumberClick");
				//explicitWait(300, "Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_AHRIType");
				
				//Equipment information Validation
				test.log(LogStatus.INFO, "Online Application Validation");
				WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_AHRIType");
				threadWait(5000);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_AHRIType", "ESG Values","CPL", 80, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_CoolingCapacity", "ESG Values","CPL", 81, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_DesignatedTestedCombination", "ESG Values","CPL", 82, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_EER", "ESG Values","CPL", 83, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_EligibleforFederalTaxCredit", "ESG Values","CPL", 84, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_EnergyGuideLabel", "ESG Values","CPL", 85, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_EstimatedNationalAverageOperatingCoolingCost", "ESG Values","CPL", 86, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_EstimatedNationalAverageOperatingHeatingCost", "ESG Values","CPL", 87, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_FurnaceModelNumber", "ESG Values","CPL", 88, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_HeatingCapacity_H12", "ESG Values","CPL", 89, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_HeatingCapacity_H32", "ESG Values","CPL", 90, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_HSPF", "ESG Values","CPL", 91, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_IndoorCoolingIntermediateAirVolumeRate", "ESG Values","CPL", 92, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_IndoorCoolingMinimumAirVolumeRate", "ESG Values","CPL", 93, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_IndoorFullLoadAirVolumeRate", "ESG Values","CPL", 94, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_IndoorUnitBrandName", "ESG Values","CPL", 95, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_IndoorUnitModelNumber", "ESG Values","CPL", 96, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_IsRerated", "ESG Values","CPL", 97, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_ManufacturerType", "ESG Values","CPL", 98, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_ModelStatus", "ESG Values","CPL", 99, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_OldAHRIReferenceNumber", "ESG Values","CPL",100, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_OutdoorUnitBrandName", "ESG Values","CPL", 101, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_OutdoorUnitModelNumberCondenser", "ESG Values","CPL", 102, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_Phase", "ESG Values","CPL", 103, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_SEER", "ESG Values","CPL", 104, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_SeriesName", "ESG Values","CPL", 105, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_HeatPump_Soldin", "ESG Values","CPL", 106, 1);
				scrollToElement("Certified_Product_List_CPL", "NextButton");
				clickWebelement("Certified_Product_List_CPL", "NextButton");
				
				//Review and Submit Step
				WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_SubmitButton_Wait");
				scrollToElement("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_SubmitButton");
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_SubmitButton");
				
				//Confirmation Step
				explicitWait(300, "Certified_Product_List_CPL", "Confirmation_Number");
				TrackEnrollmentNumber("Certified_Product_List_CPL", "Confirmation_Number", "ESG Values","CPL", 77, 1);
			}
			
			public static void EnrollmentApplication_AHRI_Heat_Pump_OnlineApplication() {
				//login("helper", "BaseURL", 1, 0, 1, 1);
				login2(1, 0, 1, 1);
				WaitForElement(300, "Certified_Product_List_CPL", "MainMenu");
				ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "ESG Values", "CPL", 35, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EnrollmentNumber", "ESG Values","CPL", 77, 1);
				scrollToElement("Certified_Product_List_CPL", "SearchButton");
				clickWebelement("Certified_Product_List_CPL", "SearchButton");
				WaitForElement(300, "Certified_Product_List_CPL", "EnrollmentLink");
				clickWebelement("Certified_Product_List_CPL", "EnrollmentLink");
				WaitForElement(300, "Certified_Product_List_CPL", "EnrollmentApplication");
				clickWebelement("Certified_Product_List_CPL", "EnrollmentApplication");
				scrollToElement("Certified_Product_List_CPL", "MeasureTab");
				clickWebelement("Certified_Product_List_CPL", "MeasureTab");
				WaitForElement(300, "Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_AHRICertifiedReferenceNumber");
				
				//Enrollment Measures Validation
				test.log(LogStatus.INFO, "Application Measure validation before Process");
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_AHRICertifiedReferenceNumber", "ESG Values","CPL", 76, 1);
				GreenTickMarkValidation();
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_AHRIType", "ESG Values","CPL", 80, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_CoolingCapacity", "ESG Values","CPL", 81, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_DesignatedTestedCombination", "ESG Values","CPL", 82, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_EER", "ESG Values","CPL", 83, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_EligibleforFederalTaxCredit", "ESG Values","CPL", 84, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_EnergyGuideLabel", "ESG Values","CPL", 85, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_EstimatedNationalAverageOperatingCoolingCost", "ESG Values","CPL", 86, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_EstimatedNationalAverageOperatingHeatingCost", "ESG Values","CPL", 87, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_FurnaceModelNumber", "ESG Values","CPL", 88, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_HeatingCapacity_H12", "ESG Values","CPL", 89, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_HeatingCapacity_H32", "ESG Values","CPL", 90, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_HSPF", "ESG Values","CPL", 91, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_IndoorCoolingIntermediateAirVolumeRate", "ESG Values","CPL", 92, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_IndoorCoolingMinimumAirVolumeRate", "ESG Values","CPL", 93, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_IndoorFullLoadAirVolumeRate", "ESG Values","CPL", 94, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_IndoorUnitBrandName", "ESG Values","CPL", 95, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_IndoorUnitModelNumber", "ESG Values","CPL", 96, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_IsRerated", "ESG Values","CPL", 97, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_ManufacturerType", "ESG Values","CPL", 98, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_ModelStatus", "ESG Values","CPL", 99, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_OldAHRIReferenceNumber", "ESG Values","CPL",100, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_OutdoorUnitBrandName", "ESG Values","CPL", 101, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_OutdoorUnitModelNumberCondenser", "ESG Values","CPL", 102, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Phase", "ESG Values","CPL", 103, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_SEER", "ESG Values","CPL", 104, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_SeriesName", "ESG Values","CPL", 105, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Soldin", "ESG Values","CPL", 106, 1);
				
				HandleErrorCodeOnProcess("helper", "ProcessButton", "");
				//clickonProcess();
			}
			public static void MeasurePropertiesValidation_Heat_Pump_OnlineApplication() {
				WaitForElement(300, "Certified_Product_List_CPL", "EnrollmentApplication");
				clickWebelement("Certified_Product_List_CPL", "EnrollmentApplication");
				scrollToElement("Certified_Product_List_CPL", "MeasureTab");
				clickWebelement("Certified_Product_List_CPL", "MeasureTab");
				WaitForElement(300, "Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_AHRICertifiedReferenceNumber");
				//Enrollment Measures Validation
				test.log(LogStatus.INFO, "Application Measure validation after the Processing the application");
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_AHRICertifiedReferenceNumber", "ESG Values","CPL", 76, 1);
				GreenTickMarkValidation();
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_AHRIType", "ESG Values","CPL", 80, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_CoolingCapacity", "ESG Values","CPL", 81, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_DesignatedTestedCombination", "ESG Values","CPL", 82, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_EER", "ESG Values","CPL", 83, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_EligibleforFederalTaxCredit", "ESG Values","CPL", 84, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_EnergyGuideLabel", "ESG Values","CPL", 85, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_EstimatedNationalAverageOperatingCoolingCost", "ESG Values","CPL", 86, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_EstimatedNationalAverageOperatingHeatingCost", "ESG Values","CPL", 87, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_FurnaceModelNumber", "ESG Values","CPL", 88, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_HeatingCapacity_H12", "ESG Values","CPL", 89, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_HeatingCapacity_H32", "ESG Values","CPL", 90, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_HSPF", "ESG Values","CPL", 91, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_IndoorCoolingIntermediateAirVolumeRate", "ESG Values","CPL", 92, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_IndoorCoolingMinimumAirVolumeRate", "ESG Values","CPL", 93, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_IndoorFullLoadAirVolumeRate", "ESG Values","CPL", 94, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_IndoorUnitBrandName", "ESG Values","CPL", 95, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_IndoorUnitModelNumber", "ESG Values","CPL", 96, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_IsRerated", "ESG Values","CPL", 97, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_ManufacturerType", "ESG Values","CPL", 98, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_ModelStatus", "ESG Values","CPL", 99, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_OldAHRIReferenceNumber", "ESG Values","CPL",100, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_OutdoorUnitBrandName", "ESG Values","CPL", 101, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_OutdoorUnitModelNumberCondenser", "ESG Values","CPL", 102, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Phase", "ESG Values","CPL", 103, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_SEER", "ESG Values","CPL", 104, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_SeriesName", "ESG Values","CPL", 105, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Soldin", "ESG Values","CPL", 106, 1);

			}
			
			
			//********************************************CPL: AHRI - Air Conditioner - Residential (Mobile Application)********************************
			public static void MobileOnlineApplication() {
				//Launch online application
				ExecutingAgainst("helper", "Version");
				openURL("Certified_Product_List_CPL", "MobileURL");
			}
			
			public static void Equipment_Information_AHRI_Air_Conditioner_Mobile_Application() {
				//Enter the AHRI Certified Reference Number
				enterTextboxValue("Certified_Product_List_CPL", "AHRIReferenceNumber_Airconditioner_Mobile", "ESG Values","CPL" , 117, 1);
				WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_AHRIType");
				//Equipment information Validation
				threadWait(5000);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_OldAHRIReferenceNumber", "ESG Values","CPL", 121, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_AHRIType", "ESG Values","CPL", 122, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_CoolingCapacity", "ESG Values","CPL", 123, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_DesignatedTestedCombination", "ESG Values","CPL", 124, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_EER", "ESG Values","CPL", 125, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_EligibleforFederalTaxCredit", "ESG Values","CPL", 126, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_EnergyGuideLabel", "ESG Values","CPL", 127, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_EstimatedNationalAverageOperatingCoolingCost", "ESG Values","CPL", 128, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_FurnaceModelNumber", "ESG Values","CPL", 129, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_IEER", "ESG Values","CPL", 130, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_IndoorCoolingIntermediateAirVolumeRate", "ESG Values","CPL", 131, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_IndoorCoolingMinimumAirVolumeRate", "ESG Values","CPL", 132, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_IndoorFullLoadAirVolumeRate", "ESG Values","CPL", 133, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_IndoorUnitModelNumber", "ESG Values","CPL", 134, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_IsRerated", "ESG Values","CPL", 135, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_ManufacturerType", "ESG Values","CPL", 136, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_ModelStatus", "ESG Values","CPL", 137, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_OutdoorUnitBrandName", "ESG Values","CPL", 138, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_OutdoorUnitModelNumberCondenser", "ESG Values","CPL", 139, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_Phase", "ESG Values","CPL", 140, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_Region", "ESG Values","CPL", 141, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_SEER", "ESG Values","CPL", 142, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_SeriesName", "ESG Values","CPL", 143, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_Soldin", "ESG Values","CPL", 144, 1);
				clickWebelement("Certified_Product_List_CPL", "Mobile_Application_NextButton");
				WaitForElement(300, "Certified_Product_List_CPL", "Mobile_Application_AccptButton");
				clickWebelement("Certified_Product_List_CPL", "Mobile_Application_AccptButton");
				
				// Enter the required Customer Details
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Name", "ESG Values","CPL" , 114, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Account", "ESG Values","CPL" , 113, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_EmailID", "ESG Values","CPL" , 115, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_PhoneNumber", "ESG Values","CPL" , 116, 1);
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_SubmitButton");
				
				//Review and Submit Step
				explicitWait(300, "Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_ConfirmationMessage");
				TrackEnrollmentNumber("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_ConfirmationMessage", "ESG Values","CPL", 118, 1);

			}
			
			public static void EnrollmentApplication_AHRI_Air_Conditioner_Mobile_Application() {
				//login("helper", "BaseURL", 1, 0, 1, 1);
				login2(1, 0, 1, 1);
				WaitForElement(300, "Certified_Product_List_CPL", "MainMenu");
				ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "ESG Values", "CPL", 35, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EnrollmentNumber", "ESG Values","CPL", 118, 1);
				scrollToElement("Certified_Product_List_CPL", "SearchButton");
				clickWebelement("Certified_Product_List_CPL", "SearchButton");
				threadWait(5000);
				clickWebelement("Certified_Product_List_CPL", "EnrollmentLink");
				WaitForElement(300, "Certified_Product_List_CPL", "EnrollmentApplication");
				clickWebelement("Certified_Product_List_CPL", "EnrollmentApplication");
				scrollToElement("Certified_Product_List_CPL", "MeasureTab");
				clickWebelement("Certified_Product_List_CPL", "MeasureTab");
				WaitForElement(300, "Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_AHRICertifiedReferenceNumber");
				
				//Enrollment Measures Validation
				
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_AHRICertifiedReferenceNumber", "ESG Values","CPL", 117, 1);
				GreenTickMarkValidation();
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_OldAHRIReferenceNumber", "ESG Values","CPL", 121, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_AHRIType", "ESG Values","CPL", 122, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_CoolingCapacity", "ESG Values","CPL", 123, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_DesignatedTestedCombination", "ESG Values","CPL", 124, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_EER", "ESG Values","CPL", 125, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_EligibleforFederalTaxCredit", "ESG Values","CPL", 126, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_EnergyGuideLabel", "ESG Values","CPL", 127, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_EstimatedNationalAverageOperatingCoolingCost", "ESG Values","CPL", 128, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_FurnaceModelNumber", "ESG Values","CPL", 129, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_IEER", "ESG Values","CPL", 130, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_IndoorCoolingIntermediateAirVolumeRate", "ESG Values","CPL", 131, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_IndoorCoolingMinimumAirVolumeRate", "ESG Values","CPL", 132, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_IndoorFullLoadAirVolumeRate", "ESG Values","CPL", 133, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_IndoorUnitModelNumber", "ESG Values","CPL", 134, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_IsRerated", "ESG Values","CPL", 135, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_ManufacturerType", "ESG Values","CPL", 136, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_ModelStatus", "ESG Values","CPL", 137, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_OutdoorUnitBrandName", "ESG Values","CPL", 138, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_OutdoorUnitModelNumberCondenser", "ESG Values","CPL", 139, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Phase", "ESG Values","CPL", 140, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Region", "ESG Values","CPL", 141, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_SEER", "ESG Values","CPL", 142, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_SeriesName", "ESG Values","CPL", 143, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Soldin", "ESG Values","CPL", 144, 1);
			}
			public static void AHRI_Furnace_MobileOnlineApplication() {
				//Launch online application
				ExecutingAgainst("helper", "Version");
				openURL("Certified_Product_List_CPL", "AHRI_Furnace_MobileURL");
			}
			public static void Equipment_Information_AHRI_Furnace_Mobile_Application() {
				//Enter the AHRI Certified Reference Number
				enterTextboxValue("Certified_Product_List_CPL", "AHRIReferenceNumber_Airconditioner_Mobile", "ESG Values","CPL" , 158, 1);
				WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_Application_BrandName");
				//Equipment information Validation
				test.log(LogStatus.INFO, "Online Application data validation");
				threadWait(2500);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_Application_BrandName", "ESG Values","CPL", 161, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_Application_Configuration", "ESG Values","CPL", 162, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_Application_Eae_including_Eso", "ESG Values","CPL", 163, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_Application_Ef", "ESG Values","CPL", 164, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_Application_Electronically_Commutated_Motor", "ESG Values","CPL", 165, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_Application_EligibleforFederalTaxCredit", "ESG Values","CPL", 166, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_Application_EnergyGuideLabel", "ESG Values","CPL", 167, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_Application_Fuel_Type", "ESG Values","CPL", 168, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_Application_Furnace_Type", "ESG Values","CPL", 169, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_Application_Input_Rating", "ESG Values","CPL", 170, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_Application_IsRerated", "ESG Values","CPL", 171, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_Application_Mobile_Home", "ESG Values","CPL", 172, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_Application_Model_Number", "ESG Values","CPL", 173, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_Application_Model_Status", "ESG Values","CPL", 174, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_Application_Old_AHRI_Reference_Number", "ESG Values","CPL", 175, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_Application_Output_Heating_Capacity", "ESG Values","CPL", 176, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_Application_PE", "ESG Values","CPL", 177, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_Application_SeriesName", "ESG Values","CPL", 178, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_Application_AFUE", "ESG Values","CPL", 179, 1);
				clickWebelement("Certified_Product_List_CPL", "Mobile_Application_NextButton");
				WaitForElement(300, "Certified_Product_List_CPL", "Mobile_Application_AccptButton");
				clickWebelement("Certified_Product_List_CPL", "Mobile_Application_AccptButton");
				
				// Enter the required Customer Details
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_Name", "ESG Values","CPL" , 155, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_Account", "ESG Values","CPL" , 154, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_EmailID", "ESG Values","CPL" , 156, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_PhoneNumber", "ESG Values","CPL" , 157, 1);
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_Application__SubmitButton");
				
				//Review and Submit Step
				explicitWait(300, "Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_Application__ConfirmationMessage");
				TrackEnrollmentNumber("Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_Mobile_Application__ConfirmationMessage", "ESG Values","CPL", 159, 1);


			}
			
			public static void EnrollmentApplication_AHRI_Furnace_Mobile_Application() {
				//login("helper", "BaseURL", 1, 0, 1, 1);
				login2(1, 0, 1, 1);
				WaitForElement(300, "Certified_Product_List_CPL", "MainMenu");
				ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "ESG Values", "CPL", 35, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EnrollmentNumber", "ESG Values","CPL", 159, 1);
				scrollToElement("Certified_Product_List_CPL", "SearchButton");
				clickWebelement("Certified_Product_List_CPL", "SearchButton");
				threadWait(5000);
				//explicitWaitForClickable(300, "Certified_Product_List_CPL", "ApplicationLink");
				clickWebelement("Certified_Product_List_CPL", "ApplicationLink");
				WaitForElement(300, "Certified_Product_List_CPL", "EnrollmentApplication");
				clickWebelement("Certified_Product_List_CPL", "EnrollmentApplication");
				scrollToElement("Certified_Product_List_CPL", "MeasureTab");
				clickWebelement("Certified_Product_List_CPL", "MeasureTab");
				WaitForElement(300, "Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_AHRICertifiedReferenceNumber");
				
				//Enrollment Measures Validation
				test.log(LogStatus.INFO, "Application Measure Tab Validation");
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Mobile_AHRICertifiedReferenceNumber", "ESG Values","CPL", 158, 1);
				GreenTickMarkValidation();
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Mobile_BrandName", "ESG Values","CPL", 161, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Mobile_Configuration", "ESG Values","CPL", 162, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Mobile_Eae_including_Eso", "ESG Values","CPL", 163, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Mobile_Ef", "ESG Values","CPL", 164, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Mobile_Electronically_Commutated_Motor", "ESG Values","CPL", 165, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Mobile_EligibleforFederalTaxCredit", "ESG Values","CPL", 166, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Mobile_EnergyGuideLabel", "ESG Values","CPL", 167, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Mobile_Fuel_Type", "ESG Values","CPL", 168, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Mobile_Furnace_Type", "ESG Values","CPL", 169, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Mobile_Input_Rating", "ESG Values","CPL", 170, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Mobile_IsRerated", "ESG Values","CPL", 171, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Mobile_Mobile_Home", "ESG Values","CPL", 172, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Mobile_Model_Number", "ESG Values","CPL", 173, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Mobile_Model_Status", "ESG Values","CPL", 174, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Mobile_Old_AHRI_Reference_Number", "ESG Values","CPL", 175, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Mobile_Output_Heating_Capacity", "ESG Values","CPL", 176, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Mobile_PE", "ESG Values","CPL", 177, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Mobile_SeriesName", "ESG Values","CPL", 178, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Mobile_AFUE", "ESG Values","CPL", 179, 1);


			}
			public static void AHRI_Heat_Pump_MobileOnlineApplication() {
				//Launch online application
				ExecutingAgainst("helper", "Version");
				openURL("Certified_Product_List_CPL", "AHRI_Heat_Pump_MobileURLMobileURL");
			}
			
			public static void Equipment_Information_AHRI_Heat_Pump_Mobile_Application() {
				//Enter the AHRI Certified Reference Number
				enterTextboxValue("Certified_Product_List_CPL", "AHRIReferenceNumber_Heat_Pump_Mobile", "ESG Values","CPL" , 190, 1);
				WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_AHRIType");
				//Equipment information Validation
				test.log(LogStatus.INFO, "Online Application data validation");
				threadWait(2500);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_AHRIType", "ESG Values","CPL", 194, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_CoolingCapacity", "ESG Values","CPL", 195, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_DesignatedTestedCombination", "ESG Values","CPL", 196, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_EER", "ESG Values","CPL", 197, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_EligibleforFederalTaxCredit", "ESG Values","CPL", 198, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_EnergyGuideLabel", "ESG Values","CPL", 199, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_EstimatedNationalAverageOperatingCoolingCost", "ESG Values","CPL", 200, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_EstimatedNationalAverageOperatingHeatingCost", "ESG Values","CPL", 201, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_FurnaceModelNumber", "ESG Values","CPL", 202, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_H12", "ESG Values","CPL", 203, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_H32", "ESG Values","CPL", 204, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_HSPF", "ESG Values","CPL", 205, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_IndoorCoolingIntermediateAirVolumeRate", "ESG Values","CPL", 206, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_IndoorCoolingMinimumAirVolumeRate", "ESG Values","CPL", 207, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_IndoorFullLoadAirVolumeRate", "ESG Values","CPL",208, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_IndoorUnitBrandName", "ESG Values","CPL",209, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_IndoorUnitModelNumber", "ESG Values","CPL", 210, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_IsRerated", "ESG Values","CPL", 211, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_ManufacturerType", "ESG Values","CPL", 212, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_ModelStatus", "ESG Values","CPL",213, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_OldAHRIReferenceNumber", "ESG Values","CPL", 214, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_OutdoorUnitBrandName", "ESG Values","CPL", 215, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_OutdoorUnitModelNumberCondenser", "ESG Values","CPL", 216, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_Phase", "ESG Values","CPL", 217, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_SEER", "ESG Values","CPL", 218, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_SeriesName", "ESG Values","CPL", 219, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_Soldin", "ESG Values","CPL", 220, 1);
				clickWebelement("Certified_Product_List_CPL", "Mobile_Application_NextButton");
				WaitForElement(300, "Certified_Product_List_CPL", "Mobile_Application_AccptButton");
				clickWebelement("Certified_Product_List_CPL", "Mobile_Application_AccptButton");
				
				// Enter the required Customer Details
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Name", "ESG Values","CPL" , 187, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Account", "ESG Values","CPL" , 186, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_EmailID", "ESG Values","CPL" , 188, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_PhoneNumber", "ESG Values","CPL" , 189, 1);
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_SubmitButton");
				
				//Review and Submit Step
				explicitWait(300, "Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_ConfirmationMessage");
				TrackEnrollmentNumber("Certified_Product_List_CPL", "EquipedInformation_AHRI_Heat_Pump_Mobile_Application_ConfirmationMessage", "ESG Values","CPL", 191, 1);

			}
			
			public static void EnrollmentApplication_AHRI_Heat_Pump_Mobile_Application() {
				//login("helper", "BaseURL", 1, 0, 1, 1);
				login2(1, 0, 1, 1);
				WaitForElement(300, "Certified_Product_List_CPL", "MainMenu");
				ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "ESG Values", "CPL", 35, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EnrollmentNumber", "ESG Values","CPL", 191, 1);
				scrollToElement("Certified_Product_List_CPL", "SearchButton");
				clickWebelement("Certified_Product_List_CPL", "SearchButton");
				WaitForElement(300, "Certified_Product_List_CPL", "EnrollmentLink");
				clickWebelement("Certified_Product_List_CPL", "EnrollmentLink");
				WaitForElement(300, "Certified_Product_List_CPL", "EnrollmentApplication");
				clickWebelement("Certified_Product_List_CPL", "EnrollmentApplication");
				scrollToElement("Certified_Product_List_CPL", "MeasureTab");
				clickWebelement("Certified_Product_List_CPL", "MeasureTab");
				WaitForElement(300, "Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_AHRICertifiedReferenceNumber");
				
				//Enrollment Measures Validation
				test.log(LogStatus.INFO, "Application Measure Tab Validation");
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_AHRICertifiedReferenceNumber", "ESG Values","CPL", 190, 1);
				GreenTickMarkValidation();
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_AHRIType", "ESG Values","CPL", 194, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_CoolingCapacity", "ESG Values","CPL", 195, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_DesignatedTestedCombination", "ESG Values","CPL", 196, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_EER", "ESG Values","CPL", 197, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_EligibleforFederalTaxCredit", "ESG Values","CPL", 198, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_EnergyGuideLabel", "ESG Values","CPL", 199, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_EstimatedNationalAverageOperatingCoolingCost", "ESG Values","CPL", 200, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_EstimatedNationalAverageOperatingHeatingCost", "ESG Values","CPL", 201, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_FurnaceModelNumber", "ESG Values","CPL", 202, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_HeatingCapacity_H12", "ESG Values","CPL", 203, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_HeatingCapacity_H32", "ESG Values","CPL", 204, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_HSPF", "ESG Values","CPL", 205, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_IndoorCoolingIntermediateAirVolumeRate", "ESG Values","CPL", 206, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_IndoorCoolingMinimumAirVolumeRate", "ESG Values","CPL", 207, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_IndoorFullLoadAirVolumeRate", "ESG Values","CPL", 208, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_IndoorUnitBrandName", "ESG Values","CPL", 209, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_IndoorUnitModelNumber", "ESG Values","CPL", 210, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_IsRerated", "ESG Values","CPL", 211, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_ManufacturerType", "ESG Values","CPL", 212, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_ModelStatus", "ESG Values","CPL", 213, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_OldAHRIReferenceNumber", "ESG Values","CPL",214, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_OutdoorUnitBrandName", "ESG Values","CPL", 215, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_OutdoorUnitModelNumberCondenser", "ESG Values","CPL", 216, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_Phase", "ESG Values","CPL", 217, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_SEER", "ESG Values","CPL", 218, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_SeriesName", "ESG Values","CPL", 219, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Heat_Pump_Mobile_Application_Soldin", "ESG Values","CPL", 220, 1);


			}
//******************************************************************************CPL: WaterSense - Toilet - Residential (Online Application)****************************************************************
			
			
			public static void Step1_Getting_Started_WaterSense_Toilet_Residential_OnlineApplication() {
				
				WaitForElement(300, "Certified_Product_List_CPL", "GettingStartedPageValidation");
				clickWebelement("Certified_Product_List_CPL", "AccountHolder");
				enterTextboxValue("Certified_Product_List_CPL", "AccountNumber", "ESG Values","CPL", 2, 1);
				Enter(KeyEvent.VK_TAB);
				enterTextboxValue("Certified_Product_List_CPL", "ZipCode", "ESG Values","CPL" , 3, 1);
				threadWait(5000);
				//clearWebelement("Certified_Product_List_CPL", "ZipCode");
				//enterTextboxValue("Certified_Product_List_CPL", "ZipCode", "ESG Values","CPL_1" , 3, 1);
				scrollToElement("Certified_Product_List_CPL", "NextButton");
				clickWebelement("Certified_Product_List_CPL", "NextButton");
				scrollToElement("Certified_Product_List_CPL", "NextButton");
				clickWebelement("Certified_Product_List_CPL", "NextButton");
				
			}
			public static void Step2_Equipment_Information_WaterSense_Toilet_Residential_OnlineApplication() {
				
				WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_OnlineApplication_AddEquipmentButton");
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_OnlineApplication_AddEquipmentButton");
				scrollToElement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_OnlineApplication_AddEquipmentMeasure");
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_OnlineApplication_AddEquipmentMeasure");
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_OnlineApplication_OkButton");
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_OnlineApplication_AddEquimentMeasureQty", "ESG Values","CPL" , 7, 1);
				WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_OnlineApplication_BrandName");
				selectDropdown("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_OnlineApplication_BrandName","", "ESG Values","CPL", 236, 1);
				WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_OnlineApplication_ModelNumber");
				selectDropdown("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_OnlineApplication_ModelNumber","", "ESG Values","CPL", 237, 1);
				WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_OnlineApplication_Tank_Model_Number");
				selectDropdown("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_OnlineApplication_Tank_Model_Number","", "ESG Values","CPL", 238, 1);
				explicitWaitForClickable(300, "Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_OnlineApplication_Bowl_Model_Number");
				selectDropdown("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_OnlineApplication_Bowl_Model_Number","", "ESG Values","CPL", 239, 1);
				WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_OnlineApplication_ModelName");
				threadWait(2500);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_OnlineApplication_ModelName", "ESG Values","CPL", 241, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_OnlineApplication_Rated_Flush_VolumeName", "ESG Values","CPL", 242, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_OnlineApplication_FlushType", "ESG Values","CPL", 243, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_OnlineApplication_FlushMechanism", "ESG Values","CPL", 244, 1);
				scrollToElement("Certified_Product_List_CPL", "NextButton");
				clickWebelement("Certified_Product_List_CPL", "NextButton");
		
				//Review and Submit Step
				WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_SubmitButton_Wait");
				scrollToElement("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_SubmitButton");
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_SubmitButton");
				
				//Confirmation Step
				explicitWaitForClickable(300, "Certified_Product_List_CPL", "Confirmation_Number");
				TrackEnrollmentNumber("Certified_Product_List_CPL", "Confirmation_Number", "ESG Values","CPL", 6, 1);
			}
			
			public static void EnrollmentApplication_WaterSense_Toilet_Residential_OnlineApplication() {
				//login("helper", "BaseURL", 1, 0, 1, 1);
				login2(1, 0, 1, 1);
				WaitForElement(300, "Certified_Product_List_CPL", "MainMenu");
				ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "ESG Values", "CPL", 35, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EnrollmentNumber", "ESG Values","CPL", 6, 1);
				scrollToElement("Certified_Product_List_CPL", "SearchButton");
				clickWebelement("Certified_Product_List_CPL", "SearchButton");
				threadWait(5000);
				//explicitWaitForClickable(300, "Certified_Product_List_CPL", "ApplicationLink");
				clickWebelement("Certified_Product_List_CPL", "EnrollmentLink");
				WaitForElement(300, "Certified_Product_List_CPL", "EnrollmentApplication");
				clickWebelement("Certified_Product_List_CPL", "EnrollmentApplication");
				scrollToElement("Certified_Product_List_CPL", "MeasureTab");
				clickWebelement("Certified_Product_List_CPL", "MeasureTab");
				WaitForElement(300, "Certified_Product_List_CPL", "Application_WaterSense_Toilet_Residential_OnlineApplication_BrandName");
				
				//Enrollment Measures Validation
				
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Toilet_Residential_OnlineApplication_BrandName", "ESG Values","CPL", 236, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Toilet_Residential_OnlineApplication_ModelNumber", "ESG Values","CPL", 237, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Toilet_Residential_OnlineApplication_TankModelNumber", "ESG Values","CPL", 238, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Toilet_Residential_OnlineApplication_BowlModelNumber", "ESG Values","CPL", 239, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Toilet_Residential_OnlineApplication_ModelName", "ESG Values","CPL", 241, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Toilet_Residential_OnlineApplication_RatedFlushVolume", "ESG Values","CPL", 242, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Toilet_Residential_OnlineApplication_FlushType", "ESG Values","CPL", 243, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Toilet_Residential_OnlineApplication_FlushMechanism", "ESG Values","CPL", 244, 1);
				GreenTickMarkValidation();
				
				HandleErrorCodeOnProcess("helper", "ProcessButton", "");
				//clickonProcess();
			}
			public static void MeasurePropertiesValidation_WaterSense_Toilet_Residential_OnlineApplication() {
				WaitForElement(300, "Certified_Product_List_CPL", "EnrollmentApplication");
				clickWebelement("Certified_Product_List_CPL", "EnrollmentApplication");
				scrollToElement("Certified_Product_List_CPL", "MeasureTab");
				clickWebelement("Certified_Product_List_CPL", "MeasureTab");
				WaitForElement(300, "Certified_Product_List_CPL", "Application_WaterSense_Toilet_Residential_OnlineApplication_BrandName");

				//Enrollment Measures Validation
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Toilet_Residential_OnlineApplication_BrandName", "ESG Values","CPL", 236, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Toilet_Residential_OnlineApplication_ModelNumber", "ESG Values","CPL", 237, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Toilet_Residential_OnlineApplication_TankModelNumber", "ESG Values","CPL", 238, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Toilet_Residential_OnlineApplication_BowlModelNumber", "ESG Values","CPL", 239, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Toilet_Residential_OnlineApplication_ModelName", "ESG Values","CPL", 241, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Toilet_Residential_OnlineApplication_RatedFlushVolume", "ESG Values","CPL", 242, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Toilet_Residential_OnlineApplication_FlushType", "ESG Values","CPL", 243, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Toilet_Residential_OnlineApplication_FlushMechanism", "ESG Values","CPL", 244, 1);
				GreenTickMarkValidation();
			}
			
//******************************************************************************CPL: WaterSense - Showerhead - Residential (Online Application)****************************************************************
			
			
			public static void Step1_Getting_Started_WaterSense_Showerhead_Residential_OnlineApplication() {
				
				WaitForElement(300, "Certified_Product_List_CPL", "GettingStartedPageValidation");
				clickWebelement("Certified_Product_List_CPL", "AccountHolder");
				enterTextboxValue("Certified_Product_List_CPL", "AccountNumber", "ESG Values","CPL", 2, 1);
				Enter(KeyEvent.VK_TAB);
				enterTextboxValue("Certified_Product_List_CPL", "ZipCode", "ESG Values","CPL" , 3, 1);
				//clearWebelement("Certified_Product_List_CPL", "ZipCode");
				//enterTextboxValue("Certified_Product_List_CPL", "ZipCode", "ESG Values","CPL_1" , 3, 1);
				scrollToElement("Certified_Product_List_CPL", "NextButton");
				clickWebelement("Certified_Product_List_CPL", "NextButton");
				scrollToElement("Certified_Product_List_CPL", "NextButton");
				clickWebelement("Certified_Product_List_CPL", "NextButton");
				
			}
			public static void Step2_Equipment_Information_WaterSense_Showerhead_Residential_OnlineApplication() {
				
				WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_WaterSense_Showerhead_Residential_OnlineApplication_AddEquipmentButton");
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Showerhead_Residential_OnlineApplication_AddEquipmentButton");
				scrollToElement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Showerhead_Residential_OnlineApplication_AddEquipmentMeasure");
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Showerhead_Residential_OnlineApplication_AddEquipmentMeasure");
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Showerhead_Residential_OnlineApplication_OkButton");
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Showerhead_Residential_OnlineApplication_AddEquimentMeasureQty", "ESG Values","CPL" , 253, 1);
				WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_WaterSense_Showerhead_Residential_OnlineApplication_BrandName");
				selectDropdown("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Showerhead_Residential_OnlineApplication_BrandName","", "ESG Values","CPL", 255, 1);
				WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_WaterSense_Showerhead_Residential_OnlineApplication_ModelNumber");
				selectDropdown("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Showerhead_Residential_OnlineApplication_ModelNumber","", "ESG Values","CPL", 256, 1);
				//WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_WaterSense_Showerhead_Residential_OnlineApplication_ModelName");
				//threadWait(2500);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Showerhead_Residential_OnlineApplication_ModelName", "ESG Values","CPL", 257, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Showerhead_Residential_OnlineApplication_Maximum_Rated_Flow_Rate", "ESG Values","CPL", 258, 1);
				scrollToElement("Certified_Product_List_CPL", "NextButton");
				clickWebelement("Certified_Product_List_CPL", "NextButton");
		
				//Review and Submit Step
				WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_SubmitButton_Wait");
				scrollToElement("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_SubmitButton");
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_SubmitButton");
				
				//Confirmation Step
				explicitWaitForClickable(300, "Certified_Product_List_CPL", "Confirmation_Number");
				TrackEnrollmentNumber("Certified_Product_List_CPL", "Confirmation_Number", "ESG Values","CPL", 252, 1);
			}
			
			public static void EnrollmentApplication_WaterSense_Showerhead_Residential_OnlineApplication() {
				//login("helper", "BaseURL", 1, 0, 1, 1);
				login2(1, 0, 1, 1);
				WaitForElement(300, "Certified_Product_List_CPL", "MainMenu");
				ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "ESG Values", "CPL", 35, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EnrollmentNumber", "ESG Values","CPL", 252, 1);
				scrollToElement("Certified_Product_List_CPL", "SearchButton");
				clickWebelement("Certified_Product_List_CPL", "SearchButton");
				threadWait(5000);
				WaitForElement(300, "Certified_Product_List_CPL", "EnrollmentLink");
				clickWebelement("Certified_Product_List_CPL", "EnrollmentLink");
				WaitForElement(300, "Certified_Product_List_CPL", "EnrollmentApplication");
				clickWebelement("Certified_Product_List_CPL", "EnrollmentApplication");
				scrollToElement("Certified_Product_List_CPL", "MeasureTab");
				clickWebelement("Certified_Product_List_CPL", "MeasureTab");
				explicitWait(300, "Certified_Product_List_CPL", "Application_WaterSense_Showerhead_Residential_OnlineApplication_BrandName");
				
				//Enrollment Measures Validation
				
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Showerhead_Residential_OnlineApplication_BrandName", "ESG Values","CPL", 255, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Showerhead_Residential_OnlineApplication_ModelNumber", "ESG Values","CPL", 256, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Showerhead_Residential_OnlineApplication_ModelName", "ESG Values","CPL", 257, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Showerhead_Residential_OnlineApplication_Maximum_Rated_Flow_Rate", "ESG Values","CPL", 258, 1);
				GreenTickMarkValidation();
				HandleErrorCodeOnProcess("helper", "ProcessButton", "");
				//clickonProcess();
			}
			public static void MeasurePropertiesValidation_WaterSense_Showerhead_Residential_OnlineApplication() {
				WaitForElement(300, "Certified_Product_List_CPL", "EnrollmentApplication");
				clickWebelement("Certified_Product_List_CPL", "EnrollmentApplication");
				scrollToElement("Certified_Product_List_CPL", "MeasureTab");
				clickWebelement("Certified_Product_List_CPL", "MeasureTab");
				WaitForElement(30, "Certified_Product_List_CPL", "Application_WaterSense_Showerhead_Residential_OnlineApplication_BrandName");

				//Enrollment Measures Validation
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Showerhead_Residential_OnlineApplication_BrandName", "ESG Values","CPL", 255, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Showerhead_Residential_OnlineApplication_ModelNumber", "ESG Values","CPL", 256, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Showerhead_Residential_OnlineApplication_ModelName", "ESG Values","CPL", 257, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Showerhead_Residential_OnlineApplication_Maximum_Rated_Flow_Rate", "ESG Values","CPL", 258, 1);
				GreenTickMarkValidation();
			}
			
//******************************************************************************CPL: WaterSense - Showerhead - Residential (Online Application)****************************************************************
			
			
			public static void Step1_Getting_Started_WaterSense_Irrigation_Controller_OnlineApplication() {
				
				WaitForElement(30, "Certified_Product_List_CPL", "GettingStartedPageValidation");
				clickWebelement("Certified_Product_List_CPL", "AccountHolder");
				enterTextboxValue("Certified_Product_List_CPL", "AccountNumber", "ESG Values","CPL", 2, 1);
				Enter(KeyEvent.VK_TAB);
				enterTextboxValue("Certified_Product_List_CPL", "ZipCode", "ESG Values","CPL" , 3, 1);
				threadWait(5000);
				//clearWebelement("Certified_Product_List_CPL", "ZipCode");
				//enterTextboxValue("Certified_Product_List_CPL", "ZipCode", "ESG Values","CPL_1" , 3, 1);
				scrollToElement("Certified_Product_List_CPL", "NextButton");
				clickWebelement("Certified_Product_List_CPL", "NextButton");
				scrollToElement("Certified_Product_List_CPL", "NextButton");
				clickWebelement("Certified_Product_List_CPL", "NextButton");
				
			}
			public static void Step2_Equipment_Information_WaterSense_Irrigation_Controller_OnlineApplication() {
				
				WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_OnlineApplication_AddEquipmentButton");
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_OnlineApplication_AddEquipmentButton");
				scrollToElement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_OnlineApplication_AddEquipmentMeasure");
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_OnlineApplication_AddEquipmentMeasure");
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_OnlineApplication_OkButton");
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_OnlineApplication_AddEquimentMeasureQty", "ESG Values","CPL" , 267, 1);
				WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_OnlineApplication_BrandName");
				selectDropdown("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_OnlineApplication_BrandName","", "ESG Values","CPL", 269, 1);
				//explicitWaitForClickable(300, "Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_OnlineApplication_ModelNumber");
				threadWait(5000);
				selectDropdown("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_OnlineApplication_ModelNumber","", "ESG Values","CPL", 270, 1);
				WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_OnlineApplication_ModelName");
				threadWait(5000);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_OnlineApplication_ModelName", "ESG Values","CPL", 271, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_OnlineApplication_Product_Type", "ESG Values","CPL", 272, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_OnlineApplication_Zone_Capacity", "ESG Values","CPL", 273, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_OnlineApplication_Weather_data_Source", "ESG Values","CPL", 274, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_OnlineApplication_Component_Information", "ESG Values","CPL", 275, 1);
				scrollToElement("Certified_Product_List_CPL", "NextButton");
				clickWebelement("Certified_Product_List_CPL", "NextButton");
		
				//Review and Submit Step
				WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_AHRI_Furnace_SubmitButton_Wait");
				scrollToElement("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_SubmitButton");
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_SubmitButton");
				
				//Confirmation Step
				explicitWaitForClickable(300, "Certified_Product_List_CPL", "Confirmation_Number");
				TrackEnrollmentNumber("Certified_Product_List_CPL", "Confirmation_Number", "ESG Values","CPL", 266, 1);
			}
			
			public static void EnrollmentApplication_WaterSense_Irrigation_Controller_OnlineApplication() {
				//login("helper", "BaseURL", 1, 0, 1, 1);
				login2(1, 0, 1, 1);
				WaitForElement(300, "Certified_Product_List_CPL", "MainMenu");
				ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "ESG Values", "CPL", 35, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EnrollmentNumber", "ESG Values","CPL", 266, 1);
				scrollToElement("Certified_Product_List_CPL", "SearchButton");
				clickWebelement("Certified_Product_List_CPL", "SearchButton");
				threadWait(5000);
				//explicitWaitForClickable(300, "Certified_Product_List_CPL", "ApplicationLink");
				clickWebelement("Certified_Product_List_CPL", "EnrollmentLink");
				WaitForElement(300, "Certified_Product_List_CPL", "EnrollmentApplication");
				clickWebelement("Certified_Product_List_CPL", "EnrollmentApplication");
				scrollToElement("Certified_Product_List_CPL", "MeasureTab");
				clickWebelement("Certified_Product_List_CPL", "MeasureTab");
				WaitForElement(300, "Certified_Product_List_CPL", "Application_WaterSense_Irrigation_Controller_OnlineApplication_BrandName");
				
				//Enrollment Measures Validation
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Irrigation_Controller_OnlineApplication_BrandName", "ESG Values","CPL", 269, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Irrigation_Controller_OnlineApplication_ModelNumber", "ESG Values","CPL", 270, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Irrigation_Controller_OnlineApplication_ModelName", "ESG Values","CPL", 271, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Irrigation_Controller_OnlineApplication_Product_Typ", "ESG Values","CPL", 272, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Irrigation_Controller_OnlineApplication_Zone_Capacity", "ESG Values","CPL", 273, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Irrigation_Controller_OnlineApplication_Weather_data_Source", "ESG Values","CPL", 274, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Irrigation_Controller_OnlineApplication_Component_Information", "ESG Values","CPL", 275, 1);
				GreenTickMarkValidation();
				HandleErrorCodeOnProcess("helper", "ProcessButton", "");
				//clickonProcess();
			}
			public static void MeasurePropertiesValidation_WaterSense_Irrigation_Controller_OnlineApplication() {
				WaitForElement(300, "Certified_Product_List_CPL", "EnrollmentApplication");
				clickWebelement("Certified_Product_List_CPL", "EnrollmentApplication");
				scrollToElement("Certified_Product_List_CPL", "MeasureTab");
				clickWebelement("Certified_Product_List_CPL", "MeasureTab");
				WaitForElement(300, "Certified_Product_List_CPL", "Application_WaterSense_Irrigation_Controller_OnlineApplication_BrandName");

				//Enrollment Measures Validation
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Irrigation_Controller_OnlineApplication_BrandName", "ESG Values","CPL", 269, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Irrigation_Controller_OnlineApplication_ModelNumber", "ESG Values","CPL", 270, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Irrigation_Controller_OnlineApplication_ModelName", "ESG Values","CPL", 271, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Irrigation_Controller_OnlineApplication_Product_Typ", "ESG Values","CPL", 272, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Irrigation_Controller_OnlineApplication_Zone_Capacity", "ESG Values","CPL", 273, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Irrigation_Controller_OnlineApplication_Weather_data_Source", "ESG Values","CPL", 274, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_WaterSense_Irrigation_Controller_OnlineApplication_Component_Information", "ESG Values","CPL", 275, 1);
				GreenTickMarkValidation();
			}
			
//******************************************************************************CPL: WaterSense - Toilet - Residential (Mobile Application)******************************************************************************************************************************************
			
			
			public static void WaterSense_Toilet_Residential_MobileOnlineApplication() {
				//Launch online application
				openURL("Certified_Product_List_CPL", "WaterSense_Toilet_Residential_MobileURL");
			}
			
			public static void Equipment_Information_WaterSense_Toilet_Residential_Mobile_Application() {
				WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_Mobile_Application_BrandName");
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_Mobile_Application_BrandName");
				WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_Mobile_Application_BrandName_Select");
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_Mobile_Application_BrandName_Select");
				
				threadWait(2500);
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_Mobile_Application_Model_Number");
				scrollToElement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_Mobile_Application_Model_Number_Select");
				threadWait(2500);
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_Mobile_Application_Model_Number_Select");
				
				threadWait(2500);
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_Mobile_Application_Tank_Model_Number");
				scrollToElement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_Mobile_Application_Tank_Model_Number_Select");
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_Mobile_Application_Tank_Model_Number_Select");
				threadWait(2500);
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_Mobile_Application_Bowl_Model_Number");
				scrollToElement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_Mobile_Application_Bowl_Model_Number_Select");
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_Mobile_Application_Bowl_Model_Number_Select");
				test.log(LogStatus.INFO, "Online Application data validation");
				threadWait(2500);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_Mobile_Application_ModelName", "ESG Values","CPL", 291, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_Mobile_Application_Rated_Flush_Volume", "ESG Values","CPL", 292, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_Mobile_Application_Flush_Type", "ESG Values","CPL", 293, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_Mobile_Application_Flush_Mechanism", "ESG Values","CPL", 294, 1);
				
				clickWebelement("Certified_Product_List_CPL", "Mobile_Application_NextButton");
				WaitForElement(300, "Certified_Product_List_CPL", "Mobile_Application_AccptButton");
				clickWebelement("Certified_Product_List_CPL", "Mobile_Application_AccptButton");
				
				// Enter the required Customer Details
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_Mobile_Name", "ESG Values","CPL" , 281, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_Mobile_Account", "ESG Values","CPL" , 280, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_Mobile_EmailID", "ESG Values","CPL" , 282, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_Mobile_PhoneNumber", "ESG Values","CPL" , 283, 1);
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_Mobile_Application__SubmitButton");
				
				//Review and Submit Step
				explicitWait(300, "Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_Mobile_Application__ConfirmationMessage");
				TrackEnrollmentNumber("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Toilet_Residential_Mobile_Application__ConfirmationMessage", "ESG Values","CPL", 285, 1);

			}
			
			public static void EnrollmentApplication_WaterSense_Toilet_Residential_Mobile_Application() {
				//login("helper", "BaseURL", 1, 0, 1, 1);
				login2(1, 0, 1, 1);
				WaitForElement(300, "Certified_Product_List_CPL", "MainMenu");
				ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "ESG Values", "CPL", 35, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EnrollmentNumber", "ESG Values","CPL", 285, 1);
				scrollToElement("Certified_Product_List_CPL", "SearchButton");
				clickWebelement("Certified_Product_List_CPL", "SearchButton");
				threadWait(5000);
				clickWebelement("Certified_Product_List_CPL", "EnrollmentLink");
				threadWait(5000);
				clickWebelement("Certified_Product_List_CPL", "EnrollmentApplication");
				scrollToElement("Certified_Product_List_CPL", "MeasureTab");
				clickWebelement("Certified_Product_List_CPL", "MeasureTab");
				
				//Enrollment Measures Validation
				test.log(LogStatus.INFO, "Application Measure Tab Validation");
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Mobile_Application_BrandName", "ESG Values","CPL", 286, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Mobile_Application_Model_Number", "ESG Values","CPL", 287, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Mobile_Application_Tank_Model_Number", "ESG Values","CPL", 288, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Mobile_Application_Bowl_Model_Number", "ESG Values","CPL", 289, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Mobile_Application_ModelName", "ESG Values","CPL", 291, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residentiale_Mobile_Application_Rated_Flush_Volume", "ESG Values","CPL", 292, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Mobile_Application_Flush_Type", "ESG Values","CPL", 293, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Mobile_Application_Flush_Mechanism", "ESG Values","CPL", 294, 1);
				GreenTickMarkValidation();
			}
			
//******************************************************************************CPL: WaterSense - Shower head - Residential (Mobile Application)******************************************************************************************************************************************
			
			
			public static void WaterSense_Showerhead_Residential_MobileOnlineApplication() {
				//Launch online application
				openURL("Certified_Product_List_CPL", "WaterSense_ShowerHead_Residential_MobileURL");
			}
			
			public static void Equipment_Information_WaterSense_Showerhead_Residential_Mobile_Application() {
				WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_WaterSense_ShowerHead_Residential_Mobile_Application_BrandName");
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_ShowerHead_Residential_Mobile_Application_BrandName");
				threadWait(300);
				scrollToElement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_ShowerHead_Residential_Mobile_Application_BrandName_Select");
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_ShowerHead_Residential_Mobile_Application_BrandName_Select");
				
				threadWait(300);
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_ShowerHead_Residential_Mobile_Application_Model_Number");
				scrollToElement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_ShowerHead_Residential_Mobile_Application_Model_Number_Select");
				threadWait(300);
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_ShowerHead_Residential_Mobile_Application_Model_Number_Select");

				test.log(LogStatus.INFO, "Online Application data validation");
				threadWait(300);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_WaterSense_ShowerHead_Residential_Mobile_Application_ModelName", "ESG Values","CPL", 307, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_WaterSense_ShowerHead_Residential_Mobile_Application_Maximum_Rate_Flow_Rate", "ESG Values","CPL", 308, 1);;
				
				clickWebelement("Certified_Product_List_CPL", "Mobile_Application_NextButton");
				WaitForElement(300, "Certified_Product_List_CPL", "Mobile_Application_AccptButton");
				clickWebelement("Certified_Product_List_CPL", "Mobile_Application_AccptButton");
				
				// Enter the required Customer Details
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_WaterSense_ShowerHead_Residential_Mobile_Name", "ESG Values","CPL" , 300, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_WaterSense_ShowerHead_Residential_Mobile_Account", "ESG Values","CPL" , 299, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_WaterSense_ShowerHead_Residential_Mobile_EmailID", "ESG Values","CPL" , 301, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_WaterSense_ShowerHead_Residential_Mobile_PhoneNumber", "ESG Values","CPL" , 302, 1);
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_ShowerHead_Residential_Mobile_Application__SubmitButton");
				
				//Review and Submit Step
				explicitWait(300, "Certified_Product_List_CPL", "EquipedInformation_WaterSense_ShowerHead_Residential_Mobile_Application__ConfirmationMessage");
				TrackEnrollmentNumber("Certified_Product_List_CPL", "EquipedInformation_WaterSense_ShowerHead_Residential_Mobile_Application__ConfirmationMessage", "ESG Values","CPL", 303, 1);

			}
			
			public static void EnrollmentApplication_WaterSense_Showerhead_Residential_Mobile_Application() {
				//login("helper", "BaseURL", 1, 0, 1, 1);
				login2(1, 0, 1, 1);
				WaitForElement(300, "Certified_Product_List_CPL", "MainMenu");
				ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "ESG Values", "CPL", 35, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EnrollmentNumber", "ESG Values","CPL", 303, 1);
				scrollToElement("Certified_Product_List_CPL", "SearchButton");
				clickWebelement("Certified_Product_List_CPL", "SearchButton");
				threadWait(2500);
				//explicitWaitForClickable(300, "Certified_Product_List_CPL", "ApplicationLink");
				clickWebelement("Certified_Product_List_CPL", "EnrollmentLink");
				WaitForElement(300, "Certified_Product_List_CPL", "EnrollmentApplication");
				clickWebelement("Certified_Product_List_CPL", "EnrollmentApplication");
				scrollToElement("Certified_Product_List_CPL", "MeasureTab");
				clickWebelement("Certified_Product_List_CPL", "MeasureTab");
				
				//Enrollment Measures Validation
				test.log(LogStatus.INFO, "Application Measure Tab Validation");
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_ShowerHead_Residential_Mobile_Application_BrandName", "ESG Values","CPL", 305, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_ShowerHead_Residential_Mobile_Application_Model_Number", "ESG Values","CPL", 306, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_ShowerHead_Residential_Mobile_Application_Model_Number_Select", "ESG Values","CPL", 307, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_ShowerHead_Residential_Mobile_Application_Maximum_Rate_Flow_Rate", "ESG Values","CPL", 308, 1);
				GreenTickMarkValidation();
			}
//******************************************************************************CPL: WaterSense - Shower head - Residential (Mobile Application)******************************************************************************************************************************************
			
			
			public static void WaterSense_Irrigation_Controller_Residential_MobileOnlineApplication() {
				//Launch online application
				openURL("Certified_Product_List_CPL", "WaterSense_Irrigation_Controller_Residential_MobileURL");
			}
			
			public static void Equipment_Information_WaterSense_Irrigation_Controller_Residential_Mobile_Application() {
				WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_Residential_Mobile_Application_BrandName");
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_Residential_Mobile_Application_BrandName");
				threadWait(2500);
				scrollToElement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_Residential_Mobile_Application_BrandName_Select");
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_Residential_Mobile_Application_BrandName_Select");
				
				threadWait(2500);
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_Residential_Mobile_Application_Model_Number");
				scrollToElement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_Residential_Mobile_Application_Model_Number_Select");
				threadWait(2500);
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_Residential_Mobile_Application_Model_Number_Select");

				test.log(LogStatus.INFO, "Online Application data validation");
				threadWait(5000);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_Residential_Mobile_Application_ModelName", "ESG Values","CPL", 321, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_Residential_Mobile_Application_Product_Type", "ESG Values","CPL", 322, 1);;
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_Residential_Mobile_Application_Zone_Capacity", "ESG Values","CPL", 323, 1);;
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_Residential_Mobile_Application_Weather_Data_Source", "ESG Values","CPL", 324, 1);;
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_Residential_Mobile_Application_Component_Information", "ESG Values","CPL", 325, 1);;
				
				clickWebelement("Certified_Product_List_CPL", "Mobile_Application_NextButton");
				WaitForElement(300, "Certified_Product_List_CPL", "Mobile_Application_AccptButton");
				clickWebelement("Certified_Product_List_CPL", "Mobile_Application_AccptButton");
				
				// Enter the required Customer Details
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_Residential_Mobile_Name", "ESG Values","CPL" , 314, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_Residential_Mobile_Account", "ESG Values","CPL" , 313, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_Residential_Mobile_EmailID", "ESG Values","CPL" , 315, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_Residential_Mobile_PhoneNumber", "ESG Values","CPL" , 316, 1);
				clickWebelement("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_Residential_Mobile_Application_SubmitButton");
				
				//Review and Submit Step
				explicitWait(300, "Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_Residential_Mobile_Application_ConfirmationMessage");
				TrackEnrollmentNumber("Certified_Product_List_CPL", "EquipedInformation_WaterSense_Irrigation_Controller_Residential_Mobile_Application_ConfirmationMessage", "ESG Values","CPL", 317, 1);

			}
			
			public static void EnrollmentApplication_WaterSense_Irrigation_Controller_Residential_Mobile_Application() {
				//login("helper", "BaseURL", 1, 0, 1, 1);
				login2(1, 0, 1, 1);
				WaitForElement(300, "Certified_Product_List_CPL", "MainMenu");
				ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "ESG Values", "CPL", 35, 1);
				enterTextboxValue("Certified_Product_List_CPL", "EnrollmentNumber", "ESG Values","CPL", 317, 1);
				scrollToElement("Certified_Product_List_CPL", "SearchButton");
				clickWebelement("Certified_Product_List_CPL", "SearchButton");
				threadWait(5000);
				clickWebelement("Certified_Product_List_CPL", "ApplicationLink");
				WaitForElement(300, "Certified_Product_List_CPL", "EnrollmentApplication");
				clickWebelement("Certified_Product_List_CPL", "EnrollmentApplication");
				scrollToElement("Certified_Product_List_CPL", "MeasureTab");
				clickWebelement("Certified_Product_List_CPL", "MeasureTab");
				
				//Enrollment Measures Validation
				test.log(LogStatus.INFO, "Application Measure Tab Validation");
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Mobile_Application_BrandName", "ESG Values","CPL", 319, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Mobile_Application_Model_Number", "ESG Values","CPL", 320, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Mobile_Application_ModelName", "ESG Values","CPL", 321, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Mobile_Application_Product_Type", "ESG Values","CPL", 322, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Mobile_Application_Zone_Capacity", "ESG Values","CPL", 323, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Mobile_Application_Weather_Data_Source", "ESG Values","CPL", 324, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Mobile_Application_Component_Information", "ESG Values","CPL", 325, 1);
				GreenTickMarkValidation();
			}

//***************************************************************************WaterSense - Toilet - Residential (Backend Enrollment)*************************************************************************
public static void WaterSense_Toilet_Residential_Backend_Enrollment_Login() {
	
	login2(1, 0, 1, 1);
}
public static void WaterSense_Toilet_Residential_Backend_Enrollment_EnrollmentPage() {
	WaitForElement(300, "Certified_Product_List_CPL", "MainMenu");
	ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "ESG Values", "CPL", 35, 1);
	threadWait(300);
	clickWebelement("Certified_Product_List_CPL", "NewEnrollmentButton");
	selectDropdown("Certified_Product_List_CPL", "SelectProgram","", "ESG Values","CPL", 331, 1);
	clickWebelement("Certified_Product_List_CPL", "NextButton1");
	enterTextboxValue("Certified_Product_List_CPL", "SearchBox", "ESG Values","CPL" , 330, 1);
	clickWebelement("Certified_Product_List_CPL", "SearchButton1");
	WaitForElement(300, "Certified_Product_List_CPL", "CustomerLink");
	clickWebelement("Certified_Product_List_CPL", "CustomerLink");
	clickWebelement("Certified_Product_List_CPL", "NextButton1");
}
public static void WaterSense_Toilet_Residential_Backend_Enrollment_Before_Process() {
	
	//explicitWait(300, "Certified_Product_List_CPL", "Process");
	scrollToElement("Certified_Product_List_CPL", "MeasureTab");
	clickWebelement("Certified_Product_List_CPL", "MeasureTab");
	WaitForElement(300, "Certified_Product_List_CPL", "AddMeasureButton");
	threadWait(2500);
	clickWebelement("Certified_Product_List_CPL", "AddMeasureButton");
	threadWait(10000);
	scrollToElement("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_SelectMeasure");
	clickWebelement("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_SelectMeasure");
	clickWebelement("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_SaveButton");
	threadWait(300);
	clickWebelement("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_MeasureName");
	enterTextboxValue("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_MeasureQty", "ESG Values","CPL", 341, 1);
	clickWebelement("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_BrandName");
	enterTextboxValue("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_BrandName", "ESG Values","CPL" , 333, 1);
	threadWait(300);
	Enter(KeyEvent.VK_DOWN);
	Enter(KeyEvent.VK_ENTER);
	clickWebelement("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_Model_Number");
	enterTextboxValue("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_Model_Number", "ESG Values","CPL" , 334, 1);
	threadWait(300);
	Enter(KeyEvent.VK_DOWN);
	Enter(KeyEvent.VK_ENTER);
	clickWebelement("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_Tank_Model_Number");
	enterTextboxValue("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_Tank_Model_Number", "ESG Values","CPL" , 335, 1);
	threadWait(300);
	Enter(KeyEvent.VK_DOWN);
	Enter(KeyEvent.VK_ENTER);
	clickWebelement("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_Bowl_Model_Number");
	enterTextboxValue("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_Bowl_Model_Number", "ESG Values","CPL" , 336, 1);
	threadWait(300);
	Enter(KeyEvent.VK_DOWN);
	Enter(KeyEvent.VK_ENTER);
	threadWait(10000);
	VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_Model_Name", "ESG Values","CPL", 337, 1);
	VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_Rated_Flush_Volume", "ESG Values","CPL", 338, 1);
	VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_Flush_Type", "ESG Values","CPL", 339, 1);
	VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_Flush_Mechanism", "ESG Values","CPL", 340, 1);
	GreenTickMarkValidation();
	HandleErrorCodeOnProcess("helper", "ProcessButton", "");
	//clickonProcess();
}
public static void WaterSense_Toilet_Residential_Backend_Enrollment_After_Process() {
	WaitForElement(300, "Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_ApplicationLink");
	clickWebelement("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_ApplicationLink");
	scrollToElement("Certified_Product_List_CPL", "MeasureTab");
	clickWebelement("Certified_Product_List_CPL", "MeasureTab");
	VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_After_BrandName", "ESG Values","CPL", 333, 1);
	VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_After_Model_Number", "ESG Values","CPL", 334, 1);
	VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_After_Tank_Model_Number", "ESG Values","CPL", 335, 1);
	VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_After_Bowl_Model_Number", "ESG Values","CPL", 336, 1);
	VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_After_Model_Name", "ESG Values","CPL", 337, 1);
	VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_After_Rated_Flush_Volume", "ESG Values","CPL", 338, 1);
	VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_After_Flush_Type", "ESG Values","CPL", 339, 1);
	VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Toilet_Residential_Backend_Enrollment_After_Flush_Mechanism", "ESG Values","CPL", 340, 1);
	GreenTickMarkValidation();
}

//***************************************************************************WaterSense - ShowerHead - Residential (Backend Enrollment)*************************************************************************
	public static void WaterSense_ShowerHead_Residential_Backend_Enrollment_Login() {
		
		login2(1, 0, 1, 1);
	}
	public static void WaterSense_ShowerHead_Residential_Backend_Enrollment_EnrollmentPage() {
		WaitForElement(300, "Certified_Product_List_CPL", "MainMenu");
		ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "ESG Values", "CPL", 35, 1);
		clickWebelement("Certified_Product_List_CPL", "NewEnrollmentButton");
		selectDropdown("Certified_Product_List_CPL", "SelectProgram","", "ESG Values","CPL", 347, 1);
		clickWebelement("Certified_Product_List_CPL", "NextButton1");
		enterTextboxValue("Certified_Product_List_CPL", "SearchBox", "ESG Values","CPL" , 346, 1);
		clickWebelement("Certified_Product_List_CPL", "SearchButton1");
		WaitForElement(300, "Certified_Product_List_CPL", "CustomerLink");
		clickWebelement("Certified_Product_List_CPL", "CustomerLink");
		clickWebelement("Certified_Product_List_CPL", "NextButton1");
	}
	public static void WaterSense_ShowerHead_Residential_Backend_Enrollment_Before_Process() {
		
		//explicitWait(300, "Certified_Product_List_CPL", "Process");
		scrollToElement("Certified_Product_List_CPL", "MeasureTab");
		clickWebelement("Certified_Product_List_CPL", "MeasureTab");
		WaitForElement(300, "Certified_Product_List_CPL", "AddMeasureButton");
		threadWait(2500);
		clickWebelement("Certified_Product_List_CPL", "AddMeasureButton");
		threadWait(10000);
		scrollToElement("Certified_Product_List_CPL", "Application_Measure_WaterSense_Showerhead_Residential_Backend_Enrollment_SelectMeasure");
		clickWebelement("Certified_Product_List_CPL", "Application_Measure_WaterSense_Showerhead_Residential_Backend_Enrollment_SelectMeasure");
		clickWebelement("Certified_Product_List_CPL", "Application_Measure_WaterSense_Showerhead_Residential_Backend_Enrollment_SaveButton");
		threadWait(300);
		clickWebelement("Certified_Product_List_CPL", "Application_Measure_WaterSense_Showerhead_Residential_Backend_Enrollment_MeasureName");
		enterTextboxValue("Certified_Product_List_CPL", "Application_Measure_WaterSense_Showerhead_Residential_Backend_Enrollment_MeasureQty", "ESG Values","CPL", 353, 1);
		clickWebelement("Certified_Product_List_CPL", "Application_Measure_WaterSense_Showerhead_Residential_Backend_Enrollment_BrandName");
		
		enterValueByActionClass("Certified_Product_List_CPL", "Application_Measure_WaterSense_Showerhead_Residential_Backend_Enrollment_BrandName", "ESG Values","CPL" , 349, 1);
		threadWait(3000);
		Enter(KeyEvent.VK_DOWN);
		Enter(KeyEvent.VK_ENTER);
		Enter(KeyEvent.VK_TAB);
		//clickWebelement("Certified_Product_List_CPL", "Application_Measure_WaterSense_Showerhead_Residential_Backend_Enrollment_Model_Number");
		enterValueByActionClass("Certified_Product_List_CPL", "Application_Measure_WaterSense_Showerhead_Residential_Backend_Enrollment_Model_Number", "ESG Values","CPL" , 350, 1);
		threadWait(300);
		Enter(KeyEvent.VK_DOWN);
		Enter(KeyEvent.VK_ENTER);
		threadWait(2500);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Showerhead_Residential_Backend_Enrollment_Model_Name", "ESG Values","CPL", 351, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Showerhead_Residential_Backend_Enrollment_Maximum_Rated_Flow_Rate", "ESG Values","CPL", 352, 1);
		GreenTickMarkValidation();
		
		HandleErrorCodeOnProcess("helper", "ProcessButton", "");
		//clickonProcess();
	}
	public static void WaterSense_Showerhead_Residential_Backend_Enrollment_After_Process() {
		WaitForElement(300, "Certified_Product_List_CPL", "Application_Measure_WaterSense_Showerhead_Residential_Backend_Enrollment_ApplicationLink");
		clickWebelement("Certified_Product_List_CPL", "Application_Measure_WaterSense_Showerhead_Residential_Backend_Enrollment_ApplicationLink");
		scrollToElement("Certified_Product_List_CPL", "MeasureTab");
		clickWebelement("Certified_Product_List_CPL", "MeasureTab");
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Showerhead_Residential_Backend_Enrollment_After_BrandName", "ESG Values","CPL", 349, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Showerhead_Residential_Backend_Enrollment_After_Model_Number", "ESG Values","CPL", 350, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Showerhead_Residential_Backend_Enrollment_After_Model_Name", "ESG Values","CPL", 351, 1);
		VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Showerhead_Residential_Backend_Enrollment_After_Maximum_Rated_Flow_Rate", "ESG Values","CPL", 352, 1);
		GreenTickMarkValidation();
	}
	
//***************************************************************************WaterSense - ShowerHead - Residential (Backend Enrollment)*************************************************************************
		public static void WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_Login() {
			
			login2(1, 0, 1, 1);
		}
		public static void WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_EnrollmentPage() {
			WaitForElement(300, "Certified_Product_List_CPL", "MainMenu");
			ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "ESG Values", "CPL", 35, 1);
			clickWebelement("Certified_Product_List_CPL", "NewEnrollmentButton");
			selectDropdown("Certified_Product_List_CPL", "SelectProgram","", "ESG Values","CPL", 359, 1);
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_NextButton");
			enterTextboxValue("Certified_Product_List_CPL", "SearchBox", "ESG Values","CPL" , 358, 1);
			clickWebelement("Certified_Product_List_CPL", "SearchButton1");
			WaitForElement(300, "Certified_Product_List_CPL", "CustomerLink");
			clickWebelement("Certified_Product_List_CPL", "CustomerLink");
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_NextButton");
		}
		public static void WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_Before_Process() {
			
			threadWait(300);
			scrollToElement("Certified_Product_List_CPL", "MeasureTab");
			clickWebelement("Certified_Product_List_CPL", "MeasureTab");
			WaitForElement(300, "Certified_Product_List_CPL", "AddMeasureButton");
			threadWait(2500);
			clickWebelement("Certified_Product_List_CPL", "AddMeasureButton");
			threadWait(10000);
			scrollToElement("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_SelectMeasure");
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_SelectMeasure");
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_SaveButton");
			threadWait(300);
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_MeasureName");
			enterTextboxValue("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_MeasureQty", "ESG Values","CPL", 368, 1);
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_BrandName");
			enterTextboxValue("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_BrandName", "ESG Values","CPL" , 361, 1);
			threadWait(300);
			Enter(KeyEvent.VK_DOWN);
			Enter(KeyEvent.VK_ENTER);
			Enter(KeyEvent.VK_TAB);
			//clickWebelement("Certified_Product_List_CPL", "Application_Measure_WaterSense_Showerhead_Residential_Backend_Enrollment_Model_Number");
			enterTextboxValue("Certified_Product_List_CPL", "Application_Measure_WaterSense_Showerhead_Residential_Backend_Enrollment_Model_Number", "ESG Values","CPL" , 362, 1);
			threadWait(300);
			Enter(KeyEvent.VK_DOWN);
			Enter(KeyEvent.VK_ENTER);
			threadWait(5000);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_Model_Name", "ESG Values","CPL", 363, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_Product_Type", "ESG Values","CPL", 364, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_Zone_Capacity", "ESG Values","CPL", 365, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_Weather_Data_Source", "ESG Values","CPL", 366, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_Component_Information", "ESG Values","CPL", 367, 1);
			GreenTickMarkValidation();
			HandleErrorCodeOnProcess("helper", "ProcessButton", "");
			
			//clickonProcess();
		}
		public static void WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_After_Process() {
			WaitForElement(300, "Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_ApplicationLink");
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_ApplicationLink");
			scrollToElement("Certified_Product_List_CPL", "MeasureTab");
			clickWebelement("Certified_Product_List_CPL", "MeasureTab");
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_After_BrandName", "ESG Values","CPL", 361, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_After_Model_Number", "ESG Values","CPL", 362, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_After_Model_Name", "ESG Values","CPL", 363, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_After_Product_Type", "ESG Values","CPL", 364, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_After_Zone_Capacity", "ESG Values","CPL", 365, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_After_Weather_Data_Source", "ESG Values","CPL", 366, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_WaterSense_Irrigation_Controller_Residential_Backend_Enrollment_After_Component_Information", "ESG Values","CPL", 367, 1);
			GreenTickMarkValidation();
		}
		
		//***************************************************************************AHRI Air Conditioner Residential Residential (Backend Enrollment)*************************************************************************
		public static void AHRI_Air_Conditioner_Residential_Backend_Enrollment_Login() {
			
			login2(1, 0, 1, 1);
		}
		public static void  AHRI_Air_Conditioner_Residential_Backend_Enrollment_EnrollmentPage() {
			WaitForElement(300, "Certified_Product_List_CPL", "MainMenu");
			ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "ESG Values", "CPL", 35, 1);
			clickWebelement("Certified_Product_List_CPL", "NewEnrollmentButton");
			selectDropdown("Certified_Product_List_CPL", "SelectProgram","", "ESG Values","CPL", 373, 1);
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_AHRI_Air_Conditioner_Residential_Backend_Enrollment_NextButton");
			enterTextboxValue("Certified_Product_List_CPL", "SearchBox", "ESG Values","CPL" , 372, 1);
			clickWebelement("Certified_Product_List_CPL", "SearchButton1");
			WaitForElement(300, "Certified_Product_List_CPL", "CustomerLink");
			clickWebelement("Certified_Product_List_CPL", "CustomerLink");
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_AHRI_Air_Conditioner_Residential_Backend_Enrollment_NextButton");
		}
		public static void  AHRI_Air_Conditioner_Residential_Backend_Enrollment_Before_Process() {
			
			//explicitWait(300, "Certified_Product_List_CPL", "Process");
			scrollToElement("Certified_Product_List_CPL", "MeasureTab");
			clickWebelement("Certified_Product_List_CPL", "MeasureTab");
			WaitForElement(300, "Certified_Product_List_CPL", "AddMeasureButton");
			threadWait(2500);
			clickWebelement("Certified_Product_List_CPL", "AddMeasureButton");
			threadWait(10000);
			scrollToElement("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_SelectMeasure");
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_SelectMeasure");
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_SaveButton");
			threadWait(20000);
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_MeasureName");
			enterTextboxValue("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_Backend_Enrollment_MeasureQty", "ESG Values","CPL", 375, 1);
			threadWait(10000);
			enterTextboxValue("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_AHRICertifiedReferenceNumber", "ESG Values","CPL" , 374, 1);
			threadWait(2500);
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_AHRICertifiedReferenceNumber_Click");
			test.log(LogStatus.INFO, "Application Measure data validation Before Process");
			threadWait(5000);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_OldAHRIReferenceNumber", "ESG Values","CPL", 377, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_AHRIType", "ESG Values","CPL", 378, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_CoolingCapacity", "ESG Values","CPL", 379, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_DesignatedTestedCombination", "ESG Values","CPL", 380, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_EER", "ESG Values","CPL", 381, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_EligibleforFederalTaxCredit", "ESG Values","CPL", 382, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_EnergyGuideLabel", "ESG Values","CPL", 383, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_EstimatedNationalAverageOperatingCoolingCost", "ESG Values","CPL", 384, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_FurnaceModelNumber", "ESG Values","CPL", 385, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_IEER", "ESG Values","CPL", 386, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_IndoorCoolingIntermediateAirVolumeRate", "ESG Values","CPL", 387, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_IndoorCoolingMinimumAirVolumeRate", "ESG Values","CPL", 388, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_IndoorFullLoadAirVolumeRate", "ESG Values","CPL", 389, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_IndoorUnitModelNumber", "ESG Values","CPL", 390, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_IsRerated", "ESG Values","CPL", 391, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_ManufacturerType", "ESG Values","CPL", 392, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_ModelStatus", "ESG Values","CPL", 393, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_OutdoorUnitBrandName", "ESG Values","CPL", 394, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_OutdoorUnitModelNumberCondenser", "ESG Values","CPL", 395, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_Phase", "ESG Values","CPL", 396, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_Region", "ESG Values","CPL", 397, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_SEER", "ESG Values","CPL", 398, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_SeriesName", "ESG Values","CPL", 399, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_Soldin", "ESG Values","CPL", 400, 1);
			GreenTickMarkValidation();
			HandleErrorCodeOnProcess("helper", "ProcessButton", "");
			//clickonProcess();
		}
		public static void  AHRI_Air_Conditioner_Residential_Backend_Enrollment_After_Process() {
			WaitForElement(300, "Certified_Product_List_CPL", "Application_Measure_WaterSense_Showerhead_Residential_Backend_Enrollment_ApplicationLink");
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_WaterSense_Showerhead_Residential_Backend_Enrollment_ApplicationLink");
			scrollToElement("Certified_Product_List_CPL", "MeasureTab");
			clickWebelement("Certified_Product_List_CPL", "MeasureTab");
			test.log(LogStatus.INFO, "Application Measure data validation After Process");
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_After_AHRICertifiedReferenceNumber", "ESG Values","CPL", 374, 2);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_After_OldAHRIReferenceNumber", "ESG Values","CPL", 377, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_After_AHRIType", "ESG Values","CPL", 378, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_After_CoolingCapacity", "ESG Values","CPL", 379, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_After_DesignatedTestedCombination", "ESG Values","CPL", 380, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_After_EER", "ESG Values","CPL", 381, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_After_EligibleforFederalTaxCredit", "ESG Values","CPL", 382, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_After_EnergyGuideLabel", "ESG Values","CPL", 383, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_After_EstimatedNationalAverageOperatingCoolingCost", "ESG Values","CPL", 384, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_After_FurnaceModelNumber", "ESG Values","CPL", 385, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_After_IEER", "ESG Values","CPL", 386, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_After_IndoorCoolingIntermediateAirVolumeRate", "ESG Values","CPL", 387, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_After_IndoorCoolingMinimumAirVolumeRate", "ESG Values","CPL", 388, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_After_IndoorFullLoadAirVolumeRate", "ESG Values","CPL", 389, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_After_IndoorUnitModelNumber", "ESG Values","CPL", 390, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_After_IsRerated", "ESG Values","CPL", 391, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_After_ManufacturerType", "ESG Values","CPL", 392, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_After_ModelStatus", "ESG Values","CPL", 393, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_After_OutdoorUnitBrandName", "ESG Values","CPL", 394, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_After_OutdoorUnitModelNumberCondenser", "ESG Values","CPL", 395, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_After_Phase", "ESG Values","CPL", 396, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_After_Region", "ESG Values","CPL", 397, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_After_SEER", "ESG Values","CPL", 398, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_After_SeriesName", "ESG Values","CPL",399 , 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_AirConditioner_Backend_Enrollment_After_Soldin", "ESG Values","CPL", 400, 1);
			GreenTickMarkValidation();
}
		//***************************************************************************AHRI Furnace Residential Residential (Backend Enrollment)*************************************************************************
		public static void AHRI_Furnace_Residential_Backend_Enrollment_Login() {
			
			login2(1, 0, 1, 1);
		}
		public static void  AHRI_Furnace_Residential_Backend_Enrollment_EnrollmentPage() {
			WaitForElement(300, "Certified_Product_List_CPL", "MainMenu");
			ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "ESG Values", "CPL", 35, 1);
			clickWebelement("Certified_Product_List_CPL", "NewEnrollmentButton");
			selectDropdown("Certified_Product_List_CPL", "SelectProgram","", "ESG Values","CPL", 405, 1);
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_NextButton");
			enterTextboxValue("Certified_Product_List_CPL", "SearchBox", "ESG Values","CPL" , 404, 1);
			clickWebelement("Certified_Product_List_CPL", "SearchButton1");
			WaitForElement(300, "Certified_Product_List_CPL", "CustomerLink");
			clickWebelement("Certified_Product_List_CPL", "CustomerLink");
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_AHRI_Air_Conditioner_Residential_Backend_Enrollment_NextButton");
		}
		public static void  AHRI_Furnace_Residential_Backend_Enrollment_Before_Process() {
			
			//explicitWait(300, "Certified_Product_List_CPL", "Process");
			scrollToElement("Certified_Product_List_CPL", "MeasureTab");
			clickWebelement("Certified_Product_List_CPL", "MeasureTab");
			WaitForElement(300, "Certified_Product_List_CPL", "AddMeasureButton");
			threadWait(2500);
			clickWebelement("Certified_Product_List_CPL", "AddMeasureButton");
			threadWait(2500);
			scrollToElement("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_SelectMeasure");
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_SelectMeasure");
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_SaveButton");
			threadWait(20000);
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_MeasureName");
			enterTextboxValue("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_MeasureQty", "ESG Values","CPL", 407, 1);
			threadWait(10000);
			enterTextboxValue("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_AHRICertifiedReferenceNumber", "ESG Values","CPL" , 406, 1);
			threadWait(2500);
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_AHRICertifiedReferenceNumber_Click");
			test.log(LogStatus.INFO, "Application Measure data validation Before Process");
			threadWait(2500);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_BrandName", "ESG Values","CPL", 409, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_Configuration", "ESG Values","CPL", 410, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_Eae_including_Eso", "ESG Values","CPL", 411, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_Ef", "ESG Values","CPL", 412, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_Electronically_Commutated_Motor", "ESG Values","CPL", 413, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_EligibleforFederalTaxCredit", "ESG Values","CPL", 414, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_EnergyGuideLabel", "ESG Values","CPL", 415, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_Fuel_Type", "ESG Values","CPL", 416, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_Furnace_Type", "ESG Values","CPL", 417, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_Input_Rating", "ESG Values","CPL", 418, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_IsRerated", "ESG Values","CPL", 419, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_Mobile_Home", "ESG Values","CPL", 420, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_Model_Number", "ESG Values","CPL", 421, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_Model_Status", "ESG Values","CPL", 422, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_Old_AHRI_Reference_Number", "ESG Values","CPL", 423, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_Output_Heating_Capacity", "ESG Values","CPL", 424, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_PE", "ESG Values","CPL", 425, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_SeriesName", "ESG Values","CPL", 426, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_AFUE", "ESG Values","CPL", 427, 1);
			GreenTickMarkValidation();
			HandleErrorCodeOnProcess("helper", "ProcessButton", "");
			//clickonProcess();
		}
		public static void  AHRI_Furnace_Residential_Backend_Enrollment_After_Process() {
			WaitForElement(300, "Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_ApplicationLink");
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_ApplicationLink");
			scrollToElement("Certified_Product_List_CPL", "MeasureTab");
			clickWebelement("Certified_Product_List_CPL", "MeasureTab");
			test.log(LogStatus.INFO, "Application Measure data validation After Process");
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_After_AHRICertifiedReferenceNumber", "ESG Values","CPL", 406, 2);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_After_BrandName", "ESG Values","CPL", 409, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_After_Configuration", "ESG Values","CPL", 410, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_After_Eae_including_Eso", "ESG Values","CPL", 411, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_After_Ef", "ESG Values","CPL", 412, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_After_Electronically_Commutated_Motor", "ESG Values","CPL", 413, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_After_EligibleforFederalTaxCredit", "ESG Values","CPL", 414, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_After_EnergyGuideLabel", "ESG Values","CPL", 415, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_After_Fuel_Type", "ESG Values","CPL", 416, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_After_Furnace_Type", "ESG Values","CPL", 417, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_After_Input_Rating", "ESG Values","CPL", 418, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_After_IsRerated", "ESG Values","CPL", 419, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_After_Mobile_Home", "ESG Values","CPL", 420, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_After_Model_Number", "ESG Values","CPL", 421, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_After_Model_Status", "ESG Values","CPL", 422, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_After_Old_AHRI_Reference_Number", "ESG Values","CPL", 423, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_After_Output_Heating_Capacity", "ESG Values","CPL", 424, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_After_PE", "ESG Values","CPL", 425, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_After_SeriesName", "ESG Values","CPL", 426, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_Furnace_Backend_Enrollment_After_AFUE", "ESG Values","CPL", 427, 1);
			GreenTickMarkValidation();
}
		//***************************************************************************AHRI Heat Pump Residential Residential (Backend Enrollment)*************************************************************************
		public static void AHRI_HeatPump_Residential_Backend_Enrollment_Login() {
			
			login2(1, 0, 1, 1);
		}
		public static void  AHRI_HeatPump_Residential_Backend_Enrollment_EnrollmentPage() {
			WaitForElement(300, "Certified_Product_List_CPL", "MainMenu");
			ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "ESG Values", "CPL", 35, 1);
			clickWebelement("Certified_Product_List_CPL", "NewEnrollmentButton");
			selectDropdown("Certified_Product_List_CPL", "SelectProgram","", "ESG Values","CPL", 433, 1);
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_NextButton");
			enterTextboxValue("Certified_Product_List_CPL", "SearchBox", "ESG Values","CPL" , 432, 1);
			clickWebelement("Certified_Product_List_CPL", "SearchButton1");
			explicitWaitForClickable(300, "Certified_Product_List_CPL", "CustomerLink");
			clickWebelement("Certified_Product_List_CPL", "CustomerLink");
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_AHRI_Air_Conditioner_Residential_Backend_Enrollment_NextButton");
		}
		public static void  AHRI_HeatPump_Residential_Backend_Enrollment_Before_Process() {
			
			//explicitWait(300, "Certified_Product_List_CPL", "Process");
			scrollToElement("Certified_Product_List_CPL", "MeasureTab");
			clickWebelement("Certified_Product_List_CPL", "MeasureTab");
			WaitForElement(300, "Certified_Product_List_CPL", "AddMeasureButton");
			threadWait(2500);
			clickWebelement("Certified_Product_List_CPL", "AddMeasureButton");
			threadWait(2500);
			scrollToElement("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_SelectMeasure");
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_SelectMeasure");
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_SaveButton");
			threadWait(20000);
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_MeasureName");
			enterTextboxValue("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_MeasureQty", "ESG Values","CPL", 435, 1);
			threadWait(2500);
			enterTextboxValue("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_AHRICertifiedReferenceNumber", "ESG Values","CPL" , 434, 1);
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_AHRICertifiedReferenceNumberClick");
			threadWait(10000);
			test.log(LogStatus.INFO, "Application Measure data validation Before Process");
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_AHRIType", "ESG Values","CPL", 437, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_CoolingCapacity", "ESG Values","CPL", 438, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_DesignatedTestedCombination", "ESG Values","CPL", 439, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_EER", "ESG Values","CPL", 440, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_EligibleforFederalTaxCredit", "ESG Values","CPL", 441, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_EnergyGuideLabel", "ESG Values","CPL", 442, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_EstimatedNationalAverageOperatingCoolingCost", "ESG Values","CPL", 443, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_EstimatedNationalAverageOperatingHeatingCost", "ESG Values","CPL", 444, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_FurnaceModelNumber", "ESG Values","CPL", 445, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_HeatingCapacity_H12", "ESG Values","CPL", 446, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_HeatingCapacity_H32", "ESG Values","CPL", 447, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_HSPF", "ESG Values","CPL", 448, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_IndoorCoolingIntermediateAirVolumeRate", "ESG Values","CPL", 449, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_IndoorCoolingMinimumAirVolumeRate", "ESG Values","CPL", 450, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_IndoorFullLoadAirVolumeRate", "ESG Values","CPL", 451, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_IndoorUnitBrandName", "ESG Values","CPL", 452, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_IndoorUnitModelNumber", "ESG Values","CPL", 453, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_IsRerated", "ESG Values","CPL", 454, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_ManufacturerType", "ESG Values","CPL", 455, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_ModelStatus", "ESG Values","CPL", 456, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_OldAHRIReferenceNumber", "ESG Values","CPL",457, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_OutdoorUnitBrandName", "ESG Values","CPL", 458, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_OutdoorUnitModelNumberCondenser", "ESG Values","CPL", 459, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_Phase", "ESG Values","CPL", 460, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_SEER", "ESG Values","CPL", 461, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_SeriesName", "ESG Values","CPL", 462, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_Soldin", "ESG Values","CPL", 463, 1);
			GreenTickMarkValidation();
			HandleErrorCodeOnProcess("helper", "ProcessButton", "");
			//clickonProcess();
		}
		public static void  AHRI_HeatPump_Residential_Backend_Enrollment_After_Process() {
			WaitForElement(300, "Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollmentt_ApplicationLink");
			clickWebelement("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollmentt_ApplicationLink");
			scrollToElement("Certified_Product_List_CPL", "MeasureTab");
			clickWebelement("Certified_Product_List_CPL", "MeasureTab");
			test.log(LogStatus.INFO, "Application Measure data validation After Process");
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_AHRICertifiedReferenceNumber", "ESG Values","CPL", 434, 2);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_AHRIType", "ESG Values","CPL", 437, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_CoolingCapacity", "ESG Values","CPL", 438, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_DesignatedTestedCombination", "ESG Values","CPL", 439, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_EER", "ESG Values","CPL", 440, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_EligibleforFederalTaxCredit", "ESG Values","CPL", 441, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_EnergyGuideLabel", "ESG Values","CPL", 442, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_EstimatedNationalAverageOperatingCoolingCost", "ESG Values","CPL", 443, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_EstimatedNationalAverageOperatingHeatingCost", "ESG Values","CPL", 444, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_FurnaceModelNumber", "ESG Values","CPL", 445, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_HeatingCapacity_H12", "ESG Values","CPL", 446, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_HeatingCapacity_H32", "ESG Values","CPL", 447, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_HSPF", "ESG Values","CPL", 448, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_IndoorCoolingIntermediateAirVolumeRate", "ESG Values","CPL", 449, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_IndoorCoolingMinimumAirVolumeRate", "ESG Values","CPL", 450, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_IndoorFullLoadAirVolumeRate", "ESG Values","CPL", 451, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_IndoorUnitBrandName", "ESG Values","CPL", 452, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_IndoorUnitModelNumber", "ESG Values","CPL", 453, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_IsRerated", "ESG Values","CPL", 454, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_ManufacturerType", "ESG Values","CPL", 455, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_ModelStatus", "ESG Values","CPL", 456, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_OldAHRIReferenceNumber", "ESG Values","CPL",457, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_OutdoorUnitBrandName", "ESG Values","CPL", 458, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_OutdoorUnitModelNumberCondenser", "ESG Values","CPL", 459, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_Phase", "ESG Values","CPL", 460, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_SEER", "ESG Values","CPL", 461, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_SeriesName", "ESG Values","CPL", 462, 1);
			VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Application_Measure_AHRI_HeatPump_Backend_Enrollment_After_Soldin", "ESG Values","CPL", 463, 1);
			GreenTickMarkValidation();
}


			
//******************************************************************************************************************************************************************************************************
public static void Refrigerator() {
			
			//Step 1 Get started
				clickWebelement("Certified_Product_List_CPL_1", "AccountHolder");
				clickWebelement("Certified_Product_List_CPL_1", "AccountNumer");
				enterTextboxValue("Certified_Product_List_CPL_1", "AccountNumer", "ESG Values","CPL_1", 1, 1);
				WaitForElement(300, "Certified_Product_List_CPL_1", "ZipCode");
				clickWebelement("Certified_Product_List_CPL_1", "ZipCode");
				enterTextboxValue("Certified_Product_List_CPL_1", "ZipCode", "ESG Values","CPL_1", 2, 1);
				/*threadWait(2000);
				Enter(KeyEvent.VK_TAB);
				enterTextboxValue("Certified_Product_List_CPL_1", "ZipCode", "ESG Values","CPL_1", 2, 1);;*/
				clickWebelement("Certified_Product_List_CPL_1", "NextButton");
				explicitWait(300, "Certified_Product_List_CPL_1", "NextButton");
				
			//Step 2 customer information
				scrollToElement("Certified_Product_List_CPL_1", "NextButton");
				clickWebelement("Certified_Product_List_CPL_1", "NextButton");
				
			//Step 3 Equipment information
				explicitWait(300, "Certified_Product_List_CPL_1", "AddEquipment");
				clickWebelement("Certified_Product_List_CPL_1", "AddEquipment");
				explicitWaitForClickable(300, "Certified_Product_List_CPL_1", "Refrigerator");
				scrollToElement("Certified_Product_List_CPL_1", "Refrigerator");
				ClickWebelementByActionClass("Certified_Product_List_CPL_1", "Refrigerator");
				clickWebelement("Certified_Product_List_CPL_1", "OkButton");
				WaitForElement(300, "Certified_Product_List_CPL_1", "Equipment_Information_CEE_Refrigerator_Quantity");
				enterTextboxValue("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Refrigerator_Quantity", "ESG Values","CPL_1", 3, 1);
				threadWait(300);
				selectDropdown("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Refrigerator_Brand","Equipment_Information_CEE_Refrigerator_Brand", "ESG Values","CPL_1", 4, 1);
				explicitWait(300, "Certified_Product_List_CPL_1", "Equipment_Information_CEE_Refrigerator_ModelNumber");
				selectDropdown("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Refrigerator_ModelNumber","", "ESG Values","CPL_1", 5, 1);
				threadWait(5000);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Refrigerator_AdditionalModelNumberVariations", "ESG Values","CPL_1", 7, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Refrigerator_Configuration", "ESG Values","CPL_1", 8, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Refrigerator_DefrostType", "ESG Values","CPL_1", 9, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Refrigerator_Compact", "ESG Values","CPL_1", 10, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Refrigerator_ThroughTheDoorDispenser", "ESG Values","CPL_1", 11, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Refrigerator_AutomaticIceMaker", "ESG Values","CPL_1", 12, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Refrigerator_Volume", "ESG Values","CPL_1", 13, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Refrigerator_AjustedVolume", "ESG Values","CPL_1", 14, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Refrigerator_Kwh/year", "ESG Values","CPL_1", 15, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Refrigerator_FederalStandard", "ESG Values","CPL_1", 16, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Refrigerator_MeasuredFederal", "ESG Values","CPL_1", 17, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Refrigerator_PercentageBetterThanMeasuredFederalStandard", "ESG Values","CPL_1", 18, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Refrigerator_CeeTire", "ESG Values","CPL_1", 19, 1);
				clickWebelement("Certified_Product_List_CPL_1", "NextButton");
				
			//Step 4 Review and submit
				WaitForElement(300, "Certified_Product_List_CPL_1", "SubmitButton");
				scrollToElement("Certified_Product_List_CPL_1", "SubmitButton");
				clickWebelement("Certified_Product_List_CPL_1", "SubmitButton");
				
			//Step 5 Confirmation
				explicitWait(300, "Certified_Product_List_CPL_1", "ConfirmationNumber");
				TrackEnrollmentNumber("Certified_Product_List_CPL_1", "ConfirmationNumber", "ESG Values", "CPL_1", 21, 1);
			
			}	
			public static void EECPApplicationRefrigerator() {
				
			//Login to EECP Application
				login("helper", "BaseURL", 1, 0, 1, 1);
				ClickByActionClass("Certified_Product_List_CPL_1", "MainMenu", "ESG Values", "CPL_1", 23, 1);
				WaitForElement(300, "Certified_Product_List_CPL_1", "Enrollment_Number");
				enterTextboxValue("Certified_Product_List_CPL_1", "Enrollment_Number", "ESG Values", "CPL_1", 21, 1);
				explicitWait(300, "Certified_Product_List_CPL_1", "Enrollment_Search");
				clickWebelement("Certified_Product_List_CPL_1", "Enrollment_Search");
				threadWait(300);
				clickWebelement("Certified_Product_List_CPL_1", "Enrollment_EnrollmentSelection");
				WaitForElement(300, "Certified_Product_List_CPL_1", "Enrollment_Application_Click");
				clickWebelement("Certified_Product_List_CPL_1", "Enrollment_Application_Click");
				selectMeasures();
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_Brand", "ESG Values","CPL_1", 25, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_ModelNumber", "ESG Values","CPL_1", 26, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_AdditionalModelNumberVariations", "ESG Values","CPL_1", 7, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_Configuration", "ESG Values","CPL_1", 8, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_DefrostType", "ESG Values","CPL_1", 9, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_Compact", "ESG Values","CPL_1", 10, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_ThroughTheDoorDispenser", "ESG Values","CPL_1", 11, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_AutomaticIceMaker", "ESG Values","CPL_1", 12, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_Volume", "ESG Values","CPL_1", 13, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_AjustedVolume", "ESG Values","CPL_1", 14, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_Kwh/year", "ESG Values","CPL_1", 15, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_FederalStandard", "ESG Values","CPL_1", 16, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_MeasuredFederal", "ESG Values","CPL_1", 17, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_PercentageBetterThanMeasuredFederalStandard", "ESG Values","CPL_1", 18, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_CeeTire", "ESG Values","CPL_1", 19, 1);
				GreenTickMarkValidation();
				HandleErrorCodeOnProcess("helper", "ProcessButton", "");
				//clickonProcess();
				WaitForElement(300, "Certified_Product_List_CPL_1", "Enrollment_Application_Click");
				clickWebelement("Certified_Product_List_CPL_1", "Enrollment_Application_Click");
				selectMeasures();
				
			//Measure verification
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_Brand", "ESG Values","CPL_1", 25, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_ModelNumber", "ESG Values","CPL_1", 26, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_AdditionalModelNumberVariations", "ESG Values","CPL_1", 7, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_Configuration", "ESG Values","CPL_1", 8, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_DefrostType", "ESG Values","CPL_1", 9, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_Compact", "ESG Values","CPL_1", 10, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_ThroughTheDoorDispenser", "ESG Values","CPL_1", 11, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_AutomaticIceMaker", "ESG Values","CPL_1", 12, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_Volume", "ESG Values","CPL_1", 13, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_AjustedVolume", "ESG Values","CPL_1", 14, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_Kwh/year", "ESG Values","CPL_1", 15, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_FederalStandard", "ESG Values","CPL_1", 16, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_MeasuredFederal", "ESG Values","CPL_1", 17, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_PercentageBetterThanMeasuredFederalStandard", "ESG Values","CPL_1", 18, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_CeeTire", "ESG Values","CPL_1", 19, 1);
				GreenTickMarkValidation();
				
				
			}
		   public static void Dishwasher() {
			  
			//Step 1 Get started
			   clickWebelement("Certified_Product_List_CPL_1", "AccountHolder");
			   clickWebelement("Certified_Product_List_CPL_1", "AccountNumer");
			   enterTextboxValue("Certified_Product_List_CPL_1", "AccountNumer", "ESG Values","CPL_1", 29, 1);
			   WaitForElement(300, "Certified_Product_List_CPL_1", "ZipCode");
			   clickWebelement("Certified_Product_List_CPL_1", "ZipCode");
			   enterTextboxValue("Certified_Product_List_CPL_1", "ZipCode", "ESG Values","CPL_1", 30, 1);
			   /*threadWait(2000);
			   Enter(KeyEvent.VK_TAB);
			   enterTextboxValue("Certified_Product_List_CPL_1", "ZipCode", "ESG Values","CPL_1", 30, 1);*/
			   clickWebelement("Certified_Product_List_CPL_1", "NextButton");
			   explicitWait(300, "Certified_Product_List_CPL_1", "NextButton");	
			 		
			//Step 2 customer information
				scrollToElement("Certified_Product_List_CPL_1", "NextButton");
				clickWebelement("Certified_Product_List_CPL_1", "NextButton");
					
			//Step 3 Equipment information
				WaitForElement(300, "Certified_Product_List_CPL_1", "AddEquipment");
				clickWebelement("Certified_Product_List_CPL_1", "AddEquipment");
				explicitWaitForClickable(300, "Certified_Product_List_CPL_1", "Dishwasher");
				ClickWebelementByActionClass("Certified_Product_List_CPL_1", "Dishwasher");
				clickWebelement("Certified_Product_List_CPL_1", "OkButton");
				explicitWait(300, "Certified_Product_List_CPL_1", "Equipment_Information_CEE_Dishwasher_Quantity");
				enterTextboxValue("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Dishwasher_Quantity", "ESG Values","CPL_1", 32, 1);
				explicitWait(300, "Certified_Product_List_CPL_1", "Equipment_Information_CEE_Dishwasher_Brand");
				selectDropdown("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Dishwasher_Brand","", "ESG Values","CPL_1", 33, 1);
				selectDropdown("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Dishwasher_ModelNumber","", "ESG Values","CPL_1", 34, 1);
				threadWait(5000);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Dishwasher_EnergyUse(kWh/year)", "ESG Values","CPL_1", 35, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Dishwasher_WaterUse(gallons/cycle)", "ESG Values","CPL_1", 36, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Dishwasher_Capacity", "ESG Values","CPL_1", 37, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Dishwasher_CEETier", "ESG Values","CPL_1", 38, 1);	
				clickWebelement("Certified_Product_List_CPL_1", "NextButton");
				
			//Step 4 Review and submit
				WaitForElement(300, "Certified_Product_List_CPL_1", "SubmitButton");
				scrollToElement("Certified_Product_List_CPL_1", "SubmitButton");
				clickWebelement("Certified_Product_List_CPL_1", "SubmitButton");	
				
			//Step 5 Confirmation
				explicitWait(300, "Certified_Product_List_CPL_1", "ConfirmationNumber");
				TrackEnrollmentNumber("Certified_Product_List_CPL_1", "ConfirmationNumber", "ESG Values", "CPL_1", 40, 1);
				
		   }
		   
		   public static void EECPApplicationDishwasher() {
			 
			//Login to EECP Application
			 	login("helper", "BaseURL", 1, 0, 1, 1);
			 	ClickByActionClass("Certified_Product_List_CPL_1", "MainMenu", "ESG Values", "CPL_1", 42, 1);
			 	WaitForElement(300, "Certified_Product_List_CPL_1", "Enrollment_Number");
			 	enterTextboxValue("Certified_Product_List_CPL_1", "Enrollment_Number", "ESG Values", "CPL_1", 40, 1);
			 	WaitForElement(300, "Certified_Product_List_CPL_1", "Enrollment_Search");
			 	clickWebelement("Certified_Product_List_CPL_1", "Enrollment_Search");
			 	threadWait(300);
			 	clickWebelement("Certified_Product_List_CPL_1", "Enrollment_EnrollmentSelection");
			 	WaitForElement(300, "Certified_Product_List_CPL_1", "Enrollment_Application_Click");
			 	clickWebelement("Certified_Product_List_CPL_1", "Enrollment_Application_Click");
			 	selectMeasures();
			 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_Brand", "ESG Values","CPL_1", 44, 1);
			 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_ModelNumber", "ESG Values","CPL_1", 45, 1);
			 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_EnergyUse(kWh/year)", "ESG Values","CPL_1", 35, 1);
			 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_WaterUse(gallons/cycle)", "ESG Values","CPL_1", 36, 1);
			 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_Capacity", "ESG Values","CPL_1", 37, 1);
			 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_CEETier", "ESG Values","CPL_1", 38, 1);
			 	GreenTickMarkValidation();
			 	
			 	HandleErrorCodeOnProcess("helper", "ProcessButton", "");
			 	//clickonProcess();
			 	WaitForElement(300, "Certified_Product_List_CPL_1", "Enrollment_Application_Click");
				clickWebelement("Certified_Product_List_CPL_1", "Enrollment_Application_Click");
				selectMeasures();
				
			//Measure verification
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_Brand", "ESG Values","CPL_1", 44, 1);
			 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_ModelNumber", "ESG Values","CPL_1", 45, 1);
			 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_EnergyUse(kWh/year)", "ESG Values","CPL_1", 35, 1);
			 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_WaterUse(gallons/cycle)", "ESG Values","CPL_1", 36, 1);
			 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_Capacity", "ESG Values","CPL_1", 37, 1);
			 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_CEETier", "ESG Values","CPL_1", 38, 1);
			 	GreenTickMarkValidation();
		   }
		   
		   public static void Clotheswasher() {
				  
			//Step 1 Get started
				 clickWebelement("Certified_Product_List_CPL_1", "AccountHolder");
				 clickWebelement("Certified_Product_List_CPL_1", "AccountNumer");
				 enterTextboxValue("Certified_Product_List_CPL_1", "AccountNumer", "ESG Values","CPL_1", 48, 1);
				 WaitForElement(300, "Certified_Product_List_CPL_1", "ZipCode");
				 clickWebelement("Certified_Product_List_CPL_1", "ZipCode");
				 enterTextboxValue("Certified_Product_List_CPL_1", "ZipCode", "ESG Values","CPL_1", 49, 1);
				 /*threadWait(2000);
				 Enter(KeyEvent.VK_TAB);
				 enterTextboxValue("Certified_Product_List_CPL_1", "ZipCode", "ESG Values","CPL_1", 49, 1);*/
				 clickWebelement("Certified_Product_List_CPL_1", "NextButton");
				 WaitForElement(300, "Certified_Product_List_CPL_1", "NextButton");	
				 
			//Step 2 customer information
				scrollToElement("Certified_Product_List_CPL_1", "NextButton");
				clickWebelement("Certified_Product_List_CPL_1", "NextButton");
				
			//Step 3 Equipment information
					WaitForElement(300, "Certified_Product_List_CPL_1", "AddEquipment");
				    clickWebelement("Certified_Product_List_CPL_1", "AddEquipment");
				    WaitForElement(300, "Certified_Product_List_CPL_1", "Clotheswasher");
					ClickWebelementByActionClass("Certified_Product_List_CPL_1", "Clotheswasher");
				    clickWebelement("Certified_Product_List_CPL_1", "OkButton");
				    WaitForElement(300, "Certified_Product_List_CPL_1", "Equipment_Information_CEE_Dishwasher_Quantity");
					enterTextboxValue("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Dishwasher_Quantity", "ESG Values","CPL_1", 51, 1);
					explicitWait(300, "Certified_Product_List_CPL_1", "Equipment_Information_CEE_Dishwasher_Brand");
					selectDropdown("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Dishwasher_Brand","", "ESG Values","CPL_1", 52, 1);
					selectDropdown("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Dishwasher_ModelNumber","", "ESG Values","CPL_1", 53, 1);
					threadWait(5000);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Clotheswasher_IntegratedModifiedEnergyFactor", "ESG Values","CPL_1", 54, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Clotheswasher_IntegratedWaterFactor", "ESG Values","CPL_1", 55, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Clotheswasher_Volume(cu.ft)", "ESG Values","CPL_1", 56, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Clotheswasher_UsesSilverInTechnology", "ESG Values","CPL_1", 57, 1);	
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Clotheswasher_FrontOrTopLoading", "ESG Values","CPL_1", 58, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Clotheswasher_MeetsEnergyStarConnectedVersion", "ESG Values","CPL_1", 59, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Clotheswasher_MeetsCEEConnectedCriteria", "ESG Values","CPL_1", 60, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Equipment_Information_CEE_Clotheswasher_CEETier", "ESG Values","CPL_1", 61, 1);
					clickWebelement("Certified_Product_List_CPL_1", "NextButton");
						
				//Step 4 Review and submit
					WaitForElement(300, "Certified_Product_List_CPL_1", "SubmitButton");
					scrollToElement("Certified_Product_List_CPL_1", "SubmitButton");
					clickWebelement("Certified_Product_List_CPL_1", "SubmitButton");
					
				//Step 5 Confirmation
					explicitWait(300, "Certified_Product_List_CPL_1", "ConfirmationNumber");
					TrackEnrollmentNumber("Certified_Product_List_CPL_1", "ConfirmationNumber", "ESG Values", "CPL_1", 63, 1);
					
		 }
		   
		   public static void EECPApplicationClotheswasher() {
				 
				//Login to EECP Application
				 	login("helper", "BaseURL", 1, 0, 1, 1);
				 	ClickByActionClass("Certified_Product_List_CPL_1", "MainMenu", "ESG Values", "CPL_1", 65, 1);
				 	WaitForElement(300, "Certified_Product_List_CPL_1", "Enrollment_Number");
				 	enterTextboxValue("Certified_Product_List_CPL_1", "Enrollment_Number", "ESG Values", "CPL_1", 63, 1);
				 	WaitForElement(300, "Certified_Product_List_CPL_1", "Enrollment_Search");
				 	clickWebelement("Certified_Product_List_CPL_1", "Enrollment_Search");
				 	threadWait(300);
				 	clickWebelement("Certified_Product_List_CPL_1", "Enrollment_EnrollmentSelection");
				 	WaitForElement(300, "Certified_Product_List_CPL_1", "Enrollment_Application_Click");
				 	clickWebelement("Certified_Product_List_CPL_1", "Enrollment_Application_Click");
				 	selectMeasures();
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_Brand", "ESG Values","CPL_1", 67, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_ModelNumber", "ESG Values","CPL_1", 68, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_IntegratedModifiedEnergyFactor", "ESG Values","CPL_1", 54, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_IntegratedWaterFactor", "ESG Values","CPL_1", 55, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_Volume(cu.ft)", "ESG Values","CPL_1", 56, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_UsesSilverInTechnology", "ESG Values","CPL_1", 57, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_FrontOrTopLoading", "ESG Values","CPL_1", 58, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_MeetsEnergyStarConnectedVersion", "ESG Values","CPL_1", 59, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_MeetsCEEConnectedCriteria", "ESG Values","CPL_1", 60, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_CEETier", "ESG Values","CPL_1", 61, 1);
				 	GreenTickMarkValidation();
				 	HandleErrorCodeOnProcess("helper", "ProcessButton", "");
				 	//clickonProcess();
				 	WaitForElement(300, "Certified_Product_List_CPL_1", "Enrollment_Application_Click");
					clickWebelement("Certified_Product_List_CPL_1", "Enrollment_Application_Click");
					selectMeasures();
					
				//Measure verification
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_Brand", "ESG Values","CPL_1", 67, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_ModelNumber", "ESG Values","CPL_1", 68, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_IntegratedModifiedEnergyFactor", "ESG Values","CPL_1", 54, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_IntegratedWaterFactor", "ESG Values","CPL_1", 55, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_Volume(cu.ft)", "ESG Values","CPL_1", 56, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_UsesSilverInTechnology", "ESG Values","CPL_1", 57, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_FrontOrTopLoading", "ESG Values","CPL_1", 58, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_MeetsEnergyStarConnectedVersion", "ESG Values","CPL_1", 59, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_MeetsCEEConnectedCriteria", "ESG Values","CPL_1", 60, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_CEETier", "ESG Values","CPL_1", 61, 1);
				 	GreenTickMarkValidation();
				 	
		   }	 
		   
		   public static void RefrigeratorMobileApplicationURL() {
				
				//open online application
					OpenBrowser("Certified_Product_List_CPL_1", "RefrigeratorMobileApplication");
				}
		   
		   public static void RefrigeratorMobileApplication() {
			   
			    //Page 1
			   
			        clickWebelement("Certified_Product_List_CPL_1", "Brand");
			        WaitForElement(300, "Certified_Product_List_CPL_1", "RefrigeratorBrandName");
			        scrollToElement("Certified_Product_List_CPL_1", "RefrigeratorBrandName");
			        clickWebelement("Certified_Product_List_CPL_1", "RefrigeratorBrandName");
			        threadWait(2000);
			        //explicitWait(300, "Certified_Product_List_CPL_1", "Model");
			        clickWebelement("Certified_Product_List_CPL_1", "Model");
			        WaitForElement(300, "Certified_Product_List_CPL_1", "RefrigeratorModelNumber");
			        scrollToElement("Certified_Product_List_CPL_1", "RefrigeratorModelNumber");
			        clickWebelement("Certified_Product_List_CPL_1", "RefrigeratorModelNumber");
			        threadWait(2000);
			        VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "EquipedInformation_CEE_Refrigerator_Mobile_Application_AdditionalModelNumberVariations", "ESG Values","CPL_1", 7, 1);
			        VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "EquipedInformation_CEE_Refrigerator_Mobile_Application_Configuration", "ESG Values","CPL_1", 8, 1);
			        VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "EquipedInformation_CEE_Refrigerator_Mobile_Application_DefrostType", "ESG Values","CPL_1", 9, 1);
			        VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "EquipedInformation_CEE_Refrigerator_Mobile_Application_Compact", "ESG Values","CPL_1", 10, 1);
			        VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "EquipedInformation_CEE_Refrigerator_Mobile_Application_ThroughTheDoorDispenser", "ESG Values","CPL_1", 11, 1);
			        VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "EquipedInformation_CEE_Refrigerator_Mobile_Application_AutomaticIceMaker", "ESG Values","CPL_1", 12, 1);
			        VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "EquipedInformation_CEE_Refrigerator_Mobile_Application_Volume(cu.ft)", "ESG Values","CPL_1", 13, 1);
			        VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "EquipedInformation_CEE_Refrigerator_Mobile_Application_AdjustedVolume", "ESG Values","CPL_1", 14, 1);
			        VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "EquipedInformation_CEE_Refrigerator_Mobile_Application_kWh/year", "ESG Values","CPL_1", 15, 1);
			        VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "EquipedInformation_CEE_Refrigerator_Mobile_Application_FederalStandard", "ESG Values","CPL_1", 16, 1);
			        VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "EquipedInformation_CEE_Refrigerator_Mobile_Application_MeasuredFederalStandard", "ESG Values","CPL_1", 17, 1);
			        VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "EquipedInformation_CEE_Refrigerator_Mobile_Application_PercentBetterThanMeasured", "ESG Values","CPL_1", 18, 1);
			        VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "EquipedInformation_CEE_Refrigerator_Mobile_Application_CEETier", "ESG Values","CPL_1", 19, 1);
			        clickWebelement("Certified_Product_List_CPL_1", "NextButtonMobileApplication");
			        
			   //Page 2
			        
			        WaitForElement(300, "Certified_Product_List_CPL_1", "AcceptButton");
			        clickWebelement("Certified_Product_List_CPL_1", "AcceptButton");
			        
			   //Page 3
			        
			        clickWebelement("Certified_Product_List_CPL_1", "Name_MobileApplication");
			        enterTextboxValue("Certified_Product_List_CPL_1", "Name_MobileApplication", "ESG Values","CPL_1", 73, 1);
			        clickWebelement("Certified_Product_List_CPL_1", "Account_MobileApplication");
			        enterTextboxValue("Certified_Product_List_CPL_1", "Account_MobileApplication", "ESG Values","CPL_1", 74, 1);
			        clickWebelement("Certified_Product_List_CPL_1", "Email_MobileApplication");
			        enterTextboxValue("Certified_Product_List_CPL_1", "Email_MobileApplication", "ESG Values","CPL_1", 75, 1);
			        clickWebelement("Certified_Product_List_CPL_1", "Phone_MobileApplication");
			        enterTextboxValue("Certified_Product_List_CPL_1", "Phone_MobileApplication", "ESG Values","CPL_1", 76, 1);
			        WaitForElement(300, "Certified_Product_List_CPL_1", "SubmitButtonMobileApplication");
			        clickWebelement("Certified_Product_List_CPL_1", "SubmitButtonMobileApplication");
			      
			   //Page 4 Confirmation
					explicitWait(300, "Certified_Product_List_CPL_1", "ConfirmationNumber_MobileApplication");
					TrackEnrollmentNumber("Certified_Product_List_CPL_1", "ConfirmationNumber_MobileApplication", "ESG Values", "CPL_1", 77, 1);
					
		   }
			    
			public static void EECPApplicationRefrigerator_MobileApplication() {
						
				//Login to EECP Application
					login("helper", "BaseURL", 1, 0, 1, 1);
					ClickByActionClass("Certified_Product_List_CPL_1", "MainMenu", "ESG Values", "CPL_1", 78, 1);
					WaitForElement(300, "Certified_Product_List_CPL_1", "Enrollment_Number");
					enterTextboxValue("Certified_Product_List_CPL_1", "Enrollment_Number", "ESG Values", "CPL_1", 77, 1);
					WaitForElement(300, "Certified_Product_List_CPL_1", "Enrollment_Search");
					scrollToElement("Certified_Product_List_CPL_1", "Enrollment_Search");
					threadWait(2000);
					clickWebelement("Certified_Product_List_CPL_1", "Enrollment_Search");
					threadWait(5000);
					clickWebelement("Certified_Product_List_CPL_1", "Enrollment_EnrollmentSelection");
					WaitForElement(300, "Certified_Product_List_CPL_1", "Enrollment_Application_Click");
					clickWebelement("Certified_Product_List_CPL_1", "Enrollment_Application_Click");
					selectMeasures();   
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_Brand", "ESG Values","CPL_1", 25, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_ModelNumber", "ESG Values","CPL_1", 26, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_AdditionalModelNumberVariations", "ESG Values","CPL_1", 7, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_Configuration", "ESG Values","CPL_1", 8, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_DefrostType", "ESG Values","CPL_1", 9, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_Compact", "ESG Values","CPL_1", 10, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_ThroughTheDoorDispenser", "ESG Values","CPL_1", 11, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_AutomaticIceMaker", "ESG Values","CPL_1", 12, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_Volume", "ESG Values","CPL_1", 13, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_AjustedVolume", "ESG Values","CPL_1", 14, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_Kwh/year", "ESG Values","CPL_1", 15, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_FederalStandard", "ESG Values","CPL_1", 16, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_MeasuredFederal", "ESG Values","CPL_1", 17, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_PercentageBetterThanMeasuredFederalStandard", "ESG Values","CPL_1", 18, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_CeeTire", "ESG Values","CPL_1", 19, 1);
					GreenTickMarkValidation();  
			      
		   }
			
		   public static void DishwasherMobileApplicationURL() {
				
				//open online application
					OpenBrowser("Certified_Product_List_CPL_1", "DishwasherMobileApplication");
				}
			
		   public static void DishwasherMobileApplication() {
			   
			    //Page 1
			   
			        clickWebelement("Certified_Product_List_CPL_1", "Brand");
			        WaitForElement(300, "Certified_Product_List_CPL_1", "DishwasherBrandName");
			        scrollToElement("Certified_Product_List_CPL_1", "DishwasherBrandName");
			        clickWebelement("Certified_Product_List_CPL_1", "DishwasherBrandName");
			        threadWait(2000);
			        //explicitWait(300, "Certified_Product_List_CPL_1", "Model");
			        clickWebelement("Certified_Product_List_CPL_1", "Model");
			        WaitForElement(300, "Certified_Product_List_CPL_1", "DishwasherModelNumber");
			        scrollToElement("Certified_Product_List_CPL_1", "DishwasherModelNumber");
			        clickWebelement("Certified_Product_List_CPL_1", "DishwasherModelNumber");
			        threadWait(2000);
			        VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "EquipedInformation_CEE_Dishwasher_Mobile_Application_EnergyUse(kWh/year)", "ESG Values","CPL_1", 35, 1);
			        VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "EquipedInformation_CEE_Dishwasher_Mobile_Application_WaterUse(gallons/cycle)", "ESG Values","CPL_1", 36, 1);
			        VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "EquipedInformation_CEE_Dishwasher_Mobile_Application_Capacity", "ESG Values","CPL_1", 37, 1);
			        VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "EquipedInformation_CEE_Dishwasher_Mobile_Application_CEETier", "ESG Values","CPL_1", 38, 1);
			        clickWebelement("Certified_Product_List_CPL_1", "NextButtonMobileApplication");
			        
		       //Page 2
			        
			        WaitForElement(300, "Certified_Product_List_CPL_1", "AcceptButton");
			        clickWebelement("Certified_Product_List_CPL_1", "AcceptButton");
			        
			   //Page 3
			        
			        clickWebelement("Certified_Product_List_CPL_1", "Name_MobileApplication");
			        enterTextboxValue("Certified_Product_List_CPL_1", "Name_MobileApplication", "ESG Values","CPL_1", 83, 1);
			        clickWebelement("Certified_Product_List_CPL_1", "Account_MobileApplication");
			        enterTextboxValue("Certified_Product_List_CPL_1", "Account_MobileApplication", "ESG Values","CPL_1", 84, 1);
			        clickWebelement("Certified_Product_List_CPL_1", "Email_MobileApplication");
			        enterTextboxValue("Certified_Product_List_CPL_1", "Email_MobileApplication", "ESG Values","CPL_1", 85, 1);
			        clickWebelement("Certified_Product_List_CPL_1", "Phone_MobileApplication");
			        enterTextboxValue("Certified_Product_List_CPL_1", "Phone_MobileApplication", "ESG Values","CPL_1", 86, 1);
			        WaitForElement(300, "Certified_Product_List_CPL_1", "SubmitButtonMobileApplication");
			        clickWebelement("Certified_Product_List_CPL_1", "SubmitButtonMobileApplication");    
			        
			    //Page 4 Confirmation
					explicitWait(300, "Certified_Product_List_CPL_1", "ConfirmationNumber_MobileApplication");
					TrackEnrollmentNumber("Certified_Product_List_CPL_1", "ConfirmationNumber_MobileApplication", "ESG Values", "CPL_1", 87, 1);
					   
		   }    
			 
		   public static void EECPApplicationDishwasher_MobileApplication() {
				
				//Login to EECP Application
					login("helper", "BaseURL", 1, 0, 1, 1);
					ClickByActionClass("Certified_Product_List_CPL_1", "MainMenu", "ESG Values", "CPL_1", 88, 1);
					WaitForElement(300, "Certified_Product_List_CPL_1", "Enrollment_Number");
					enterTextboxValue("Certified_Product_List_CPL_1", "Enrollment_Number", "ESG Values", "CPL_1", 87, 1);
					WaitForElement(300, "Certified_Product_List_CPL_1", "Enrollment_Search");
					clickWebelement("Certified_Product_List_CPL_1", "Enrollment_Search");
					threadWait(5000);
					clickWebelement("Certified_Product_List_CPL_1", "Enrollment_EnrollmentSelection");
					WaitForElement(300, "Certified_Product_List_CPL_1", "Enrollment_Application_Click");
					clickWebelement("Certified_Product_List_CPL_1", "Enrollment_Application_Click");
					selectMeasures();   
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_Brand", "ESG Values","CPL_1", 44, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_ModelNumber", "ESG Values","CPL_1", 45, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_EnergyUse(kWh/year)", "ESG Values","CPL_1", 35, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_WaterUse(gallons/cycle)", "ESG Values","CPL_1", 36, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_Capacity", "ESG Values","CPL_1", 37, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_CEETier", "ESG Values","CPL_1", 38, 1);
				 	GreenTickMarkValidation();        
		}
		   
		   public static void ClotheswasherMobileApplicationURL() {
				
				//open online application
					OpenBrowser("Certified_Product_List_CPL_1", "ClotheswasherMobileApplication");
				} 
		   
		   public static void ClotheswasherMobileApplication() {
			   
			    //Page 1
			   
			        clickWebelement("Certified_Product_List_CPL_1", "Brand");
			        WaitForElement(300, "Certified_Product_List_CPL_1", "ClotheswasherBrandName");
			        scrollToElement("Certified_Product_List_CPL_1", "ClotheswasherBrandName");
			        clickWebelement("Certified_Product_List_CPL_1", "ClotheswasherBrandName");
			        threadWait(2000);
			        //explicitWait(300, "Certified_Product_List_CPL_1", "Model");
			        clickWebelement("Certified_Product_List_CPL_1", "Model");
			        WaitForElement(300, "Certified_Product_List_CPL_1", "ClotheswasherModelNumber");
			        scrollToElement("Certified_Product_List_CPL_1", "ClotheswasherModelNumber");
			        clickWebelement("Certified_Product_List_CPL_1", "ClotheswasherModelNumber");
			        threadWait(2000);
		            VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "EquipedInformation_CEE_Clotheswasher_Mobile_Application_IntegratedModifiedEnergyFactor", "ESG Values","CPL_1", 54, 1);
			        VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "EquipedInformation_CEE_Clotheswasher_Mobile_Application_IntegratedWaterFactor", "ESG Values","CPL_1", 55, 1);
			        VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "EquipedInformation_CEE_Clotheswasher_Mobile_Application_Volume(cu.ft)", "ESG Values","CPL_1", 56, 1);
			        VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "EquipedInformation_CEE_Clotheswasher_Mobile_Application_UsesSilverInTechnology", "ESG Values","CPL_1", 57, 1);	
			        VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "EquipedInformation_CEE_Clotheswasher_Mobile_Application_FrontOrTopLoading", "ESG Values","CPL_1", 58, 1);
			        VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "EquipedInformation_CEE_Clotheswasher_Mobile_Application_MeetsEnergystarConnectedVersion", "ESG Values","CPL_1", 59, 1);
			        VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "EquipedInformation_CEE_Clotheswasher_Mobile_Application_MeetsCEEConnectedCriteria", "ESG Values","CPL_1", 60, 1);
			        VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "EquipedInformation_CEE_Clotheswasher_Mobile_Application_CEETier", "ESG Values","CPL_1", 61, 1);
			        clickWebelement("Certified_Product_List_CPL_1", "NextButtonMobileApplication");
			        
			    //Page 2
			 	        
			        WaitForElement(300, "Certified_Product_List_CPL_1", "AcceptButton");
			 	    clickWebelement("Certified_Product_List_CPL_1", "AcceptButton");
			 	        
			    //Page 3
			 	        
			 	    clickWebelement("Certified_Product_List_CPL_1", "Name_MobileApplication");
			        enterTextboxValue("Certified_Product_List_CPL_1", "Name_MobileApplication", "ESG Values","CPL_1", 93, 1);
			        clickWebelement("Certified_Product_List_CPL_1", "Account_MobileApplication");
		 	        enterTextboxValue("Certified_Product_List_CPL_1", "Account_MobileApplication", "ESG Values","CPL_1", 94, 1);
		 	        clickWebelement("Certified_Product_List_CPL_1", "Email_MobileApplication");
			 	    enterTextboxValue("Certified_Product_List_CPL_1", "Email_MobileApplication", "ESG Values","CPL_1", 95, 1);
			        clickWebelement("Certified_Product_List_CPL_1", "Phone_MobileApplication");
		 	        enterTextboxValue("Certified_Product_List_CPL_1", "Phone_MobileApplication", "ESG Values","CPL_1", 96, 1);
		 	        explicitWait(300, "Certified_Product_List_CPL_1", "SubmitButtonMobileApplication");
			 	    clickWebelement("Certified_Product_List_CPL_1", "SubmitButtonMobileApplication");    
			   
			 	//Page 4 Confirmation
					explicitWait(300, "Certified_Product_List_CPL_1", "ConfirmationNumber_MobileApplication");
					TrackEnrollmentNumber("Certified_Product_List_CPL_1", "ConfirmationNumber_MobileApplication", "ESG Values", "CPL_1", 97, 1);
					
		   }	
		   public static void EECPApplicationClotheswasher_MobileApplication() {
				
				//Login to EECP Application
					login("helper", "BaseURL", 1, 0, 1, 1);
					ClickByActionClass("Certified_Product_List_CPL_1", "MainMenu", "ESG Values", "CPL_1", 98, 1);
					WaitForElement(300, "Certified_Product_List_CPL_1", "Enrollment_Number");
					enterTextboxValue("Certified_Product_List_CPL_1", "Enrollment_Number", "ESG Values", "CPL_1", 97, 1);
					WaitForElement(300, "Certified_Product_List_CPL_1", "Enrollment_Search");
					clickWebelement("Certified_Product_List_CPL_1", "Enrollment_Search");
					threadWait(5000);
					clickWebelement("Certified_Product_List_CPL_1", "Enrollment_EnrollmentSelection");
					WaitForElement(300, "Certified_Product_List_CPL_1", "Enrollment_Application_Click");
					clickWebelement("Certified_Product_List_CPL_1", "Enrollment_Application_Click");
					selectMeasures();   
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_Brand", "ESG Values","CPL_1", 67, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_ModelNumber", "ESG Values","CPL_1", 68, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_IntegratedModifiedEnergyFactor", "ESG Values","CPL_1", 54, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_IntegratedWaterFactor", "ESG Values","CPL_1", 55, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_Volume(cu.ft)", "ESG Values","CPL_1", 56, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_UsesSilverInTechnology", "ESG Values","CPL_1", 57, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_FrontOrTopLoading", "ESG Values","CPL_1", 58, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_MeetsEnergyStarConnectedVersion", "ESG Values","CPL_1", 59, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_MeetsCEEConnectedCriteria", "ESG Values","CPL_1", 60, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_CEETier", "ESG Values","CPL_1", 61, 1);
				 	GreenTickMarkValidation();		
					
		   }
		   
		   public static void CEERefrigeratorBackendEnrollment() {
			   
			 //Login to EECP Application
				login("helper", "BaseURL", 1, 0, 1, 1);
				ClickByActionClass("Certified_Product_List_CPL_1", "MainMenu", "ESG Values", "CPL_1", 101, 1);
				WaitForElement(300, "Certified_Product_List_CPL_1", "NewButton");
				clickWebelement("Certified_Product_List_CPL_1", "NewButton");
				selectDropdown("Certified_Product_List_CPL_1", "SelectProgram","", "ESG Values", "CPL_1", 102, 1);
				WaitForElement(5000, "Certified_Product_List_CPL_1", "NextButtonBackendEnrollment");
				clickWebelement("Certified_Product_List_CPL_1", "NextButtonBackendEnrollment");
				WaitForElement(300, "Certified_Product_List_CPL_1", "GeneralSearchNumber");
				clickWebelement("Certified_Product_List_CPL_1", "GeneralSearchNumber");
				enterTextboxValue("Certified_Product_List_CPL_1", "GeneralSearchNumber", "ESG Values", "CPL_1", 103, 1);
				WaitForElement(300, "Certified_Product_List_CPL_1", "GoButton");
				clickWebelement("Certified_Product_List_CPL_1", "GoButton");
				WaitForElement(300, "Certified_Product_List_CPL_1", "Customer");
				clickWebelement("Certified_Product_List_CPL_1", "Customer");
				WaitForElement(2000, "Certified_Product_List_CPL_1", "NextButtonBackendEnrollment");
				clickWebelement("Certified_Product_List_CPL_1", "NextButtonBackendEnrollment");
				selectMeasures();
				threadWait(5000);
				
			//New Measure
				clickWebelement("Certified_Product_List_CPL_1", "AddMeasure");
				WaitForElement(300, "Certified_Product_List_CPL_1", "RefrigeratorCheckBox");
				clickWebelement("Certified_Product_List_CPL_1", "RefrigeratorCheckBox");
				clickWebelement("Certified_Product_List_CPL_1", "SavebuttonBackendEnrollment");
				threadWait(300);
				clickWebelement("Certified_Product_List_CPL_1", "MeasureActivate");
				threadWait(5000);
				enterTextboxValue("Certified_Product_List_CPL_1", "Quantity", "ESG Values", "CPL_1", 104, 1);
				WaitForElement(300, "Certified_Product_List_CPL_1", "BrandNameBackendEnrollment");
				clickWebelement("Certified_Product_List_CPL_1", "BrandNameBackendEnrollment");
				enterTextboxValue("Certified_Product_List_CPL_1", "BrandNameBackendEnrollment", "ESG Values", "CPL_1", 105, 1);
				threadWait(5000);
				Enter(KeyEvent.VK_DOWN);	
				threadWait(300);
				Enter(KeyEvent.VK_DOWN);
				threadWait(300);
				Enter(KeyEvent.VK_ENTER);
				WaitForElement(300, "Certified_Product_List_CPL_1", "ModelNumberBackendEnrollment");
				clickWebelement("Certified_Product_List_CPL_1", "ModelNumberBackendEnrollment");
				enterTextboxValue("Certified_Product_List_CPL_1", "ModelNumberBackendEnrollment", "ESG Values", "CPL_1", 106, 1);
				threadWait(2000);
				Enter(KeyEvent.VK_DOWN);
				Enter(KeyEvent.VK_ENTER);
				threadWait(2000);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_AdditionalModelNumberVariations", "ESG Values","CPL_1", 7, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_Configuration", "ESG Values","CPL_1", 8, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_DefrostType", "ESG Values","CPL_1", 9, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_Compact", "ESG Values","CPL_1", 10, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_ThroughTheDoorDispenser", "ESG Values","CPL_1", 11, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_AutomaticIceMaker", "ESG Values","CPL_1", 12, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_Volume", "ESG Values","CPL_1", 13, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_AjustedVolume", "ESG Values","CPL_1", 14, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_Kwh/year", "ESG Values","CPL_1", 15, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_FederalStandard", "ESG Values","CPL_1", 16, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_MeasuredFederal", "ESG Values","CPL_1", 17, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_PercentageBetterThanMeasuredFederalStandard", "ESG Values","CPL_1", 18, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_CeeTire", "ESG Values","CPL_1", 19, 1);
				GreenTickMarkValidation();
				HandleErrorCodeOnProcess("helper", "ProcessButton", "");
				//clickonProcess();
				WaitForElement(300, "Certified_Product_List_CPL_1", "Enrollment_Application_Click");
				clickWebelement("Certified_Product_List_CPL_1", "Enrollment_Application_Click");
				selectMeasures();
				
			//Application Measure verification
				
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_Brand", "ESG Values","CPL_1", 25, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_ModelNumber", "ESG Values","CPL_1", 26, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_AdditionalModelNumberVariations", "ESG Values","CPL_1", 7, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_Configuration", "ESG Values","CPL_1", 8, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_DefrostType", "ESG Values","CPL_1", 9, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_Compact", "ESG Values","CPL_1", 10, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_ThroughTheDoorDispenser", "ESG Values","CPL_1", 11, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_AutomaticIceMaker", "ESG Values","CPL_1", 12, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_Volume", "ESG Values","CPL_1", 13, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_AjustedVolume", "ESG Values","CPL_1", 14, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_Kwh/year", "ESG Values","CPL_1", 15, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_FederalStandard", "ESG Values","CPL_1", 16, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_MeasuredFederal", "ESG Values","CPL_1", 17, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_PercentageBetterThanMeasuredFederalStandard", "ESG Values","CPL_1", 18, 1);
				VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Refrigerator_CeeTire", "ESG Values","CPL_1", 19, 1);
				GreenTickMarkValidation();
					
			}
				
		   public static void CEEDishwasherBackendEnrollment() {
			   
				 //Login to EECP Application
					login("helper", "BaseURL", 1, 0, 1, 1);
					ClickByActionClass("Certified_Product_List_CPL_1", "MainMenu", "ESG Values", "CPL_1", 109, 1);
					WaitForElement(300, "Certified_Product_List_CPL_1", "NewButton");
					clickWebelement("Certified_Product_List_CPL_1", "NewButton");
					selectDropdown("Certified_Product_List_CPL_1", "SelectProgram","", "ESG Values", "CPL_1", 110, 1);
					WaitForElement(5000, "Certified_Product_List_CPL_1", "NextButtonBackendEnrollment");
					clickWebelement("Certified_Product_List_CPL_1", "NextButtonBackendEnrollment");
					WaitForElement(300, "Certified_Product_List_CPL_1", "GeneralSearchNumber");
					clickWebelement("Certified_Product_List_CPL_1", "GeneralSearchNumber");
					enterTextboxValue("Certified_Product_List_CPL_1", "GeneralSearchNumber", "ESG Values", "CPL_1", 111, 1);
					WaitForElement(300, "Certified_Product_List_CPL_1", "GoButton");
					clickWebelement("Certified_Product_List_CPL_1", "GoButton");
					WaitForElement(300, "Certified_Product_List_CPL_1", "Customer");
					clickWebelement("Certified_Product_List_CPL_1", "Customer");
					WaitForElement(2000, "Certified_Product_List_CPL_1", "NextButtonBackendEnrollment");
					clickWebelement("Certified_Product_List_CPL_1", "NextButtonBackendEnrollment");
					selectMeasures();
					threadWait(5000);
				
			     //New Measure
					clickWebelement("Certified_Product_List_CPL_1", "AddMeasure");
					WaitForElement(300, "Certified_Product_List_CPL_1", "DishwasherCheckBox");
					clickWebelement("Certified_Product_List_CPL_1", "DishwasherCheckBox");
					clickWebelement("Certified_Product_List_CPL_1", "SavebuttonBackendEnrollment");
					threadWait(5000);
					clickWebelement("Certified_Product_List_CPL_1", "MeasureActivate");
					threadWait(300);
					enterTextboxValue("Certified_Product_List_CPL_1", "Quantity", "ESG Values", "CPL_1", 112, 1);
					WaitForElement(300, "Certified_Product_List_CPL_1", "BrandNameBackendEnrollment");
					clickWebelement("Certified_Product_List_CPL_1", "BrandNameBackendEnrollment");
					enterTextboxValue("Certified_Product_List_CPL_1", "BrandNameBackendEnrollment", "ESG Values", "CPL_1", 113, 1);
					threadWait(2000);
					Enter(KeyEvent.VK_DOWN);
					threadWait(2000);
					Enter(KeyEvent.VK_ENTER);
					WaitForElement(300, "Certified_Product_List_CPL_1", "ModelNumberBackendEnrollment");
					clickWebelement("Certified_Product_List_CPL_1", "ModelNumberBackendEnrollment");
					enterTextboxValue("Certified_Product_List_CPL_1", "ModelNumberBackendEnrollment", "ESG Values", "CPL_1", 114, 1);
					threadWait(2000);
					Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);
					threadWait(5000);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_EnergyUse(kWh/year)", "ESG Values","CPL_1", 35, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_WaterUse(gallons/cycle)", "ESG Values","CPL_1", 36, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_Capacity", "ESG Values","CPL_1", 37, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_CEETier", "ESG Values","CPL_1", 38, 1);
				 	GreenTickMarkValidation();
				 	HandleErrorCodeOnProcess("helper", "ProcessButton", "");
				 	//clickonProcess();
				 	WaitForElement(300, "Certified_Product_List_CPL_1", "Enrollment_Application_Click");
					clickWebelement("Certified_Product_List_CPL_1", "Enrollment_Application_Click");
					selectMeasures();
					
				//Measure verification
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_Brand", "ESG Values","CPL_1", 44, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_ModelNumber", "ESG Values","CPL_1", 45, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_EnergyUse(kWh/year)", "ESG Values","CPL_1", 35, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_WaterUse(gallons/cycle)", "ESG Values","CPL_1", 36, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_Capacity", "ESG Values","CPL_1", 37, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Dishwasher_CEETier", "ESG Values","CPL_1", 38, 1);
				 	GreenTickMarkValidation();
		   }  
		   
		   public static void CEEClotheswasherBackendEnrollment() {
			   
				 //Login to EECP Application
					login("helper", "BaseURL", 1, 0, 1, 1);
					threadWait(300);
					ClickByActionClass("Certified_Product_List_CPL_1", "MainMenu", "ESG Values", "CPL_1", 117, 1);
					WaitForElement(300, "Certified_Product_List_CPL_1", "NewButton");
					clickWebelement("Certified_Product_List_CPL_1", "NewButton");
					selectDropdown("Certified_Product_List_CPL_1", "SelectProgram","", "ESG Values", "CPL_1", 118, 1);
					WaitForElement(5000, "Certified_Product_List_CPL_1", "NextButtonBackendEnrollment");
					clickWebelement("Certified_Product_List_CPL_1", "NextButtonBackendEnrollment");
					WaitForElement(300, "Certified_Product_List_CPL_1", "GeneralSearchNumber");
					clickWebelement("Certified_Product_List_CPL_1", "GeneralSearchNumber");
					enterTextboxValue("Certified_Product_List_CPL_1", "GeneralSearchNumber", "ESG Values", "CPL_1", 119, 1);
					WaitForElement(300, "Certified_Product_List_CPL_1", "GoButton");
					clickWebelement("Certified_Product_List_CPL_1", "GoButton");
					WaitForElement(300, "Certified_Product_List_CPL_1", "Customer");
					clickWebelement("Certified_Product_List_CPL_1", "Customer");
					WaitForElement(2000, "Certified_Product_List_CPL_1", "NextButtonBackendEnrollment");
					clickWebelement("Certified_Product_List_CPL_1", "NextButtonBackendEnrollment");
					selectMeasures();
					threadWait(5000);
				
			     //New Measure
					clickWebelement("Certified_Product_List_CPL_1", "AddMeasure");
					WaitForElement(300, "Certified_Product_List_CPL_1", "ClotheswasherCheckBox");
					clickWebelement("Certified_Product_List_CPL_1", "ClotheswasherCheckBox");
					clickWebelement("Certified_Product_List_CPL_1", "SavebuttonBackendEnrollment");
					threadWait(300);
					clickWebelement("Certified_Product_List_CPL_1", "MeasureActivate");
					threadWait(300);
					enterTextboxValue("Certified_Product_List_CPL_1", "Quantity", "ESG Values", "CPL_1", 120, 1);
					WaitForElement(300, "Certified_Product_List_CPL_1", "BrandNameBackendEnrollment");
					clickWebelement("Certified_Product_List_CPL_1", "BrandNameBackendEnrollment");
					enterTextboxValue("Certified_Product_List_CPL_1", "BrandNameBackendEnrollment", "ESG Values", "CPL_1", 121, 1);
					threadWait(2000);
					Enter(KeyEvent.VK_DOWN);
					threadWait(2000);
					Enter(KeyEvent.VK_ENTER);
					WaitForElement(300, "Certified_Product_List_CPL_1", "ModelNumberBackendEnrollment");
					clickWebelement("Certified_Product_List_CPL_1", "ModelNumberBackendEnrollment");
					enterTextboxValue("Certified_Product_List_CPL_1", "ModelNumberBackendEnrollment", "ESG Values", "CPL_1", 122, 1);
					threadWait(2000);
					Enter(KeyEvent.VK_DOWN);
					Enter(KeyEvent.VK_ENTER);
					threadWait(2000);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_IntegratedModifiedEnergyFactor", "ESG Values","CPL_1", 54, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_IntegratedWaterFactor", "ESG Values","CPL_1", 55, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_Volume(cu.ft)", "ESG Values","CPL_1", 56, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_UsesSilverInTechnology", "ESG Values","CPL_1", 57, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_FrontOrTopLoading", "ESG Values","CPL_1", 58, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_MeetsEnergyStarConnectedVersion", "ESG Values","CPL_1", 59, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_MeetsCEEConnectedCriteria", "ESG Values","CPL_1", 60, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_CEETier", "ESG Values","CPL_1", 61, 1);
				 	GreenTickMarkValidation();
				 	HandleErrorCodeOnProcess("helper", "ProcessButton", "");
				 	//clickonProcess();
				 	WaitForElement(300, "Certified_Product_List_CPL_1", "Enrollment_Application_Click");
					clickWebelement("Certified_Product_List_CPL_1", "Enrollment_Application_Click");
					selectMeasures();
					
				//Measure verification
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_Brand", "ESG Values","CPL_1", 67, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_ModelNumber", "ESG Values","CPL_1", 68, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_IntegratedModifiedEnergyFactor", "ESG Values","CPL_1", 54, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_IntegratedWaterFactor", "ESG Values","CPL_1", 55, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_Volume(cu.ft)", "ESG Values","CPL_1", 56, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_UsesSilverInTechnology", "ESG Values","CPL_1", 57, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_FrontOrTopLoading", "ESG Values","CPL_1", 58, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_MeetsEnergyStarConnectedVersion", "ESG Values","CPL_1", 59, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_MeetsCEEConnectedCriteria", "ESG Values","CPL_1", 60, 1);
				 	VerifyElementForExistingValueWithText("Certified_Product_List_CPL_1", "Application_Measure_CEE_Clotheswasher_CEETier", "ESG Values","CPL_1", 61, 1);
				 	GreenTickMarkValidation();
					

						
			   }	
			   

			   
//**************************************************************************************************************************************************************************************************************************************************
			 //****************************************************CPL Energy Star Ceiling Fan*****************************************************************************
				
				public static void Step1_Complete_GettingStarted_EnergyStar_CeilingFan() {
					// Complete Getting Started - EnergyStar CeilingFan Step-1
					Pass_Message("Complete Getting Started - EnergyStar CeilingFan Step-1");

					clickWebelement("Certified_Product_List_CPL", "AccountHolder");
					clickWebelement("Certified_Product_List_CPL", "GettingStarted_AccountNumber");
					enterTextboxValue("Certified_Product_List_CPL", "GettingStarted_AccountNumber", "CPL", "CPL_Energy_Star_CeilingFan", 4, 1);
					threadWait(2000);
					Enter(KeyEvent.VK_TAB);
					enterTextboxValue("Certified_Product_List_CPL", "GettingStarted_ZIP_or_PostalCode", "CPL", "CPL_Energy_Star_CeilingFan", 5, 1);
					
					clickWebelement("Certified_Product_List_CPL", "NextButton");
					defineLogs("Customer Information", "Customer Information", "Customer Information",
							"Navigate to Customer Information Successfully", "Unable to Navigate to Customer Information",
							"Certified_Product_List_CPL", "VerifyCustomerInformation");
				}

				public static void Step2_Complete_CustomerInformation_EnergyStar_CeilingFan() {
					// Complete Customer Information - EnergyStar CeilingFan Step-2
					Pass_Message("Complete Customer Information - EnergyStar CeilingFan Step-2");

					clickWebelement("Certified_Product_List_CPL", "NextButton");
					defineLogs("Equipment Information", "Equipment Information", "Equipment Information",
							"Navigate to Equipment Information Successfully", "Unable to Navigate to Equipment Information",
							"Certified_Product_List_CPL", "VerifyEquipmentInformation");
				}
				
				public static void Step3_Complete_EquipmentInformation_EnergyStar_CeilingFan() {
					WaitForElement(30, "Certified_Product_List_CPL", "AddEquipment");
					ClickWebelementByActionClass("Certified_Product_List_CPL", "AddEquipment");

					clickWebelement("Certified_Product_List_CPL", "Select_CPL_EnergyStar_Ceiling_Fan");
					clickWebelement("Certified_Product_List_CPL", "Add_Quantity_for_CPL_EnergyStar_Ceiling_Fan");
					Clear("Certified_Product_List_CPL", "Add_Quantity_for_CPL_EnergyStar_Ceiling_Fan");
					enterTextboxValue("Certified_Product_List_CPL", "Add_Quantity_for_CPL_EnergyStar_Ceiling_Fan", "CPL", "CPL_Energy_Star_CeilingFan", 34, 1);
					clickWebelement("Certified_Product_List_CPL", "Equipment_Information_OkButton");

					// Enter Value for CPL: Energy Star - Ceiling Fan - Residential
					Pass_Message("Enter Value for CPL: Energy Star - Ceiling Fan - Residential Step-3");
					enterTextboxValue("Certified_Product_List_CPL", "Equipment_Information_EnergyStar_CeilingFan_Quantity", "CPL", "CPL_Energy_Star_CeilingFan", 34, 1);
					selectDropdown("Certified_Product_List_CPL", "Equipment_Information_EnergyStar_CeilingFan_BrandName","", "CPL", "CPL_Energy_Star_CeilingFan", 35, 1);
					WaitForElement(30, "Certified_Product_List_CPL", "Equipment_Information_EnergyStar_CeilingFan_ModelNumber");
					selectDropdown("Certified_Product_List_CPL", "Equipment_Information_EnergyStar_CeilingFan_ModelNumber","", "CPL", "CPL_Energy_Star_CeilingFan", 36, 1);
					WaitForElement(30, "Certified_Product_List_CPL", "Equipment_Information_EnergyStar_CeilingFan_ProductType");
					selectDropdown("Certified_Product_List_CPL", "Equipment_Information_EnergyStar_CeilingFan_ProductType","", "CPL", "CPL_Energy_Star_CeilingFan", 37, 1);
					WaitForElement(30, "Certified_Product_List_CPL", "Equipment_Information_EnergyStar_CeilingFan_BladeSpan");
					selectDropdown("Certified_Product_List_CPL", "Equipment_Information_EnergyStar_CeilingFan_BladeSpan","", "CPL", "CPL_Energy_Star_CeilingFan", 38, 1);

					// Verify CPL: Energy Star - Ceiling Fan - Residential
					Pass_Message("Verify CPL: Energy Star - Ceiling Fan - Residential");
					
					threadWait(300);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_AdditionalModelInformation", "CPL", "CPL_Energy_Star_CeilingFan", 42, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_CBModelIdentifier", "CPL", "CPL_Energy_Star_CeilingFan", 43, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_CeilingFanComponentsWarranty", "CPL", "CPL_Energy_Star_CeilingFan", 44, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_CeilingFanEfficiency", "CPL", "CPL_Energy_Star_CeilingFan", 45,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_CeilingFanFeatures", "CPL", "CPL_Energy_Star_CeilingFan", 46,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_ConnectedFunctionality", "CPL", "CPL_Energy_Star_CeilingFan", 47, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_ConnectsUsing", "CPL", "CPL_Energy_Star_CeilingFan", 48, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_DateAvailableOnMarket", "CPL", "CPL_Energy_Star_CeilingFan", 49,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_DateCertified", "CPL", "CPL_Energy_Star_CeilingFan", 50,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_ENERGYSTARLampESUID", "CPL", "CPL_Energy_Star_CeilingFan", 51, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_ENERGYSTARLampPartner", "CPL", "CPL_Energy_Star_CeilingFan", 52, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_ENERGYSTARPartner", "CPL", "CPL_Energy_Star_CeilingFan", 53,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_ENERGYSTARUniqueID", "CPL", "CPL_Energy_Star_CeilingFan", 54,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_FanPowerConsumptionHighSpeed", "CPL", "CPL_Energy_Star_CeilingFan", 55, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_FanPowerConsumptionLowSpeed", "CPL", "CPL_Energy_Star_CeilingFan", 56, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_FanPowerConsumptionStandby", "CPL", "CPL_Energy_Star_CeilingFan", 57,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_IndoorOutdoor", "CPL", "CPL_Energy_Star_CeilingFan", 58,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_LampModelNumber", "CPL", "CPL_Energy_Star_CeilingFan", 59, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_LightColorAppearance", "CPL", "CPL_Energy_Star_CeilingFan", 60, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_LightColorQuality", "CPL", "CPL_Energy_Star_CeilingFan", 61,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_LightKitDimmability", "CPL", "CPL_Energy_Star_CeilingFan", 62,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_LightSourceConnectionBaseType", "CPL", "CPL_Energy_Star_CeilingFan", 63, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_LightSourceRatedLife", "CPL", "CPL_Energy_Star_CeilingFan", 64, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_LightSourceTechnology", "CPL", "CPL_Energy_Star_CeilingFan", 65,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_LightSourcesPerLightKit", "CPL", "CPL_Energy_Star_CeilingFan", 66,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_LightingEfficiencyMeasuredAtTheSource", "CPL", "CPL_Energy_Star_CeilingFan", 67, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_LightingEfficiencyMeasuredOutsideTheFixture", "CPL", "CPL_Energy_Star_CeilingFan", 68, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_Markets", "CPL", "CPL_Energy_Star_CeilingFan", 69,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_MeetsENERGYSTARMostEfficient2018Criteria", "CPL", "CPL_Energy_Star_CeilingFan", 70,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_ModelName", "CPL", "CPL_Energy_Star_CeilingFan", 71, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_PowerFactorOfLightKit", "CPL", "CPL_Energy_Star_CeilingFan", 72, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_ShippedWithENERGYSTARLamp", "CPL", "CPL_Energy_Star_CeilingFan", 73,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_SpecialLightingFeatures", "CPL", "CPL_Energy_Star_CeilingFan", 74,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_TotalLightOutput", "CPL", "CPL_Energy_Star_CeilingFan", 75, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_CeilingFan_TotalLightingInputPower", "CPL", "CPL_Energy_Star_CeilingFan", 76, 1);
					
					
					clickWebelement("Certified_Product_List_CPL", "NextButton");
					defineLogs("Review and Submit", "Review and Submit", "Review and Submit",
							"Navigate to Review and Submit Successfully", "Unable to Navigate to Review and Submit", "Certified_Product_List_CPL",
							"VerifyReviewAndSubmit");
				}
				
				public static void Step4_Complete_ReviewandSubmit_EnergyStar_CeilingFan() {
					
					clickWebelement("Certified_Product_List_CPL", "SubmitButton");
					explicitWait(300, "Certified_Product_List_CPL", "Confirmation_Number");
					
					TrackEnrollmentNumber("Certified_Product_List_CPL", "Confirmation_Number", "CPL","CPL_Energy_Star_CeilingFan", 3, 3);
					threadWait(2000);
				}

				public static void Verify_Enrollment_EnergyStar_CeilingFan() {
					login("Helper", "BaseURL", 1, 0, 1, 1);
					ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "CPL", "CPL_Energy_Star_CeilingFan", 6, 1);
					threadWait(2000);
					enterTextboxValue("Certified_Product_List_CPL", "EnterEnrollmentNo", "CPL", "CPL_Energy_Star_CeilingFan", 3, 3);
					threadWait(300);
					scrollToElement("Certified_Product_List_CPL", "SearchButton");
					clickWebelement("Certified_Product_List_CPL", "SearchButton");
					threadWait(7000);
					clickWebelement("Certified_Product_List_CPL", "EnrollmentLink");
					
				}
				
				public static void Verify_ApplicationWorkflowStep_EnergyStar_CeilingFan() {
					clickWebelement("Certified_Product_List_CPL", "ApplicationWorkflowStep");
					Verify_ApplicationWorkflowStep_Measures__EnergyStar_CeilingFan();
					HandleErrorCodeOnProcess("helper", "ProcessButton", "");
					//clickonProcess();
				}
				
				public static void Verify_ApplicationWorkflowStep_After_Process_EnergyStar_CeilingFan() {
					clickWebelement("Certified_Product_List_CPL", "ApplicationWorkflowStep");
					Verify_ApplicationWorkflowStep_Measures__EnergyStar_CeilingFan();
					clickWebelement("Certified_Product_List_CPL", "CloseButton");
				}

				public static void Verify_ApplicationWorkflowStep_Measures__EnergyStar_CeilingFan() {

					scrollToElement("Certified_Product_List_CPL", "Navigate_To_Measure_Tab");
					clickWebelement("Certified_Product_List_CPL", "Navigate_To_Measure_Tab");
					
					
					// Verify CPL: Energy Star-Ceiling Fan-Measure -Application Workflow Step
					Pass_Message("Verify CPL: Energy Star-Ceiling Fan-Measure -Application Workflow Step");

					threadWait(300);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BrandName", "CPL", "CPL_Energy_Star_CeilingFan", 35, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_ModelNumber", "CPL", "CPL_Energy_Star_CeilingFan", 36, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_ProductType", "CPL", "CPL_Energy_Star_CeilingFan", 37, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BladeSpan", "CPL", "CPL_Energy_Star_CeilingFan", 38,1);
					
					
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_AdditionalModelInformation", "CPL", "CPL_Energy_Star_CeilingFan", 42, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_CBModelIdentifier", "CPL", "CPL_Energy_Star_CeilingFan", 43, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_CeilingFanComponentsWarranty", "CPL", "CPL_Energy_Star_CeilingFan", 44, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_CeilingFanEfficiency", "CPL", "CPL_Energy_Star_CeilingFan", 45,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_CeilingFanFeatures", "CPL", "CPL_Energy_Star_CeilingFan", 46,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_ConnectedFunctionality", "CPL", "CPL_Energy_Star_CeilingFan", 47, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_ConnectsUsing", "CPL", "CPL_Energy_Star_CeilingFan", 48, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_DateAvailableOnMarket", "CPL", "CPL_Energy_Star_CeilingFan", 49,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_DateCertified", "CPL", "CPL_Energy_Star_CeilingFan", 50,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_ENERGYSTARLampESUID", "CPL", "CPL_Energy_Star_CeilingFan", 51, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_ENERGYSTARLampPartner", "CPL", "CPL_Energy_Star_CeilingFan", 52, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_ENERGYSTARPartner", "CPL", "CPL_Energy_Star_CeilingFan", 53,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_ENERGYSTARUniqueID", "CPL", "CPL_Energy_Star_CeilingFan", 54,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_FanPowerConsumptionHighSpeed", "CPL", "CPL_Energy_Star_CeilingFan", 55, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_FanPowerConsumptionLowSpeed", "CPL", "CPL_Energy_Star_CeilingFan", 56, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_FanPowerConsumptionStandby", "CPL", "CPL_Energy_Star_CeilingFan", 57,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_IndoorOutdoor", "CPL", "CPL_Energy_Star_CeilingFan", 58,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_LampModelNumber", "CPL", "CPL_Energy_Star_CeilingFan", 59, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_LightColorAppearance", "CPL", "CPL_Energy_Star_CeilingFan", 60, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_LightColorQuality", "CPL", "CPL_Energy_Star_CeilingFan", 61,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_LightKitDimmability", "CPL", "CPL_Energy_Star_CeilingFan", 62,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_LightSourceConnectionBaseType", "CPL", "CPL_Energy_Star_CeilingFan", 63, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_LightSourceRatedLife", "CPL", "CPL_Energy_Star_CeilingFan", 64, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_LightSourceTechnology", "CPL", "CPL_Energy_Star_CeilingFan", 65,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_LightSourcesPerLightKit", "CPL", "CPL_Energy_Star_CeilingFan", 66,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_LightingEfficiencyMeasuredAtTheSource", "CPL", "CPL_Energy_Star_CeilingFan", 67, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_LightingEfficiencyMeasuredOutsideTheFixture", "CPL", "CPL_Energy_Star_CeilingFan", 68, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_Markets", "CPL", "CPL_Energy_Star_CeilingFan", 69,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MeetsENERGYSTARMostEfficient2018Criteria", "CPL", "CPL_Energy_Star_CeilingFan", 70,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_ModelName", "CPL", "CPL_Energy_Star_CeilingFan", 71, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_PowerFactorOfLightKit", "CPL", "CPL_Energy_Star_CeilingFan", 72, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_ShippedWithENERGYSTARLamp", "CPL", "CPL_Energy_Star_CeilingFan", 73,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_SpecialLightingFeatures", "CPL", "CPL_Energy_Star_CeilingFan", 74,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_TotalLightOutput", "CPL", "CPL_Energy_Star_CeilingFan", 75, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_TotalLightingInputPower", "CPL", "CPL_Energy_Star_CeilingFan", 76, 1);
					
					if (Xpath("Certified_Product_List_CPL","Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BladeSpan_GreenCheckMark").isDisplayed()) {
						
						test.log(LogStatus.PASS, "Blade Span Green Check Mark verified Successfully");
						
					} else {
						
						test.log(LogStatus.FAIL, "Failed to verify Blade Span Green Check Mark");

					}
					
				}
				
		//****************************************************CPL Energy Star Clothes Washer*****************************************************************************
				
				public static void Step1_Complete_GettingStarted_EnergyStar_ClothesWasher() {
					// Complete Getting Started - EnergyStar ClothesWasher Step-1
					Pass_Message("Complete Getting Started - EnergyStar ClothesWasher Step-1");

					clickWebelement("Certified_Product_List_CPL", "AccountHolder");
					clickWebelement("Certified_Product_List_CPL", "GettingStarted_AccountNumber");
					enterTextboxValue("Certified_Product_List_CPL", "GettingStarted_AccountNumber", "CPL", "CPL_Energy_Star_ClothesWasher", 4, 1);
					Enter(KeyEvent.VK_TAB);
					enterTextboxValue("Certified_Product_List_CPL", "GettingStarted_ZIP_or_PostalCode", "CPL", "CPL_Energy_Star_ClothesWasher", 5, 1);

					clickWebelement("Certified_Product_List_CPL", "NextButton");
					defineLogs("Customer Information", "Customer Information", "Customer Information",
							"Navigate to Customer Information Successfully", "Unable to Navigate to Customer Information",
							"Certified_Product_List_CPL", "VerifyCustomerInformation");
				}

				public static void Step2_Complete_CustomerInformation_EnergyStar_ClothesWasher() {
					// Complete Customer Information - EnergyStar ClothesWasher Step-2
					Pass_Message("Complete Customer Information - EnergyStar ClothesWasher Step-2");

					clickWebelement("Certified_Product_List_CPL", "NextButton");
					defineLogs("Equipment Information", "Equipment Information", "Equipment Information",
							"Navigate to Equipment Information Successfully", "Unable to Navigate to Equipment Information",
							"Certified_Product_List_CPL", "VerifyEquipmentInformation");
				}
				
				public static void Step3_Complete_EquipmentInformation_EnergyStar_ClothesWasher() {
					WaitForElement(30, "Certified_Product_List_CPL", "AddEquipment");
					ClickWebelementByActionClass("Certified_Product_List_CPL", "AddEquipment");

					clickWebelement("Certified_Product_List_CPL", "Select_CPL_EnergyStar_ClothesWasher");
					clickWebelement("Certified_Product_List_CPL", "Add_Quantity_for_CPL_EnergyStar_ClothesWasher");
					Clear("Certified_Product_List_CPL", "Add_Quantity_for_CPL_EnergyStar_ClothesWasher");
					enterTextboxValue("Certified_Product_List_CPL", "Add_Quantity_for_CPL_EnergyStar_ClothesWasher", "CPL", "CPL_Energy_Star_ClothesWasher", 34, 1);
					clickWebelement("Certified_Product_List_CPL", "Equipment_Information_OkButton");

					// Enter Value for CPL: Energy Star - Clothes Washer - Residential
					Pass_Message("Enter Value for CPL: Energy Star - Clothes Washer - Residential Step-3");
					enterTextboxValue("Certified_Product_List_CPL", "Equipment_Information_EnergyStar_ClothesWasher_Quantity", "CPL", "CPL_Energy_Star_ClothesWasher", 34, 1);
					selectDropdown("Certified_Product_List_CPL", "Equipment_Information_EnergyStar_ClothesWasher_BrandName","", "CPL", "CPL_Energy_Star_ClothesWasher", 35, 1);
					WaitForElement(30, "Certified_Product_List_CPL", "Equipment_Information_EnergyStar_ClothesWasher_ModelNumber");
					selectDropdown("Certified_Product_List_CPL", "Equipment_Information_EnergyStar_ClothesWasher_ModelNumber","", "CPL", "CPL_Energy_Star_ClothesWasher", 36, 1);
					
					// Verify CPL: Energy Star - Clothes Washer - Residential
					Pass_Message("Verify CPL: Energy Star - Clothes Washer - Residential");
					
					threadWait(300);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesWasher_LoadConfiguration", "CPL", "CPL_Energy_Star_ClothesWasher", 42, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesWasher_AdditionalModelInformation", "CPL", "CPL_Energy_Star_ClothesWasher", 43, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesWasher_AdditionalWasherFeatures", "CPL", "CPL_Energy_Star_ClothesWasher", 44, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesWasher_AnnualEnergyUse", "CPL", "CPL_Energy_Star_ClothesWasher", 45,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesWasher_AnnualWaterUse", "CPL", "CPL_Energy_Star_ClothesWasher", 46,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesWasher_CommunicationStandardApplicationLayer", "CPL", "CPL_Energy_Star_ClothesWasher", 47, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesWasher_Connected", "CPL", "CPL_Energy_Star_ClothesWasher", 48, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesWasher_ConnectsUsing", "CPL", "CPL_Energy_Star_ClothesWasher", 49,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesWasher_DateAvailableOnMarket", "CPL", "CPL_Energy_Star_ClothesWasher", 50,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesWasher_DateCertified", "CPL", "CPL_Energy_Star_ClothesWasher", 51, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesWasher_DirectonPremisesOpenStandardBasedInterConnection", "CPL", "CPL_Energy_Star_ClothesWasher", 52, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesWasher_ENERGYSTARModelIdentifier", "CPL", "CPL_Energy_Star_ClothesWasher", 53,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesWasher_ENERGYSTARUniqueID", "CPL", "CPL_Energy_Star_ClothesWasher", 54,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesWasher_IntegratedModifiedEnergyFactor", "CPL", "CPL_Energy_Star_ClothesWasher", 55, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesWasher_IntegratedWaterFactor", "CPL", "CPL_Energy_Star_ClothesWasher", 56, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesWasher_IntendedMarket", "CPL", "CPL_Energy_Star_ClothesWasher", 57,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesWasher_Markets", "CPL", "CPL_Energy_Star_ClothesWasher", 58,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesWasher_MeetsENERGYSTARMostEfficient2018Criteria", "CPL", "CPL_Energy_Star_ClothesWasher", 59, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesWasher_PairedENERGYSTARClothesDryerAvailable", "CPL", "CPL_Energy_Star_ClothesWasher", 60, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesWasher_PairedENERGYSTARClothesDryerENERGYSTARModelIdentifier", "CPL", "CPL_Energy_Star_ClothesWasher", 61,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesWasher_UPC", "CPL", "CPL_Energy_Star_ClothesWasher", 62,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesWasher_USFederalStandard_IMEF", "CPL", "CPL_Energy_Star_ClothesWasher", 63, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesWasher_USFederalStandard_IWF", "CPL", "CPL_Energy_Star_ClothesWasher", 64, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesWasher_Volume", "CPL", "CPL_Energy_Star_ClothesWasher", 65,1);			
					
					clickWebelement("Certified_Product_List_CPL", "NextButton");
					defineLogs("Review and Submit", "Review and Submit", "Review and Submit",
							"Navigate to Review and Submit Successfully", "Unable to Navigate to Review and Submit", "Certified_Product_List_CPL",
							"VerifyReviewAndSubmit");
				}
				
				public static void Step4_Complete_ReviewandSubmit_EnergyStar_ClothesWasher() {
					
					clickWebelement("Certified_Product_List_CPL", "SubmitButton");
					explicitWait(300, "Certified_Product_List_CPL", "Confirmation_Number");
					TrackEnrollmentNumber("Certified_Product_List_CPL", "Confirmation_Number", "CPL","CPL_Energy_Star_ClothesWasher", 3, 3);
					threadWait(2000);
				}

				public static void Verify_Enrollment_EnergyStar_ClothesWasher() {
					login("Helper", "BaseURL", 2, 0, 2, 1);
					ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "CPL", "CPL_Energy_Star_ClothesWasher", 6, 1);
					threadWait(2000);
					enterTextboxValue("Certified_Product_List_CPL", "EnterEnrollmentNo", "CPL", "CPL_Energy_Star_ClothesWasher", 3, 3);
					threadWait(300);
					scrollToElement("Certified_Product_List_CPL", "SearchButton");
					clickWebelement("Certified_Product_List_CPL", "SearchButton");
					threadWait(7000);
					clickWebelement("Certified_Product_List_CPL", "EnrollmentLink");
					
				}
				
				public static void Verify_ApplicationWorkflowStep_EnergyStar_ClothesWasher() {
					clickWebelement("Certified_Product_List_CPL", "ApplicationWorkflowStep");
					Verify_ApplicationWorkflowStep_Measures__EnergyStar_ClothesWasher();
					HandleErrorCodeOnProcess("helper", "ProcessButton", "");
					//clickonProcess();
				}
				
				public static void Verify_ApplicationWorkflowStep_After_Process_EnergyStar_ClothesWasher() {
					clickWebelement("Certified_Product_List_CPL", "ApplicationWorkflowStep");
					Verify_ApplicationWorkflowStep_Measures__EnergyStar_ClothesWasher();
					clickWebelement("Certified_Product_List_CPL", "CloseButton");
				}

				public static void Verify_ApplicationWorkflowStep_Measures__EnergyStar_ClothesWasher() {

					scrollToElement("Certified_Product_List_CPL", "Navigate_To_Measure_Tab");
					clickWebelement("Certified_Product_List_CPL", "Navigate_To_Measure_Tab");
					
					
					// Verify CPL: Energy Star-Clothes Washer-Measure -Application Workflow Step
					Pass_Message("Verify CPL: Energy Star-Clothes Washer-Measure -Application Workflow Step");

					threadWait(300);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BrandName", "CPL", "CPL_Energy_Star_ClothesWasher", 35, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_ModelNumber", "CPL", "CPL_Energy_Star_ClothesWasher", 36, 1);
					
					
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_LoadConfiguration", "CPL", "CPL_Energy_Star_ClothesWasher", 42, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_AdditionalModelInformation", "CPL", "CPL_Energy_Star_ClothesWasher", 43, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_AdditionalWasherFeatures", "CPL", "CPL_Energy_Star_ClothesWasher", 44, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_AnnualEnergyUse", "CPL", "CPL_Energy_Star_ClothesWasher", 45,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_AnnualWaterUse", "CPL", "CPL_Energy_Star_ClothesWasher", 46,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_CommunicationStandardApplicationLayer", "CPL", "CPL_Energy_Star_ClothesWasher", 47, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_Connected", "CPL", "CPL_Energy_Star_ClothesWasher", 48, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_ConnectsUsing", "CPL", "CPL_Energy_Star_ClothesWasher", 49,1);
					
					
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_DateAvailableOnMarket", "CPL", "CPL_Energy_Star_ClothesWasher", 50,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_DateCertified", "CPL", "CPL_Energy_Star_ClothesWasher", 51, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_DirectonPremisesOpenStandardBasedInterConnection", "CPL", "CPL_Energy_Star_ClothesWasher", 52, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_ENERGYSTARModelIdentifier", "CPL", "CPL_Energy_Star_ClothesWasher", 53,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_ENERGYSTARUniqueID", "CPL", "CPL_Energy_Star_ClothesWasher", 54,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_IntegratedModifiedEnergyFactor", "CPL", "CPL_Energy_Star_ClothesWasher", 55, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_IntegratedWaterFactor", "CPL", "CPL_Energy_Star_ClothesWasher", 56, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_IntendedMarket", "CPL", "CPL_Energy_Star_ClothesWasher", 57,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_Markets", "CPL", "CPL_Energy_Star_ClothesWasher", 58,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MeetsENERGYSTARMostEfficient2018Criteria", "CPL", "CPL_Energy_Star_ClothesWasher", 59, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_PairedENERGYSTARClothesDryerAvailable", "CPL", "CPL_Energy_Star_ClothesWasher", 60, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_PairedENERGYSTARClothesDryerENERGYSTARModelIdentifier", "CPL", "CPL_Energy_Star_ClothesWasher", 61,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_UPC", "CPL", "CPL_Energy_Star_ClothesWasher", 62,1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_USFederalStandard_IMEF", "CPL", "CPL_Energy_Star_ClothesWasher", 63, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_USFederalStandard_IWF", "CPL", "CPL_Energy_Star_ClothesWasher", 64, 1);
					VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_Volume", "CPL", "CPL_Energy_Star_ClothesWasher", 65,1);			
					
					if (Xpath("Certified_Product_List_CPL","Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_ModelNumber_GreenCheckMark").isDisplayed()) {
						
						test.log(LogStatus.PASS, "Model Number Green Check Mark verified Successfully");
						
					} else {
						
						test.log(LogStatus.FAIL, "Failed to verify Model Number Green Check Mark");

					}
					
				}
				
		//****************************************************CPL Energy Star Clothes Dryer*****************************************************************************
				
						public static void Step1_Complete_GettingStarted_EnergyStar_ClothesDryer() {
							// Complete Getting Started - EnergyStar ClothesDryer Step-1
							Pass_Message("Complete Getting Started - EnergyStar ClothesDryer Step-1");

							clickWebelement("Certified_Product_List_CPL", "AccountHolder");
							clickWebelement("Certified_Product_List_CPL", "GettingStarted_AccountNumber");
							enterTextboxValue("Certified_Product_List_CPL", "GettingStarted_AccountNumber", "CPL", "CPL_Energy_Star_ClothesDryer", 4, 1);
							Enter(KeyEvent.VK_TAB);
							enterTextboxValue("Certified_Product_List_CPL", "GettingStarted_ZIP_or_PostalCode", "CPL", "CPL_Energy_Star_ClothesDryer", 5, 1);

							clickWebelement("Certified_Product_List_CPL", "NextButton");
							defineLogs("Customer Information", "Customer Information", "Customer Information",
									"Navigate to Customer Information Successfully", "Unable to Navigate to Customer Information",
									"Certified_Product_List_CPL", "VerifyCustomerInformation");
						}

						public static void Step2_Complete_CustomerInformation_EnergyStar_ClothesDryer() {
							// Complete Customer Information - EnergyStar ClothesDryer Step-2
							Pass_Message("Complete Customer Information - EnergyStar ClothesDryer Step-2");

							clickWebelement("Certified_Product_List_CPL", "NextButton");
							defineLogs("Equipment Information", "Equipment Information", "Equipment Information",
									"Navigate to Equipment Information Successfully", "Unable to Navigate to Equipment Information",
									"Certified_Product_List_CPL", "VerifyEquipmentInformation");
						}
						
						public static void Step3_Complete_EquipmentInformation_EnergyStar_ClothesDryer() {
							WaitForElement(30, "Certified_Product_List_CPL", "AddEquipment");
							ClickWebelementByActionClass("Certified_Product_List_CPL", "AddEquipment");

							clickWebelement("Certified_Product_List_CPL", "Select_CPL_EnergyStar_ClothesDryer");
							clickWebelement("Certified_Product_List_CPL", "Add_Quantity_for_CPL_EnergyStar_ClothesDryer");
							Clear("Certified_Product_List_CPL", "Add_Quantity_for_CPL_EnergyStar_ClothesDryer");
							enterTextboxValue("Certified_Product_List_CPL", "Add_Quantity_for_CPL_EnergyStar_ClothesDryer", "CPL", "CPL_Energy_Star_ClothesDryer", 34, 1);
							clickWebelement("Certified_Product_List_CPL", "Equipment_Information_OkButton");

							// Enter Value for CPL: Energy Star - Clothes Dryer - Residential
							Pass_Message("Enter Value for CPL: Energy Star - Clothes Dryer - Residential Step-3");
							enterTextboxValue("Certified_Product_List_CPL", "Equipment_Information_EnergyStar_ClothesDryer_Quantity", "CPL", "CPL_Energy_Star_ClothesDryer", 34, 1);
							selectDropdown("Certified_Product_List_CPL", "Equipment_Information_EnergyStar_ClothesDryer_BrandName","", "CPL", "CPL_Energy_Star_ClothesDryer", 35, 1);
							WaitForElement(30, "Certified_Product_List_CPL", "Equipment_Information_EnergyStar_ClothesDryer_ModelNumber");
							selectDropdown("Certified_Product_List_CPL", "Equipment_Information_EnergyStar_ClothesDryer_ModelNumber","", "CPL", "CPL_Energy_Star_ClothesDryer", 36, 1);
							
							// Verify CPL: Energy Star - Clothes Dryer - Residential
							Pass_Message("Verify CPL: Energy Star - Clothes Dryer - Residential");
							
							threadWait(300);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_AdditionalDryerFeatures", "CPL", "CPL_Energy_Star_ClothesDryer", 42, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_AdditionalModelInformation", "CPL", "CPL_Energy_Star_ClothesDryer", 43, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_CalculatedCombinedEnergyFactorMaxDrynessSetting", "CPL", "CPL_Energy_Star_ClothesDryer", 44, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_CBModelIdentifier", "CPL", "CPL_Energy_Star_ClothesDryer", 45,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_CombinedEnergyFactor", "CPL", "CPL_Energy_Star_ClothesDryer", 46,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_CommunicationStandardApplicationLayer", "CPL", "CPL_Energy_Star_ClothesDryer", 47, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_Connected", "CPL", "CPL_Energy_Star_ClothesDryer", 48, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_ConnectsUsing", "CPL", "CPL_Energy_Star_ClothesDryer", 49,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_DateAvailableOnMarket", "CPL", "CPL_Energy_Star_ClothesDryer", 50,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_DateCertified", "CPL", "CPL_Energy_Star_ClothesDryer", 51, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_Depth", "CPL", "CPL_Energy_Star_ClothesDryer", 52, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_DirectonPremisesOpenStandardBasedInterConnection", "CPL", "CPL_Energy_Star_ClothesDryer", 53,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_DrumCapacity", "CPL", "CPL_Energy_Star_ClothesDryer", 54,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_ENERGYSTARUniqueID", "CPL", "CPL_Energy_Star_ClothesDryer", 55, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_EnergyTestCycleInformation", "CPL", "CPL_Energy_Star_ClothesDryer", 56, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_EstimatedAnnualEnergyUse", "CPL", "CPL_Energy_Star_ClothesDryer", 57,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_EstimatedEnergyTestCycleTime", "CPL", "CPL_Energy_Star_ClothesDryer", 58,1);
						//	VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_HeatPumpTechnology", "CPL", "CPL_Energy_Star_ClothesDryer", 59, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_Height", "CPL", "CPL_Energy_Star_ClothesDryer", 60, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_Markets", "CPL", "CPL_Energy_Star_ClothesDryer", 61,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_MeetsENERGYSTARMostEfficient2018Criteria", "CPL", "CPL_Energy_Star_ClothesDryer", 62,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_ModelName", "CPL", "CPL_Energy_Star_ClothesDryer", 63, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_PairedENERGYSTARClothesWasherAvailable", "CPL", "CPL_Energy_Star_ClothesDryer", 64, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_PairedENERGYSTARClothesWasherENERGYSTARModelIdentifier", "CPL", "CPL_Energy_Star_ClothesDryer", 65,1);			
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_Type", "CPL", "CPL_Energy_Star_ClothesDryer", 66, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_UPC", "CPL", "CPL_Energy_Star_ClothesDryer", 67,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_VentedorVentless", "CPL", "CPL_Energy_Star_ClothesDryer", 68,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_Voltage", "CPL", "CPL_Energy_Star_ClothesDryer", 69, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_ClothesDryer_Width", "CPL", "CPL_Energy_Star_ClothesDryer", 70, 1);			
							
							clickWebelement("Certified_Product_List_CPL", "NextButton");
							defineLogs("Review and Submit", "Review and Submit", "Review and Submit",
									"Navigate to Review and Submit Successfully", "Unable to Navigate to Review and Submit", "Certified_Product_List_CPL",
									"VerifyReviewAndSubmit");
						}
						
						public static void Step4_Complete_ReviewandSubmit_EnergyStar_ClothesDryer() {
							
							clickWebelement("Certified_Product_List_CPL", "SubmitButton");
							explicitWait(300, "Certified_Product_List_CPL", "Confirmation_Number");
							TrackEnrollmentNumber("Certified_Product_List_CPL", "Confirmation_Number", "CPL","CPL_Energy_Star_ClothesDryer", 3, 3);
							threadWait(2000);
						}

						public static void Verify_Enrollment_EnergyStar_ClothesDryer() {
							login("Helper", "BaseURL", 2, 0, 2, 1);
							ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "CPL", "CPL_Energy_Star_ClothesDryer", 6, 1);
							threadWait(2000);
							enterTextboxValue("Certified_Product_List_CPL", "EnterEnrollmentNo", "CPL", "CPL_Energy_Star_ClothesDryer", 3, 3);
							threadWait(300);
							scrollToElement("Certified_Product_List_CPL", "SearchButton");
							clickWebelement("Certified_Product_List_CPL", "SearchButton");
							threadWait(7000);
							clickWebelement("Certified_Product_List_CPL", "EnrollmentLink");
							
						}
						
						public static void Verify_ApplicationWorkflowStep_EnergyStar_ClothesDryer() {
							clickWebelement("Certified_Product_List_CPL", "ApplicationWorkflowStep");
							Verify_ApplicationWorkflowStep_Measures__EnergyStar_ClothesDryer();
							HandleErrorCodeOnProcess("helper", "ProcessButton", "");
							//clickonProcess();
						}
						
						public static void Verify_ApplicationWorkflowStep_After_Process_EnergyStar_ClothesDryer() {
							clickWebelement("Certified_Product_List_CPL", "ApplicationWorkflowStep");
							Verify_ApplicationWorkflowStep_Measures__EnergyStar_ClothesDryer();
							clickWebelement("Certified_Product_List_CPL", "CloseButton");
						}

						public static void Verify_ApplicationWorkflowStep_Measures__EnergyStar_ClothesDryer() {

							scrollToElement("Certified_Product_List_CPL", "Navigate_To_Measure_Tab");
							clickWebelement("Certified_Product_List_CPL", "Navigate_To_Measure_Tab");
							
							
							// Verify CPL: Energy Star-Clothes Dryer-Measure -Application Workflow Step
							Pass_Message("Verify CPL: Energy Star-Clothes Dryer-Measure -Application Workflow Step");

							threadWait(300);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BrandName", "CPL", "CPL_Energy_Star_ClothesDryer", 35, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_ModelNumber", "CPL", "CPL_Energy_Star_ClothesDryer", 36, 1);
							
							
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_AdditionalDryerFeatures", "CPL", "CPL_Energy_Star_ClothesDryer", 42, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_AdditionalModelInformation", "CPL", "CPL_Energy_Star_ClothesDryer", 43, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_CalculatedCombinedEnergyFactorMaxDrynessSetting", "CPL", "CPL_Energy_Star_ClothesDryer", 44, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_CBModelIdentifier", "CPL", "CPL_Energy_Star_ClothesDryer", 45,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_CombinedEnergyFactor", "CPL", "CPL_Energy_Star_ClothesDryer", 46,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_CommunicationStandardApplicationLayer", "CPL", "CPL_Energy_Star_ClothesDryer", 47, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_Connected", "CPL", "CPL_Energy_Star_ClothesDryer", 48, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_ConnectsUsing", "CPL", "CPL_Energy_Star_ClothesDryer", 49,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_DateAvailableOnMarket", "CPL", "CPL_Energy_Star_ClothesDryer", 50,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_DateCertified", "CPL", "CPL_Energy_Star_ClothesDryer", 51, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_Depth", "CPL", "CPL_Energy_Star_ClothesDryer", 52, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_DirectonPremisesOpenStandardBasedInterConnection", "CPL", "CPL_Energy_Star_ClothesDryer", 53,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_DrumCapacity", "CPL", "CPL_Energy_Star_ClothesDryer", 54,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_ENERGYSTARUniqueID", "CPL", "CPL_Energy_Star_ClothesDryer", 55, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_EnergyTestCycleInformation", "CPL", "CPL_Energy_Star_ClothesDryer", 56, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_EstimatedAnnualEnergyUse", "CPL", "CPL_Energy_Star_ClothesDryer", 57,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_EstimatedEnergyTestCycleTime", "CPL", "CPL_Energy_Star_ClothesDryer", 58,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_HeatPumpTechnology", "CPL", "CPL_Energy_Star_ClothesDryer", 59, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_Height", "CPL", "CPL_Energy_Star_ClothesDryer", 60, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_Markets", "CPL", "CPL_Energy_Star_ClothesDryer", 61,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MeetsENERGYSTARMostEfficient2018Criteria", "CPL", "CPL_Energy_Star_ClothesDryer", 62,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_ModelName", "CPL", "CPL_Energy_Star_ClothesDryer", 63, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_PairedENERGYSTARClothesWasherAvailable", "CPL", "CPL_Energy_Star_ClothesDryer", 64, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_PairedENERGYSTARClothesWasherENERGYSTARModelIdentifier", "CPL", "CPL_Energy_Star_ClothesDryer", 65,1);			
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_Type", "CPL", "CPL_Energy_Star_ClothesDryer", 66, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_UPC", "CPL", "CPL_Energy_Star_ClothesDryer", 67,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_VentedorVentless", "CPL", "CPL_Energy_Star_ClothesDryer", 68,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_Voltage", "CPL", "CPL_Energy_Star_ClothesDryer", 69, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_Width", "CPL", "CPL_Energy_Star_ClothesDryer", 70, 1);			
							
							if (Xpath("Certified_Product_List_CPL","Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_ModelNumber_GreenCheckMark").isDisplayed()) {
								
								test.log(LogStatus.PASS, "Model Number Green Check Mark verified Successfully");
								
							} else {
								
								test.log(LogStatus.FAIL, "Failed to verify Model Number Green Check Mark");

							}
							
						}		
						
		//****************************************************CPL Energy Star Ceiling Fan Mobile Application*****************************************************************************
						
						public static void Open_MobileApplication_EnergyStar_CeilingFan() {
							setProperty("helper", "chrome", "Chrome_Path");
							openChrome();
							openURL("Certified_Product_List_CPL", "OnlineApplication_CeilingFan_MobileApplication");
							maximizeWindow();
							implicitlywait(220);
						}
						
						public static void Complete_EnergyStar_CeilingFan_MobileApplication_Step1() {
							// Enter Value for CPL: Energy Star - Ceiling Fan - Residential Mobile Application
							Pass_Message("Enter Value for CPL: Energy Star - Ceiling Fan - Residential Mobile Application Step-1");
							
							clickWebelement("Certified_Product_List_CPL", "CeilingFan_MobileApplication_Step1_BrandName");
							//explicitWait(30, "Certified_Product_List_CPL", "CeilingFan_MobileApplication_Step1_Select_Emerson");
							threadWait(2000);
							clickWebelement("Certified_Product_List_CPL", "CeilingFan_MobileApplication_Step1_Select_Emerson");
							//explicitWait(30, "Certified_Product_List_CPL", "CeilingFan_MobileApplication_Step1_ModelNumber");
							threadWait(2000);
							clickWebelement("Certified_Product_List_CPL", "CeilingFan_MobileApplication_Step1_ModelNumber");
							//explicitWait(30, "Certified_Product_List_CPL", "CeilingFan_MobileApplication_Step1_Select_CF921");
							threadWait(2000);
							clickWebelement("Certified_Product_List_CPL", "CeilingFan_MobileApplication_Step1_Select_CF921");
							threadWait(2000);
							clickWebelement("Certified_Product_List_CPL", "CeilingFan_MobileApplication_Step1_ProductType");
							threadWait(2000);
							clickWebelement("Certified_Product_List_CPL", "CeilingFan_MobileApplication_Step1_Select_StandardFanOnly");
							threadWait(2000);
							clickWebelement("Certified_Product_List_CPL", "CeilingFan_MobileApplication_Step1_BladeSpan");
							threadWait(2000);
							clickWebelement("Certified_Product_List_CPL", "CeilingFan_MobileApplication_Step1_Select_60");
							threadWait(5000);
							// Verify CPL: Energy Star - Ceiling Fan - Residential Mobile Application
							Pass_Message("Verify CPL: Energy Star - Ceiling Fan - Residential Mobile Application");
							
							threadWait(2000);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_AdditionalModelInformation", "CPL", "CeilingFan_MobileApplication", 16, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_CBModelIdentifier", "CPL", "CeilingFan_MobileApplication", 17, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_CeilingFan_MobileApplicationComponentsWarranty", "CPL", "CeilingFan_MobileApplication", 18, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_CeilingFan_MobileApplicationEfficiency", "CPL", "CeilingFan_MobileApplication", 19,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_CeilingFan_MobileApplicationFeatures", "CPL", "CeilingFan_MobileApplication", 20,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_ConnectedFunctionality", "CPL", "CeilingFan_MobileApplication", 21, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_ConnectsUsing", "CPL", "CeilingFan_MobileApplication", 22, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_DateAvailableOnMarket", "CPL", "CeilingFan_MobileApplication", 23,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_DateCertified", "CPL", "CeilingFan_MobileApplication", 24,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_ENERGYSTARLampESUID", "CPL", "CeilingFan_MobileApplication", 25, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_ENERGYSTARLampPartner", "CPL", "CeilingFan_MobileApplication", 26, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_ENERGYSTARPartner", "CPL", "CeilingFan_MobileApplication", 27,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_ENERGYSTARUniqueID", "CPL", "CeilingFan_MobileApplication", 28,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_FanPowerConsumptionHighSpeed", "CPL", "CeilingFan_MobileApplication", 29, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_FanPowerConsumptionLowSpeed", "CPL", "CeilingFan_MobileApplication", 30, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_FanPowerConsumptionStandby", "CPL", "CeilingFan_MobileApplication", 31,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_IndoorOutdoor", "CPL", "CeilingFan_MobileApplication", 32,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_LampModelNumber", "CPL", "CeilingFan_MobileApplication", 33, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_LightColorAppearance", "CPL", "CeilingFan_MobileApplication", 34, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_LightColorQuality", "CPL", "CeilingFan_MobileApplication", 35,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_LightKitDimmability", "CPL", "CeilingFan_MobileApplication", 36,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_LightSourceConnectionBaseType", "CPL", "CeilingFan_MobileApplication", 37, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_LightSourceRatedLife", "CPL", "CeilingFan_MobileApplication", 38, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_LightSourceTechnology", "CPL", "CeilingFan_MobileApplication", 39,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_LightSourcesPerLightKit", "CPL", "CeilingFan_MobileApplication", 40,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_LightingEfficiencyMeasuredAtTheSource", "CPL", "CeilingFan_MobileApplication", 41, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_LightingEfficiencyMeasuredOutsideTheFixture", "CPL", "CeilingFan_MobileApplication", 42, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_Markets", "CPL", "CeilingFan_MobileApplication", 43,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_MeetsENERGYSTARMostEfficient2018Criteria", "CPL", "CeilingFan_MobileApplication", 44,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_ModelName", "CPL", "CeilingFan_MobileApplication", 45, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_PowerFactorOfLightKit", "CPL", "CeilingFan_MobileApplication", 46, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_ShippedWithENERGYSTARLamp", "CPL", "CeilingFan_MobileApplication", 47,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_SpecialLightingFeatures", "CPL", "CeilingFan_MobileApplication", 48,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_TotalLightOutput", "CPL", "CeilingFan_MobileApplication", 49, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_CeilingFan_MobileApplication_Step1_TotalLightingInputPower", "CPL", "CeilingFan_MobileApplication", 50, 1);
							
							
							clickWebelement("Certified_Product_List_CPL", "Next_Button_MobileApplication");
							defineLogs("Terms and Conditions", "Terms and Conditions", "Terms and Conditions",
									"Navigate to Terms and Conditions Successfully", "Unable to Navigate to Terms and Conditions", "Certified_Product_List_CPL",
									"VerifyTermsAndCondition");
						}
						
						public static void Complete_EnergyStar_CeilingFan_MobileApplication_Step2() {
							
							clickWebelement("Certified_Product_List_CPL", "Accept_Button_MobileApplication");
							//explicitWait(30, "Certified_Product_List_CPL", "MobileApplication_ApplicantInformation_Step2_EnterName");
							threadWait(300);
							clickWebelement("Certified_Product_List_CPL", "MobileApplication_ApplicantInformation_Step2_EnterName");
							
							enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Name", "ESG Values","CPL" , 114, 1);
							enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Account", "ESG Values","CPL" , 113, 1);
							enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_EmailID", "ESG Values","CPL" , 115, 1);
							enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_PhoneNumber", "ESG Values","CPL" , 116, 1);
							/*enterTextboxValue("Certified_Product_List_CPL", "MobileApplication_ApplicantInformation_Step2_EnterName", "CPL", "CeilingFan_MobileApplication", 53, 1);
							//Enter(KeyEvent.VK_ENTER);
							Enter(KeyEvent.VK_TAB);
							enterTextboxValue("Certified_Product_List_CPL", "MobileApplication_ApplicantInformation_Step2_EnterAccountNumber", "CPL", "CeilingFan_MobileApplication", 54, 1);
							Enter(KeyEvent.VK_TAB);
							enterTextboxValue("Certified_Product_List_CPL", "MobileApplication_ApplicantInformation_Step2_EnterEmailAddress", "CPL", "CeilingFan_MobileApplication", 55, 1);
							Enter(KeyEvent.VK_TAB);
							enterTextboxValue("Certified_Product_List_CPL", "MobileApplication_ApplicantInformation_Step2_EnterPhoneNumber", "CPL", "CeilingFan_MobileApplication", 56, 1);*/
							
							clickWebelement("Certified_Product_List_CPL", "Submit_Button_MobileApplication");
							WaitForElement(300, "Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_ConfirmationMessage");
							TrackEnrollmentNumber("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_ConfirmationMessage", "ESG Values","CPL", 181, 1);
							threadWait(2000);
						}

						public static void Verify_Enrollment_EnergyStar_CeilingFan_MobileApplication() {
							login("Helper", "BaseURL", 2, 0, 2, 1);
							ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "CPL", "CeilingFan_MobileApplication", 4, 1);
							threadWait(2000);
							enterTextboxValue("Certified_Product_List_CPL", "EnterEnrollmentNo", "ESG Values", "CPL", 181, 1);
							threadWait(300);
							scrollToElement("Certified_Product_List_CPL", "SearchButton");
							clickWebelement("Certified_Product_List_CPL", "SearchButton");
							threadWait(7000);
							clickWebelement("Certified_Product_List_CPL", "EnrollmentLink");
							
						}
						
						public static void Verify_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication() {
							clickWebelement("Certified_Product_List_CPL", "ApplicationWorkflowStep");
							Verify_ApplicationWorkflowStep_Measures__EnergyStar_CeilingFan_MobileApplication();
						    
							HandleErrorCodeOnProcess("helper", "ProcessButton", "");
							//clickonProcess();
						}
						
						public static void Verify_ApplicationWorkflowStep_After_Process_EnergyStar_CeilingFan_MobileApplication() {
							clickWebelement("Certified_Product_List_CPL", "ApplicationWorkflowStep");
							Verify_ApplicationWorkflowStep_Measures__EnergyStar_CeilingFan_MobileApplication();
							clickWebelement("Certified_Product_List_CPL", "CloseButton");
						}

						public static void Verify_ApplicationWorkflowStep_Measures__EnergyStar_CeilingFan_MobileApplication() {

							scrollToElement("Certified_Product_List_CPL", "Navigate_To_Measure_Tab");
							clickWebelement("Certified_Product_List_CPL", "Navigate_To_Measure_Tab");
							
							
							// Verify CPL: Energy Star-Ceiling Fan Mobile Application-Measure -Application Workflow Step
							Pass_Message("Verify CPL: Energy Star-Ceiling Fan Mobile Application-Measure -Application Workflow Step");

							threadWait(300);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_BrandName", "CPL", "CeilingFan_MobileApplication", 9, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_ModelNumber", "CPL", "CeilingFan_MobileApplication", 10, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_ProductType", "CPL", "CeilingFan_MobileApplication", 11, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_BladeSpan", "CPL", "CeilingFan_MobileApplication", 12,1);
							
							
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_AdditionalModelInformation", "CPL", "CeilingFan_MobileApplication", 16, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_CBModelIdentifier", "CPL", "CeilingFan_MobileApplication", 17, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_CeilingFan_MobileApplicationComponentsWarranty", "CPL", "CeilingFan_MobileApplication", 18, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_CeilingFan_MobileApplicationEfficiency", "CPL", "CeilingFan_MobileApplication", 19,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_CeilingFan_MobileApplicationFeatures", "CPL", "CeilingFan_MobileApplication", 20,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_ConnectedFunctionality", "CPL", "CeilingFan_MobileApplication", 21, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_ConnectsUsing", "CPL", "CeilingFan_MobileApplication", 22, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_DateAvailableOnMarket", "CPL", "CeilingFan_MobileApplication", 23,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_DateCertified", "CPL", "CeilingFan_MobileApplication", 24,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_ENERGYSTARLampESUID", "CPL", "CeilingFan_MobileApplication", 25, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_ENERGYSTARLampPartner", "CPL", "CeilingFan_MobileApplication", 26, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_ENERGYSTARPartner", "CPL", "CeilingFan_MobileApplication", 27,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_ENERGYSTARUniqueID", "CPL", "CeilingFan_MobileApplication", 28,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_FanPowerConsumptionHighSpeed", "CPL", "CeilingFan_MobileApplication", 29, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_FanPowerConsumptionLowSpeed", "CPL", "CeilingFan_MobileApplication", 30, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_FanPowerConsumptionStandby", "CPL", "CeilingFan_MobileApplication", 31,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_IndoorOutdoor", "CPL", "CeilingFan_MobileApplication", 32,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_LampModelNumber", "CPL", "CeilingFan_MobileApplication", 33, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_LightColorAppearance", "CPL", "CeilingFan_MobileApplication", 34, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_LightColorQuality", "CPL", "CeilingFan_MobileApplication", 35,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_LightKitDimmability", "CPL", "CeilingFan_MobileApplication", 36,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_LightSourceConnectionBaseType", "CPL", "CeilingFan_MobileApplication", 37, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_LightSourceRatedLife", "CPL", "CeilingFan_MobileApplication", 38, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_LightSourceTechnology", "CPL", "CeilingFan_MobileApplication", 39,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_LightSourcesPerLightKit", "CPL", "CeilingFan_MobileApplication", 40,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_LightingEfficiencyMeasuredAtTheSource", "CPL", "CeilingFan_MobileApplication", 41, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_LightingEfficiencyMeasuredOutsideTheFixture", "CPL", "CeilingFan_MobileApplication", 42, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_Markets", "CPL", "CeilingFan_MobileApplication", 43,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_MeetsENERGYSTARMostEfficient2018Criteria", "CPL", "CeilingFan_MobileApplication", 44,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_ModelName", "CPL", "CeilingFan_MobileApplication", 45, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_PowerFactorOfLightKit", "CPL", "CeilingFan_MobileApplication", 46, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_ShippedWithENERGYSTARLamp", "CPL", "CeilingFan_MobileApplication", 47,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_SpecialLightingFeatures", "CPL", "CeilingFan_MobileApplication", 48,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_TotalLightOutput", "CPL", "CeilingFan_MobileApplication", 49, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_TotalLightingInputPower", "CPL", "CeilingFan_MobileApplication", 50, 1);
							
							if (Xpath("Certified_Product_List_CPL","Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_MobileApplication_BladeSpan_GreenCheckMark").isDisplayed()) {
								
								test.log(LogStatus.PASS, "Blade Span Green Check Mark verified Successfully");
								
							} else {
								
								test.log(LogStatus.FAIL, "Failed to verify Blade Span Green Check Mark");

							}
							
						}
						
		//****************************************************CPL Energy Star Clothes Washer Mobile Application*****************************************************************************
						public static void Open_MobileApplication_EnergyStar_ClothesWasher() {
							setProperty("helper", "chrome", "Chrome_Path");
							openChrome();
							openURL("Certified_Product_List_CPL", "OnlineApplication_ClothesWasher_MobileApplication");
							maximizeWindow();
							implicitlywait(220);
						}
						
						public static void Complete_ClothesWasher_MobileApplication_Step1() {
							// Enter Value for CPL: Energy Star - Clothes Washer Mobile Application Mobile Application - Residential
							Pass_Message("Enter Value for CPL: Energy Star - Clothes Washer - Residential Mobile Application Step-1");
							
							threadWait(2000);
							clickWebelement("Certified_Product_List_CPL", "ClothesWasher_MobileApplication_Step1_BrandName");
							threadWait(2000);
							clickWebelement("Certified_Product_List_CPL", "ClothesWasher_MobileApplication_Step1_SelectKenmore");
							threadWait(2000);
							//explicitWait(30, "Certified_Product_List_CPL", "ClothesWasher_MobileApplication_Step1_ModelNumber");
							clickWebelement("Certified_Product_List_CPL", "ClothesWasher_MobileApplication_Step1_ModelNumber");
							threadWait(2000);
							clickWebelement("Certified_Product_List_CPL", "ClothesWasher_MobileApplication_Step1_Select4136");
							
							// Verify CPL: Energy Star - Clothes Washer Mobile Application Mobile Application - Residential
							Pass_Message("Verify CPL: Energy Star - Clothes Washer Mobile Application Mobile Application - Residential");
							
							threadWait(5000);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesWasher_MobileApplication_Step1_LoadConfiguration", "CPL", "ClothesWasher_MobileApplication", 16, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesWasher_MobileApplication_Step1_AdditionalModelInformation", "CPL", "ClothesWasher_MobileApplication", 17, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesWasher_MobileApplication_Step1_AdditionalWasherFeatures", "CPL", "ClothesWasher_MobileApplication", 18, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesWasher_MobileApplication_Step1_AnnualEnergyUse", "CPL", "ClothesWasher_MobileApplication", 19,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesWasher_MobileApplication_Step1_AnnualWaterUse", "CPL", "ClothesWasher_MobileApplication", 20,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesWasher_MobileApplication_Step1_CommunicationStandardApplicationLayer", "CPL", "ClothesWasher_MobileApplication", 21, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesWasher_MobileApplication_Step1_Connected", "CPL", "ClothesWasher_MobileApplication", 22, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesWasher_MobileApplication_Step1_ConnectsUsing", "CPL", "ClothesWasher_MobileApplication", 23,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesWasher_MobileApplication_Step1_DateAvailableOnMarket", "CPL", "ClothesWasher_MobileApplication", 24,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesWasher_MobileApplication_Step1_DateCertified", "CPL", "ClothesWasher_MobileApplication", 25, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesWasher_MobileApplication_Step1_DirectonPremisesOpenStandardBasedInterConnection", "CPL", "ClothesWasher_MobileApplication", 26, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesWasher_MobileApplication_Step1_ENERGYSTARModelIdentifier", "CPL", "ClothesWasher_MobileApplication", 27,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesWasher_MobileApplication_Step1_ENERGYSTARUniqueID", "CPL", "ClothesWasher_MobileApplication", 28,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesWasher_MobileApplication_Step1_IntegratedModifiedEnergyFactor", "CPL", "ClothesWasher_MobileApplication", 29, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesWasher_MobileApplication_Step1_IntegratedWaterFactor", "CPL", "ClothesWasher_MobileApplication", 30, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesWasher_MobileApplication_Step1_IntendedMarket", "CPL", "ClothesWasher_MobileApplication", 31,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesWasher_MobileApplication_Step1_Markets", "CPL", "ClothesWasher_MobileApplication", 32,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesWasher_MobileApplication_Step1_MeetsENERGYSTARMostEfficient2018Criteria", "CPL", "ClothesWasher_MobileApplication", 33, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesWasher_MobileApplication_Step1_PairedENERGYSTARClothesDryerAvailable", "CPL", "ClothesWasher_MobileApplication", 34, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesWasher_MobileApplication_Step1_PairedENERGYSTARClothesDryerENERGYSTARModelIdentifier", "CPL", "ClothesWasher_MobileApplication", 35,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesWasher_MobileApplication_Step1_UPC", "CPL", "ClothesWasher_MobileApplication", 36,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesWasher_MobileApplication_Step1_USFederalStandard_IMEF", "CPL", "ClothesWasher_MobileApplication", 37, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesWasher_MobileApplication_Step1_USFederalStandard_IWF", "CPL", "ClothesWasher_MobileApplication", 38, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesWasher_MobileApplication_Step1_Volume", "CPL", "ClothesWasher_MobileApplication", 39,1);			
							
							clickWebelement("Certified_Product_List_CPL", "Next_Button_MobileApplication");
							defineLogs("Terms and Conditions", "Terms and Conditions", "Terms and Conditions",
									"Navigate to Terms and Conditions Successfully", "Unable to Navigate to Terms and Conditions", "Certified_Product_List_CPL",
									"VerifyTermsAndCondition");
						}
						
		                public static void Complete_EnergyStar_ClothesWasher_MobileApplication_Step2() {
							
							clickWebelement("Certified_Product_List_CPL", "Accept_Button_MobileApplication");
							//explicitWait(30, "Certified_Product_List_CPL", "MobileApplication_ApplicantInformation_Step2_EnterName");
							
							threadWait(300);
							clickWebelement("Certified_Product_List_CPL", "MobileApplication_ApplicantInformation_Step2_EnterName");
							
							enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Name", "ESG Values","CPL" , 114, 1);
							enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Account", "ESG Values","CPL" , 113, 1);
							enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_EmailID", "ESG Values","CPL" , 115, 1);
							enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_PhoneNumber", "ESG Values","CPL" , 116, 1);
							/*enterTextboxValue("Certified_Product_List_CPL", "MobileApplication_ApplicantInformation_Step2_EnterName", "CPL", "ClothesWasher_MobileApplication", 42, 1);
							//Enter(KeyEvent.VK_ENTER);
							Enter(KeyEvent.VK_TAB);
							enterTextboxValue("Certified_Product_List_CPL", "MobileApplication_ApplicantInformation_Step2_EnterAccountNumber", "CPL", "ClothesWasher_MobileApplication", 43, 1);
							Enter(KeyEvent.VK_TAB);
							enterTextboxValue("Certified_Product_List_CPL", "MobileApplication_ApplicantInformation_Step2_EnterEmailAddress", "CPL", "ClothesWasher_MobileApplication", 44, 1);
							Enter(KeyEvent.VK_TAB);
							enterTextboxValue("Certified_Product_List_CPL", "MobileApplication_ApplicantInformation_Step2_EnterPhoneNumber", "CPL", "ClothesWasher_MobileApplication", 45, 1);*/
							
							clickWebelement("Certified_Product_List_CPL", "Submit_Button_MobileApplication");
							explicitWait(300, "Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_ConfirmationMessage");
							TrackEnrollmentNumber("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Application_ConfirmationMessage", "ESG Values","CPL", 118, 1);

							//TrackEnrollmentNumber("Certified_Product_List_CPL", "Confirmation_Number1", "CPL","ClothesWasher_MobileApplication", 3, 3);
							threadWait(2000);
						}
						

						public static void Verify_Enrollment_EnergyStar_ClothesWasher_MobileApplication() {
							login("Helper", "BaseURL", 2, 0, 2, 1);
							ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "CPL", "ClothesWasher_MobileApplication", 4, 1);
							threadWait(2000);
							enterTextboxValue("Certified_Product_List_CPL", "EnterEnrollmentNo", "ESG Values", "CPL", 118, 1);
							threadWait(300);
							scrollToElement("Certified_Product_List_CPL", "SearchButton");
							clickWebelement("Certified_Product_List_CPL", "SearchButton");
							threadWait(7000);
							clickWebelement("Certified_Product_List_CPL", "EnrollmentLink");
							
						}
						
						public static void Verify_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication() {
							clickWebelement("Certified_Product_List_CPL", "ApplicationWorkflowStep");
							Verify_ApplicationWorkflowStep_Measures__EnergyStar_ClothesWasher_MobileApplication();
						   
							HandleErrorCodeOnProcess("helper", "ProcessButton", "");
							//clickonProcess();
						}
						
						public static void Verify_ApplicationWorkflowStep_After_Process_EnergyStar_ClothesWasher_MobileApplication() {
							clickWebelement("Certified_Product_List_CPL", "ApplicationWorkflowStep");
							Verify_ApplicationWorkflowStep_Measures__EnergyStar_ClothesWasher_MobileApplication();
							clickWebelement("Certified_Product_List_CPL", "CloseButton");
						}

						public static void Verify_ApplicationWorkflowStep_Measures__EnergyStar_ClothesWasher_MobileApplication() {

							scrollToElement("Certified_Product_List_CPL", "Navigate_To_Measure_Tab");
							clickWebelement("Certified_Product_List_CPL", "Navigate_To_Measure_Tab");
							
							
							// Verify CPL: Energy Star-Clothes Washer Mobile Application Mobile Application-Measure -Application Workflow Step
							Pass_Message("Verify CPL: Energy Star-Clothes Washer Mobile Application Mobile Application-Measure -Application Workflow Step");

							threadWait(300);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_BrandName", "CPL", "ClothesWasher_MobileApplication", 9, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_ModelNumber", "CPL", "ClothesWasher_MobileApplication", 10, 1);
							
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_LoadConfiguration", "CPL", "ClothesWasher_MobileApplication", 16, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_AdditionalModelInformation", "CPL", "ClothesWasher_MobileApplication", 17, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_AdditionalWasherFeatures", "CPL", "ClothesWasher_MobileApplication", 18, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_AnnualEnergyUse", "CPL", "ClothesWasher_MobileApplication", 19,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_AnnualWaterUse", "CPL", "ClothesWasher_MobileApplication", 20,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_CommunicationStandardApplicationLayer", "CPL", "ClothesWasher_MobileApplication", 21, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_Connected", "CPL", "ClothesWasher_MobileApplication", 22, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_ConnectsUsing", "CPL", "ClothesWasher_MobileApplication", 23,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_DateAvailableOnMarket", "CPL", "ClothesWasher_MobileApplication", 24,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_DateCertified", "CPL", "ClothesWasher_MobileApplication", 25, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_DirectonPremisesOpenStandardBasedInterConnection", "CPL", "ClothesWasher_MobileApplication", 26, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_ENERGYSTARModelIdentifier", "CPL", "ClothesWasher_MobileApplication", 27,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_ENERGYSTARUniqueID", "CPL", "ClothesWasher_MobileApplication", 28,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_IntegratedModifiedEnergyFactor", "CPL", "ClothesWasher_MobileApplication", 29, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_IntegratedWaterFactor", "CPL", "ClothesWasher_MobileApplication", 30, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_IntendedMarket", "CPL", "ClothesWasher_MobileApplication", 31,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_Markets", "CPL", "ClothesWasher_MobileApplication", 32,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_MeetsENERGYSTARMostEfficient2018Criteria", "CPL", "ClothesWasher_MobileApplication", 33, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_PairedENERGYSTARClothesDryerAvailable", "CPL", "ClothesWasher_MobileApplication", 34, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_PairedENERGYSTARClothesDryerENERGYSTARModelIdentifier", "CPL", "ClothesWasher_MobileApplication", 35,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_UPC", "CPL", "ClothesWasher_MobileApplication", 36,1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_USFederalStandard_IMEF", "CPL", "ClothesWasher_MobileApplication", 37, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_USFederalStandard_IWF", "CPL", "ClothesWasher_MobileApplication", 38, 1);
							VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_Volume", "CPL", "ClothesWasher_MobileApplication", 39,1);			
							
							if (Xpath("Certified_Product_List_CPL","Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_MobileApplication_ModelNumber_GreenCheckMark").isDisplayed()) {
								
								test.log(LogStatus.PASS, "Model Number Green Check Mark verified Successfully");
								
							} else {
								
								test.log(LogStatus.FAIL, "Failed to verify Model Number Green Check Mark");

							}
							
						}
						
		//****************************************************CPL Energy Star Clothes Dryer Mobile Application*****************************************************************************
						
						public static void Open_MobileApplication_EnergyStar_ClothesDryer() {
							setProperty("helper", "chrome", "Chrome_Path");
							openChrome();
							openURL("Certified_Product_List_CPL", "OnlineApplicationr_ClothesDryer_MobileApplication");
							maximizeWindow();
							implicitlywait(220);
						}
						
								public static void Complete_ClothesDryer_MobileApplication_Step1() {
									
									// Enter Value for CPL: Energy Star - Clothes Dryer Mobile Application - Residential
									Pass_Message("Enter Value for CPL: Energy Star - Clothes Dryer Mobile Application - Residential Step-3");
									
									threadWait(2000);
									clickWebelement("Certified_Product_List_CPL", "ClothesDryer_MobileApplication_Step1_BrandName");
									threadWait(2000);
									clickWebelement("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_SelectAmana");
									threadWait(2000);
									//explicitWait(30, "Certified_Product_List_CPL", "ClothesDryer_MobileApplication_Step1_ModelNumber");
									clickWebelement("Certified_Product_List_CPL", "ClothesDryer_MobileApplication_Step1_ModelNumber");
									threadWait(2000);
									clickWebelement("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_SelectNED5800H");
									
									// Verify CPL: Energy Star - Clothes Dryer Mobile Application - Residential
									Pass_Message("Verify CPL: Energy Star - Clothes Dryer Mobile Application - Residential");
									
									threadWait(300);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_AdditionalDryerFeatures", "CPL", "ClothesDryer_MobileApplication", 16, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_AdditionalModelInformation", "CPL", "ClothesDryer_MobileApplication", 17, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_CalculatedCombinedEnergyFactorMaxDrynessSetting", "CPL", "ClothesDryer_MobileApplication", 18, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_CBModelIdentifier", "CPL", "ClothesDryer_MobileApplication", 19,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_CombinedEnergyFactor", "CPL", "ClothesDryer_MobileApplication", 20,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_CommunicationStandardApplicationLayer", "CPL", "ClothesDryer_MobileApplication", 21, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_Connected", "CPL", "ClothesDryer_MobileApplication", 22, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_ConnectsUsing", "CPL", "ClothesDryer_MobileApplication", 23,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_DateAvailableOnMarket", "CPL", "ClothesDryer_MobileApplication", 24,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_DateCertified", "CPL", "ClothesDryer_MobileApplication", 25, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_Depth", "CPL", "ClothesDryer_MobileApplication", 26, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_DirectonPremisesOpenStandardBasedInterConnection", "CPL", "ClothesDryer_MobileApplication", 27,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_DrumCapacity", "CPL", "ClothesDryer_MobileApplication", 28,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_ENERGYSTARUniqueID", "CPL", "ClothesDryer_MobileApplication", 29, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_EnergyTestCycleInformation", "CPL", "ClothesDryer_MobileApplication", 30, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_EstimatedAnnualEnergyUse", "CPL", "ClothesDryer_MobileApplication", 31,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_EstimatedEnergyTestCycleTime", "CPL", "ClothesDryer_MobileApplication", 32,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Equipment_Information_EnergyStar_HeatPumpTechnology", "CPL", "ClothesDryer_MobileApplication", 33, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_Height", "CPL", "ClothesDryer_MobileApplication", 34, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_Markets", "CPL", "ClothesDryer_MobileApplication", 35,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_MeetsENERGYSTARMostEfficient2018Criteria", "CPL", "ClothesDryer_MobileApplication", 36,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_ModelName", "CPL", "ClothesDryer_MobileApplication", 37, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_PairedENERGYSTARClothesWasherAvailable", "CPL", "ClothesDryer_MobileApplication", 38, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_PairedENERGYSTARClothesWasherENERGYSTARModelIdentifier", "CPL", "ClothesDryer_MobileApplication", 39,1);			
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_Type", "CPL", "ClothesDryer_MobileApplication", 40, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_UPC", "CPL", "ClothesDryer_MobileApplication", 41,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_VentedorVentless", "CPL", "ClothesDryer_MobileApplication", 42,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_Voltage", "CPL", "ClothesDryer_MobileApplication", 43, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_ClothesDryer_MobileApplication_Step1_Width", "CPL", "ClothesDryer_MobileApplication", 44, 1);			
									
									clickWebelement("Certified_Product_List_CPL", "Next_Button_MobileApplication");
									defineLogs("Terms and Conditions", "Terms and Conditions", "Terms and Conditions",
											"Navigate to Terms and Conditions Successfully", "Unable to Navigate to Terms and Conditions", "Certified_Product_List_CPL",
											"VerifyTermsAndCondition");
								}
								
								 public static void Complete_EnergyStar_ClothesDryer_MobileApplication_Step2() {
										
										clickWebelement("Certified_Product_List_CPL", "Accept_Button_MobileApplication");
										//explicitWait(30, "Certified_Product_List_CPL", "MobileApplication_ApplicantInformation_Step2_EnterName");
										threadWait(300);
										clickWebelement("Certified_Product_List_CPL", "MobileApplication_ApplicantInformation_Step2_EnterName");
										enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Name", "ESG Values","CPL" , 114, 1);
										enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_Account", "ESG Values","CPL" , 113, 1);
										enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_EmailID", "ESG Values","CPL" , 115, 1);
										enterTextboxValue("Certified_Product_List_CPL", "EquipedInformation_AHRI_AirConditioner_Mobile_PhoneNumber", "ESG Values","CPL" , 116, 1);
										/*enterTextboxValue("Certified_Product_List_CPL", "MobileApplication_ApplicantInformation_Step2_EnterName", "CPL", "ClothesDryer_MobileApplication", 47, 1);
										//Enter(KeyEvent.VK_ENTER);
										threadWait(300);
										Enter(KeyEvent.VK_TAB);
										enterTextboxValue("Certified_Product_List_CPL", "MobileApplication_ApplicantInformation_Step2_EnterAccountNumber", "CPL", "ClothesDryer_MobileApplication", 48, 1);
										threadWait(300);
										Enter(KeyEvent.VK_TAB);
										enterTextboxValue("Certified_Product_List_CPL", "MobileApplication_ApplicantInformation_Step2_EnterEmailAddress", "CPL", "ClothesDryer_MobileApplication", 49, 1);
										threadWait(300);
										Enter(KeyEvent.VK_TAB);
										enterTextboxValue("Certified_Product_List_CPL", "MobileApplication_ApplicantInformation_Step2_EnterPhoneNumber", "CPL", "ClothesDryer_MobileApplication", 50, 1);*/
										
										clickWebelement("Certified_Product_List_CPL", "Submit_Button_MobileApplication");
										explicitWait(300, "Certified_Product_List_CPL", "EquipedInformation_WaterSense_ShowerHead_Residential_Mobile_Application__ConfirmationMessage");
										TrackEnrollmentNumber("Certified_Product_List_CPL", "EquipedInformation_WaterSense_ShowerHead_Residential_Mobile_Application__ConfirmationMessage", "ESG Values","CPL", 118, 1);
										//TrackEnrollmentNumber("Certified_Product_List_CPL", "Confirmation_Number", "CPL","ClothesDryer_MobileApplication", 3, 3);
										threadWait(2000);
									}
								
								public static void Verify_Enrollment_EnergyStar_ClothesDryer_MobileApplication() {
									login("Helper", "BaseURL", 2, 0, 2, 1);
									ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "CPL", "ClothesDryer_MobileApplication", 4, 1);
									threadWait(2000);
									enterTextboxValue("Certified_Product_List_CPL", "EnterEnrollmentNo", "ESG Values", "CPL", 118, 1);
									threadWait(300);
									scrollToElement("Certified_Product_List_CPL", "SearchButton");
									clickWebelement("Certified_Product_List_CPL", "SearchButton");
									threadWait(7000);
									clickWebelement("Certified_Product_List_CPL", "EnrollmentLink");
									
								}
								
								public static void Verify_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication() {
									clickWebelement("Certified_Product_List_CPL", "ApplicationWorkflowStep");
									Verify_ApplicationWorkflowStep_Measures__EnergyStar_ClothesDryer_MobileApplication();
									HandleErrorCodeOnProcess("helper", "ProcessButton", "");
									//clickonProcess();
								}
								
								public static void Verify_ApplicationWorkflowStep_After_Process_EnergyStar_ClothesDryer_MobileApplication() {
									clickWebelement("Certified_Product_List_CPL", "ApplicationWorkflowStep");
									Verify_ApplicationWorkflowStep_Measures__EnergyStar_ClothesDryer_MobileApplication();
									clickWebelement("Certified_Product_List_CPL", "CloseButton");
								}

								public static void Verify_ApplicationWorkflowStep_Measures__EnergyStar_ClothesDryer_MobileApplication() {

									scrollToElement("Certified_Product_List_CPL", "Navigate_To_Measure_Tab");
									clickWebelement("Certified_Product_List_CPL", "Navigate_To_Measure_Tab");
									
									
									// Verify CPL: Energy Star-Clothes Dryer Mobile Application-Measure -Application Workflow Step
									Pass_Message("Verify CPL: Energy Star-Clothes Dryer Mobile Application-Measure -Application Workflow Step");

									threadWait(300);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_BrandName", "CPL", "ClothesDryer_MobileApplication", 9, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_ModelNumber", "CPL", "ClothesDryer_MobileApplication", 10, 1);
									
									
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_AdditionalDryerFeatures", "CPL", "ClothesDryer_MobileApplication", 16, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_AdditionalModelInformation", "CPL", "ClothesDryer_MobileApplication", 17, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_CalculatedCombinedEnergyFactorMaxDrynessSetting", "CPL", "ClothesDryer_MobileApplication", 18, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_CBModelIdentifier", "CPL", "ClothesDryer_MobileApplication", 19,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_CombinedEnergyFactor", "CPL", "ClothesDryer_MobileApplication", 20,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_CommunicationStandardApplicationLayer", "CPL", "ClothesDryer_MobileApplication", 21, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_Connected", "CPL", "ClothesDryer_MobileApplication", 22, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_ConnectsUsing", "CPL", "ClothesDryer_MobileApplication", 23,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_DateAvailableOnMarket", "CPL", "ClothesDryer_MobileApplication", 24,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_DateCertified", "CPL", "ClothesDryer_MobileApplication", 25, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_Depth", "CPL", "ClothesDryer_MobileApplication", 26, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_DirectonPremisesOpenStandardBasedInterConnection", "CPL", "ClothesDryer_MobileApplication", 27,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_DrumCapacity", "CPL", "ClothesDryer_MobileApplication", 28,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_ENERGYSTARUniqueID", "CPL", "ClothesDryer_MobileApplication", 29, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_EnergyTestCycleInformation", "CPL", "ClothesDryer_MobileApplication", 30, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_EstimatedAnnualEnergyUse", "CPL", "ClothesDryer_MobileApplication", 31,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_EstimatedEnergyTestCycleTime", "CPL", "ClothesDryer_MobileApplication", 32,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_HeatPumpTechnology", "CPL", "ClothesDryer_MobileApplication", 33, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_Height", "CPL", "ClothesDryer_MobileApplication", 34, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_Markets", "CPL", "ClothesDryer_MobileApplication", 35,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_MeetsENERGYSTARMostEfficient2018Criteria", "CPL", "ClothesDryer_MobileApplication", 36,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_ModelName", "CPL", "ClothesDryer_MobileApplication", 37, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_PairedENERGYSTARClothesWasherAvailable", "CPL", "ClothesDryer_MobileApplication", 38, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_PairedENERGYSTARClothesWasherENERGYSTARModelIdentifier", "CPL", "ClothesDryer_MobileApplication", 39,1);			
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_Type", "CPL", "ClothesDryer_MobileApplication", 40, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_UPC", "CPL", "ClothesDryer_MobileApplication", 41,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_VentedorVentless", "CPL", "ClothesDryer_MobileApplication", 42,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_Voltage", "CPL", "ClothesDryer_MobileApplication", 43, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_Width", "CPL", "ClothesDryer_MobileApplication", 44, 1);			
									
									if (Xpath("Certified_Product_List_CPL","Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_MobileApplication_ModelNumber_GreenCheckMark").isDisplayed()) {
										
										test.log(LogStatus.PASS, "Model Number Green Check Mark verified Successfully");
										
									} else {
										
										test.log(LogStatus.FAIL, "Failed to verify Model Number Green Check Mark");

									}
									
								}		
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
		//****************************************************CPL Energy Star Ceiling Fan Backend Enrollment*****************************************************************************
								
								public static void Open_BackendEnrollment_EnergyStar_CeilingFan() {
									login("Helper", "BaseURL", 2, 0, 2, 1);
									//createEnrollment( "CPL", "CeilingFan_BackendEnrollment", 2, 1, 3, 1);
									WaitForElement(300, "Certified_Product_List_CPL", "MainMenu");
									ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "ESG Values", "CPL", 35, 1);
									clickWebelement("Certified_Product_List_CPL", "NewEnrollmentButton");
									selectDropdown("Certified_Product_List_CPL", "SelectProgram","", "ESG Values","CPL", 331, 1);
									clickWebelement("Certified_Product_List_CPL", "NextButton1");
									enterTextboxValue("Certified_Product_List_CPL", "SearchBox", "ESG Values","CPL" , 330, 1);
									clickWebelement("Certified_Product_List_CPL", "SearchButton1");
									WaitForElement(300, "Certified_Product_List_CPL", "CustomerLink");
									clickWebelement("Certified_Product_List_CPL", "CustomerLink");
									clickWebelement("Certified_Product_List_CPL", "NextButton1");
								}
								
								public static void Complete_Measure_EnergyStar_CeilingFan_BackendEnrollment() {
									
									scrollToElement("Certified_Product_List_CPL", "Navigate_To_Measure_Tab");
									clickWebelement("Certified_Product_List_CPL", "Navigate_To_Measure_Tab");
									
									threadWait(5000);
									clickWebelement("Certified_Product_List_CPL", "AddMeasure_Button");
									clickWebelement("Certified_Product_List_CPL", "Select_Measure_CeilingFan_BackendEnrollment");
									clickWebelement("Certified_Product_List_CPL", "Save_Button_BackendEnrollment");
									
									// Enter Value for CPL: Energy Star - Ceiling Fan - Residential Backend Enrollment
									Pass_Message("Enter Value for CPL: Energy Star - Ceiling Fan - Residential Backend Enrollment");
									threadWait(300);
									clickWebelement("Certified_Product_List_CPL", "Access_MeasureField");
									clickWebelement("Certified_Product_List_CPL", "Select_Measure_Qty_BackendEnrollment");
									enterTextboxValue("Certified_Product_List_CPL", "Select_Measure_Qty_BackendEnrollment", "CPL", "CeilingFan_BackendEnrollment", 8, 1);
									threadWait(2000);
									
									clickWebelement("Certified_Product_List_CPL", "Complete_Measure_CeilingFan_BackendEnrollment_BrandName");
									enterTextboxValue("Certified_Product_List_CPL", "Complete_Measure_CeilingFan_BackendEnrollment_BrandName", "CPL", "CeilingFan_BackendEnrollment", 9, 1);
									Enter(KeyEvent.VK_ENTER);
									threadWait(2000);
									clickWebelement("Certified_Product_List_CPL", "Complete_Measure_CeilingFan_BackendEnrollment_ModelNumber");
									enterTextboxValue("Certified_Product_List_CPL", "Complete_Measure_CeilingFan_BackendEnrollment_ModelNumber", "CPL", "CeilingFan_BackendEnrollment", 10, 1);
									Enter(KeyEvent.VK_ENTER);
									//explicitWait(30, "Certified_Product_List_CPL", "CeilingFan_BackendEnrollment_Step1_ModelNumber");
									threadWait(2000);
									clickWebelement("Certified_Product_List_CPL", "Complete_Measure_CeilingFan_BackendEnrollment_ProductType");
									enterTextboxValue("Certified_Product_List_CPL", "Complete_Measure_CeilingFan_BackendEnrollment_ProductType", "CPL", "CeilingFan_BackendEnrollment", 11, 1);
									Enter(KeyEvent.VK_ENTER);
									threadWait(2000);
									clickWebelement("Certified_Product_List_CPL", "Complete_Measure_CeilingFan_BackendEnrollment_BladeSpan");
									enterTextboxValue("Certified_Product_List_CPL", "Complete_Measure_CeilingFan_BackendEnrollment_BladeSpan", "CPL", "CeilingFan_BackendEnrollment", 12, 1);
									Enter(KeyEvent.VK_ENTER);

									// Verify CPL: Energy Star - Ceiling Fan - Residential Backend Enrollment
									Pass_Message("Verify CPL: Energy Star - Ceiling Fan - Residential Backend Enrollment");
									
									threadWait(300);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_AdditionalModelInformation", "CPL", "CeilingFan_BackendEnrollment", 16, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_CBModelIdentifier", "CPL", "CeilingFan_BackendEnrollment", 17, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_CeilingFan_BackendEnrollmentComponentsWarranty", "CPL", "CeilingFan_BackendEnrollment", 18, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_CeilingFan_BackendEnrollmentEfficiency", "CPL", "CeilingFan_BackendEnrollment", 19,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_CeilingFan_BackendEnrollmentFeatures", "CPL", "CeilingFan_BackendEnrollment", 20,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_ConnectedFunctionality", "CPL", "CeilingFan_BackendEnrollment", 21, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_ConnectsUsing", "CPL", "CeilingFan_BackendEnrollment", 22, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_DateAvailableOnMarket", "CPL", "CeilingFan_BackendEnrollment", 23,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_DateCertified", "CPL", "CeilingFan_BackendEnrollment", 24,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_ENERGYSTARLampESUID", "CPL", "CeilingFan_BackendEnrollment", 25, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_ENERGYSTARLampPartner", "CPL", "CeilingFan_BackendEnrollment", 26, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_ENERGYSTARPartner", "CPL", "CeilingFan_BackendEnrollment", 27,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_ENERGYSTARUniqueID", "CPL", "CeilingFan_BackendEnrollment", 28,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_FanPowerConsumptionHighSpeed", "CPL", "CeilingFan_BackendEnrollment", 29, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_FanPowerConsumptionLowSpeed", "CPL", "CeilingFan_BackendEnrollment", 30, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_FanPowerConsumptionStandby", "CPL", "CeilingFan_BackendEnrollment", 31,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_IndoorOutdoor", "CPL", "CeilingFan_BackendEnrollment", 32,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_LampModelNumber", "CPL", "CeilingFan_BackendEnrollment", 33, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_LightColorAppearance", "CPL", "CeilingFan_BackendEnrollment", 34, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_LightColorQuality", "CPL", "CeilingFan_BackendEnrollment", 35,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_LightKitDimmability", "CPL", "CeilingFan_BackendEnrollment", 36,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_LightSourceConnectionBaseType", "CPL", "CeilingFan_BackendEnrollment", 37, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_LightSourceRatedLife", "CPL", "CeilingFan_BackendEnrollment", 38, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_LightSourceTechnology", "CPL", "CeilingFan_BackendEnrollment", 39,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_LightSourcesPerLightKit", "CPL", "CeilingFan_BackendEnrollment", 40,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_LightingEfficiencyMeasuredAtTheSource", "CPL", "CeilingFan_BackendEnrollment", 41, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_LightingEfficiencyMeasuredOutsideTheFixture", "CPL", "CeilingFan_BackendEnrollment", 42, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_Markets", "CPL", "CeilingFan_BackendEnrollment", 43,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_MeetsENERGYSTARMostEfficient2018Criteria", "CPL", "CeilingFan_BackendEnrollment", 44,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_ModelName", "CPL", "CeilingFan_BackendEnrollment", 45, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_PowerFactorOfLightKit", "CPL", "CeilingFan_BackendEnrollment", 46, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_ShippedWithENERGYSTARLamp", "CPL", "CeilingFan_BackendEnrollment", 47,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_SpecialLightingFeatures", "CPL", "CeilingFan_BackendEnrollment", 48,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_TotalLightOutput", "CPL", "CeilingFan_BackendEnrollment", 49, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_TotalLightingInputPower", "CPL", "CeilingFan_BackendEnrollment", 50, 1);
									
									if (Xpath("Certified_Product_List_CPL","Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_BladeSpan_GreenCheckMark").isDisplayed()) {
										
										test.log(LogStatus.PASS, "Blade Span Green Check Mark verified Successfully");
										
									} else {
										
										test.log(LogStatus.FAIL, "Failed to verify Blade Span Green Check Mark");

									}
									
									HandleErrorCodeOnProcess("helper", "ProcessButton", "");
									//clickonProcess();
								}
								
														
								public static void Verify_ApplicationWorkflowStep_After_Process_EnergyStar_CeilingFan_BackendEnrollment() {
									clickWebelement("Certified_Product_List_CPL", "ApplicationWorkflowStep");
								
									scrollToElement("Certified_Product_List_CPL", "Navigate_To_Measure_Tab");
									clickWebelement("Certified_Product_List_CPL", "Navigate_To_Measure_Tab");
									
									
									// Verify CPL: Energy Star-Ceiling Fan Backend Enrollment-Measure -Application Workflow Step
									Pass_Message("Verify CPL: Energy Star-Ceiling Fan Backend Enrollment-Measure -Application Workflow Step");

									threadWait(300);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_BrandName", "CPL", "CeilingFan_BackendEnrollment", 9, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_ModelNumber", "CPL", "CeilingFan_BackendEnrollment", 10, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_ProductType", "CPL", "CeilingFan_BackendEnrollment", 11, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_BladeSpan", "CPL", "CeilingFan_BackendEnrollment", 12,1);
									
									
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_AdditionalModelInformation", "CPL", "CeilingFan_BackendEnrollment", 16, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_CBModelIdentifier", "CPL", "CeilingFan_BackendEnrollment", 17, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_CeilingFan_BackendEnrollmentComponentsWarranty", "CPL", "CeilingFan_BackendEnrollment", 18, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_CeilingFan_BackendEnrollmentEfficiency", "CPL", "CeilingFan_BackendEnrollment", 19,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_CeilingFan_BackendEnrollmentFeatures", "CPL", "CeilingFan_BackendEnrollment", 20,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_ConnectedFunctionality", "CPL", "CeilingFan_BackendEnrollment", 21, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_ConnectsUsing", "CPL", "CeilingFan_BackendEnrollment", 22, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_DateAvailableOnMarket", "CPL", "CeilingFan_BackendEnrollment", 23,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_DateCertified", "CPL", "CeilingFan_BackendEnrollment", 24,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_ENERGYSTARLampESUID", "CPL", "CeilingFan_BackendEnrollment", 25, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_ENERGYSTARLampPartner", "CPL", "CeilingFan_BackendEnrollment", 26, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_ENERGYSTARPartner", "CPL", "CeilingFan_BackendEnrollment", 27,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_ENERGYSTARUniqueID", "CPL", "CeilingFan_BackendEnrollment", 28,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_FanPowerConsumptionHighSpeed", "CPL", "CeilingFan_BackendEnrollment", 29, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_FanPowerConsumptionLowSpeed", "CPL", "CeilingFan_BackendEnrollment", 30, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_FanPowerConsumptionStandby", "CPL", "CeilingFan_BackendEnrollment", 31,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_IndoorOutdoor", "CPL", "CeilingFan_BackendEnrollment", 32,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_LampModelNumber", "CPL", "CeilingFan_BackendEnrollment", 33, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_LightColorAppearance", "CPL", "CeilingFan_BackendEnrollment", 34, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_LightColorQuality", "CPL", "CeilingFan_BackendEnrollment", 35,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_LightKitDimmability", "CPL", "CeilingFan_BackendEnrollment", 36,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_LightSourceConnectionBaseType", "CPL", "CeilingFan_BackendEnrollment", 37, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_LightSourceRatedLife", "CPL", "CeilingFan_BackendEnrollment", 38, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_LightSourceTechnology", "CPL", "CeilingFan_BackendEnrollment", 39,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_LightSourcesPerLightKit", "CPL", "CeilingFan_BackendEnrollment", 40,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_LightingEfficiencyMeasuredAtTheSource", "CPL", "CeilingFan_BackendEnrollment", 41, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_LightingEfficiencyMeasuredOutsideTheFixture", "CPL", "CeilingFan_BackendEnrollment", 42, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_Markets", "CPL", "CeilingFan_BackendEnrollment", 43,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_MeetsENERGYSTARMostEfficient2018Criteria", "CPL", "CeilingFan_BackendEnrollment", 44,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_ModelName", "CPL", "CeilingFan_BackendEnrollment", 45, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_PowerFactorOfLightKit", "CPL", "CeilingFan_BackendEnrollment", 46, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_ShippedWithENERGYSTARLamp", "CPL", "CeilingFan_BackendEnrollment", 47,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_SpecialLightingFeatures", "CPL", "CeilingFan_BackendEnrollment", 48,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_TotalLightOutput", "CPL", "CeilingFan_BackendEnrollment", 49, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_TotalLightingInputPower", "CPL", "CeilingFan_BackendEnrollment", 50, 1);
									
									if (Xpath("Certified_Product_List_CPL","Verify_Measure_ApplicationWorkflowStep_EnergyStar_CeilingFan_BackendEnrollment_BladeSpan_GreenCheckMark").isDisplayed()) {
										
										test.log(LogStatus.PASS, "Blade Span Green Check Mark verified Successfully");
										
									} else {
										
										test.log(LogStatus.FAIL, "Failed to verify Blade Span Green Check Mark");

									}
									
									clickWebelement("Certified_Product_List_CPL", "CloseButton");
									
								}
								
		//****************************************************CPL Energy Star Clothes Washer Backend Enrollment*****************************************************************************
								public static void Open_BackendEnrollment_EnergyStar_ClothesWasher() {
									login("Helper", "BaseURL", 2, 0, 2, 1);
									//createEnrollment( "CPL", "ClothesWasher_BackendEnrollment", 2, 1, 3, 1);
									WaitForElement(300, "Certified_Product_List_CPL", "MainMenu");
									ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "ESG Values", "CPL", 35, 1);
									clickWebelement("Certified_Product_List_CPL", "NewEnrollmentButton");
									selectDropdown("Certified_Product_List_CPL", "SelectProgram","", "ESG Values","CPL", 331, 1);
									clickWebelement("Certified_Product_List_CPL", "NextButton1");
									enterTextboxValue("Certified_Product_List_CPL", "SearchBox", "ESG Values","CPL" , 330, 1);
									clickWebelement("Certified_Product_List_CPL", "SearchButton1");
									WaitForElement(300, "Certified_Product_List_CPL", "CustomerLink");
									clickWebelement("Certified_Product_List_CPL", "CustomerLink");
									clickWebelement("Certified_Product_List_CPL", "NextButton1");
								}
								
								public static void Complete_Measure_ClothesWasher_BackendEnrollment() {
									
									scrollToElement("Certified_Product_List_CPL", "Navigate_To_Measure_Tab");
									clickWebelement("Certified_Product_List_CPL", "Navigate_To_Measure_Tab");
									
									threadWait(5000);
									clickWebelement("Certified_Product_List_CPL", "AddMeasure_Button");
									clickWebelement("Certified_Product_List_CPL", "Select_Measure_ClothesWasher_BackendEnrollment");
									clickWebelement("Certified_Product_List_CPL", "Save_Button_BackendEnrollment");
								    				
									// Enter Value for CPL: Energy Star - Clothes Washer Backend Enrollment Backend Enrollment - Residential
									Pass_Message("Enter Value for CPL: Energy Star - Clothes Washer - Residential Backend Enrollment");
									
									threadWait(300);
									clickWebelement("Certified_Product_List_CPL", "Access_MeasureField");
									clickWebelement("Certified_Product_List_CPL", "Select_Measure_Qty_BackendEnrollment");
									enterTextboxValue("Certified_Product_List_CPL", "Select_Measure_Qty_BackendEnrollment", "CPL", "ClothesWasher_BackendEnrollment", 8, 1);
									threadWait(2000);
									
									clickWebelement("Certified_Product_List_CPL", "Complete_Measure_ClothesWasher_BackendEnrollment_BrandName");
									enterTextboxValue("Certified_Product_List_CPL", "Complete_Measure_ClothesWasher_BackendEnrollment_BrandName", "CPL", "ClothesWasher_BackendEnrollment", 9, 1);
									Enter(KeyEvent.VK_ENTER);
									threadWait(2000);
									clickWebelement("Certified_Product_List_CPL", "Complete_Measure_ClothesWasher_BackendEnrollment_ModelNumber");
									enterTextboxValue("Certified_Product_List_CPL", "Complete_Measure_ClothesWasher_BackendEnrollment_ModelNumber", "CPL", "ClothesWasher_BackendEnrollment", 10, 1);
									Enter(KeyEvent.VK_ENTER);
									
									// Verify CPL: Energy Star - Clothes Washer Backend Enrollment Backend Enrollment - Residential
									Pass_Message("Verify CPL: Energy Star - Clothes Washer Backend Enrollment Backend Enrollment - Residential");
									
									threadWait(300);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_LoadConfiguration", "CPL", "ClothesWasher_BackendEnrollment", 16, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_AdditionalModelInformation", "CPL", "ClothesWasher_BackendEnrollment", 17, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_AdditionalWasherFeatures", "CPL", "ClothesWasher_BackendEnrollment", 18, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_AnnualEnergyUse", "CPL", "ClothesWasher_BackendEnrollment", 19,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_AnnualWaterUse", "CPL", "ClothesWasher_BackendEnrollment", 20,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_CommunicationStandardApplicationLayer", "CPL", "ClothesWasher_BackendEnrollment", 21, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_Connected", "CPL", "ClothesWasher_BackendEnrollment", 22, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_ConnectsUsing", "CPL", "ClothesWasher_BackendEnrollment", 23,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_DateAvailableOnMarket", "CPL", "ClothesWasher_BackendEnrollment", 24,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_DateCertified", "CPL", "ClothesWasher_BackendEnrollment", 25, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_DirectonPremisesOpenStandardBasedInterConnection", "CPL", "ClothesWasher_BackendEnrollment", 26, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_ENERGYSTARModelIdentifier", "CPL", "ClothesWasher_BackendEnrollment", 27,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_ENERGYSTARUniqueID", "CPL", "ClothesWasher_BackendEnrollment", 28,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_IntegratedModifiedEnergyFactor", "CPL", "ClothesWasher_BackendEnrollment", 29, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_IntegratedWaterFactor", "CPL", "ClothesWasher_BackendEnrollment", 30, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_IntendedMarket", "CPL", "ClothesWasher_BackendEnrollment", 31,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_Markets", "CPL", "ClothesWasher_BackendEnrollment", 32,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_MeetsENERGYSTARMostEfficient2018Criteria", "CPL", "ClothesWasher_BackendEnrollment", 33, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_PairedENERGYSTARClothesDryerAvailable", "CPL", "ClothesWasher_BackendEnrollment", 34, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_PairedENERGYSTARClothesDryerENERGYSTARModelIdentifier", "CPL", "ClothesWasher_BackendEnrollment", 35,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_UPC", "CPL", "ClothesWasher_BackendEnrollment", 36,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_USFederalStandard_IMEF", "CPL", "ClothesWasher_BackendEnrollment", 37, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_USFederalStandard_IWF", "CPL", "ClothesWasher_BackendEnrollment", 38, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_Volume", "CPL", "ClothesWasher_BackendEnrollment", 39,1);			
									
									if (Xpath("Certified_Product_List_CPL","Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_ModelNumber_GreenCheckMark").isDisplayed()) {
										
										test.log(LogStatus.PASS, "Model Number Green Check Mark verified Successfully");
										
									} else {
										
										test.log(LogStatus.FAIL, "Failed to verify Model Number Green Check Mark");

									}
									HandleErrorCodeOnProcess("helper", "ProcessButton", "");
									//clickonProcess();
								}
								
				              
								
								public static void Verify_ApplicationWorkflowStep_After_Process_EnergyStar_ClothesWasher_BackendEnrollment() {
									clickWebelement("Certified_Product_List_CPL", "ApplicationWorkflowStep");
									
									scrollToElement("Certified_Product_List_CPL", "Navigate_To_Measure_Tab");
									clickWebelement("Certified_Product_List_CPL", "Navigate_To_Measure_Tab");
									
									
									// Verify CPL: Energy Star-Clothes Washer Backend Enrollment Backend Enrollment-Measure -Application Workflow Step
									Pass_Message("Verify CPL: Energy Star-Clothes Washer Backend Enrollment Backend Enrollment-Measure -Application Workflow Step");

									threadWait(300);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_BrandName", "CPL", "ClothesWasher_BackendEnrollment", 9, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_ModelNumber", "CPL", "ClothesWasher_BackendEnrollment", 10, 1);
									
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_LoadConfiguration", "CPL", "ClothesWasher_BackendEnrollment", 16, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_AdditionalModelInformation", "CPL", "ClothesWasher_BackendEnrollment", 17, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_AdditionalWasherFeatures", "CPL", "ClothesWasher_BackendEnrollment", 18, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_AnnualEnergyUse", "CPL", "ClothesWasher_BackendEnrollment", 19,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_AnnualWaterUse", "CPL", "ClothesWasher_BackendEnrollment", 20,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_CommunicationStandardApplicationLayer", "CPL", "ClothesWasher_BackendEnrollment", 21, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_Connected", "CPL", "ClothesWasher_BackendEnrollment", 22, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_ConnectsUsing", "CPL", "ClothesWasher_BackendEnrollment", 23,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_DateAvailableOnMarket", "CPL", "ClothesWasher_BackendEnrollment", 24,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_DateCertified", "CPL", "ClothesWasher_BackendEnrollment", 25, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_DirectonPremisesOpenStandardBasedInterConnection", "CPL", "ClothesWasher_BackendEnrollment", 26, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_ENERGYSTARModelIdentifier", "CPL", "ClothesWasher_BackendEnrollment", 27,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_ENERGYSTARUniqueID", "CPL", "ClothesWasher_BackendEnrollment", 28,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_IntegratedModifiedEnergyFactor", "CPL", "ClothesWasher_BackendEnrollment", 29, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_IntegratedWaterFactor", "CPL", "ClothesWasher_BackendEnrollment", 30, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_IntendedMarket", "CPL", "ClothesWasher_BackendEnrollment", 31,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_Markets", "CPL", "ClothesWasher_BackendEnrollment", 32,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_MeetsENERGYSTARMostEfficient2018Criteria", "CPL", "ClothesWasher_BackendEnrollment", 33, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_PairedENERGYSTARClothesDryerAvailable", "CPL", "ClothesWasher_BackendEnrollment", 34, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_PairedENERGYSTARClothesDryerENERGYSTARModelIdentifier", "CPL", "ClothesWasher_BackendEnrollment", 35,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_UPC", "CPL", "ClothesWasher_BackendEnrollment", 36,1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_USFederalStandard_IMEF", "CPL", "ClothesWasher_BackendEnrollment", 37, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_USFederalStandard_IWF", "CPL", "ClothesWasher_BackendEnrollment", 38, 1);
									VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_Volume", "CPL", "ClothesWasher_BackendEnrollment", 39,1);			
									
									if (Xpath("Certified_Product_List_CPL","Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesWasher_BackendEnrollment_ModelNumber_GreenCheckMark").isDisplayed()) {
										
										test.log(LogStatus.PASS, "Model Number Green Check Mark verified Successfully");
										
									} else {
										
										test.log(LogStatus.FAIL, "Failed to verify Model Number Green Check Mark");

									}
									
									clickWebelement("Certified_Product_List_CPL", "CloseButton");
									
								}
								
		//****************************************************CPL Energy Star Clothes Dryer Backend Enrollment*****************************************************************************
								
								public static void Open_BackendEnrollment_EnergyStar_ClothesDryer() {
									login("Helper", "BaseURL", 2, 0, 2, 1);
									//createEnrollment( "CPL", "ClothesDryer_BackendEnrollment", 2, 1, 3, 1);
									WaitForElement(300, "Certified_Product_List_CPL", "MainMenu");
									ClickByActionClass("Certified_Product_List_CPL", "MainMenu", "ESG Values", "CPL", 35, 1);
									clickWebelement("Certified_Product_List_CPL", "NewEnrollmentButton");
									selectDropdown("Certified_Product_List_CPL", "SelectProgram","", "ESG Values","CPL", 331, 1);
									clickWebelement("Certified_Product_List_CPL", "NextButton1");
									enterTextboxValue("Certified_Product_List_CPL", "SearchBox", "ESG Values","CPL" , 330, 1);
									clickWebelement("Certified_Product_List_CPL", "SearchButton1");
									explicitWaitForClickable(300, "Certified_Product_List_CPL", "CustomerLink");
									clickWebelement("Certified_Product_List_CPL", "CustomerLink");
									clickWebelement("Certified_Product_List_CPL", "NextButton1");
									
								}
		
										public static void Complete_Measure_ClothesDryer_BackendEnrollment() {
											
											scrollToElement("Certified_Product_List_CPL", "Navigate_To_Measure_Tab");
											clickWebelement("Certified_Product_List_CPL", "Navigate_To_Measure_Tab");
											
											threadWait(5000);
											clickWebelement("Certified_Product_List_CPL", "AddMeasure_Button");
											clickWebelement("Certified_Product_List_CPL", "Select_Measure_ClothesDryer_BackendEnrollment");
											clickWebelement("Certified_Product_List_CPL", "Save_Button_BackendEnrollment");
										    								
											// Enter Value for CPL: Energy Star - Clothes Dryer Backend Enrollment - Residential
											Pass_Message("Enter Value for CPL: Energy Star - Clothes Dryer Backend Enrollment - Residential Step-3");
											
											threadWait(300);
											clickWebelement("Certified_Product_List_CPL", "Access_MeasureField");
											clickWebelement("Certified_Product_List_CPL", "Select_Measure_Qty_BackendEnrollment");
											enterTextboxValue("Certified_Product_List_CPL", "Select_Measure_Qty_BackendEnrollment", "CPL", "ClothesDryer_BackendEnrollment", 8, 1);
											threadWait(2000);
											
											clickWebelement("Certified_Product_List_CPL", "Complete_Measure_ClothesDryer_BackendEnrollment_BrandName");
											enterTextboxValue("Certified_Product_List_CPL", "Complete_Measure_ClothesDryer_BackendEnrollment_BrandName", "CPL", "ClothesDryer_BackendEnrollment", 9, 1);
											Enter(KeyEvent.VK_ENTER);
											threadWait(2000);
											clickWebelement("Certified_Product_List_CPL", "Complete_Measure_ClothesDryer_BackendEnrollment_ModelNumber");
											enterTextboxValue("Certified_Product_List_CPL", "Complete_Measure_ClothesDryer_BackendEnrollment_ModelNumber", "CPL", "ClothesDryer_BackendEnrollment", 10, 1);
											Enter(KeyEvent.VK_ENTER);
											
											
											// Verify CPL: Energy Star - Clothes Dryer Backend Enrollment - Residential
											Pass_Message("Verify CPL: Energy Star - Clothes Dryer Backend Enrollment - Residential");
											
											threadWait(300);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_AdditionalDryerFeatures", "CPL", "ClothesDryer_BackendEnrollment", 16, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_AdditionalModelInformation", "CPL", "ClothesDryer_BackendEnrollment", 17, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_CalculatedCombinedEnergyFactorMaxDrynessSetting", "CPL", "ClothesDryer_BackendEnrollment", 18, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_CBModelIdentifier", "CPL", "ClothesDryer_BackendEnrollment", 19,1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_CombinedEnergyFactor", "CPL", "ClothesDryer_BackendEnrollment", 20,1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_CommunicationStandardApplicationLayer", "CPL", "ClothesDryer_BackendEnrollment", 21, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_Connected", "CPL", "ClothesDryer_BackendEnrollment", 22, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_ConnectsUsing", "CPL", "ClothesDryer_BackendEnrollment", 23,1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_DateAvailableOnMarket", "CPL", "ClothesDryer_BackendEnrollment", 24,1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_DateCertified", "CPL", "ClothesDryer_BackendEnrollment", 25, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_Depth", "CPL", "ClothesDryer_BackendEnrollment", 26, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_DirectonPremisesOpenStandardBasedInterConnection", "CPL", "ClothesDryer_BackendEnrollment", 27,1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_DrumCapacity", "CPL", "ClothesDryer_BackendEnrollment", 28,1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_ENERGYSTARUniqueID", "CPL", "ClothesDryer_BackendEnrollment", 29, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_EnergyTestCycleInformation", "CPL", "ClothesDryer_BackendEnrollment", 30, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_EstimatedAnnualEnergyUse", "CPL", "ClothesDryer_BackendEnrollment", 31,1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_EstimatedEnergyTestCycleTime", "CPL", "ClothesDryer_BackendEnrollment", 32,1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_HeatPumpTechnology", "CPL", "ClothesDryer_BackendEnrollment", 33, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_Height", "CPL", "ClothesDryer_BackendEnrollment", 34, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_Markets", "CPL", "ClothesDryer_BackendEnrollment", 35,1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_MeetsENERGYSTARMostEfficient2018Criteria", "CPL", "ClothesDryer_BackendEnrollment", 36,1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_ModelName", "CPL", "ClothesDryer_BackendEnrollment", 37, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_PairedENERGYSTARClothesWasherAvailable", "CPL", "ClothesDryer_BackendEnrollment", 38, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_PairedENERGYSTARClothesWasherENERGYSTARModelIdentifier", "CPL", "ClothesDryer_BackendEnrollment", 39,1);			
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_Type", "CPL", "ClothesDryer_BackendEnrollment", 40, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_UPC", "CPL", "ClothesDryer_BackendEnrollment", 41,1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_VentedorVentless", "CPL", "ClothesDryer_BackendEnrollment", 42,1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_Voltage", "CPL", "ClothesDryer_BackendEnrollment", 43, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_Width", "CPL", "ClothesDryer_BackendEnrollment", 44, 1);			
											
											if (Xpath("Certified_Product_List_CPL","Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_ModelNumber_GreenCheckMark").isDisplayed()) {
												
												test.log(LogStatus.PASS, "Model Number Green Check Mark verified Successfully");
												
											} else {
												
												test.log(LogStatus.FAIL, "Failed to verify Model Number Green Check Mark");

											}
											
											HandleErrorCodeOnProcess("helper", "ProcessButton", "");
											//clickonProcess();
										}
										
										
										
										public static void Verify_ApplicationWorkflowStep_After_Process_EnergyStar_ClothesDryer_BackendEnrollment() {
											clickWebelement("Certified_Product_List_CPL", "ApplicationWorkflowStep");

											scrollToElement("Certified_Product_List_CPL", "Navigate_To_Measure_Tab");
											clickWebelement("Certified_Product_List_CPL", "Navigate_To_Measure_Tab");
											
											
											// Verify CPL: Energy Star-Clothes Dryer Backend Enrollment-Measure -Application Workflow Step
											Pass_Message("Verify CPL: Energy Star-Clothes Dryer Backend Enrollment-Measure -Application Workflow Step");

											threadWait(300);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_BrandName", "CPL", "ClothesDryer_BackendEnrollment", 9, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_ModelNumber", "CPL", "ClothesDryer_BackendEnrollment", 10, 1);
											
											
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_AdditionalDryerFeatures", "CPL", "ClothesDryer_BackendEnrollment", 16, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_AdditionalModelInformation", "CPL", "ClothesDryer_BackendEnrollment", 17, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_CalculatedCombinedEnergyFactorMaxDrynessSetting", "CPL", "ClothesDryer_BackendEnrollment", 18, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_CBModelIdentifier", "CPL", "ClothesDryer_BackendEnrollment", 19,1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_CombinedEnergyFactor", "CPL", "ClothesDryer_BackendEnrollment", 20,1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_CommunicationStandardApplicationLayer", "CPL", "ClothesDryer_BackendEnrollment", 21, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_Connected", "CPL", "ClothesDryer_BackendEnrollment", 22, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_ConnectsUsing", "CPL", "ClothesDryer_BackendEnrollment", 23,1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_DateAvailableOnMarket", "CPL", "ClothesDryer_BackendEnrollment", 24,1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_DateCertified", "CPL", "ClothesDryer_BackendEnrollment", 25, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_Depth", "CPL", "ClothesDryer_BackendEnrollment", 26, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_DirectonPremisesOpenStandardBasedInterConnection", "CPL", "ClothesDryer_BackendEnrollment", 27,1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_DrumCapacity", "CPL", "ClothesDryer_BackendEnrollment", 28,1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_ENERGYSTARUniqueID", "CPL", "ClothesDryer_BackendEnrollment", 29, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_EnergyTestCycleInformation", "CPL", "ClothesDryer_BackendEnrollment", 30, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_EstimatedAnnualEnergyUse", "CPL", "ClothesDryer_BackendEnrollment", 31,1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_EstimatedEnergyTestCycleTime", "CPL", "ClothesDryer_BackendEnrollment", 32,1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_HeatPumpTechnology", "CPL", "ClothesDryer_BackendEnrollment", 33, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_Height", "CPL", "ClothesDryer_BackendEnrollment", 34, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_Markets", "CPL", "ClothesDryer_BackendEnrollment", 35,1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_MeetsENERGYSTARMostEfficient2018Criteria", "CPL", "ClothesDryer_BackendEnrollment", 36,1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_ModelName", "CPL", "ClothesDryer_BackendEnrollment", 37, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_PairedENERGYSTARClothesWasherAvailable", "CPL", "ClothesDryer_BackendEnrollment", 38, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_PairedENERGYSTARClothesWasherENERGYSTARModelIdentifier", "CPL", "ClothesDryer_BackendEnrollment", 39,1);			
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_Type", "CPL", "ClothesDryer_BackendEnrollment", 40, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_UPC", "CPL", "ClothesDryer_BackendEnrollment", 41,1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_VentedorVentless", "CPL", "ClothesDryer_BackendEnrollment", 42,1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_Voltage", "CPL", "ClothesDryer_BackendEnrollment", 43, 1);
											VerifyElementForExistingValueWithText("Certified_Product_List_CPL", "Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_Width", "CPL", "ClothesDryer_BackendEnrollment", 44, 1);			
											
											if (Xpath("Certified_Product_List_CPL","Verify_Measure_ApplicationWorkflowStep_EnergyStar_ClothesDryer_BackendEnrollment_ModelNumber_GreenCheckMark").isDisplayed()) {
												
												test.log(LogStatus.PASS, "Model Number Green Check Mark verified Successfully");
												
											} else {
												
												test.log(LogStatus.FAIL, "Failed to verify Model Number Green Check Mark");

											}
											
											
											clickWebelement("Certified_Product_List_CPL", "CloseButton");
											
										}		
							
				
}

	
