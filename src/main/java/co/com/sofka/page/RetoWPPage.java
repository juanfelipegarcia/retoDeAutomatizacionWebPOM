package co.com.sofka.page;

import co.com.sofka.model.RetoWPModel;
import co.com.sofka.page.common.CommonActionOnPages;
import co.com.sofka.util.TipoViaje;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetoWPPage  {

    private final RetoWPModel retoWPModel;
    private WebDriver webDriver;

    private final By tipoViaje = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[1]/div/span[1]");
    private final By origen = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/input");
    private final By destino = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[1]/div/div[2]/div/div/input");
    private final By date = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div/div");
    private final By idaDia = By.xpath("");
    private final By idaMes = By.xpath("");
    private final By idaAno = By.xpath("");
    private final By regresoDia = By.xpath("");
    private final By regresoMes = By.xpath("");
    private final By regresoAno = By.xpath("");
    private final By pasajeroAdulto = By.xpath("");
    private final By pasajeroMenor = By.xpath("");
    private final By clase = By.xpath("");

    //Constructor


    public RetoWPPage(RetoWPModel retoWPModel, WebDriver webDriver) {
        this.retoWPModel = retoWPModel;
        this.webDriver = webDriver;
    }

    //Funtions
    public void fillretoWPTestIdaVuelta(){
        CommonActionOnPages commonActionOnPages = new CommonActionOnPages(webDriver);

        commonActionOnPages.click(origen);
        commonActionOnPages.clearText(origen);
        commonActionOnPages.typeInto(origen, retoWPModel.getOrigen());
        //commonActionOnPages.click(destino);
        //commonActionOnPages.typeInto(destino, retoWPModel.getDestino());
        //commonActionOnPages.click(date);

    }
}
