/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.awt.Image;
import java.time.LocalDate;
import javax.swing.ImageIcon;

/**
 *
 * @author Oswaldo
 */
public final class Delantero extends Jugador {
    private int goles;
    private int remates;
    

    public Delantero() {
    }

    public Delantero(int goles, int remates, String numero, int partidos, String nombre, String id, String apellidos, ImageIcon foto, LocalDate nacimiento, int edad) {
        super(numero, partidos, nombre, id, apellidos, foto, nacimiento, edad);
        this.goles = goles;
        this.remates = remates;
    }

    

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getRemates() {
        return remates;
    }

    public void setRemates(int remates) {
        this.remates = remates;
    }
    
    @Override
    public String toString() {
        return super.toString()+ "Delantero{" + " goles: " + goles + " remates: " + remates + '}' + "\n";
    }
    
}
