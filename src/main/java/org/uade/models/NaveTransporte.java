package org.uade.models;

public class NaveTransporte extends Nave{
    private double costoHipercombustible;

    public NaveTransporte(String codigoID, String modelo, double precioHora, double costoHipercombustible) {
        super(codigoID, modelo, precioHora);
        this.costoHipercombustible = costoHipercombustible;
    }

    @Override
    protected double calcularCosto(int horas) {
        if(horas < 0) throw new IllegalArgumentException("Debe introducir un número de horas válido.");

        double costoDelViaje = this.calculoDelCosto(horas);

        double total = costoDelViaje + costoHipercombustible;

        return total;
    }
}
