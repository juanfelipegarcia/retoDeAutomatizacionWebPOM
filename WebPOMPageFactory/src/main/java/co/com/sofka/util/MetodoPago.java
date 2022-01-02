package co.com.sofka.util;

public enum MetodoPago {

    CORRESPONSAL("corresponsal"),
    BALOTO("baloto"),
    TARJETAS("tarjetas");

    private final String value;

    public String getValue () {
        return value;
    }

    MetodoPago (String value) {
        this.value = value;
    }
}
