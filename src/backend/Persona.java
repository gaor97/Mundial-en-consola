/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.awt.Image;
import java.time.LocalDate;
import java.time.Month;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.ImageIcon;

/**
 *
 * @author Oswaldo
 */
public abstract class Persona {
    protected String nombre;
    protected String id;
    protected String apellidos;
    protected ImageIcon foto;
    protected LocalDate nacimiento;
    protected int edad;

    public Persona() {
    }

    public Persona(String nombre, String id, String apellidos, ImageIcon foto, LocalDate nacimiento, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.apellidos = apellidos;
        this.foto = foto;
        this.nacimiento = nacimiento;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public ImageIcon getFoto() {
        return foto;
    }

    public void setFoto(ImageIcon foto) {
        this.foto = foto;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre:  " + nombre + ", id:  " + id + ", apellidos:  " + apellidos + ", foto:  " + foto + ", nacimiento:  " + nacimiento + ", edad:  " + edad + '}';
    }
    
    
    
    
    
    
    
}
