import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxDriver

// Location where Geb saves the screenshots and HTML dumps at the end of each test
reportsDir = 'build/test-reports'

waiting {
    timeout = 2
}

environments {

    // run via “./gradlew chromeTest”
    // See: http://code.google.com/p/selenium/wiki/ChromeDriver
    chrome {
        def chromeDriver = new File('C:/TestAutomation/Selenium/Drivers/Chrome/chromedriver.exe') // add .exe for Windows...
        System.setProperty('webdriver.chrome.driver', chromeDriver.absolutePath)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        options.addArguments("--start-maximized");
        driver = { new ChromeDriver(options) }

    }

    // run via “./gradlew chromeHeadlessTest”
    // See: http://code.google.com/p/selenium/wiki/ChromeDriver
    chromeHeadless {
        driver = {
            ChromeOptions o = new ChromeOptions()
            o.addArguments('headless')
            new ChromeDriver(o)
        }
    }

    // run via “./gradlew firefoxTest”
    // See: http://code.google.com/p/selenium/wiki/FirefoxDriver
    firefox {
        atCheckWaiting = 1

        driver = { new FirefoxDriver() }
    }

    baseUrl = "https://tbex-test-split-apps.talentbankonline.com/am/"
}

