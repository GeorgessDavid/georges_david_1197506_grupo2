package org.uade.models;

public abstract class Nave {
    private String codigoID;
    private String modelo;
    private double precioHora;

    public Nave(String codigoID, String modelo, double precioHora) {
        this.codigoID = codigoID;
        this.modelo = modelo;
        this.precioHora = precioHora;
    }

    protected abstract double calcularCosto(int horas);

    protected double calculoDelCosto(int horasVuelo){
        return precioHora*horasVuelo;
    }
}
