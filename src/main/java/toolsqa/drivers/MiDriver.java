package toolsqa.drivers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MiDriver {

	private WebDriver driver;

	private static List<MiDriver> listMiDriver = new ArrayList<>();

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static MiDriver withBrowser() {
		String downloadPath = "";
		int timeOut = 20;
		ChromeOptions chromeOptions = new ChromeOptions();
		HashMap<String, Object> chromePrefs = new HashMap();
		chromePrefs.put("download.default_directory", downloadPath);
		chromeOptions.addArguments("--start-maximized --ignore-certificate-errors --disable-infobars --incognito");
		chromeOptions.setExperimentalOption("prefs", chromePrefs);

		listMiDriver.add(new MiDriver());
		listMiDriver.get(listMiDriver.size() - 1).driver = new ChromeDriver(chromeOptions);
		listMiDriver.get(listMiDriver.size() - 1).driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
		return listMiDriver.get(listMiDriver.size() - 1);

	}

	public WebDriver setURL(String url) {
		driver.get(url);
		return listMiDriver.get(listMiDriver.size() - 1).driver;
	}

	public static WebDriver getBrowser() {
		return listMiDriver.get(listMiDriver.size() - 1).driver;
	}
}
