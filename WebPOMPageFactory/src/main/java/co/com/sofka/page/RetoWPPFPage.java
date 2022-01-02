package co.com.sofka.page;

import co.com.sofka.page.common.CommonActionOnpages;
import co.com.sofka.model.RetoWPPFModel;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import static io.cucumber.messages.internal.com.google.common.base.StandardSystemProperty.USER_DIR;

public class RetoWPPFPage extends CommonActionOnpages {

    private final RetoWPPFModel retoWPPFModel;
    private static final Logger LOGGER = Logger.getLogger(RetoWPPFModel.class);


    //localizadores//

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]")
    private WebElement div_X2;

    @CacheLookup
    @FindBy(id = "mega-menu-item-198594")
    private WebElement productos;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"mega-menu-item-198552\"]")
    private WebElement inicio;



    @CacheLookup
    @FindBy(id = "shop-sidebar")
    private WebElement sidebar;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"pwb_filter_by_brand_widget-2\"]/div[2]/ul/li[5]/label")
    private WebElement gnc;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div/div[2]/div[4]")
    private WebElement div_productos;

    @CacheLookup
    @FindBy(id = "mega-menu-item-203769")
    private WebElement outlet;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div/div[2]/div[1]")
    private WebElement div_outlet;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"product-194936\"]/div/div[1]/div/div[2]")
    private WebElement div_options;

    @CacheLookup
    @FindBy(id = "pa_sabor")
    private WebElement selectOptionOutlet;


    @CacheLookup
    @FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div/div[1]/div/div[2]/form/table/tbody/tr/td[2]/select/option[2]")
    private WebElement selectSaborOutlet;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"product-194936\"]/div/div[1]/div/div[2]/form/div/div[2]/div/input[3]")
    private WebElement adjutoUnidadOutlet;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"pwb_filter_by_brand_widget-2\"]/div[2]/ul/li[18]/label")
    private WebElement smartMuscle;



    @CacheLookup
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[2]/div/div[2]/div[2]")
    private WebElement div_ofertas;


    @CacheLookup
    @FindBy(xpath = "/html/body/div[2]/main/div/div[2]/div/div[1]/div/div[2]")
    private WebElement div_options_ofertas;

    @CacheLookup
    @FindBy(id = "pa_sabor_4744")
    private WebElement selectOptionOfertas;


    @CacheLookup
    @FindBy(xpath = "//*[@id=\"pa_sabor_4744\"]/option[3]")
    private WebElement selectSaborOfertas;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"product-227900\"]/div/div[1]/div/div[2]/form/div[4]/div/div[4]/div/input[3]")
    private WebElement adjutoUnidadOfertas;




    @CacheLookup
    @FindBy(xpath = "//*[@id=\"masthead\"]/div/div[4]/ul/li[5]/div")
    private WebElement carritoCompras;

    @CacheLookup
    @FindBy(className = "wc-proceed-to-checkout")
    private WebElement finalizarCompra;









    @CacheLookup
    @FindBy(xpath = "//*[@id=\"section_655457896\"]/div[2]/div[2]")
    private WebElement info_inicio;

    @CacheLookup
    @FindBy(xpath = "//a[@class='dashicons-tag mega-menu-link']")
    private WebElement ofertas;

    @CacheLookup
    @FindBy(id = "mega-menu-item-202958")
    private WebElement X2;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"masthead\"]/div/div[4]/ul/li[5]/ul")
    private WebElement waitDiv;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"order_review_heading\"]")
    private WebElement Pedido;


    @CacheLookup
    @FindBy(css = "input[data-brand='800']")
    private WebElement marca;

    @CacheLookup
    @FindBy(css = "div[class='wc-proceed-to-checkout']")
    private WebElement buttonEndBuy;

    @CacheLookup
    @FindBy(id = "billing_myfield12")
    private WebElement documento;

    @CacheLookup
    @FindBy(id = "billing_email")
    private WebElement email;

    @CacheLookup
    @FindBy(id = "billing_first_name")
    private WebElement nombre;

    @CacheLookup
    @FindBy(id = "billing_last_name")
    private WebElement apellido;

    @CacheLookup
    @FindBy(id = "select2-billing_state-container")
    private WebElement departamento;

    @FindBy(css = "input[class='select2-search__field']")
    private WebElement campoDepartamento;

    @CacheLookup
    @FindBy(id = "select2-billing_city-container")
    private WebElement ciudad;
    @CacheLookup
    @FindBy(css = "input[class='select2-search__field']")
    private WebElement campoCiudad;

    @CacheLookup
    @FindBy(id = "billing_address_1")
    private WebElement direccion;

    @CacheLookup
    @FindBy(id = "billing_address_2")
    private WebElement complementoDireccion;

    @CacheLookup
    @FindBy(id = "billing_phone")
    private WebElement numeroCelular;

    @CacheLookup
    @FindBy(id = "order_comments")
    private WebElement notasPedido;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"payment\"]/ul/li[1]")
    private WebElement pagoCorresponsal;

    @CacheLookup
    @FindBy(id = "payment_method_bank_transfer_1")
    private WebElement pagoBaloto;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"payment\"]/ul/li[2]")
    private WebElement pagoBaloto2;

    @CacheLookup
    @FindBy(id = "payment_method_woo-mercado-pago-basic")
    private WebElement tarjetasOtros;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"payment\"]/ul/li[3]")
    private WebElement tarjetasOtros2;

    @CacheLookup
    @FindBy(id = "terms")
    private WebElement terminosCondiciones;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"payment\"]/div/div/p/label")
    private WebElement terminosCondiciones2;

    @CacheLookup
    @FindBy(id = "place_order")
    private WebElement pago;

    //Validations//
    @CacheLookup
    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/div/div[2]/div/p/strong")
    private WebElement validationPedido;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/form[2]/div/div[2]/div/div/div[2]/p")
    private WebElement validationPedido2;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"main\"]/div[2]/div/div/div[1]/h2")
    private WebElement validationPedidoBaloto;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"order_review\"]/table/tbody/tr[1]/td[1]/strong")
    private WebElement validationUnidadesPedidas1;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"order_review\"]/table/tbody/tr[2]/td[1]/strong")
    private WebElement validationUnidadesPedidas2;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"order_review\"]/table/tbody/tr[3]/td[1]/strong")
    private WebElement validationUnidadesPedidas3;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"order_review\"]/table/tbody/tr[4]/td[1]/strong")
    private WebElement validationUnidadesPedidas4;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"masthead\"]/div/div[4]/ul/li[5]/div/a/span/span/span/bdi")
    private WebElement validacionValorEnCarrito;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"order_review\"]/table/tfoot/tr[1]/td/span/bdi")
    private WebElement validacionValorEnDetalle;

    //Ruta skl//

    private static final String PAGE_BASE_PATCH = USER_DIR.value() + "\\src\\main\\resources\\Page.RetoWPPF\\";
    private static final String SELECT_ADD_CAR = PAGE_BASE_PATCH + "addCar.PNG";
    private static final String SELECT_SEE_CAR = PAGE_BASE_PATCH + "seeCar.PNG";
    private static final String SELECT_ADD_GREN_CAR = PAGE_BASE_PATCH + "addGrenCar.PNG";
    private static final String SELECT_OPTIONS = PAGE_BASE_PATCH + "selectOptions.PNG";
    private static final String SELECT_FINISH_SHOPPING = PAGE_BASE_PATCH + "finishShopping.PNG";



    //constructor
    public RetoWPPFPage (RetoWPPFModel retoWPPFModel, WebDriver webDriver) {
        super(webDriver);
        this.retoWPPFModel = retoWPPFModel;
        PageFactory.initElements(webDriver, this);
    }

    //functions
    public void llenadoCamposComprador1() {
        try {

            click(X2);
            explicitWaitTime(div_X2);
            scrollTo(div_X2);

            click(SELECT_ADD_CAR);
            waitGeneral(waitDiv);
            click(SELECT_ADD_CAR);
            waitGeneral(waitDiv);

            scrollTo(inicio);
            click(inicio);
            scrollDown();
            scrollDown();
            scrollDown();
            scrollDown();
            scrollDown();
            click(SELECT_ADD_CAR);

            click(SELECT_SEE_CAR);
            click(buttonEndBuy);

            typeInto(documento, retoWPPFModel.getDocumento());
            clearText(email);
            typeInto(email, retoWPPFModel.getEmail());
            clearText(nombre);
            typeInto(nombre, retoWPPFModel.getNombres());
            clearText(apellido);
            typeInto(apellido, retoWPPFModel.getApellidos());

            scrollTo(departamento);

            click(departamento);
            typeInto(campoDepartamento, retoWPPFModel.getDepartamento());
            tab(campoDepartamento);

            click(ciudad);
            typeInto(campoCiudad, retoWPPFModel.getCiudad());
            tab(campoCiudad);

            click(direccion);

            typeInto(direccion, retoWPPFModel.getDireccion());
            clearText(complementoDireccion);
            typeInto(complementoDireccion, retoWPPFModel.getAnexoDireccion());
            clearText(numeroCelular);
            typeInto(numeroCelular, retoWPPFModel.getNumeroCelular());
            clearText(notasPedido);
            typeInto(notasPedido, retoWPPFModel.getNotasPedido());

            scrollTo(pago);
            scrollTo(pagoBaloto2);

            explicitWaitTime(terminosCondiciones2);
            click(terminosCondiciones2);

            switch (retoWPPFModel.getMetodoPago()){
                case CORRESPONSAL:
                    click(pagoCorresponsal);
                    break;
                case BALOTO:
                    click(pagoBaloto2);
                    break;
                case TARJETAS:
                    click(tarjetasOtros2);
                    break;
            }


            //click(pago);

            LOGGER.info("Proceso Finalizado comprador 1");



        } catch (Exception exception) {
            LOGGER.warn(exception.getMessage());
        }

    }

    public List<String> isRegistrationDoneComprador1(){
        List<String> submitedFormResult = new ArrayList<>();
        submitedFormResult.add(getText(validationPedido2).trim());

        return submitedFormResult;
    }

    public void llenadoCamposComprador2(){

        try {
            click(productos);
            click(productos);
            explicitWaitTime(sidebar);
            click(gnc);

            scrollTo(div_productos);
            click(SELECT_ADD_CAR);
            waitGeneral(waitDiv);
            click(SELECT_ADD_CAR);
            waitGeneral(waitDiv);

            scrollTo(outlet);
            click(outlet);
            explicitWaitTime(div_outlet);
            scrollTo(div_outlet);

            click(SELECT_OPTIONS);

            explicitWaitTime(div_options);
            scrollTo(div_options);

            click(selectOptionOutlet);
            click(selectSaborOutlet);
            click(adjutoUnidadOutlet);
            click(SELECT_ADD_GREN_CAR);

            explicitWaitTime(ofertas);
            click(ofertas);
            click(ofertas);
            click(smartMuscle);

            explicitWaitTime(div_ofertas);
            scrollTo(div_ofertas);

            click(SELECT_OPTIONS);

            //explicitWaitTime(div_options_ofertas);
            scrollTo(div_options_ofertas);

            click(selectOptionOfertas);
            click(selectSaborOfertas);
            click(adjutoUnidadOfertas);
            click(SELECT_ADD_GREN_CAR);

            scrollTo(carritoCompras);
            click(carritoCompras);
            click(SELECT_FINISH_SHOPPING);

            typeInto(documento, retoWPPFModel.getDocumento());
            clearText(email);
            typeInto(email, retoWPPFModel.getEmail());
            clearText(nombre);
            typeInto(nombre, retoWPPFModel.getNombres());
            clearText(apellido);
            typeInto(apellido, retoWPPFModel.getApellidos());

            scrollTo(departamento);

            click(departamento);
            typeInto(campoDepartamento, retoWPPFModel.getDepartamento());
            tab(campoDepartamento);

            click(ciudad);
            typeInto(campoCiudad, retoWPPFModel.getCiudad());
            tab(campoCiudad);

            click(direccion);

            typeInto(direccion, retoWPPFModel.getDireccion());
            clearText(complementoDireccion);
            typeInto(complementoDireccion, retoWPPFModel.getAnexoDireccion());
            clearText(numeroCelular);
            typeInto(numeroCelular, retoWPPFModel.getNumeroCelular());
            clearText(notasPedido);
            typeInto(notasPedido, retoWPPFModel.getNotasPedido());

            scrollTo(pago);
            scrollTo(tarjetasOtros2);

            explicitWaitTime(terminosCondiciones2);
            click(terminosCondiciones2);

            switch (retoWPPFModel.getMetodoPago()){
                case CORRESPONSAL:
                    click(pagoCorresponsal);
                    break;
                case BALOTO:
                    click(pagoBaloto2);
                    break;
                case TARJETAS:
                    click(tarjetasOtros2);
                    break;
            }

            //click(pago);

            LOGGER.info("Proceso Finalizado comprador 2");


        }catch (Exception exception) {
            LOGGER.warn(exception.getMessage());
        }



    }

    public List<String> isRegistrationDoneComprador2(){
        List<String> submitedFormResult = new ArrayList<>();
        submitedFormResult.add(getText(validationPedido2).trim());
        submitedFormResult.add(String.valueOf(Integer.parseInt(getText(validationUnidadesPedidas1).substring(2,3).trim())
                +Integer.parseInt(getText(validationUnidadesPedidas2).substring(2,3).trim())
                +Integer.parseInt(getText(validationUnidadesPedidas3).substring(2,3).trim())
                +Integer.parseInt(getText(validationUnidadesPedidas4).substring(2,3).trim())));
        submitedFormResult.add(getText(validacionValorEnCarrito).trim());

        return submitedFormResult;
    }



}
