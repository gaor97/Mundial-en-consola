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
public final class Portero extends Jugador {
    private int atajadas;
    private int golesContra;

    public Portero() {
    }

    public Portero(int atajadas, int golesContra, String numero, int partidos, String nombre, String id, String apellidos, ImageIcon foto, LocalDate nacimiento, int edad) {
        super(numero, partidos, nombre, id, apellidos, foto, nacimiento, edad);
        this.atajadas = atajadas;
        this.golesContra = golesContra;
    }

    

    

    public int getAtajadas() {
        return atajadas;
    }

    public void setAtajadas(int atajadas) {
        this.atajadas = atajadas;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }


    
    
    
    @Override
    public String toString() {
        return super.toString()+ " Portero{" + " atajadas: " + atajadas + " goles en contra: " + golesContra + '}' + "\n";
    }
    
}
