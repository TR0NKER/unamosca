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
public class Camion {
    private int id;
    private String placa;
    private String marca;
    private ArrayList<Turno> turnos;

    public Camion(int id, String placa, String marca) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.turnos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }
    
    

    
}
