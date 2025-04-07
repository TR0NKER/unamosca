package core;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author examen
 */
public class PuntoGeografico {
    private double latitud;
    private double longitud;

    public PuntoGeografico(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "("+latitud + ", " + longitud + ')';
    }

    
}
