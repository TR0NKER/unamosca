/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author examen
 */
public class Turno {

    
    private int id;
    private Camion camion;
    private Conductor conductor;
    private Asistente asistente1;
    private Asistente asistente2;
    private Ruta ruta;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private Residuo residuos;

    public Turno(int id, Camion camion, Empleado conductor, Empleado asistente1, Empleado asistente2, Ruta ruta) {
        this.id = id;
        this.camion = camion;
        this.conductor = (Conductor) conductor;
        this.asistente1 = (Asistente) asistente1;
        this.asistente2 = (Asistente) asistente2;
        this.ruta = ruta;
    }
  
    public int getId() {
        return id;
    }

    public void ejecutar(LocalDateTime fechaInicio, int duracion) {
        this.fechaInicio= fechaInicio;
        this.fechaFin=fechaInicio.plusHours(duracion);
    }

    public void clasificarResiduos(double vidrio, double papel, double plastico, double metal, double residuosOrganicos) {
        this.residuos = new Residuo(vidrio, papel, plastico, metal, residuosOrganicos);
    }

    public Residuo getResiduos() {
        return residuos;
    }

    public String getCamion() {
        return camion.getPlaca();
    }

    public String getConductor() {
        return conductor.getNombre();
    }

    public String getAsistente1() {
        return asistente1.getNombre();
    }

    public String getAsistente2() {
        return asistente2.getNombre();
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public Ruta getRuta() {
        return ruta;
    }
    
    
    
}
