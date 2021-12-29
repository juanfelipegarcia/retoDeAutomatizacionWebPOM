package co.com.sofka.stepdefinition;

import co.com.sofka.model.RetoWPModel;
import co.com.sofka.page.RetoWPPage;
import co.com.sofka.runner.RetoWPTestCucumber;
import co.com.sofka.setup.WebUI;
import co.com.sofka.util.TipoClase;
import co.com.sofka.util.TipoViaje;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class RetoWPTestCucumberStepDefinition extends WebUI {
    private static final Logger LOGGER = Logger.getLogger(RetoWPTestCucumber.class);
    private RetoWPPage retoWPPage;
    private RetoWPModel viajeIdaVuelta;
    private RetoWPModel viajeIda;
    private static final String ASSERTION_EXCEPTION_MESSAGE = "Los valores suministrados no son los esperados: %s";


    @Given("que el usuario se encuentra en la pagina web de vuelos.com")
    public void que_el_usuario_se_encuentra_en_la_pagina_web_de_vuelos_com() {
        try {
            generalSetUp();
            LOGGER.info("Configuración inicial OK.");

        } catch (Exception exception){
            Assertions.fail(exception.getMessage(), exception);
            quietDriver();
        }

    }

    //Scenario 1
    @When("el Usuario ingresa los campos obligatorios y necesarios para la seleccion del destino de ida y vuelta  e inicia la busqueda.")
    public void el_usuario_ingresa_los_campos_obligatorios_y_necesarios_para_la_seleccion_del_destino_de_ida_y_vuelta_e_inicia_la_busqueda() {
        try {
            generateTravelIdaVuelta();
            retoWPPage = new RetoWPPage(viajeIdaVuelta, super.driver);
            retoWPPage.fillretoWPTestIdaVuelta();

        } catch (Exception exception){
            Assertions.fail(exception.getMessage(), exception);
            quietDriver();

        }
    }

    @Then("el sistema debera mostrar por pantalla los diferentes precios del vueldo de ida y vuelta.")
    public void el_sistema_debera_mostrar_por_pantalla_los_diferentes_precios_del_vueldo_de_ida_y_vuelta() {
        try {
            Assertions.assertEquals(
                retoWPPage.isRegistrationDoneIdaVuelta(),
                forSubmittedFormIdaVuelta(),
                String.format(ASSERTION_EXCEPTION_MESSAGE, outcomeIdaVuelta())
        );

        } catch (Exception exception){
            Assertions.fail(exception.getMessage(), exception);
            quietDriver();
        }finally {
            quietDriver();
        }


    }



    //Scenario 2
    @When("el Usuario ingresa los campos obligatorios y necesarios para la seleccion del destino de ida e inicia la busqueda.")
    public void el_usuario_ingresa_los_campos_obligatorios_y_necesarios_para_la_seleccion_del_destino_de_ida_e_inicia_la_busqueda() {
        try {
            generateTravelIda();
            retoWPPage = new RetoWPPage(viajeIda, super.driver);
            retoWPPage.fillretoWPTestIda();
        } catch (Exception exception){
            Assertions.fail(exception.getMessage(), exception);
            quietDriver();
        }
    }

    @Then("el sistema debera mostrar por pantalla los diferentes precios del vueldo de ida.")
    public void el_sistema_debera_mostrar_por_pantalla_los_diferentes_precios_del_vueldo_de_ida() {
        try {
            Assertions.assertEquals(
                retoWPPage.isRegistrationDoneIda().toString(),
                forSubmittedFormIda().toString(),
                String.format(ASSERTION_EXCEPTION_MESSAGE, outcomeIda())
        );

        } catch (Exception exception){
            Assertions.fail(exception.getMessage(), exception);
            quietDriver();
        }finally {
            quietDriver();
        }



    }

    private void generateTravelIdaVuelta(){
        viajeIdaVuelta = new RetoWPModel();
        viajeIdaVuelta.setTipoViaje(TipoViaje.IDAVUELTA);
        viajeIdaVuelta.setOrigen("Medellín");
        viajeIdaVuelta.setDestino("Cartagena de Indias");
        viajeIdaVuelta.setIdaDia(14);
        viajeIdaVuelta.setIdaMes("05");
        viajeIdaVuelta.setIdaAno(2022);
        viajeIdaVuelta.setRegresoDia(21);
        viajeIdaVuelta.setRegresoMes("05");
        viajeIdaVuelta.setRegresoAno(2022);
        viajeIdaVuelta.setPasajeroAdulto("2");
        viajeIdaVuelta.setPasajeroMenor("2");
        viajeIdaVuelta.setTipoClase(TipoClase.ECONOMICA);
        viajeIdaVuelta.setTarjetaCredito("5254 1336 7440 3564");
        viajeIdaVuelta.setNombretitularTC("Jose");
        viajeIdaVuelta.setApellidotitularTC("jimenez");
        viajeIdaVuelta.setCodigoSeguridadTC("123");
        viajeIdaVuelta.setVencimientoTarjeta("11/25");
        viajeIdaVuelta.setDocumentoTitularTC("14879587");
        viajeIdaVuelta.setCiudad("Bello, Antioquia, Colombia");
        viajeIdaVuelta.setDireccion("Cra 65 a #44-60");
        viajeIdaVuelta.setNombresAdulto1("Andrea Maria");
        viajeIdaVuelta.setApellidosAdulto1("Torres Perez");
        viajeIdaVuelta.setDocumentoAdulto1("1045565544");
        viajeIdaVuelta.setNombresAdulto2("Pedro Jose");
        viajeIdaVuelta.setApellidosAdulto2("lopez Gomez");
        viajeIdaVuelta.setDocumentoAdulto2("1045565545");
        viajeIdaVuelta.setEmail("juanjogomez@gmail.com");
        viajeIdaVuelta.setArea("57");
        viajeIdaVuelta.setNumeroTelefonico("3001234567");

    }

    public List<String> forSubmittedFormIdaVuelta(){
        List<String> submitedFormResult = new ArrayList<>();
        submitedFormResult.add(viajeIdaVuelta.getOrigen() + " - " + viajeIdaVuelta.getDestino());

        return submitedFormResult;
    }

    private void generateTravelIda(){
        viajeIda = new RetoWPModel();
        viajeIda.setTipoViaje(TipoViaje.SOLOIDA);
        viajeIda.setOrigen("Medellín");
        viajeIda.setDestino("Bogotá");
        viajeIda.setIdaDia(30);
        viajeIda.setIdaMes("05");
        viajeIda.setIdaAno(2022);
        viajeIda.setTipoClase(TipoClase.ECONOMICA);
        viajeIda.setTarjetaCredito("5254 1336 7440 3564");
        viajeIda.setNombretitularTC("Jose");
        viajeIda.setApellidotitularTC("jimenez");
        viajeIda.setCodigoSeguridadTC("123");
        viajeIda.setVencimientoTarjeta("11/25");
        viajeIda.setDocumentoTitularTC("14879587");
        viajeIda.setCiudad("Bello, Antioquia, Colombia");
        viajeIda.setDireccion("Cra 65 a #44-60");
        viajeIda.setNombresAdulto1("Maria Fernanda");
        viajeIda.setApellidosAdulto1("Perez Perez");
        viajeIda.setDocumentoAdulto1("705587445");
        viajeIda.setNombresNino1("Matias");
        viajeIda.setApellidosNino1("Lopez Perez");
        viajeIda.setDocumentoNino1("1038977455");
        viajeIda.setEmail("juanjogomez@gmail.com");
        viajeIda.setArea("57");
        viajeIda.setNumeroTelefonico("3001234567");

    }

    public List<String> forSubmittedFormIda(){
        List<String> submitedFormResult = new ArrayList<>();
        submitedFormResult.add(viajeIda.getOrigen() + " - " + viajeIda.getDestino());

        return submitedFormResult;
    }

    private String outcomeIdaVuelta(){
        return "\n" + retoWPPage.isRegistrationDoneIdaVuelta().toString() + "\n\r" + forSubmittedFormIdaVuelta().toString();
    }

    private String outcomeIda(){
        return "\n" + retoWPPage.isRegistrationDoneIda().toString() + "\n\r" + forSubmittedFormIda().toString();
    }

}
