/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.awt.Image;
import java.time.LocalDate;
import javax.swing.ImageIcon;

/**
 *
 * @author Oswaldo
 */
public abstract class Jugador extends Persona {
    protected String numero;
    protected int partidos;
    
    
    public Jugador() {
    }

    public Jugador(String numero, int partidos, String nombre, String id, String apellidos, ImageIcon foto, LocalDate nacimiento, int edad) {
        super(nombre, id, apellidos, foto, nacimiento, edad);
        this.numero = numero;
        this.partidos = partidos;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getPartidos() {
        return partidos;
    }

    public void setPartidos(int partidos) {
        this.partidos = partidos;
    }
    
    

    @Override
    public String toString() {
        return super.toString()+"Jugador{" + " numero:  " + numero + " partidos:  " + partidos +'}';
    }
    
    
    public String generarNumero(String n)
    {
        numero = String.valueOf(Math.random()*100);
        return numero;
    }
    
    
}
