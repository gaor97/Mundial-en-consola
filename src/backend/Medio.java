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
 * @author jazo0
 */
public  final class Medio extends Jugador{
    private int barridas;
    private int pases;

    public Medio() {
    }

    public Medio(int barridas, int pases, String numero, int partidos, String nombre, String id, String apellidos, ImageIcon foto, LocalDate nacimiento, int edad) {
        super(numero, partidos, nombre, id, apellidos, foto, nacimiento, edad);
        this.barridas = barridas;
        this.pases = pases;
    }
    
    

    public int getBarridas() {
        return barridas;
    }

    public void setBarridas(int barridas) {
        this.barridas = barridas;
    }

    public int getPases() {
        return pases;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    @Override
    public String toString() {
        return super.toString() + "Medio{" + " barridas: " + barridas + ", pases: " + pases + '}' + "\n";
    }
    
}
