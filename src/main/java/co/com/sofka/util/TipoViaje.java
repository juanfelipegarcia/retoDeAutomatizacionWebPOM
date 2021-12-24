package co.com.sofka.util;

public enum TipoViaje {
    IDAVUELTA ("Ida y vuelta"),
    SOLOIDA("Solo ida"),
    MULTIDESTINO("Multidestino");

    private final String value;

    public String getValue() {
        return value;
    }

    TipoViaje(String value) {
        this.value = value;
    }
}
