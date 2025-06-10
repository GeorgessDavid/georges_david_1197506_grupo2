package org.uade.models;

public class Cliente {
    private String idGalactico;
    private String nombre;
    private String especie;
    private String sistemaOrigen;
    private String comunicador;

    public Cliente(String idGalactico, String nombre, String especie, String sistemaOrigen, String comunicador) {
        this.idGalactico = idGalactico;
        this.nombre = nombre;
        this.especie = especie;
        this.sistemaOrigen = sistemaOrigen;
        this.comunicador = comunicador;
    }
}
