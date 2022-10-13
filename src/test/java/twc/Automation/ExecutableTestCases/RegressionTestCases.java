package twc.Automation.ExecutableTestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.io.File;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import io.qameta.allure.Description;
import twc.Automation.General.Functions;
import twc.Automation.General.TwcAndroidBaseTest;
import twc.Automation.General.Utils;
import twc.Automation.HandleWithApp.AppFunctions;
import twc.Automation.HandleWithAppium.AppiumFunctions;
import twc.Automation.HandleWithCharles.CharlesFunctions;
import twc.Automation.HandleWithCharles.CharlesProxy;

public class RegressionTestCases extends  TwcAndroidBaseTest{

	public static String CurrentWifiName=null;
	
	private static final String CONFIG_FILE_PATH = "charles_common.config";
	private static final String BN_SEVERE1_CONFIG_FILE_PATH = "BNSevere1charles_common.config";
	private static final String BN_SEVERE2_CONFIG_FILE_PATH = "BNSevere2charles_common.config";
	// public static CharlesProxy proxy;
	public File configFile;
	private CharlesProxy proxy;
	
	@BeforeClass(alwaysRun = true)
    public void beforeClass() throws Exception {	
	this.configFile = this.charlesGeneralConfigFile(CONFIG_FILE_PATH);
	proxy = new CharlesProxy("localhost", 8333, CONFIG_FILE_PATH);
	proxy.startCharlesProxyWithUI();
	proxy.disableRewriting();
    proxy.stopRecording();
	proxy.disableMapLocal();
	proxy.startRecording();
	proxy.clearCharlesSession();
	AppiumFunctions.LaunchAppWithFullReset();
    AppiumFunctions.enter_requiredLocation("30124");	
}
	
	
	
	@Test(priority = 51, enabled = true)
	@Description("Verify amazon aax homescreen adhesive preload ad call")
	public void Verify_amazon_aax_preload_homescreen_adhesive_adcall() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"=========================== amazon aax homescreen adhesive preload ad call ====================");

		System.out.println("****** amazon aax homescreen adhesive preload ad call validation Started");
		logStep("****** amazon aax homescreen adhesive preload ad call validation Started");

		Utils.verifyAAX_SlotId("Smoke", "Pulltorefresh");

	}
	@Test(priority = 52, enabled = true)
	@Description("Verify amazon aax Feed1 preload ad call")
	public void Verify_amazon_aax_preload_feed1_adcall() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== amazon aax feed1 preload ad call ====================");
		System.out.println("****** amazon aax feed1 preload ad call validation Started");
		logStep("****** amazon aax feed1 preload ad call validation Started");
		Utils.verifyAAX_SlotId("Smoke", "Feed1");

	}

	@Test(priority = 53, enabled = true)
	@Description("Verify amazon aax Feed2 preload ad call")
	public void Verify_amazon_aax_preload_feed2_adcall() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== amazon aax feed2 preload ad call ====================");
		System.out.println("****** amazon aax feed2 preload ad call validation Started");
		logStep("****** amazon aax feed2 preload ad call validation Started");
		Utils.verifyAAX_SlotId("Smoke", "Feed2", false);

	}

	@Test(priority = 54, enabled = true)
	@Description("Verify amazon aax Feed3 preload ad call")
	public void Verify_amazon_aax_preload_feed3_adcall() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== amazon aax feed3 preload ad call ====================");
		System.out.println("****** amazon aax feed3 preload ad call validation Started");
		logStep("****** amazon aax feed3 preload ad call validation Started");
		Utils.verifyAAX_SlotId("Smoke", "Feed3", false);

	}

	@Test(priority = 55, enabled = true)
	@Description("Verify amazon aax Feed4 preload ad call")
	public void Verify_amazon_aax_preload_feed4_adcall() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== amazon aax feed4 preload ad call ====================");
		System.out.println("****** amazon aax feed4 preload ad call validation Started");
		logStep("****** amazon aax feed4 preload ad call validation Started");
		Utils.verifyAAX_SlotId("Smoke", "Feed4", false);

	}

	@Test(priority = 57, enabled = true)
	@Description("Verify amazon aax PreRollVideo preload ad call")
	public void Verify_amazon_aax_preload_PreRollVideo_adcall() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== amazon PreRollVideo preload ad call ====================");
		System.out.println("****** amazon aax PreRollVideo preload ad call validation Started");
		logStep("****** amazon aax PreRollVideo preload ad call validation Started");
		Utils.verifyAAX_SlotId("Smoke", "PreRollVideo");

	}

	@Test(priority = 58, enabled = true)
	@Description("Verify amazon aax map details preload ad call")
	public void Verify_amazon_aax_preload_map_details_adcall() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== amazon aax map details preload ad call ====================");
		System.out.println("****** amazon aax Map details preload ad call validation Started");
		logStep("****** amazon aax Map details preload ad call validation Started");
		Utils.verifyAAX_SlotId("Smoke", "Map");

	}

	@Test(priority = 59, enabled = true)
	@Description("Verify amazon aax Daily Details preload ad call")
	public void Verify_amazon_aax_preload_Daily_details_adcall() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== amazon aax Daily Details preload ad call ====================");
		System.out.println("****** amazon aax Daily Details preload ad call validation Started");
		logStep("****** amazon aax Daily Details preload ad call validation Started");
		Utils.verifyAAX_SlotId("Smoke", "Daily(10day)");

	}

	@Test(priority = 60, enabled = true)
	@Description("Verify amazon aax Hourly Details preload ad call")
	public void Verify_amazon_aax_preload_Hourly_details_adcall() throws Exception {
		System.out.println("==============================================");
		System.out
				.println("=========================== amazon aax Hourly Details preload ad call ====================");
		System.out.println("****** amazon aax Hourly Details preload ad call validation Started");
		logStep("****** amazon aax Hourly Details preload ad call validation Started");
		Utils.verifyAAX_SlotId("Smoke", "Hourly", false);
	}
	
	@Test(priority = 61, enabled = true)
	@Description("Verify amazon aax Hourly Bigad preload ad call")
	public void Verify_amazon_aax_preload_Hourly_bigad_adcall() throws Exception {
		System.out.println("==============================================");
		System.out
				.println("=========================== amazon aax Hourly Bigad preload ad call ====================");
		System.out.println("****** amazon aax Hourly Bigad preload ad call validation Started");
		logStep("****** amazon aax Hourly Bigad preload ad call validation Started");
		Utils.verifyAAX_SlotId("Smoke", "Hourly1");
	}
	
	@Test(priority = 62, enabled = true)
	@Description("Verify amazon aax Covid details preload ad call")
	public void Verify_amazon_aax_preload_Covid_details_adcall() throws Exception {
		System.out.println("==============================================");
		System.out
				.println("=========================== amazon aax Covid details preload ad call ====================");
		System.out.println("****** amazon aax Covid details preload ad call validation Started");
		logStep("****** amazon aax Covid details preload ad call validation Started");
		Utils.verifyAAX_SlotId("Smoke", "Covid");
	}
	
	@Test(priority = 65, enabled = true)
	@Description("Validating 'adsdk' parameter of Amazon aax call ")
	public void Validate_Amazon_SDK_adsdk_parameter() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating Amazon SDK version i.e. 'adsdk' parameter of Amazon aax call");
		logStep("****** Validating Amazon SDK version i.e. 'adsdk' parameter of Amazon aax call");
		Utils.validate_Amazon_aax_call_parameter("Smoke", "Amazon", "adsdk",
				properties.getProperty("AmazonSDKVersion"));

	}

	@Test(priority = 70, enabled = true)
	@Description("Validating Google Mobile Ads SDK version of gampad call ")
	public void Validate_GMA_SDK_version() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating Google Mobile Ads SDK Version i.e. 'js' parameter of gampad call");
		logStep("Validating Google Mobile Ads SDK Version i.e. 'js' parameter of gampad call");
		Utils.validate_Noncustom_param_val_of_gampad("Smoke", "Marquee", "js", properties.getProperty("GMASDKVersion"));

	}
	
	@Test(priority = 75, enabled = true)
	@Description("Verify Criteo SDK inapp v2 call")
	public void Verify_Criteo_SDK_inapp_v2_Call() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Criteo SDK inapp/v2 call ====================");

		System.out.println("****** Criteo SDK inapp/v2 call validation Started");
		logStep("****** Criteo SDK inapp/v2 call validation Started");

		Utils.verifyCriteo_inapp_v2_Call("Smoke", "Criteo");

	}

	@Test(priority = 76, enabled = true)
	@Description("Verify Criteo SDK config app call")
	public void Verify_Criteo_SDK_config_app_Call() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== Criteo SDK config/app call ====================");

		System.out.println("****** Criteo SDK config/app call validation Started");
		logStep("****** Criteo SDK config/app call validation Started");

		Utils.verifyCriteo_config_app_Call("Smoke", "Criteo");

	}

	@Test(priority = 77, enabled = true)
	@Description("Validating 'cpId' parameter of Criteo SDK config app call ")
	public void Validate_Criteo_SDK_config_app_Call_cpId_parameter() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating 'cpId' parameter of Criteo SDK config app call");
		logStep("****** Validating 'cpId' parameter of Criteo SDK config app call");
		Utils.validate_Criteo_SDK_config_app_call_parameter("Smoke", "Criteo", "cpId",
				properties.getProperty("CriteoCpId"));

	}

	@Test(priority = 78, enabled = true)
	@Description("Validating 'bundleId' parameter of Criteo SDK config app call ")
	public void Validate_Criteo_SDK_config_app_Call_bundleId_parameter() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating 'bundleId' parameter of Criteo SDK config app call");
		logStep("****** Validating 'bundleId' parameter of Criteo SDK config app call");
		Utils.validate_Criteo_SDK_config_app_call_parameter("Smoke", "Criteo", "bundleId",
				properties.getProperty("CriteoBundleId"));

	}

	@Test(priority = 79, enabled = true)
	@Description("Validating 'sdkVersion' parameter of Criteo SDK config app call ")
	public void Validate_Criteo_SDK_config_app_Call_sdkVersion_parameter() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating 'sdkVersion' parameter of Criteo SDK config app call");
		logStep("****** Validating 'sdkVersion' parameter of Criteo SDK config app call");
		Utils.validate_Criteo_SDK_config_app_call_parameter("Smoke", "Criteo", "sdkVersion",
				properties.getProperty("CriteoSDKVersion"));
	}

	/**
	 * This method validates Criteo Bidder API (invapp v2) call response code
	 */
	@Test(priority = 81, enabled = true)
	@Description("Validating Criteo Bidder API (invapp v2) call response code")
	public void Validate_Criteo_SDK_Bidder_API_Call_Response_Code() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating Criteo Bidder API (invapp v2) Call Response Code");
		logStep("****** Validating Criteo Bidder API (invapp v2) Call Response Code");
		Utils.verifyCriteo_inapp_v2_Call_ReponseStatusCode("Smoke", "Criteo", "status",
				properties.getProperty("CriteoResponseCode"));
	}

	/**
	 * This method validates Initialization API (config app) call response code
	 */
	@Test(priority = 82, enabled = true)
	@Description("Validating Criteo Initialization API (config app) call response code")
	public void Validate_Criteo_SDK_Initialization_API_Call_Response_Code() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating Criteo Initialization API (config app) Call Response Code");
		logStep("****** Validating Criteo Initialization API (config app) Call Response Code");
		Utils.verifyCriteo_config_app_Call_ReponseStatusCode("Smoke", "Criteo", "status",
				properties.getProperty("CriteoResponseCode"));
	}

	/**
	 * This method validates Initialization API (config app) call response parameter
	 * 'csmEnabled'
	 */
	@Test(priority = 83, enabled = true)
	@Description("Validating Criteo Initialization API (config app) call response parameter 'csmEnabled' value")
	public void Validate_Criteo_SDK_Initialization_API_Call_Response_Parameter_csmEnabled() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"****** Validating csmEnabled parameter value in Criteo Initialization API (config app) Call Response");
		logStep("****** Validating csmEnabled parameter value in Criteo Initialization API (config app) Call Response");
		Utils.validate_Criteo_SDK_config_app_call_response_parameter("Smoke", "Criteo", "csmEnabled",
				properties.getProperty("csmEnabled"));
	}

	/**
	 * This method validates Initialization API (config app) call response parameter
	 * 'liveBiddingEnabled'
	 */
	@Test(priority = 84, enabled = true)
	@Description("Validating Criteo Initialization API (config app) call response parameter 'liveBiddingEnabled' value")
	public void Validate_Criteo_SDK_Initialization_API_Call_Response_Parameter_liveBiddingEnabled() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"****** Validating liveBiddingEnabled parameter value in Criteo Initialization API (config app) Call Response");
		logStep("****** Validating liveBiddingEnabled parameter value in Criteo Initialization API (config app) Call Response");
		Utils.validate_Criteo_SDK_config_app_call_response_parameter("Smoke", "Criteo", "liveBiddingEnabled",
				properties.getProperty("liveBiddingEnabled"));
	}
	
	/**
	 * This method validates Initialization API (config app) call response parameter
	 * 'prefetchOnInitEnabled'
	 */
	@Test(priority = 86, enabled = true)
	@Description("Validating Criteo Initialization API (config app) call response parameter 'prefetchOnInitEnabled' value")
	public void Validate_Criteo_SDK_Initialization_API_Call_Response_Parameter_prefetchOnInitEnabled()
			throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"****** Validating prefetchOnInitEnabled parameter value in Criteo Initialization API (config app) Call Response");
		logStep("****** Validating prefetchOnInitEnabled parameter value in Criteo Initialization API (config app) Call Response");
		Utils.validate_Criteo_SDK_config_app_call_response_parameter("Smoke", "Criteo", "prefetchOnInitEnabled",
				properties.getProperty("prefetchOnInitEnabled"));
	}

	/**
	 * This method validates Initialization API (config app) call response parameter
	 * 'remoteLogLevel'
	 */
	@Test(priority = 87, enabled = true)
	@Description("Validating Criteo Initialization API (config app) call response parameter 'remoteLogLevel' value")
	public void Validate_Criteo_SDK_Initialization_API_Call_Response_Parameter_remoteLogLevel() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"****** Validating remoteLogLevel parameter value in Criteo Initialization API (config app) Call Response");
		logStep("****** Validating remoteLogLevel parameter value in Criteo Initialization API (config app) Call Response");
		Utils.validate_Criteo_SDK_config_app_call_response_parameter("Smoke", "Criteo", "remoteLogLevel",
				properties.getProperty("remoteLogLevel"));
	}
	
	
	@Test(priority = 250,   enabled = true)
	@Description("Segment Parameter Verificatiion when background launch the app from hourly tab")
	public void seg_Parameter_Verification_When_Navigated_To_Hourly_Tab() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Segment Parameter Verificatiion when background launch the app from hourly tab test case Started");
		logStep("****** Segment Parameter Verificatiion when background launch the app from hourly tab test case Started");
		proxy.clearCharlesSession();
	 	AppFunctions.Kill_Launch_App();
		proxy.clearCharlesSession();
		CharlesFunctions.archive_folder("Charles");
		   AppFunctions.click_hourly_element();
		AppFunctions.Kill_Launch_App();
		proxy.getXml();
		Utils.createXMLFileForCharlesSessionFile();
		Utils.verify_Lotame_Call_Segment_Parameter("Smoke", "Lotame", "seg=Hourly");
	
	}
	
	@Test(priority = 251,   enabled = true)
	@Description("Segment Parameter Verificatiion when background launch the app from daily tab")
	public void seg_Parameter_Verification_When_Navigated_To_Daily_Tab() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Segment Parameter Verificatiion when background launch the app from daily tab test case Started");
		logStep("****** Segment Parameter Verificatiion when background launch the app from daily tab test case Started");
		proxy.clearCharlesSession();
		CharlesFunctions.archive_folder("Charles");
	Functions.clickdailydetails();
		 	AppFunctions.Kill_Launch_App();
		proxy.getXml();
		CharlesFunctions.createXMLFileForCharlesSessionFile();
		Utils.verify_Lotame_Call_Segment_Parameter("Smoke", "Lotame", "seg=Daily");

		
	
	}
	
	@Test(priority = 252,   enabled = true)
	@Description("Segment Parameter Verificatiion when background launch the app from radar tab")
	public void seg_Parameter_Verification_When_Navigated_To_Radar_Tab() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Segment Parameter Verificatiion when background launch the app from radar tab test case Started");
		logStep("****** Segment Parameter Verificatiion when background launch the app from radar tab test case Started");
		proxy.clearCharlesSession();
		CharlesFunctions.archive_folder("Charles");
		  AppFunctions.click_radar_element();
			AppFunctions.Kill_Launch_App();
		proxy.getXml();
		Utils.createXMLFileForCharlesSessionFile();
		Utils.verify_Lotame_Call_Segment_Parameter("Smoke", "Lotame", "seg=Radar");
	
	}
	
	@Test(priority = 253,   enabled = true)
	@Description("Segment Parameter Verificatiion when background launch the app from video tab")
	public void seg_Parameter_Verification_When_Navigated_To_Video_Tab() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Segment Parameter Verificatiion when background launch the app from video tab test case Started");
		logStep("****** Segment Parameter Verificatiion when background launch the app from video tab test case Started");
		proxy.clearCharlesSession();
		CharlesFunctions.archive_folder("Charles");
		  AppFunctions.click_video_element();
		  AppFunctions.Kill_Launch_App();
		proxy.getXml();
		Utils.createXMLFileForCharlesSessionFile();
		Utils.verify_Lotame_Call_Segment_Parameter("Smoke", "Lotame", "seg=Video");
	
	}
	
	@Test(priority = 101, enabled = true)
	@Description("Verify preroll video iu")
	public void Verify_video_adcall_iu() throws Exception {
		System.out.println("==============================================");
		System.out.println("=========================== preroll video ad call iu ====================");

		System.out.println("****** preroll video ad call iu validation Started");
		logStep("****** preroll video ad call iu validation Started");
		proxy.clearCharlesSession();
		CharlesFunctions.archive_folder("Charles");
		Functions.waitForMilliSeconds(5000);
		AppFunctions.click_HomeButton();
		proxy.clearCharlesSession();
Functions.clickOnVideos_tile();	
		proxy.getXml();
		Utils.createXMLFileForCharlesSessionFile();
		Utils.get_iu_value_of_Feedcall("Smoke", "PreRollVideo");
	}

	@Test(priority = 102, enabled = true)
	@Description("Validating Google Interactive Media Ads SDK version of Preroll video call ")
	public void Validate_IMA_SDK_version() throws Exception {
		System.out.println("==============================================");
		System.out.println(
				"****** Validating Google Interactive Media Ads SDK version i.e. 'js' parameter of Preroll video call");
		logStep("Validating Google Interactive Media Ads SDK version i.e. 'js' parameter of Preroll video call");

		Utils.validate_Noncustom_param_val_of_gampad("Smoke", "PreRollVideo", "js",
				properties.getProperty("IMASDKVersion"));

	}
	
	@Test(priority = 270, enabled = true)
	@Description("Enable Preconditions to change region to de_DE")
	public void enable_preConditions_toChange_Region_for_de_DE() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** enable Preconditions to change region to de_DE test case Started");
		logStep("****** enable Preconditions to change region to de_DE test case Started");
		
		AppiumFunctions.Appium_Autostart();
		CharlesFunctions.archive_folder("Charles");
		proxy.startRecording();
		proxy.clearCharlesSession();
		AppiumFunctions.launchtheApp_forLocalization("true", "de_DE", true, "de", true);
		System.out.println("App launched ");
		logStep("App launched ");
		proxy.getXml();
		CharlesFunctions.archive_folder("Charles");
		AppFunctions.Kill_Launch_App();
		proxy.clearCharlesSession();
		AppFunctions.Kill_Launch_App();
		proxy.getXml();
		Utils.createXMLFileForCharlesSessionFile();
		
	}

	@Test(priority = 271, enabled = true)
	@Description("Validating NextGen IM Call for de_DE")
	public void validate_NextGen_IM_call_for_de_DE() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Call for de_DE");
		logStep("Validating NextGen IM Call for de_DE");

		Utils.verifyPubadCal("iu=%2F3673%2Fm_app_android_wx");

	}
	
	@Test(priority = 275, enabled = true)
	@Description("Enable Preconditions to change region to es_US")
	public void enable_preConditions_toChange_Region_for_es_US() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** enable Preconditions to change region to es_US test case Started");
		logStep("****** enable Preconditions to change region to es_US test case Started");	
		AppiumFunctions.Appium_Autostart();
		CharlesFunctions.archive_folder("Charles");
		proxy.startRecording();
		proxy.clearCharlesSession();
		AppiumFunctions.launchtheApp_forLocalization("true", "es_US", true, "es", true);
		System.out.println("App launched ");
		logStep("App launched ");
		proxy.getXml();
		CharlesFunctions.archive_folder("Charles");
		AppFunctions.Kill_Launch_App();
		proxy.clearCharlesSession();
		AppFunctions.Kill_Launch_App();
		proxy.getXml();
		Utils.createXMLFileForCharlesSessionFile();
		
	}

	@Test(priority = 276, enabled = true)
	@Description("Validating NextGen IM Call for es_US")
	public void validate_NextGen_IM_call_for_es_US() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Call for es_US");
		logStep("Validating NextGen IM Call for es_US");

		Utils.verifyPubadCal("iu=%2F7646%2Fapp_android_us_es%2Fdb_display%2Fhome_screen%2Fmarquee");

	}
	
	@Test(priority = 280, enabled = true)
	@Description("Enable Preconditions to change region to hi_IN")
	public void enable_preConditions_toChange_Region_for_hi_IN() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** enable Preconditions to change region to hi_IN test case Started");
		logStep("****** enable Preconditions to change region to hi_IN test case Started");
	
		AppiumFunctions.Appium_Autostart();
		CharlesFunctions.archive_folder("Charles");
		proxy.startRecording();
		proxy.clearCharlesSession();
		AppiumFunctions.launchtheApp_forLocalization("true", "hi_IN", true, "hi", true);
		System.out.println("App launched ");
		logStep("App launched ");
		proxy.getXml();
		CharlesFunctions.archive_folder("Charles");
		AppFunctions.Kill_Launch_App();
		proxy.clearCharlesSession();
		AppFunctions.Kill_Launch_App();
		proxy.getXml();
		Utils.createXMLFileForCharlesSessionFile();
	}

	@Test(priority = 281, enabled = true)
	@Description("Validating NextGen IM Call for hi_IN")
	public void validate_NextGen_IM_call_for_hi_IN() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Call for hi_IN");
		logStep("Validating NextGen IM Call for hi_IN");

		Utils.verifyPubadCal("iu=%2F7646%2Fapp_android_hi_in%2Fdb_display%2Fhome_screen%2Fmarquee");

	}
	
	@Test(priority = 285, enabled = true)
	@Description("Enable Preconditions to change region to en_IN")
	public void enable_preConditions_toChange_Region_for_en_IN() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** enable Preconditions to change region to en_IN test case Started");
		logStep("****** enable Preconditions to change region to en_IN test case Started");
		
		AppiumFunctions.Appium_Autostart();
		CharlesFunctions.archive_folder("Charles");
		proxy.startRecording();
		proxy.clearCharlesSession();
		AppiumFunctions.launchtheApp_forLocalization("true", "en_IN", true, "en", false);
		System.out.println("App launched ");
		logStep("App launched ");
		proxy.getXml();
		CharlesFunctions.archive_folder("Charles");
		AppFunctions.Kill_Launch_App();
		proxy.clearCharlesSession();
		AppFunctions.Kill_Launch_App();
		proxy.getXml();
		Utils.createXMLFileForCharlesSessionFile();

	}

	@Test(priority = 286, enabled = true)
	@Description("Validating NextGen IM Call for en_IN")
	public void validate_NextGen_IM_call_for_en_IN() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Call for en_IN");
		logStep("Validating NextGen IM Call for en_IN");

		Utils.verifyPubadCal("iu=%2F7646%2Fapp_android_en_in%2Fdb_display%2Fhome_screen%2Fmarquee");

	}
	
	
	@Test(priority = 290, enabled = true)
	@Description("Enable Preconditions to change region to en_GB")
	public void enable_preConditions_toChange_Region_for_en_GB() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** enable Preconditions to change region to en_GB test case Started");
		logStep("****** enable Preconditions to change region to en_GB test case Started");
		
		AppiumFunctions.Appium_Autostart();
		CharlesFunctions.archive_folder("Charles");
		proxy.startRecording();
		proxy.clearCharlesSession();
		AppiumFunctions.launchtheApp_forLocalization("true", "en_GB", true, "en", false);
		System.out.println("App launched ");
		logStep("App launched ");
		proxy.getXml();
		CharlesFunctions.archive_folder("Charles");
		AppFunctions.Kill_Launch_App();
		proxy.clearCharlesSession();
		AppFunctions.Kill_Launch_App();
		proxy.getXml();
		Utils.createXMLFileForCharlesSessionFile();
	
	}

	@Test(priority = 291, enabled = true)
	@Description("Validating NextGen IM Call for en_GB")
	public void validate_NextGen_IM_call_for_en_GB() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Call for en_GB");
		logStep("Validating NextGen IM Call for en_GB");

		Utils.verifyPubadCal("iu=%2F7646%2Fapp_android_intl%2Fdb_display%2Fhome_screen%2Fmarquee");

	}
	
	@Test(priority = 295, enabled = true)
	@Description("Enable Preconditions to change region to en_CA")
	public void enable_preConditions_toChange_Region_for_en_CA() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** enable Preconditions to change region to en_CA test case Started");
		logStep("****** enable Preconditions to change region to en_CA test case Started");
		
		AppiumFunctions.Appium_Autostart();
		CharlesFunctions.archive_folder("Charles");
		proxy.startRecording();
		proxy.clearCharlesSession();
		AppiumFunctions.launchtheApp_forLocalization("true", "en_CA", true, "en", false);
		System.out.println("App launched ");
		logStep("App launched ");
		proxy.getXml();
		CharlesFunctions.archive_folder("Charles");
		AppFunctions.Kill_Launch_App();
		proxy.clearCharlesSession();
		AppFunctions.Kill_Launch_App();
		proxy.getXml();
		Utils.createXMLFileForCharlesSessionFile();
		
	}

	@Test(priority = 296, enabled = true)
	@Description("Validating NextGen IM Call for en_CA")
	public void validate_NextGen_IM_call_for_en_CA() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Call for en_CA");
		logStep("Validating NextGen IM Call for en_CA");

		Utils.verifyPubadCal("iu=%2F7646%2Fapp_android_intl%2Fdb_display%2Fhome_screen%2Fmarquee");

	}
	
	@Test(priority = 300, enabled = true)
	@Description("Enable Preconditions to change region to fr_FR")
	public void enable_preConditions_toChange_Region_for_fr_FR() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** enable Preconditions to change region to fr_FR test case Started");
		logStep("****** enable Preconditions to change region to fr_FR test case Started");
	
		AppiumFunctions.Appium_Autostart();
		CharlesFunctions.archive_folder("Charles");
		proxy.startRecording();
		proxy.clearCharlesSession();
		AppiumFunctions.launchtheApp_forLocalization("true", "fr_FR", true, "fr", true);
		System.out.println("App launched ");
		logStep("App launched ");
		proxy.getXml();
		CharlesFunctions.archive_folder("Charles");
		AppFunctions.Kill_Launch_App();
		proxy.clearCharlesSession();
		AppFunctions.Kill_Launch_App();
		proxy.getXml();
		Utils.createXMLFileForCharlesSessionFile();
	
	}

	@Test(priority = 301, enabled = true)
	@Description("Validating NextGen IM Call for fr_FR")
	public void validate_NextGen_IM_call_for_fr_FR() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Call for fr_FR");
		logStep("Validating NextGen IM Call for fr_FR");

		Utils.verifyPubadCal("iu=%2F7646%2Fapp_android_intl%2Fdb_display%2Fhome_screen%2Fmarquee");

	}
	
	@Test(priority = 305, enabled = true)
	@Description("Enable Preconditions for en_US")
	public void preConditionsTest_for_en_US() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** PreConditions For en_US test case Started");
		logStep("****** PreConditions For en_US test case Started");
		AppiumFunctions.Appium_Autostart();
		CharlesFunctions.archive_folder("Charles");
		proxy.startRecording();
		proxy.clearCharlesSession();
		AppiumFunctions.LaunchAppWithFullReset();
		System.out.println("App launched ");
		logStep("App launched ");
		AppFunctions.Kill_Launch_App();
		proxy.clearCharlesSession();
		AppFunctions.Kill_Launch_App();
		proxy.getXml();
		Utils.createXMLFileForCharlesSessionFile();
	}

	@Test(priority = 306, enabled = true)
	@Description("Validating NextGen IM Call for en_US")
	public void validate_NextGen_IM_call_for_en_US() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Call for en_US");
		logStep("Validating NextGen IM Call for en_US");

		Utils.verifyPubadCal("iu=%2F7646%2Fapp_android_us%2Fdb_display%2Fhome_screen%2Fmarquee");

	}

	
	/**
	 * This Script Validate NextGen IM Ad and its parameters
	 * @throws Exception
	 */
	@Test(priority = 601, enabled = true)
	@Description("Validating NextGen IM Static Ad when app in test mode")
	public void Validate_NextGenIM_StaticAd() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Static Ad in test mode");
		logStep("Validating NextGen IM Static Ad in test mode ");
		proxy.quitCharlesProxy();;
		proxy.startCharlesProxyWithUI();
		proxy.disableRewriting();
		proxy.disableMapLocal();
		proxy.clearCharlesSession();
		CharlesFunctions.archive_folder("Charles");
		Functions.waitForMilliSeconds(5000);
		AppFunctions.Kill_Launch_App();
AppiumFunctions.clickOnHomeTab();
AppFunctions.enable_adstestadunit();
		proxy.clearCharlesSession();
		AppFunctions.Kill_Launch_App();
		 AppiumFunctions.enter_requiredLocation("07095");	
		Functions.waitForMilliSeconds(20000);		
		proxy.getXml();
		Utils.createXMLFileForCharlesSessionFile();
		Utils.verifyPubadCal("Smoke", "NextGenIM");
		
	}
	/**
	 * This Script Validate NextGen IM Ad response
	 * @throws Exception
	 */
	@Test(priority = 602, enabled = true)
	@Description("Validating NextGen IM Static Ad response when app in test mode")
	public void Validate_NextGenIM_StaticAd_response() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Static Ad response in test mode");
		logStep("Validating NextGen IM Static Ad response in test mode ");

		Utils.verifyMarqueeAd_byCallResponse("Smoke", "NextGenIM");

	}

	/**
	 * This Script Validate NextGen IM Ad and its parameters
	 * @throws Exception
	 */

	@Test(priority = 603, enabled = true)

	@Description("Validating NextGen IM Static Ad BackGround Asset Call")
	public void Validate_NextGenIM_StaticAd_bgAssetCall() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Static Ad BG Asset Call");
		logStep("Validating NextGen IM Static Ad BG Asset Call ");

		Utils.verifyBGAd_byCallResponse("Smoke", "NextGenIM", "Static");

	}

	/**
	 * This Script Validate NextGen IM Ad and its parameters
	 * @throws Exception
	 */

	@Test(priority = 604, enabled = true)
	@Description("Validating NextGen IM Static Ad ForeGround Asset Call")
	public void Validate_NextGenIM_StaticAd_fgAssetCall() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Static Ad FG Asset Call");
		logStep("Validating NextGen IM Static Ad FG Asset Call ");

		Utils.verifyFGAd_byCallResponse("Smoke", "NextGenIM", "Static");

	}

	@Test(priority = 605, enabled = true)
	@Description("Validating NextGen IM Static Ad sz parameter")
	public void Validate_NextGenIM_StaticAd_Size() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Static Ad sz parameter in charles");
		logStep("Validating NextGen IM Static Ad sz parameter in charles ");

		Utils.verify_Ad_Size("Smoke", "NextGenIM");

	}

	@Test(priority = 611, enabled = true)
	@Description("Validating NextGen IM Video Ad and its Parameters when app in test mode")
	public void Validate_NextGenIM_VideoAd() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Video Ad in test mode");
		logStep("Validating NextGen IM Video Ad in test mode ");
		proxy.clearCharlesSession();
		CharlesFunctions.archive_folder("Charles");
		Functions.waitForMilliSeconds(5000);
		AppiumFunctions.enter_requiredLocation("61920");	
		Functions.waitForMilliSeconds(20000);	
		proxy.getXml();
		Utils.createXMLFileForCharlesSessionFile();
		Utils.verifyPubadCal("Smoke", "NextGenIM");

	}

	@Test(priority = 612, enabled = true)
	@Description("Validating NextGen IM Video Ad response when app in test mode")
	public void Validate_NextGenIM_VideoAd_response() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Video Ad response in test mode");
		logStep("Validating NextGen IM Video Ad response in test mode ");
		Utils.verifyMarqueeAd_byCallResponse("Smoke", "NextGenIM");

	}

	/**
	 * This Script Validate NextGen IM Ad and its parameters
	 * @throws Exception
	 */
	@Test(priority = 613, enabled = true)
	@Description("Validating NextGen IM Video Ad BackGround Asset Call")
	public void Validate_NextGenIM_VideoAd_bgAssetCall() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Video Ad BG Asset Call");
		logStep("Validating NextGen IM Video Ad BG Asset Call ");
		Utils.verifyBGAd_byCallResponse("Smoke", "NextGenIM", "Video");

	}

	

	@Test(priority = 615, enabled = true)
	@Description("Validating NextGen IM Video Ad sz parameter")
	public void Validate_NextGenIM_VideoAd_Size() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating NextGen IM Video Ad sz parameter in charles");
		logStep("Validating NextGen IM Video Ad sz parameter in charles ");
		Utils.verify_Ad_Size("Smoke", "NextGenIM");

	}
	
	/**
	 *This Script Validate Integrated Daily Details Ad Call and its response
	 * @throws Exception 
	 */
	@Test(priority = 701, enabled = true)
	@Description("Validating IDD Ad when app in test mode")
	public void Validate_IDD_Ad() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating IDD Ad in test mode");
		logStep("Validating IDD Ad in test mode ");
		AppFunctions.Kill_Launch_App();
	AppFunctions.click_HomeButton();
		AppFunctions.Kill_Launch_App();
		proxy.clearCharlesSession();
		CharlesFunctions.archive_folder("Charles");
		//TestBase.waitForMilliSeconds(5000);
	    AppiumFunctions.enter_requiredLocation("30124");	
		Functions.waitForMilliSeconds(20000);
Functions.clickdailydetails();
		Functions.waitForMilliSeconds(10000);	
		proxy.getXml();
		Utils.createXMLFileForCharlesSessionFile();
		Utils.verifyPubadCal("Smoke", "IDD");

	}



	/**
	 * This Script Validate IDD Ad and its parameters
	 * @throws Exception 
	 */

	@Test(priority = 703, enabled = true)
	@Description("Validating IDD Static Ad BackGround Asset Call")
	public void Validate_IDD_StaticAd_bgAssetCall() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating IDD Static Ad BG Asset Call");
		logStep("Validating IDD Static Ad BG Asset Call ");
		Utils.verifyBGAd_byCallResponse("Smoke", "IDD", "Static");

	}

	/**
	 * This Script Validate IDD Ad and its parameters
	 * @throws Exception 
	 */

	@Test(priority = 704, enabled = true)
	@Description("Validating IDD Static Ad ForeGround Asset Call")
	public void Validate_IDD_StaticAd_fgAssetCall() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating IDD Static Ad FG Asset Call");
		logStep("Validating IDD Static Ad FG Asset Call ");
		Utils.verifyFGAd_byCallResponse("Smoke", "IDD", "Static");
	}

	@Test(priority = 705, enabled = true)
	@Description("Validating IDD Ad sz parameter")
	public void Validate_IDD_Ad_Size() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating IDD Ad sz parameter in charles");
		logStep("Validating IDD Ad sz parameter in charles ");
		Utils.verify_Ad_Size("Smoke", "IDD");

	}
	
	
	/**
	 * This Script Validate Integrated Feed Card Static Ad Call and its response
	 * @throws Exception                 
	 */
	@Test(priority = 751, enabled = true)
	@Description("Validating Integrated Feed Card Static Ad i.e. Feed1 Card when app in test mode")
	public void Validate_Integrated_FeedCard_StaticAd() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating Integrated Feed Card Static Ad in test mode");
		logStep("Validating Integrated Feed Card Static Ad in test mode ");
		try{
			AppFunctions.click_HomeButton();
			proxy.clearCharlesSession();
			CharlesFunctions.archive_folder("Charles");
			AppFunctions.Kill_Launch_App();
			 AppiumFunctions.enter_requiredLocation("30124");	
			Functions.waitForMilliSeconds(20000);
					
		} finally {
			proxy.getXml();
			Utils.createXMLFileForCharlesSessionFile();
			Utils.verifyPubadCal("Smoke", "IntegratedFeedCard");
		}
	}

	@Test(priority = 752, enabled = true)
	@Description("Validating Integrated Feed Card Static Ad response")
	public void Validate_Integrated_FeedCard_StaticAd_response() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating Integrated Feed Card Static Ad response");
		logStep("Validating Integrated Feed Card Static Ad response");
		Utils.verifyIntegratedFeedCardAd_byCallResponse("Smoke", "IntegratedFeedCard");
	}

	/**
	 * This Script Validate Integrated Feed Card Static Ad and its parameters
	 * @throws Exception                
	 */

	@Test(priority = 753, enabled = true)
	@Description("Validating Integrated Feed Card Static Ad BackGround Asset Call")
	public void Validate_Integrated_FeedCard_StaticAd_bgAssetCall() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating Integrated Feed Card Static Ad BG Asset Call");
		logStep("Validating Integrated Feed Card Static Ad BG Asset Call ");
		
		Utils.verifyAssetCallWithHostandPath("s.w-x.co", "/cl/prototype/", "-ifc-stc", "-ifc-stc");
	}

	/**
	 * This Script Validate Integrated Feed Card Static Ad and its parameters
	 * @throws Exception              
	 */
	@Test(priority = 754, enabled = true)
	@Description("Validating Integrated Feed Card Static Ad ForeGround Asset Call")
	public void Validate_Integrated_FeedCard_StaticAd_fgAssetCall() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating Integrated Feed Card Static Ad FG Asset Call");
		logStep("Validating Integrated Feed Card Static Ad FG Asset Call ");
		
		Utils.verifyAssetCallWithHostandPath("s.w-x.co", "/cl/prototype/", "-ifc-stc", "-fg");

	}

	@Test(priority = 755, enabled = true)
	@Description("Validating Integrated Feed Card Static Ad sz parameter")
	public void Validate_Integrated_FeedCard_StaticAd_Size() throws Exception {
		System.out.println("==============================================");
		System.out.println("****** Validating Integrated Feed Card Static Ad sz parameter in charles");
		logStep("Validating Integrated Feed Card Static Ad sz parameter in charles ");
		Utils.verify_Ad_Size("Smoke", "IntegratedFeedCard");

	}


}
