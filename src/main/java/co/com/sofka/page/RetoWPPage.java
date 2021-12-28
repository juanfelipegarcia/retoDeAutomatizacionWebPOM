package co.com.sofka.page;

import co.com.sofka.model.RetoWPModel;
import co.com.sofka.page.common.CommonActionOnPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetoWPPage extends CommonActionOnPages {

    private final RetoWPModel retoWPModel;
    private WebDriver webDriver;

    private final By tipoViaje = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[1]/div/span[1]");
    private final By origen = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/input");
    private final By confirOrigen = By.xpath("/html/body/div[4]/div/div[1]/ul/li[1]");
    private final By destino = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[1]/div/div[2]/div/div/input");
    private final By confirDestino = By.xpath("/html/body/div[4]/div/div[1]/ul/li");
    private final By date = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div/div/div/input");
    private final By idaDia = By.xpath("//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]/div[2]/div[3]/div[12]");
    private final By aplicarFechas = By.xpath("//*[@id=\"component-modals\"]/div[1]/div[2]/div[1]/button");
    private final By regresoDia = By.xpath("//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]/div[2]/div[3]/div[18]");
    private final By pasajeros = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[4]/div/div/div/div/input");
    private final By addPasajero = By.xpath("//*[@id=\"component-modals\"]/div[3]/div/div/div[1]/div[1]/div[2]/div/button[2]");
    private final By aplicarPasajeros = By.xpath("//*[@id=\"component-modals\"]/div[3]/div/div/div[3]/a");
    private final By localizacionSelecionar = By.xpath("//*[@id=\"clusters\"]/span[1]/div/span/cluster/div/div/div[2]/fare/span");
    private final By selectVuelos = By.xpath("//*[@id=\"clusters\"]/span[1]/div/span/cluster/div/div/div[2]/fare/span/span/div[2]");
    private final By confirmacionEquipaje = By.xpath("//*[@id=\"upselling-popup-position\"]/upselling-popup/div/div[3]/div/div/button");
    private final By search = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[3]/button");

    private final By localizacionDetalleVuelo = By.xpath("//*[@id=\"pricebox-list-detail\"]");
    private final By localizacionInfo = By.xpath("//*[@id=\"checkout-content\"]/div[1]/payment-component/payment-method-selector/div/span");

    private final By tarjetaC = By.xpath("//*[@id=\"formData.paymentData.cardPayments[0].card.number\"]/div/input");
    private final By titularTarjeta = By.xpath("//*[@id=\"formData.paymentData.cardPayments[0].card.holderName\"]/div/input");
    private final By vencimiento = By.xpath("//*[@id=\"formData.paymentData.cardPayments[0].card.expirationDate\"]/div/input");
    private final By seguridad = By.xpath("//*[@id=\"formData.paymentData.cardPayments[0].card.securityCode\"]/div/input");
    private final By documentoTitular = By.xpath("//*[@id=\"formData.paymentData.cardPayments[0].cardHolderIdentification.number\"]/div/input");
    private final By cuota = By.xpath("//*[@id=\"checkout-content\"]/div[1]/payment-component/div/div[1]/payment-method/div/payment-method-selector-container/prepaid-payment-container/div/div/direct-card-load/div/installment-selector/collapse/div/div[2]/div/payment-installment-items/div[1]/div");

    private final By localizacionInfoFactura = By.xpath("//*[@id=\"checkout-content\"]/div[1]/payment-component/div/div[1]/payment-method/div/payment-method-selector-container/prepaid-payment-container/div/div[2]");
    private final By nombrePernonaFactura = By.xpath("//*[@id=\"invoice-first-name-0\"]");
    private final By apellidoPersonaFactura = By.xpath("//*[@id=\"invoice-last-name-0\"]");
    private final By documentoPersonaFactura = By.xpath("//*[@id=\"invoice-fiscal-identification-number-0\"]");
    private final By departamento = By.id("invoice-fiscal-address-state-0");
    private final By selectDepartamento = By.xpath("//*[@id=\"invoice-fiscal-address-state-0\"]/option[2]");
    private final By ciudad = By.id("invoice-fiscal-address-city-ONE_CARD_CREDIT-0");
    private final By confirmacionCiudad = By.xpath("//*[@id=\"ui-id-1\"]");
    private final By direccionFactura = By.id("formData.paymentData.cardPayments[0].invoice.fiscalAddress.street");
    private final By confirdireccionFactura = By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/payment-component/div/div[1]/payment-method/div/payment-method-selector-container/prepaid-payment-container/div/div[2]/invoice-component/div/div[2]/div/invoice-default-component/div/address/div/div[4]/div/address-street-input/div/div/input-component-v2/div/div/div/input");
    private final By nombresAdulto1 = By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/travelers-container/travelers/old-travelers/div/ul/li/ul/li[1]/traveler/div/div[2]/div/div[1]/traveler-first-name-input/div/div/input-component-v2/div/div/div/input");
    private final By apellidosAdulto1 = By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/travelers-container/travelers/old-travelers/div/ul/li/ul/li[1]/traveler/div/div[2]/div/div[1]/traveler-last-name-input/div/div/input-component-v2/div/div/div/input");
    private final By documentoAdulto1 = By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/travelers-container/travelers/old-travelers/div/ul/li/ul/li[1]/traveler/div/div[2]/div/div[2]/traveler-identification/div/div/div[3]/div/input-component-v2/div/div/div/input");
    private final By nombresAdulto2 = By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/travelers-container/travelers/old-travelers/div/ul/li/ul/li[2]/traveler/div/div[2]/div/div[1]/traveler-first-name-input/div/div/input-component-v2/div/div/div/input");
    private final By apellidosAdulto2 = By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/travelers-container/travelers/old-travelers/div/ul/li/ul/li[2]/traveler/div/div[2]/div/div[1]/traveler-last-name-input/div/div/input-component-v2/div/div/div/input");
    private final By documentoAdulto2 = By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/travelers-container/travelers/old-travelers/div/ul/li/ul/li[2]/traveler/div/div[2]/div/div[2]/traveler-identification/div/div/div[3]/div/input-component-v2/div/div/div/input");
    private final By email = By.xpath("//*[@id=\"formData.contactData.mainEmailAddress\"]/div/input");
    private final By confirmacionEmail = By.xpath("//*[@id=\"formData.contactData.repeatEmailAddress\"]/div/input");
    private final By area = By.xpath("//*[@id=\"formData.contactData.phones[0].areaCode\"]/div/input");
    private final By telefono = By.name("formData.contactData.phones[0].number");



    //Constructor


    public RetoWPPage(RetoWPModel retoWPModel, WebDriver webDriver) {
        super(webDriver);
        this.retoWPModel = retoWPModel;

    }

    //Funtions
    public void fillretoWPTestIdaVuelta() throws InterruptedException {

        click(origen);
        typeInto(origen, " "+retoWPModel.getOrigen());
        explicitWaitTime(confirOrigen);
        click(confirOrigen);
        click(destino);
        typeInto(destino, " ");
        typeInto(destino, " "+retoWPModel.getDestino());
        explicitWaitTime(confirDestino);
        click(confirDestino);

        click(date);
        Thread.sleep(2000);

        scrollTo(aplicarFechas);
        click(idaDia);
        click(regresoDia);
        click(aplicarFechas);
        click(pasajeros);
        explicitWaitTime(addPasajero);
        click(addPasajero);
        click(aplicarPasajeros);

        click(search);

        explicitWaitTime(localizacionSelecionar);
        click(selectVuelos);

        explicitWaitTime(confirmacionEquipaje);
        click(confirmacionEquipaje);

        explicitWaitTime(localizacionDetalleVuelo);

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












    }
}
