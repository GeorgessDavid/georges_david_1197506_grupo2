package org.uade.models;

public class CazaEstelar extends Nave{
    public CazaEstelar(String codigoID, String modelo, double precioHora) {
        super(codigoID, modelo, precioHora);
    }

    @Override
    protected double calcularCosto(int horas) {
        return this.calculoDelCosto(horas);
    }
}
