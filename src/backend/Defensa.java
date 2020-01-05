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
public final class Defensa extends Jugador{
    private int faltas;
    private int penalti;

    public Defensa() {
    } 

    public Defensa(int faltas, int penalti, String numero, int partidos, String nombre, String id, String apellidos, ImageIcon foto, LocalDate nacimiento, int edad) {
        super(numero, partidos, nombre, id, apellidos, foto, nacimiento, edad);
        this.faltas = faltas;
        this.penalti = penalti;
    }

    

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getPenalti() {
        return penalti;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;
    }

    @Override
    public String toString() {
        return super.toString() + "Defensa{" + " faltas:" + faltas + ", penalti:" + penalti + '}' + "\n";
    }
     
    
}
