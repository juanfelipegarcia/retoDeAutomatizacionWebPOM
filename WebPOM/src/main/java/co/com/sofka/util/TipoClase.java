package co.com.sofka.util;

public enum TipoClase {

    ECONOMICA ("Economica"),
    PREMIUM("Premium economy"),
    EJECUTIVA("Ejecutiva/Business"),
    PRIMERA("Primera Clase");

    private final String value;

    public String getValue() {
        return value;
    }

    TipoClase(String value) {this.value = value;}
}
