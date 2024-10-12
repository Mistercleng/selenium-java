package automation.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO extends BasePO{

    @FindBy(name = "q")
    public WebElement inputPesquisa;

    @FindBy(id = "oFNiHe")
    public WebElement divResultadoPesquisa;
    /**
     * Construtor para criação da pagina do goole
     * @param driver Driver da pagina do google
     */
    public GooglePO(WebDriver driver) {
        super(driver);
    }
    
    /**
     * Metodo que ira pesquisar um item noggogler baseado no texto informado e concluindo com enter
     */
    public void pesquisar(String texto){
        inputPesquisa.sendKeys(texto+ Keys.ENTER);
    }

    /**
     * Metodo que retorna o resultado da pesquisa
     * @return
     */
    public String obterResultadoPesquisa() {
        return divResultadoPesquisa.getText();
    }

    
}
