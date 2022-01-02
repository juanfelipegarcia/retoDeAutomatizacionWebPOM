package co.com.sofka.stepdefinition;

import co.com.sofka.model.RetoWPPFModel;
import co.com.sofka.page.RetoWPPFPage;
import co.com.sofka.runner.RetoWPPFTestCucumber;
import co.com.sofka.setup.WebUI;
import co.com.sofka.util.MetodoPago;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import java.util.ArrayList;
import java.util.List;

public class RetoWPPFStepDefinitions extends WebUI {

    private static final Logger LOGGER = Logger.getLogger(RetoWPPFTestCucumber.class);
    private RetoWPPFModel comprador1;
    private RetoWPPFModel comprador2;
    private RetoWPPFPage retoWPPFPage;
    private static final String ASSERTION_EXCEPTION_MESSAGE = "Los valores suministrados no son los esperados: %s";

    @Given("Que el comprador se encuentra en la pagina web de la empresa zonafit")
    public void queElCompradorSeEncuentraEnLaPaginaWebDeLaEmpresaZonafit() {
        try {
            generalSetUp();

        } catch (Exception e) {
            Assertions.fail(e.getMessage(), e);
            LOGGER.warn(e);
           //quietDriver();
        }

    }

    //Scenario 1
    @When("el comprador ingresa en X2 añade los productos al carrito de compras dilegencia el formulario y realiza el pedido")
    public void elCompradorIngresaEnX2AnadeLosProductosAlCarritoDeComprasDilegenciaElFormularioYRealizaElPedido() {
        try {
            generarComprador1();
            retoWPPFPage = new RetoWPPFPage(comprador1, super.driver);
            retoWPPFPage.llenadoCamposComprador1();
        }catch (Exception e){
            Assertions.fail(e.getMessage(), e);
            LOGGER.warn(e);
            //quietDriver();
        }
    }
    @Then("el comprador debere observar el mensaje de comfirmacion de su pedido de X2.")
    public void elCompradorDebereObservarElMensajeDeComfirmacionDeSuPedidoDeX2() {
        try {
            Assertions.assertEquals(
                    retoWPPFPage.isRegistrationDoneComprador1(),
                    forSubmittedFormComprador1(),
                    String.format(ASSERTION_EXCEPTION_MESSAGE, outcomeComprador1())
            );
            LOGGER.info("Finaliza scenario 1");

        } catch (Exception exception){
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception);
            //quietDriver();
        }finally {
            //quietDriver();
        }
    }

    //Scenario 2
    @When("el comprador ingresa en Ofertas añade los productos al carrito de compras dilegencia el formulario y realiza el pedido")
    public void elCompradorIngresaEnOfertasAnadeLosProductosAlCarritoDeComprasDilegenciaElFormularioYRealizaElPedido() {
        try {
            generarComprador2();
            retoWPPFPage = new RetoWPPFPage(comprador2, super.driver);
            retoWPPFPage.llenadoCamposComprador2();
        }catch (Exception e){
            Assertions.fail(e.getMessage(), e);
            LOGGER.warn(e);
            //quietDriver();
        }
    }
    @Then("el comprador debere observar el mensaje de comfirmacion de su pedido de Ofertas.")
    public void elCompradorDebereObservarElMensajeDeComfirmacionDeSuPedidoDeOfertas() {
        try {
            Assertions.assertEquals(
                    retoWPPFPage.isRegistrationDoneComprador2(),
                    forSubmittedFormComprador2(),
                    String.format(ASSERTION_EXCEPTION_MESSAGE, outcomeComprador2())
            );
            LOGGER.info("Finaliza scenario 2");

        } catch (Exception exception){
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception);
            //quietDriver();
        }finally {
            //quietDriver();
        }
    }



    private void generarComprador1() {
        comprador1 = new RetoWPPFModel();
        comprador1.setDocumento("15440460");
        comprador1.setEmail("pipe.plata@gmail.com");
        comprador1.setNombres("Felipe Andres");
        comprador1.setApellidos("Moreno");
        comprador1.setDepartamento("Antioquia");
        comprador1.setCiudad("Bello");
        comprador1.setDireccion("Cra 65 A · 44-55");
        comprador1.setAnexoDireccion("Apt 604");
        comprador1.setNumeroCelular("3006447272");
        comprador1.setNotasPedido(" Despues del medio dia hora de entrega");
        comprador1.setMetodoPago(MetodoPago.BALOTO);

    }

    public List<String> forSubmittedFormComprador1(){
        List<String> submitedFormResult = new ArrayList<>();
        submitedFormResult.add("Tus datos personales se utilizarán para procesar tu pedido, mejorar tu experiencia en esta web y otros propósitos descritos en nuestra política de privacidad.");

        return submitedFormResult;
    }

    private void generarComprador2() {
        comprador2 = new RetoWPPFModel();
        comprador2.setDocumento("43920889");
        comprador2.setEmail("alejitanice@gmail.com");
        comprador2.setNombres("Alejandra Milena");
        comprador2.setApellidos("Machado Sepulveda");
        comprador2.setDepartamento("Córdoba");
        comprador2.setCiudad("Monteria - 230001");
        comprador2.setDireccion("Cra 65 A · 44-55");
        comprador2.setAnexoDireccion("Apt 604");
        comprador2.setNumeroCelular("3006447272");
        comprador2.setNotasPedido(" Despues del medio dia hora de entrega");
        comprador2.setMetodoPago(MetodoPago.TARJETAS);

    }

    public List<String> forSubmittedFormComprador2(){
        List<String> submitedFormResult = new ArrayList<>();
        submitedFormResult.add("Tus datos personales se utilizarán para procesar tu pedido, mejorar tu experiencia en esta web y otros propósitos descritos en nuestra política de privacidad.");
        submitedFormResult.add("6");
        submitedFormResult.add("$731.900");

        return submitedFormResult;
    }


    private String outcomeComprador1(){
        return "\n" + retoWPPFPage.isRegistrationDoneComprador1().toString() + "\n\r" + forSubmittedFormComprador1().toString();
    }

    private String outcomeComprador2(){
        return "\n" + retoWPPFPage.isRegistrationDoneComprador2().toString() + "\n\r" + forSubmittedFormComprador2().toString();
    }




}
