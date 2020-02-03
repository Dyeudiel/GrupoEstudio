package com.toolsqa.drivers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MiDriver {

//	private static List<MiDriver> listWebDriver = new ArrayList<>();
//	private WebDriver driver;
//
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public static MiDriver withChrome() {
//
//		ChromeOptions chromeOptions = new ChromeOptions();
//		HashMap<String, Object> chromePrefs = new HashMap();
//		chromePrefs.put("download.default_directory", "");
//		chromeOptions.addArguments("--start-Minimize");
//		chromeOptions.setExperimentalOption("prefs", chromePrefs);
//
//		listWebDriver.add(new MiDriver());
//		listWebDriver.get(listWebDriver.size() - 1).driver = new ChromeDriver(chromeOptions);
//		listWebDriver.get(listWebDriver.size() - 1).driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		return listWebDriver.get(listWebDriver.size() - 1);
//	}
//
//	public WebDriver enLaURL(String url) {
//		driver.get(url);
//		return listWebDriver.get(listWebDriver.size() - 1).driver;
//	}
	
	
	private WebDriver driver;

	private static List<MiDriver> listWebDriver = new ArrayList<>();

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static MiDriver withChrome() {
		String downloadPath = "";
		ChromeOptions chromeOptions = new ChromeOptions();
		HashMap<String, Object> chromePrefs = new HashMap();
		chromePrefs.put("download.default_directory", downloadPath);
		chromeOptions.addArguments("--start-Minimize");
		chromeOptions.setExperimentalOption("prefs", chromePrefs);

		listWebDriver.add(new MiDriver());
		listWebDriver.get(listWebDriver.size() - 1).driver = new ChromeDriver(chromeOptions);
		listWebDriver.get(listWebDriver.size() - 1).driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return listWebDriver.get(listWebDriver.size() - 1);

	}

	public WebDriver enLaURL(String url) {
		driver.get(url);
		return listWebDriver.get(listWebDriver.size() - 1).driver;
	}

	public static WebDriver getBrowser() {
		return listWebDriver.get(listWebDriver.size() - 1).driver;
	}

}