package co.com.sofka.page;

import co.com.sofka.model.RetoWPModel;
import co.com.sofka.page.common.CommonActionOnPages;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.core.config.plugins.util.ResolverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class RetoWPPage extends CommonActionOnPages {

    private final RetoWPModel retoWPModel;
    private WebDriver webDriver;
    public static Log log= LogFactory.getLog(ResolverUtil.Test.class);

    //For input test cases
    private final By tipoViajeIdaYVuelta = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[1]/div/span[1]");
    private final By tipoViajeIda = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[1]/div/span[2]");
    private final By tipoViajeMultidestino = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[1]/div/span[3]");
    private final By origen = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/input");
    private final By confirOrigen = By.xpath("/html/body/div[4]/div/div[1]/ul/li[1]");
    private final By destino = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[1]/div/div[2]/div/div/input");
    private final By confirDestino = By.xpath("/html/body/div[4]/div/div[1]/ul/li");
    private final By date = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div/div/div/input");
    private final By LocalizacionDate = By.xpath("//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]");
    private final By arrowRight = By.xpath("//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]/a[2]");

    private final By idaDia = By.xpath("//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]/div[2]/div[3]/div[12]");
    private final By aplicarFechas = By.xpath("//*[@id=\"component-modals\"]/div[1]/div[2]/div[1]/button");
    private final By regresoDia = By.xpath("//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]/div[2]/div[3]/div[18]");
    private final By pasajeros = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[4]/div/div/div/div/input");
    private final By addAdulto = By.xpath("//*[@id=\"component-modals\"]/div[3]/div/div/div[1]/div[1]/div[2]/div/button[2]");
    private final By addNino = By.xpath("//*[@id=\"component-modals\"]/div[3]/div/div/div[1]/div[2]/div[2]/div/button[2]");
    private final By seleccionEdadNino1 = By.xpath("//*[@id=\"component-modals\"]/div[3]/div/div/div[1]/div[3]/div[2]/div/div");
    private final By addEdadNino1 = By.xpath("//option[. ='7 años']");
    private final By clase = By.xpath("//*[@id=\"component-modals\"]/div[3]/div/div/div[2]/div[2]/div/div/div");
    private final By claseEconomica = By.xpath("//option[. ='Economica']");
    private final By clasePremium = By.xpath("//option[. ='Premium economy']");
    private final By claseEjecutiva = By.xpath("//option[. ='Ejecutiva/Business']");
    private final By clasePrimera = By.xpath("//option[. ='Primera Clase']");

    private final By aplicarPasajeros = By.xpath("//*[@id=\"component-modals\"]/div[3]/div/div/div[3]/a");
    private final By localizacionSelecionar = By.xpath("//*[@id=\"clusters\"]/span[1]/div/span/cluster/div/div/div[2]/fare/span");
    private final By selectVuelos = By.xpath("//*[@id=\"clusters\"]/span[1]/div/span/cluster/div/div/div[2]/fare/span/span/div[2]");

    private final By equipajePageLocator = By.className("-show-modal");
    private final By confirmacionEquipaje = By.xpath("//*[@id=\"upselling-popup-position\"]/upselling-popup/div/div[3]/div/div/button");
    private final By search = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[3]/button");

    private final By filteraerolinea = By.xpath("//*[@id=\"filter-airlines\"]");
    private final By aerolinea = By.xpath("//*[@id=\"filter-airlines\"]/li/span");
    private final By mismaAerolinea = By.xpath("//*[@id=\"filter-airlines\"]/li/ul/div[2]/checkbox-filter/checkbox-filter-item/li/span/span/span/label");
    private final By selectVuelosMismaAerolinea = By.xpath("/html/body/div[13]/div/div/div/div[3]/div/div[2]/div/div[4]/app-root/app-common/items/div/span[1]/div/span/cluster/div/div/div[2]/fare/span/span/div[2]");

    private final By localizacionDetalleVuelo = By.xpath("//*[@id=\"pricebox-list-detail\"]");
    private final By localizacionInfo = By.xpath("//*[@id=\"checkout-content\"]/div[2]/pricebox/div[1]/p");

    private final By tarjetaC = By.xpath("//*[@id=\"formData.paymentData.cardPayments[0].card.number\"]/div/input");
    private final By titularTarjeta = By.xpath("//*[@id=\"formData.paymentData.cardPayments[0].card.holderName\"]/div/input");
    private final By vencimiento = By.xpath("//*[@id=\"formData.paymentData.cardPayments[0].card.expirationDate\"]/div/input");
    private final By seguridad = By.xpath("//*[@id=\"formData.paymentData.cardPayments[0].card.securityCode\"]/div/input");
    private final By documentoTitular = By.xpath("//*[@id=\"formData.paymentData.cardPayments[0].cardHolderIdentification.number\"]/div/input");
    private final By cuota = By.xpath("//*[@id=\"checkout-content\"]/div[1]/payment-component/div/div[1]/payment-method/div/" +
            "payment-method-selector-container/prepaid-payment-container/div/div/direct-card-load/div/installment-selector/" +
            "collapse/div/div[2]/div/payment-installment-items/div[1]/div");

    private final By localizacionInfoFactura = By.xpath("//*[@id=\"checkout-content\"]/div[1]/payment-component/div/div[1]/" +
            "payment-method/div/payment-method-selector-container/prepaid-payment-container/div/div[2]");
    private final By nombrePernonaFactura = By.xpath("//*[@id=\"invoice-first-name-0\"]");
    private final By apellidoPersonaFactura = By.xpath("//*[@id=\"invoice-last-name-0\"]");
    private final By documentoPersonaFactura = By.xpath("//*[@id=\"invoice-fiscal-identification-number-0\"]");
    private final By departamento = By.id("invoice-fiscal-address-state-0");
    private final By selectDepartamento = By.xpath("//*[@id=\"invoice-fiscal-address-state-0\"]/option[2]");
    private final By ciudad = By.id("invoice-fiscal-address-city-ONE_CARD_CREDIT-0");
    private final By confirmacionCiudad = By.xpath("//*[@id=\"ui-id-1\"]");
    private final By direccionFactura = By.id("formData.paymentData.cardPayments[0].invoice.fiscalAddress.street");
    private final By confirdireccionFactura = By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/" +
            "form/div[1]/payment-component/div/div[1]/payment-method/div/payment-method-selector-container/prepaid-payment-container/" +
            "div/div[2]/invoice-component/div/div[2]/div/invoice-default-component/div/address/div/div[4]/div/address-street-input/" +
            "div/div/input-component-v2/div/div/div/input");
    private final By nombresAdulto1 = By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/" +
            "travelers-container/travelers/old-travelers/div/ul/li/ul/li[1]/traveler/div/div[2]/div/div[1]/traveler-first-name-input/" +
            "div/div/input-component-v2/div/div/div/input");
    private final By apellidosAdulto1 = By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/" +
            "travelers-container/travelers/old-travelers/div/ul/li/ul/li[1]/traveler/div/div[2]/div/div[1]/traveler-last-name-input/" +
            "div/div/input-component-v2/div/div/div/input");
    private final By documentoAdulto1 = By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/" +
            "travelers-container/travelers/old-travelers/div/ul/li/ul/li[1]/traveler/div/div[2]/div/div[2]/traveler-identification/" +
            "div/div/div[3]/div/input-component-v2/div/div/div/input");
    private final By nombresAdulto2 = By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/" +
            "travelers-container/travelers/old-travelers/div/ul/li/ul/li[2]/traveler/div/div[2]/div/div[1]/traveler-first-name-input/" +
            "div/div/input-component-v2/div/div/div/input");
    private final By apellidosAdulto2 = By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/" +
            "travelers-container/travelers/old-travelers/div/ul/li/ul/li[2]/traveler/div/div[2]/div/div[1]/traveler-last-name-input/" +
            "div/div/input-component-v2/div/div/div/input");
    private final By documentoAdulto2 = By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/" +
            "travelers-container/travelers/old-travelers/div/ul/li/ul/li[2]/traveler/div/div[2]/div/div[2]/traveler-identification/" +
            "div/div/div[3]/div/input-component-v2/div/div/div/input");
    private final By nombresNino1 = By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/" +
            "travelers-container/travelers/old-travelers/div/ul/li/ul/li[2]/traveler/div/div[2]/div/div[1]/traveler-first-name-input/" +
            "div/div/input-component-v2/div/div/div/input");
    private final By apellidosNino1 = By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/" +
            "travelers-container/travelers/old-travelers/div/ul/li/ul/li[2]/traveler/div/div[2]/div/div[1]/traveler-last-name-input/" +
            "div/div/input-component-v2/div/div/div/input");
    private final By documentoNino1 = By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/" +
            "travelers-container/travelers/old-travelers/div/ul/li/ul/li[2]/traveler/div/div[2]/div/div[2]/traveler-identification/" +
            "div/div/div[3]/div/input-component-v2/div/div/div/input");
    private final By email = By.xpath("//*[@id=\"formData.contactData.mainEmailAddress\"]/div/input");
    private final By confirmacionEmail = By.xpath("//*[@id=\"formData.contactData.repeatEmailAddress\"]/div/input");
    private final By area = By.xpath("//*[@id=\"formData.contactData.phones[0].areaCode\"]/div/input");
    private final By telefono = By.name("formData.contactData.phones[0].number");


    // For validations

    private final By assertionOrigenDestino = By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/" +
            "form/div[2]/div/purchase-detail-component/div/products-detail-component-v2/div/div/product-title-v2/div/div[2]/div");
    private final By assertionOrigenDestinoIdaVuelta = By.xpath("//*[@id=\"checkout-content\"]/div[2]/div/purchase-detail-component/" +
            "div/products-detail-component-v2/div[1]/div/product-title-v2/div/div[2]/div[2]");

    //Constructor


    public RetoWPPage(RetoWPModel retoWPModel, WebDriver webDriver) {
        super(webDriver);
        this.retoWPModel = retoWPModel;

    }

    //Funtions
    public void fillretoWPTestIdaVuelta() throws InterruptedException {

        switch (retoWPModel.getTipoViaje()){
            case IDAVUELTA:
                click(tipoViajeIdaYVuelta);
                break;
            case SOLOIDA:
                click(tipoViajeIda);
                break;
            case MULTIDESTINO:
                click(tipoViajeMultidestino);
                break;
        }

        click(origen);
        typeInto(origen, retoWPModel.getOrigen());
        explicitWaitTime(confirOrigen);
        click(confirOrigen);
        click(destino);
        typeInto(destino, retoWPModel.getDestino());

        try {
            waitGeneral(confirDestino);
            click(confirDestino);

        }catch (Exception e){

            click(destino);
            clearText(destino);
            typeInto(destino, retoWPModel.getDestino());
            waitGeneral(confirDestino);
            click(confirDestino);
        }

        click(date);
        //Thread.sleep(2000);
        explicitWaitTime(LocalizacionDate);

        scrollTo(aplicarFechas);

        for(Integer i=0 ; i<=Integer.parseInt(retoWPModel.getIdaMes())-2 ; i++){
            click(arrowRight);
        }

        /*By seleccionDiaIda =By.cssSelector("div[data-month='"+retoWPModel.getIdaAno()+"-"+retoWPModel.getIdaMes()+"'].sbox5-monthgrid-datenumber:nth-child("+retoWPModel.getIdaDia()+")");
        click(seleccionDiaIda);

        By seleccionDiaVuelta =By.cssSelector("div[data-month='"+retoWPModel.getRegresoAno()+"-"+retoWPModel.getRegresoMes()+"'] " +
                ".sbox5-monthgrid-datenumber:nth-child("+retoWPModel.getRegresoDia()+")");
        click(seleccionDiaVuelta);*/

        By seleccionDiaIda =By.xpath("//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]/div[1]/div[3]/div["+retoWPModel.getIdaDia()+"]/div");
        click(seleccionDiaIda);

        By seleccionDiaVuelta =By.xpath("//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]/div[1]/div[3]/div["+retoWPModel.getRegresoDia()+"]/div");
        click(seleccionDiaVuelta);

        click(aplicarFechas);

        click(pasajeros);
        explicitWaitTime(addAdulto);
        click(addAdulto);
        click(aplicarPasajeros);

        click(search);

        explicitWaitTime(localizacionSelecionar);

        click(selectVuelos);

        if (isElementPresent(equipajePageLocator)) {
            waitToBeClickable(confirmacionEquipaje);
            click(confirmacionEquipaje);
        }

        explicitWaitTime(localizacionInfo);

        scrollTo(tarjetaC);
        click(tarjetaC);
        typeInto(tarjetaC, retoWPModel.getTarjetaCredito());
        typeInto(titularTarjeta, retoWPModel.getNombretitularTC()+ " "+retoWPModel.getApellidotitularTC());
        typeInto(vencimiento, retoWPModel.getVencimientoTarjeta());
        typeInto(seguridad, retoWPModel.getCodigoSeguridadTC());
        typeInto(documentoTitular, retoWPModel.getDocumentoTitularTC());
        click(cuota);

        explicitWaitTime(localizacionInfoFactura);
        scrollTo(nombrePernonaFactura);

        typeInto(nombrePernonaFactura, retoWPModel.getNombretitularTC());
        typeInto(apellidoPersonaFactura, retoWPModel.getApellidotitularTC());
        typeInto(documentoPersonaFactura, retoWPModel.getDocumentoTitularTC());

        click(departamento);
        click(selectDepartamento);
        typeInto(ciudad, retoWPModel.getCiudad());
        explicitWaitTime(confirmacionCiudad);
        click(confirmacionCiudad);
        tab(ciudad);
        click(direccionFactura);
        typeInto(confirdireccionFactura, retoWPModel.getDireccion());
        tab(confirdireccionFactura);
        typeInto(nombresAdulto1, retoWPModel.getNombresAdulto1());
        tab(nombresAdulto1);
        typeInto(apellidosAdulto1, retoWPModel.getApellidosAdulto1());
        click(documentoAdulto1);
        typeInto(documentoAdulto1, retoWPModel.getDocumentoAdulto1());
        tab(documentoAdulto1);
        typeInto(nombresAdulto2, retoWPModel.getNombresAdulto2());
        tab(nombresAdulto2);
        typeInto(apellidosAdulto2, retoWPModel.getApellidosAdulto2());
        click(documentoAdulto2);
        typeInto(documentoAdulto2, retoWPModel.getDocumentoAdulto2());

        scrollTo(email);
        typeInto(email, retoWPModel.getEmail());
        tab(email);
        typeInto(confirmacionEmail, retoWPModel.getEmail());

        scrollTo(area);
        typeInto(area, retoWPModel.getArea());
        typeInto(telefono, retoWPModel.getNumeroTelefonico());

        scrollTo(localizacionInfo);
    }

    public void fillretoWPTestIda(){

        switch (retoWPModel.getTipoViaje()){
            case IDAVUELTA:
                click(tipoViajeIdaYVuelta);
                break;
            case SOLOIDA:
                click(tipoViajeIda);
                break;
            case MULTIDESTINO:
                click(tipoViajeMultidestino);
                break;
        }

        click(origen);
        typeInto(origen, retoWPModel.getOrigen());
        explicitWaitTime(confirOrigen);
        click(confirOrigen);
        click(destino);
        typeInto(destino, retoWPModel.getDestino());

        try {
            waitGeneral(confirDestino);
            click(confirDestino);

        }catch (Exception e){

            click(destino);
            clearText(destino);
            typeInto(destino, retoWPModel.getDestino());
            waitGeneral(confirDestino);
            click(confirDestino);
        }

        click(date);
        explicitWaitTime(LocalizacionDate);

        scrollTo(aplicarFechas);

        for(Integer i=0 ; i<=Integer.parseInt(retoWPModel.getIdaMes())-2 ; i++){
            click(arrowRight);
        }

        /*By seleccionDiaIda =By.cssSelector("div[data-month='"+retoWPModel.getIdaAno()+"-"+retoWPModel.getIdaMes()+"'] " +
                ".sbox5-monthgrid-datenumber:nth-child("+retoWPModel.getIdaDia()+")");
        click(seleccionDiaIda);*/

        By seleccionDiaIda =By.xpath("//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]/div[1]/div[3]/div["+retoWPModel.getIdaDia()+"]/div");
        click(seleccionDiaIda);

        scrollTo(pasajeros);
        click(pasajeros);
        explicitWaitTime(addNino);
        click(addNino);
        click(seleccionEdadNino1);
        click(addEdadNino1);
        scrollTo(clase);
        click(clase);


        switch (retoWPModel.getTipoClase()){

            case ECONOMICA:
                click(claseEconomica);
                break;
            case PREMIUM:
                click(clasePremium);
                break;
            case EJECUTIVA:
                click(claseEjecutiva);
                break;
            case PRIMERA:
                click(clasePrimera);
                break;
        }
        click(aplicarPasajeros);

        click(search);

        explicitWaitTime(localizacionSelecionar);
        click(selectVuelos);

        if (isElementPresent(equipajePageLocator)) {
            waitToBeClickable(confirmacionEquipaje);
            click(confirmacionEquipaje);
        }else{

        }

        explicitWaitTime(localizacionInfo);

        scrollTo(tarjetaC);
        click(tarjetaC);
        typeInto(tarjetaC, retoWPModel.getTarjetaCredito());
        typeInto(titularTarjeta, retoWPModel.getNombretitularTC()+ " "+retoWPModel.getApellidotitularTC());
        typeInto(vencimiento, retoWPModel.getVencimientoTarjeta());
        typeInto(seguridad, retoWPModel.getCodigoSeguridadTC());
        typeInto(documentoTitular, retoWPModel.getDocumentoTitularTC());
        click(cuota);

        explicitWaitTime(localizacionInfoFactura);
        scrollTo(nombrePernonaFactura);

        typeInto(nombrePernonaFactura, retoWPModel.getNombretitularTC());
        typeInto(apellidoPersonaFactura, retoWPModel.getApellidotitularTC());
        typeInto(documentoPersonaFactura, retoWPModel.getDocumentoTitularTC());

        click(departamento);
        click(selectDepartamento);
        typeInto(ciudad, retoWPModel.getCiudad());
        explicitWaitTime(confirmacionCiudad);
        click(confirmacionCiudad);
        tab(ciudad);
        click(direccionFactura);
        typeInto(confirdireccionFactura, retoWPModel.getDireccion());
        tab(confirdireccionFactura);
        typeInto(nombresAdulto1, retoWPModel.getNombresAdulto1());
        tab(nombresAdulto1);
        typeInto(apellidosAdulto1, retoWPModel.getApellidosAdulto1());
        click(documentoAdulto1);
        typeInto(documentoAdulto1, retoWPModel.getDocumentoAdulto1());
        tab(documentoAdulto1);
        typeInto(nombresNino1, retoWPModel.getNombresNino1());
        tab(nombresNino1);
        typeInto(apellidosNino1, retoWPModel.getApellidosNino1());
        click(documentoNino1);
        typeInto(documentoNino1, retoWPModel.getDocumentoNino1());

        scrollTo(email);
        typeInto(email, retoWPModel.getEmail());
        tab(email);
        typeInto(confirmacionEmail, retoWPModel.getEmail());

        scrollTo(area);
        typeInto(area, retoWPModel.getArea());
        typeInto(telefono, retoWPModel.getNumeroTelefonico());

        scrollTo(localizacionInfo);



    }

    public List<String> isRegistrationDoneIdaVuelta(){
        List<String> submitedFormResult = new ArrayList<>();
        submitedFormResult.add(getText(assertionOrigenDestinoIdaVuelta).trim());

        return submitedFormResult;
    }

    public List<String> isRegistrationDoneIda(){
        List<String> submitedFormResult = new ArrayList<>();
        submitedFormResult.add(getText(assertionOrigenDestino).trim());

        return submitedFormResult;
    }
}
