/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.time.LocalDate;
import javax.swing.ImageIcon;

/**
 *
 * @author jazo0
 */
public final class DirectorTecnico extends Persona{
    private String titulos;
    
    public DirectorTecnico() {
    }

    public DirectorTecnico(String titulos, String nombre, String id, String apellidos, ImageIcon foto, LocalDate nacimiento, int edad) {
        super(nombre, id, apellidos, foto, nacimiento, edad);
        this.titulos = titulos;
    }

    

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    @Override
    public String toString() {
        return super.toString() + "DirectorTecnico{" + " titulos: " + titulos + '}';
    }
    
}
