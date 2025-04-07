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
public class Conductor extends Empleado{
    private ArrayList<Turno> turnos;
    public Conductor(int id, String nombre, int edad, double salario) {
        super(id,nombre,edad,salario);
        this.turnos= new ArrayList<>();
    }
    
}
