package twc.Automation.ExecutableTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;



import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.TemporaryFilesystem;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import twc.Automation.Driver.Drivers;
import twc.Automation.General.DeviceStatus;
import twc.Automation.General.loginModule;
import twc.Automation.HandleMapLocal.MapLocalFunctions;
import twc.Automation.HandleWithApp.AppFunctions;
import twc.Automation.HandleWithAppium.AppiumFunctions;
import twc.Automation.HandleWithCharles.CharlesFunctions;
import twc.Automation.ReadDataFromFile.read_excel_data;
import twc.Automation.ReadDataFromFile.read_xml_data_into_buffer;
import twc.Automation.RetryAnalyzer.RetryAnalyzer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import twc.Automation.Driver.Drivers;
import twc.Automation.General.loginModule;
import twc.Automation.HandleMapLocal.MapLocalFunctions;
import twc.Automation.HandleWithApp.AppFunctions;
import twc.Automation.HandleWithAppium.AppiumFunctions;
import twc.Automation.HandleWithCharles.CharlesFunctions;
import twc.Automation.RetryAnalyzer.RetryAnalyzer;
import twc.Automation.General.Functions;


public class ApkDowload extends Drivers {
	
	
	

	public static String  ipAddress=null;
	public static String  portNumber=null;

//	public static String  portNumber="8222";
	@Test(priority=1)
	public void downloadApkfromAppTester() throws Exception {
		AppiumFunctions.UnInstallApp();
		AppiumFunctions.LaunchAppWithFullReset();
		Thread.sleep(20000);
	}
	  
	@Test(priority=2)
	public void installApkinDevice() throws Exception {
		AppiumFunctions.installapk();
		Thread.sleep(20000);

		Ad.closeApp();
	}
	  
	
	@BeforeTest
	public void Before_Test() throws Exception {
		System.out.println("================= Before Test Started =========================");
	AppiumFunctions.getIpaddress();		
		Drivers.property();
		//ipAddress=properties.getProperty("currentIpAddress");
		//portNumber=properties.getProperty("PortNumber");
		
		String CurrentWifiName=properties.getProperty("deviceWifiName");
		AppiumFunctions.LaunchSettingsAppWithFullReset();		
	AppiumFunctions.settingProxyEnable("Manual",AppiumFunctions.current_IPAddress,AppiumFunctions.Android_PortNumber);
		
	Thread.sleep(20000);
		
		//AppiumFunctions.LaunchSettingsAppWithFullReset();
		//proxy offf
	  AppiumFunctions.settingProxyOff("None");
		
	
		//proxyenable
		
		System.out.println("================= Before Test End =========================");
	}

	
	

	
	@AfterTest
	public void After_Test() throws Exception {
		/*
		 * System.out.println("After Test started");
		 * 
		 * TemporaryFilesystem.getDefaultTmpFS().deleteTemporaryFiles(); Ad.quit();
		 */

	}

}
