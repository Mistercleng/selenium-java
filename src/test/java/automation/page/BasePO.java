package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Classe para a criação das novas page objects
 * Todas as pages deve herar essa classe
 */
public abstract class BasePO {
    
    /** Driver que sera usado por todsas as pages */
    protected WebDriver driver;

    /**
     * Construtor padrão para a fabrica de elementos (PAgeFactory)
     * @param driver Driver da pagina atual
     */
    protected BasePO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


}
