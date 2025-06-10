package org.uade.models;

import java.sql.Date;

public class Alquiler {
    private String numeroReserva;
    private Date fechaInicio;
    private Date fechaFin;
    private int horasEstimadas;

    public Alquiler(String numeroReserva, Date fechaInicio, Date fechaFin, int horasEstimadas) {
        this.numeroReserva = numeroReserva;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horasEstimadas = horasEstimadas;
    }


}
