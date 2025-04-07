package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author examen
 */
public class TrashCity {

    private ArrayList<Empleado> empleados;
    private ArrayList<Camion> camiones;
    private ArrayList<Ruta> rutas;
    private ArrayList<Turno> turnos;
    
    public TrashCity() {
        this.empleados = new ArrayList<>();
        this.camiones = new ArrayList<>();
        this.rutas = new ArrayList<>();
        this.turnos = new ArrayList<>();
    }

    public void addEmpleado(Conductor conductor) {
        if (!empleados.contains(conductor)) {
            empleados.add(conductor);
        }
    }
    public void addEmpleado(Asistente asistente) {
        if (!empleados.contains(asistente)) {
            empleados.add(asistente);
        }
    }
    public void addCamion(Camion camion) {
        if (!camiones.contains(camion)) {
            camiones.add(camion);
        }
    }

    public void addRuta(ArrayList<PuntoGeografico> puntos) {
        Ruta ruta = new Ruta(puntos);
        if (!rutas.contains(ruta)) {
            rutas.add(ruta);
        }
    }
    
    public Ruta getRuta(int i){
        return rutas.get(i);
    }
    public Empleado getEmpleado(int id){
        for (Empleado empleado : empleados) {
            if (empleado.getId()==id) {
                if (empleado instanceof Asistente) {
                    Asistente asistente = (Asistente) empleado;
                    return asistente;
                } else {
                    Conductor conductor = (Conductor) empleado;
                    return  conductor;
                }
            }
        }
        return null;
    }
    public Camion getCamion(int id){
        for (Camion camion : camiones) {
            if (camion.getId()==id) {
                return camion;
            }
        }
        return null;
    }

    public void addTurno(int id, Camion camion, Empleado conductor, Empleado  asistente1, Empleado asistente2, Ruta ruta) {
       Turno turno = new Turno(id, camion, conductor, asistente1, asistente2, ruta);
        if (!turnos.contains(turno)) {
            turnos.add(turno);
        } 
    }

    public Turno getTurno(int id) {
        for (Turno turno : turnos) {
            if (turno.getId()==id) {
                return turno;
            }
        }
        return null;
    }

    public void showMinMaxTurnoPorResiduo() {
        HashMap<String, Turno> residuosmin = new HashMap<>();
        residuosmin.put("Vidrio", turnos.get(0));
        residuosmin.put("Papel", turnos.get(0));
        residuosmin.put("Plastico", turnos.get(0));
        residuosmin.put("Metal", turnos.get(0));
        residuosmin.put("Residuos Organicos", turnos.get(0));
        HashMap<String, Turno> residuosmax = new HashMap<>();
        residuosmax.put("Vidrio", turnos.get(0));
        residuosmax.put("Papel", turnos.get(0));
        residuosmax.put("Plastico", turnos.get(0));
        residuosmax.put("Metal", turnos.get(0));
        residuosmax.put("Residuos Organicos", turnos.get(0));
        
        for (Turno turno : turnos) {
            if (turno.getResiduos().getVidrio()<residuosmin.get("Vidrio").getResiduos().getVidrio()) {
                residuosmin.put("Vidrio", turno);
            }
            if (turno.getResiduos().getPapel()<residuosmin.get("Papel").getResiduos().getPapel()) {
                residuosmin.put("Papel", turno);
            }
            if (turno.getResiduos().getPlastico()<residuosmin.get("Plastico").getResiduos().getPlastico()) {
                residuosmin.put("Plastico", turno);
            }
            if (turno.getResiduos().getMetal()<residuosmin.get("Metal").getResiduos().getMetal()) {
                residuosmin.put("Metal", turno);
            }
            if (turno.getResiduos().getResiduoOrganicos()<residuosmin.get("Residuos Organicos").getResiduos().getResiduoOrganicos()) {
                residuosmin.put("Residuos Organicos", turno);
            }
        }
        for (Turno turno : turnos) {
            if (turno.getResiduos().getVidrio()>residuosmax.get("Vidrio").getResiduos().getVidrio()) {
                residuosmax.put("Vidrio", turno);
            }
            if (turno.getResiduos().getPapel()>residuosmax.get("Papel").getResiduos().getPapel()) {
                residuosmax.put("Papel", turno);
            }
            if (turno.getResiduos().getPlastico()>residuosmax.get("Plastico").getResiduos().getPlastico()) {
                residuosmax.put("Plastico", turno);
            }
            if (turno.getResiduos().getMetal()>residuosmax.get("Metal").getResiduos().getMetal()) {
                residuosmax.put("Metal", turno);
            }
            if (turno.getResiduos().getResiduoOrganicos()>residuosmax.get("Residuos Organicos").getResiduos().getResiduoOrganicos()) {
                residuosmax.put("Residuos Organicos", turno);
            }
        }
        System.out.println("Residuo - Vidrio");
        System.out.println("- Turno Minimo: ");
        System.out.println("    - ID: "+residuosmin.get("Vidrio").getId());
        System.out.println("    - Camion:"+residuosmin.get("Vidrio").getCamion());
        System.out.println("    - Conductor:"+residuosmin.get("Vidrio").getConductor());
        System.out.println("    - Asistente 1: "+residuosmin.get("Vidrio").getAsistente1());
        System.out.println("    - Asistente 2: "+residuosmin.get("Vidrio").getAsistente2());
        System.out.println("    - Fecha inicio: "+residuosmin.get("Vidrio").getFechaInicio());
        System.out.println("    - Fecha fin: "+residuosmin.get("Vidrio").getFechaFin());
        System.out.println("    - Cantidad: "+residuosmin.get("Vidrio").getResiduos().getVidrio());
        System.out.println("- Turno Maximo: ");
        System.out.println("    - ID: "+residuosmax.get("Vidrio").getId());
        System.out.println("    - Camion:"+residuosmax.get("Vidrio").getCamion());
        System.out.println("    - Conductor:"+residuosmax.get("Vidrio").getConductor());
        System.out.println("    - Asistente 1: "+residuosmax.get("Vidrio").getAsistente1());
        System.out.println("    - Asistente 2: "+residuosmax.get("Vidrio").getAsistente2());
        System.out.println("    - Fecha inicio: "+residuosmax.get("Vidrio").getFechaInicio());
        System.out.println("    - Fecha fin: "+residuosmax.get("Vidrio").getFechaFin());
        System.out.println("    - Cantidad: "+residuosmax.get("Vidrio").getResiduos().getVidrio());
        
        System.out.println("Residuo - Papel");
        System.out.println("- Turno Minimo: ");
        System.out.println("    - ID: "+residuosmin.get("Papel").getId());
        System.out.println("    - Camion:"+residuosmin.get("Papel").getCamion());
        System.out.println("    - Conductor:"+residuosmin.get("Papel").getConductor());
        System.out.println("    - Asistente 1: "+residuosmin.get("Papel").getAsistente1());
        System.out.println("    - Asistente 2: "+residuosmin.get("Papel").getAsistente2());
        System.out.println("    - Fecha inicio: "+residuosmin.get("Papel").getFechaInicio());
        System.out.println("    - Fecha fin: "+residuosmin.get("Papel").getFechaFin());
        System.out.println("    - Cantidad: "+residuosmin.get("Papel").getResiduos().getPapel());
        System.out.println("- Turno Maximo: ");
        System.out.println("    - ID: "+residuosmax.get("Papel").getId());
        System.out.println("    - Camion:"+residuosmax.get("Papel").getCamion());
        System.out.println("    - Conductor:"+residuosmax.get("Papel").getConductor());
        System.out.println("    - Asistente 1: "+residuosmax.get("Papel").getAsistente1());
        System.out.println("    - Asistente 2: "+residuosmax.get("Papel").getAsistente2());
        System.out.println("    - Fecha inicio: "+residuosmax.get("Papel").getFechaInicio());
        System.out.println("    - Fecha fin: "+residuosmax.get("Papel").getFechaFin());
        System.out.println("    - Cantidad: "+residuosmax.get("Papel").getResiduos().getPapel());
        
        System.out.println("Residuo - Plastico");
        System.out.println("- Turno Minimo: ");
        System.out.println("    - ID: "+residuosmin.get("Plastico").getId());
        System.out.println("    - Camion:"+residuosmin.get("Plastico").getCamion());
        System.out.println("    - Conductor:"+residuosmin.get("Plastico").getConductor());
        System.out.println("    - Asistente 1: "+residuosmin.get("Plastico").getAsistente1());
        System.out.println("    - Asistente 2: "+residuosmin.get("Plastico").getAsistente2());
        System.out.println("    - Fecha inicio: "+residuosmin.get("Plastico").getFechaInicio());
        System.out.println("    - Fecha fin: "+residuosmin.get("Plastico").getFechaFin());
        System.out.println("    - Cantidad: "+residuosmin.get("Plastico").getResiduos().getPlastico());
        System.out.println("- Turno Maximo: ");
        System.out.println("    - ID: "+residuosmax.get("Plastico").getId());
        System.out.println("    - Camion:"+residuosmax.get("Plastico").getCamion());
        System.out.println("    - Conductor:"+residuosmax.get("Plastico").getConductor());
        System.out.println("    - Asistente 1: "+residuosmax.get("Plastico").getAsistente1());
        System.out.println("    - Asistente 2: "+residuosmax.get("Plastico").getAsistente2());
        System.out.println("    - Fecha inicio: "+residuosmax.get("Plastico").getFechaInicio());
        System.out.println("    - Fecha fin: "+residuosmax.get("Plastico").getFechaFin());
        System.out.println("    - Cantidad: "+residuosmax.get("Plastico").getResiduos().getPlastico());
        
        System.out.println("Residuo - Metal");
        System.out.println("- Turno Minimo: ");
        System.out.println("    - ID: "+residuosmin.get("Metal").getId());
        System.out.println("    - Camion:"+residuosmin.get("Metal").getCamion());
        System.out.println("    - Conductor:"+residuosmin.get("Metal").getConductor());
        System.out.println("    - Asistente 1: "+residuosmin.get("Metal").getAsistente1());
        System.out.println("    - Asistente 2: "+residuosmin.get("Metal").getAsistente2());
        System.out.println("    - Fecha inicio: "+residuosmin.get("Metal").getFechaInicio());
        System.out.println("    - Fecha fin: "+residuosmin.get("Metal").getFechaFin());
        System.out.println("    - Cantidad: "+residuosmin.get("Metal").getResiduos().getMetal());
        System.out.println("- Turno Maximo: ");
        System.out.println("    - ID: "+residuosmax.get("Metal").getId());
        System.out.println("    - Camion:"+residuosmax.get("Metal").getCamion());
        System.out.println("    - Conductor:"+residuosmax.get("Metal").getConductor());
        System.out.println("    - Asistente 1: "+residuosmax.get("Metal").getAsistente1());
        System.out.println("    - Asistente 2: "+residuosmax.get("Metal").getAsistente2());
        System.out.println("    - Fecha inicio: "+residuosmax.get("Metal").getFechaInicio());
        System.out.println("    - Fecha fin: "+residuosmax.get("Metal").getFechaFin());
        System.out.println("    - Cantidad: "+residuosmax.get("Metal").getResiduos().getMetal());
        
        System.out.println("Residuo - Residuos Organicos");
        System.out.println("- Turno Minimo: ");
        System.out.println("    - ID: "+residuosmin.get("Residuos Organicos").getId());
        System.out.println("    - Camion:"+residuosmin.get("Residuos Organicos").getCamion());
        System.out.println("    - Conductor:"+residuosmin.get("Residuos Organicos").getConductor());
        System.out.println("    - Asistente 1: "+residuosmin.get("Residuos Organicos").getAsistente1());
        System.out.println("    - Asistente 2: "+residuosmin.get("Residuos Organicos").getAsistente2());
        System.out.println("    - Fecha inicio: "+residuosmin.get("Residuos Organicos").getFechaInicio());
        System.out.println("    - Fecha fin: "+residuosmin.get("Residuos Organicos").getFechaFin());
        System.out.println("    - Cantidad: "+residuosmin.get("Residuos Organicos").getResiduos().getResiduoOrganicos());
        System.out.println("- Turno Maximo: ");
        System.out.println("    - ID: "+residuosmax.get("Residuos Organicos").getId());
        System.out.println("    - Camion:"+residuosmax.get("Residuos Organicos").getCamion());
        System.out.println("    - Conductor:"+residuosmax.get("Residuos Organicos").getConductor());
        System.out.println("    - Asistente 1: "+residuosmax.get("Residuos Organicos").getAsistente1());
        System.out.println("    - Asistente 2: "+residuosmax.get("Residuos Organicos").getAsistente2());
        System.out.println("    - Fecha inicio: "+residuosmax.get("Residuos Organicos").getFechaInicio());
        System.out.println("    - Fecha fin: "+residuosmax.get("Residuos Organicos").getFechaFin());
        System.out.println("    - Cantidad: "+residuosmax.get("Residuos Organicos").getResiduos().getResiduoOrganicos());
    }

    public void showRutaMaxMetal() {
        System.out.println("");
        System.out.println("Los puntos de la ruta con mayor cantidad de metal recogido son:");
        Turno max=turnos.get(0);
        for (Turno turno : turnos) {
            if (turno.getResiduos().getMetal()>max.getResiduos().getMetal()) {
                max=turno;
            }
        }
        for (PuntoGeografico pg : max.getRuta().getPuntosGeograficos()) {
            System.out.println(pg.toString());
        }
        double metalm=0;
        for (Turno turno : turnos) {
            if (turno.getRuta().equals(max.getRuta())) {
                metalm=metalm+turno.getResiduos().getMetal();
            }
            
        }
        
        System.out.println("La cantidad de metal total en la ruta es: "+metalm);
    }
    
}
