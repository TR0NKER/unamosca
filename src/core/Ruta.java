/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author examen
 */
public class Ruta {
    private ArrayList<PuntoGeografico> puntosGeograficos;

    public Ruta(ArrayList<PuntoGeografico> puntosGeograficos) {
        this.puntosGeograficos = puntosGeograficos;
    }

    public ArrayList<PuntoGeografico> getPuntosGeograficos() {
        return puntosGeograficos;
    }
    
}
