/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

/**
 *
 * @author examen
 */
public class Residuo {
    private double vidrio;
    private double papel;
    private double plastico;
    private double metal;
    private double residuoOrganicos;

    public Residuo(double vidrio, double papel, double plastico, double metal, double residuoOrganicos) {
        this.vidrio = vidrio;
        this.papel = papel;
        this.plastico = plastico;
        this.metal = metal;
        this.residuoOrganicos = residuoOrganicos;
    }

    public double getVidrio() {
        return vidrio;
    }

    public double getPapel() {
        return papel;
    }

    public double getPlastico() {
        return plastico;
    }

    public double getMetal() {
        return metal;
    }

    public double getResiduoOrganicos() {
        return residuoOrganicos;
    }
    
    
}
