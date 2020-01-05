/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author jazo0
 */
public class Equipo {
    private String nombre;
    private String fundacion;
    private ImageIcon Escudo;
    private DirectorTecnico directorTecnico;
    private ArrayList<Jugador> jugadores;
    private int partidosJugados;
    private int partidosGanados;
    private int partidosEmpatados;
    private int golesAFavor;
    private int golesEnContra;
    private int puntos;

    public Equipo() {
    }

    public Equipo(String nombre, String fundacion, ImageIcon Escudo, DirectorTecnico directorTecnico, ArrayList<Jugador> jugadores, int partidosJugados, int partidosGanados, int partidosEmpatados, int golesAFavor, int golesEnContra, int puntos) {
        this.nombre = nombre;
        this.fundacion = fundacion;
        this.Escudo = Escudo;
        this.directorTecnico = directorTecnico;
        this.jugadores = jugadores;
        this.partidosJugados = partidosJugados;
        this.partidosGanados = partidosGanados;
        this.partidosEmpatados = partidosEmpatados;
        this.golesAFavor = golesAFavor;
        this.golesEnContra = golesEnContra;
        this.puntos = puntos;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFundacion() {
        return fundacion;
    }

    public void setFundacion(String fundacion) {
        this.fundacion = fundacion;
    }

    public ImageIcon getEscudo() {
        return Escudo;
    }

    public void setEscudo(ImageIcon Escudo) {
        this.Escudo = Escudo;
    }

    public DirectorTecnico getDirectorTecnico() {
        return directorTecnico;
    }

    public void setDirectorTecnico(DirectorTecnico directorTecnico) {
        this.directorTecnico = directorTecnico;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    public void setGolesAFavor(int golesAFavor) {
        this.golesAFavor = golesAFavor;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }

    public void setGolesEnContra(int golesEnContra) {
        this.golesEnContra = golesEnContra;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "\n\nEquipo{" + "nombre=" + nombre + ", fundacion=" + fundacion + ", Escudo=" + Escudo + ", \ndirectorTecnico=" + directorTecnico + ", \njugadores=" + jugadores + ", \npartidosJugados=" + partidosJugados + ", partidosGanados=" + partidosGanados + ", partidosEmpatados=" + partidosEmpatados + ", golesAFavor=" + golesAFavor + ", golesEnContra=" + golesEnContra + ", puntos=" + puntos + '}';
    }
      
}
