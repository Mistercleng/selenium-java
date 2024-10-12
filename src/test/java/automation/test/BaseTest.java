package automation.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {
    
    protected static  WebDriver driver;
    private static final String URL_BASE = "http://www.google.com/";
    private static final String CAMINHO_DRIVER = "src/test/java/automation/resources/chromedriver";

    @BeforeClass
    public static void iniciar(){
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.get(URL_BASE);
    }

    @AfterClass
    public static void finalizar(){
        driver.quit();
    }
}
