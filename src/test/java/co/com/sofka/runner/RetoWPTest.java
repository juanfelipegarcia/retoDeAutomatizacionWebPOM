package co.com.sofka.runner;

import co.com.sofka.model.RetoWPModel;
import co.com.sofka.page.RetoWPPage;
import co.com.sofka.setup.WebUI;
import co.com.sofka.util.TipoViaje;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RetoWPTest extends WebUI {

    private RetoWPModel viaje;

    @BeforeEach
    public void setUp(){
        generalSetUp();
        generateTravel();
    }

    @Test
    public void retoWPTestIdaVuelta() throws InterruptedException {
        RetoWPPage retoWPPage = new RetoWPPage(viaje, driver);
        retoWPPage.fillretoWPTestIdaVuelta();
    }

    @AfterEach
    public void tearDown(){
        //quietDriver();
    }

    private void generateTravel(){
        viaje = new RetoWPModel();
        viaje.setTipoViaje(TipoViaje.IDAVUELTA);
        viaje.setOrigen("Medellín, Antioquia, Colombia");
        viaje.setDestino("Cartagena de Indias, Bolívar, Colombia");
        viaje.setIdaDia("30");
        viaje.setRegresoDia("24");
        viaje.setPasajeroAdulto("2");
        viaje.setPasajeroMenor("2");
        viaje.setClase("Economica");
    }
}
