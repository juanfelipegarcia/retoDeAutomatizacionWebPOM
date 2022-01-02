package co.com.sofka.model;

import co.com.sofka.util.MetodoPago;

public class RetoWPPFModel {

    private String documento;
    private String email;
    private String nombres;
    private String apellidos;
    private String departamento;
    private String ciudad;
    private String direccion;
    private String anexoDireccion;
    private String numeroCelular;
    private String notasPedido;
    private MetodoPago metodoPago;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAnexoDireccion() {
        return anexoDireccion;
    }

    public void setAnexoDireccion(String anexoDireccion) {
        this.anexoDireccion = anexoDireccion;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getNotasPedido() {
        return notasPedido;
    }

    public void setNotasPedido(String notasPedido) {
        this.notasPedido = notasPedido;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }
}
