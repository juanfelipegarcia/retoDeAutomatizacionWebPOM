package co.com.sofka.model;

import co.com.sofka.util.TipoViaje;

public class RetoWPModel {

    private TipoViaje tipoViaje;
    private String origen;
    private String destino;
    private String idaDia;
    private String idaMes;
    private String idaAno;
    private String regresoDia;
    private String regresoMes;
    private String regresoAno;
    private String pasajeroAdulto;
    private String pasajeroMenor;
    private String clase;


    public TipoViaje getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(TipoViaje tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getIdaDia() {
        return idaDia;
    }

    public void setIdaDia(String idaDia) {
        this.idaDia = idaDia;
    }

    public String getIdaMes() {
        return idaMes;
    }

    public void setIdaMes(String idaMes) {
        this.idaMes = idaMes;
    }

    public String getIdaAno() {
        return idaAno;
    }

    public void setIdaAno(String idaAno) {
        this.idaAno = idaAno;
    }

    public String getRegresoDia() {
        return regresoDia;
    }

    public void setRegresoDia(String regresoDia) {
        this.regresoDia = regresoDia;
    }

    public String getRegresoMes() {
        return regresoMes;
    }

    public void setRegresoMes(String regresoMes) {
        this.regresoMes = regresoMes;
    }

    public String getRegresoAno() {
        return regresoAno;
    }

    public void setRegresoAno(String regresoAno) {
        this.regresoAno = regresoAno;
    }

    public String getPasajeroAdulto() {
        return pasajeroAdulto;
    }

    public void setPasajeroAdulto(String pasajeroAdulto) {
        this.pasajeroAdulto = pasajeroAdulto;
    }

    public String getPasajeroMenor() {
        return pasajeroMenor;
    }

    public void setPasajeroMenor(String pasajeroMenor) {
        this.pasajeroMenor = pasajeroMenor;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
}
