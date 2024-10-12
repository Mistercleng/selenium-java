package automation.test;

import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;
import automation.page.GooglePO;


public class GoogleTest extends BaseTest {

    private static GooglePO googlePage;
    
    @BeforeClass
    public static void preparaTest(){
        googlePage = new GooglePO(driver);
    }

    @Test
    public void deve_prsquisar_no_google(){
        googlePage.pesquisar("Batata Frita");
        String result = googlePage.obterResultadoPesquisa();
        assertTrue(result, result.contains("Resultados"));
    }

}
