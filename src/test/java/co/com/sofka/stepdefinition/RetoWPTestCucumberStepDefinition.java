package co.com.sofka.stepdefinition;

import co.com.sofka.model.RetoWPModel;
import co.com.sofka.page.RetoWPPage;
import co.com.sofka.runner.RetoWPTestCucumber;
import co.com.sofka.setup.WebUI;
import co.com.sofka.util.TipoViaje;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

public class RetoWPTestCucumberStepDefinition extends WebUI {
    private static final Logger LOGGER = Logger.getLogger(RetoWPTestCucumber.class);
    private RetoWPPage retoWPPage;
    private RetoWPModel viaje;
    private static final String ASSETION_EXCEPTION_MESSAGE = "Los valores suministrados no son los esperados: %s";


    @Given("que el usuario se encuentra en la pagina web de vuelos.com")
    public void que_el_usuario_se_encuentra_en_la_pagina_web_de_vuelos_com() {
        try {
            generalSetUp();
            LOGGER.info("Configuración inicial OK.");

        } catch (Exception exception){
            quietDriver();
        }

    }

    //Scenario 1
    @When("el Usuario ingresa los campos obligatorios y necesarios para la seleccion del destino de ida y vuelta  e inicia la busqueda.")
    public void el_usuario_ingresa_los_campos_obligatorios_y_necesarios_para_la_seleccion_del_destino_de_ida_y_vuelta_e_inicia_la_busqueda() {
        try {
            generateTravel();
            retoWPPage = new RetoWPPage(viaje, super.driver);
            retoWPPage.fillretoWPTestIdaVuelta();

        } catch (Exception exception){
            //quietDriver();

        }
    }

    @Then("el sistema debera mostrar por pantalla los diferentes precios del vueldo de ida.")
    public void el_sistema_debera_mostrar_por_pantalla_los_diferentes_precios_del_vueldo_de_ida() {
        try {

        } catch (Exception exception){

        }finally {
            //quietDriver();
        }
    }

    //Scenario 2
    @When("el Usuario ingresa los campos obligatorios y necesarios para la seleccion del destino de ida e inicia la busqueda.")
    public void el_usuario_ingresa_los_campos_obligatorios_y_necesarios_para_la_seleccion_del_destino_de_ida_e_inicia_la_busqueda() {
        try {

        } catch (Exception exception){

        }
    }

    @Then("el sistema debera mostrar por pantalla los diferentes precios del vueldo de ida y vuelta.")
    public void el_sistema_debera_mostrar_por_pantalla_los_diferentes_precios_del_vueldo_de_ida_y_vuelta() {
        try {

        } catch (Exception exception){
            quietDriver();
        }finally {
            quietDriver();
        }
    }


    private void generateTravel(){
        viaje = new RetoWPModel();
        viaje.setTipoViaje(TipoViaje.IDAVUELTA);
        viaje.setOrigen("Medellín");
        viaje.setDestino("Cartagena");
        viaje.setIdaDia("30");
        viaje.setRegresoDia("24");
        viaje.setPasajeroAdulto("2");
        viaje.setPasajeroMenor("2");
        viaje.setClase("Economica");
        viaje.setTarjetaCredito("5254 1336 7440 3564");
        viaje.setNombretitularTC("Jose");
        viaje.setApellidotitularTC("jimenez");
        viaje.setCodigoSeguridadTC("123");
        viaje.setVencimientoTarjeta("11/25");
        viaje.setDocumentoTitularTC("14879587");
        viaje.setCiudad("Bello, Antioquia, Colombia");
        viaje.setDireccion("Cra 65 a #44-60");
        viaje.setNombresAdulto1("Andrea Maria");
        viaje.setApellidosAdulto1("Torres Perez");
        viaje.setDocumentoAdulto1("1045565544");
        viaje.setNombresAdulto2("Pedro Jose");
        viaje.setApellidosAdulto2("lopez Gomez");
        viaje.setDocumentoAdulto2("1045565545");
        viaje.setEmail("juanjogomez@gmail.com");
        viaje.setArea("57");
        viaje.setNumeroTelefonico("3001234567");


    }

}
