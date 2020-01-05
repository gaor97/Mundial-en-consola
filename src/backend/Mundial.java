/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.awt.Image;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author jazo0
 */
public class Mundial {
    private String nombre;
    private Equipo campeon;
    private ArrayList<Equipo> equipos = new ArrayList();
    private ArrayList<Partido> partidosGrupos;

    
    Partido partido;
    Random random = new Random();
    public Mundial(String nombre, Equipo campeon, ArrayList<Equipo> equipos, ArrayList<Partido> partidosGrupos) {
        this.nombre = nombre;
        this.campeon = campeon;
        this.equipos = equipos;
        this.partidosGrupos = partidosGrupos;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Equipo getCampeon() {
        return campeon;
    }

    public void setCampeon(Equipo campeon) {
        this.campeon = campeon;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public ArrayList<Partido> getPartidos() {
        return partidosGrupos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidosGrupos = partidos;
    }


    @Override
    public String toString() {
        return "Mundial{" + "nombre=" + nombre + ", campeon=" + campeon + '}';
    }
          

}
