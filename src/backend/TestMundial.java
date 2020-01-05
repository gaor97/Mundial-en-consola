/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;

/**
 *
 * @author jazo0
 */
public class TestMundial {
    Equipo equipo;
    Portero portero;
    Defensa defensa;
    Medio medio;
    Delantero delantero;
    Mundial mundial;
    DirectorTecnico directTec;
    Partido partido;
    int idp;
    
    int j = 0, aux = 4, aux2 = 0;
    int m = 0, ax = 3, ax2 = 0;
    int d = 0, tmp = 3, tmp2 = 0;
    
    long min = LocalDate.of(1990, 1, 1).toEpochDay();
    long max = LocalDate.of(1995, 1, 1).toEpochDay();
    
    ArrayList<String> nombres = new ArrayList();
    ArrayList<String> apellidos = new ArrayList();
    ArrayList<String> imagenJug = new ArrayList();
    ArrayList<String> nomEquip = new ArrayList();
    ArrayList<String> banderas = new ArrayList();
    ArrayList<String> estadios = new ArrayList();
    
    
    ArrayList<Portero> port = new ArrayList();
    ArrayList<Defensa> defe = new ArrayList();
    ArrayList<Medio> mid = new ArrayList();
    ArrayList<Delantero> del = new ArrayList();
    ArrayList<DirectorTecnico> dic = new ArrayList();
    

    ArrayList<Equipo> equip = new ArrayList();
    ArrayList<Equipo> grupoA = new ArrayList();
    ArrayList<Equipo> grupoB = new ArrayList();
    ArrayList<Equipo> grupoC = new ArrayList();
    ArrayList<Equipo> grupoD = new ArrayList();
    ArrayList<Equipo> faseCuar = new ArrayList();
    
    ArrayList<Equipo> faseSemiFinales = new ArrayList();
    ArrayList<Equipo> faseFinales = new ArrayList();
    ArrayList<Partido> partidos = new ArrayList();
    
    Equipo campeon = new Equipo();
   
    Random random = new Random();
    
    public void crearEquipos(){  
        
        //Nombres
        nombres.add("Jesus");
        nombres.add("Gama");
        nombres.add("Abraham");
        nombres.add("Rigo");
        nombres.add("Josue");
        nombres.add("Patrick");
        nombres.add("Bob");
        nombres.add("Eugenio");
        nombres.add("Ordanys");
        nombres.add("Isaias");
        nombres.add("Isaac");
        nombres.add("David");
        nombres.add("Argos");
        nombres.add("Nick");
        nombres.add("Adib");
        nombres.add("Hasan");
        nombres.add("Khalil");
        //Apellidos
        apellidos.add("Galindo");
        apellidos.add("Ascencio");
        apellidos.add("Montes");
        apellidos.add("Alcaraz");
        apellidos.add("Martinez");
        apellidos.add("Hool");
        apellidos.add("Fujimoto");
        apellidos.add("Fujioka");
        apellidos.add("Stark");
        apellidos.add("Scheck");
        apellidos.add("Schnitzler");
        apellidos.add("Fave");
        apellidos.add("Ferrec");
        apellidos.add("Feraud");
        apellidos.add("Liel");
        
        //Imagenes jugadores
        imagenJug.add("Jugador1");
        imagenJug.add("Jugador2");
        imagenJug.add("Jugador3");
        imagenJug.add("Jugador4");
        imagenJug.add("Jugador5");
        imagenJug.add("Jugador6");
        imagenJug.add("Jugador7");
        imagenJug.add("Jugador8");
        imagenJug.add("Jugador9");
        imagenJug.add("Jugador10");
        imagenJug.add("Jugador11");
        
        //Nombres equipos
        nomEquip.add("Mexico");
        nomEquip.add("Alemania");
        nomEquip.add("Rusia");
        nomEquip.add("Portugal");
        nomEquip.add("Dinamarca");
        nomEquip.add("Nigeria");
        nomEquip.add("Australia");
        nomEquip.add("Francia");
        nomEquip.add("Holanda");
        nomEquip.add("Inglaterra");
        nomEquip.add("Argentina");
        nomEquip.add("Canada");
        nomEquip.add("Brazil");
        nomEquip.add("Estados Unidos");
        nomEquip.add("España");
        nomEquip.add("Austria");
        
        //Paises
        banderas.add("Mexico.png");
        banderas.add("Alemania.png");
        banderas.add("Rusia.png");
        banderas.add("Portugal.png");
        banderas.add("Dinamarca.png");
        banderas.add("Nigeria.png");
        banderas.add("Australia.png");
        banderas.add("Francia.png");
        banderas.add("Holanda.png");
        banderas.add("Inglaterra.png");
        banderas.add("Argentina.png");
        banderas.add("Canada.png");
        banderas.add("Brazil.png");
        banderas.add("Estados Unidos.png");
        banderas.add("España.png");
        banderas.add("Austria.png");
        
        //Estadios
        estadios.add("La bombonera");
        estadios.add("Camp Nou");
        estadios.add("Wembley");
        estadios.add("Estadio Azteca");
        estadios.add("San siro");
        estadios.add("Maracana");
        estadios.add("Signal Iduna Park");
        estadios.add("Santiago Bernabeu");
        estadios.add("Old Trafford");
        estadios.add("Allianz Arena");
        estadios.add("Celtic Park");
        estadios.add("Estadio Da Luz");
        
        //portero
        System.out.println("Porteros\n\n");
        for(int i = 0 ; i < 16; i++ ){
           
            
            
            int nameIndex = random.nextInt(15);
            String name = nombres.get(nameIndex);
            
            int apellIndex = random.nextInt(15);
            String apellido = apellidos.get(apellIndex);
            
            int numero = (int) ((Math.random() * 100) + 0);
            String num = String.valueOf(numero);
            
            int idIndx = (int) ((Math.random() * 100) + 0);
            String id = String.valueOf(idIndx);
            
            int atajadas = (int)(Math.random() * 7) + 0;
            int golesContra = (int)(Math.random() * 7) + 0;
            
            
            int imgIndex = random.nextInt(10);
            String img = imagenJug.get(imgIndex);
            ImageIcon foto = new ImageIcon(img);
            
            
            LocalDate nacimiento = calcularNacimiento(min, max);
            Period edad = calcularEdad(nacimiento);
            
            portero = new Portero(atajadas, golesContra, num, 0, name, id, apellido, foto, nacimiento, edad.getYears());
            
            System.out.println(portero);
            
            port.add(portero);
        }  
        
        //creacion de defensas
        System.out.println("\n\nDefensas\n\n");
        for(int i = 0 ; i < 64; i++){
            int nameIndex = random.nextInt(15);
            String name = nombres.get(nameIndex);
            
            int apellIndex = random.nextInt(15);
            String apellido = apellidos.get(apellIndex);
            
            int numero = (int) ((Math.random() * 100) + 0);
            String num = String.valueOf(numero);
            
            int idIndx = (int) ((Math.random() * 100) + 0);
            String id = String.valueOf(idIndx);
            
            int imgIndex = random.nextInt(10);
            String img = imagenJug.get(imgIndex);
            ImageIcon foto = new ImageIcon(img);
            
            int penalti = (int)(Math.random() * 7) + 3;
            int faltas = (int)(Math.random() * 7) + 3;
            
            
            LocalDate nacimiento = calcularNacimiento(min, max);
            Period edad = calcularEdad(nacimiento);
            
            defensa = new Defensa(faltas, penalti, num, 0, name, id, apellido, foto, nacimiento, edad.getYears());
            
            System.out.println(defensa);
            
            defe.add(defensa);
        }
        
        //Creacion de medios
        System.out.println("\n\nMedio campistas\n\n");
        for(int i = 0; i < 48; i++){
            
            int nameIndex = random.nextInt(15);
            String name = nombres.get(nameIndex);
            
            int apellIndex = random.nextInt(15);
            String apellido = apellidos.get(apellIndex);
            
            int numero = (int) ((Math.random() * 100) + 0);
            String num = String.valueOf(numero);
            
            int idIndx = (int) ((Math.random() * 100) + 0);
            String id = String.valueOf(idIndx);
            
            int imgIndex = random.nextInt(10);
            String img = imagenJug.get(imgIndex);
            ImageIcon foto = new ImageIcon(img);
            
            int barridas = (int)(Math.random() * 7) + 3;
            int pases = (int)(Math.random() * 7) + 3;
            
            
            LocalDate nacimiento = calcularNacimiento(min, max);
            Period edad = calcularEdad(nacimiento);
            
            medio = new Medio(barridas, pases, num, 0, name, id, apellido, foto, nacimiento, edad.getYears());
            
            System.out.println(medio);
            
            mid.add(medio);
        }
        
        //Creacion de delanteros
        System.out.println("\n\nDelanteros\n\n");
        for(int i = 0; i < 48; i++){
            int nameIndex = random.nextInt(15);
            String name = nombres.get(nameIndex);
            
            int apellIndex = random.nextInt(15);
            String apellido = apellidos.get(apellIndex);
            
            int numero = (int) ((Math.random() * 100) + 0);
            String num = String.valueOf(numero);
            
            int idIndx = (int) ((Math.random() * 100) + 0);
            String id = String.valueOf(idIndx);
            
            int imgIndex = random.nextInt(10);
            String img = imagenJug.get(imgIndex);
            ImageIcon foto = new ImageIcon(img);
            
            int goles = (int)(Math.random() * 7) + 3;
            int remates = (int)(Math.random() * 7) + 3;
            int partidos = (int)(Math.random() * 7) + 3;
            
            
            LocalDate nacimiento = calcularNacimiento(min, max);
            Period edad = calcularEdad(nacimiento);
            
            delantero = new Delantero(goles, remates, num, partidos, name, id, apellido, foto, nacimiento, edad.getYears());
            
            System.out.println(delantero);
            
            del.add(delantero);
        }
        
        //Crear Directores tecnicos
        for(int i = 0; i < 16; i++){
            
            int nameIndex = random.nextInt(15);
            String name = nombres.get(nameIndex);
            
            int idIndx = (int) ((Math.random() * 100) + 0);
            String id = String.valueOf(idIndx);
            
            int apellIndex = random.nextInt(15);
            String apellido = apellidos.get(apellIndex);
            
            int imgIndex = random.nextInt(10);
            String img = imagenJug.get(imgIndex);
            ImageIcon foto = new ImageIcon(img);
            
            int title = (int) ((Math.random() * 4) + 0);
            String titulos = String.valueOf(title);
            
            
            long minim = LocalDate.of(1970, 1, 1).toEpochDay();
            long maxim = LocalDate.of(1990, 1, 1).toEpochDay();
            LocalDate nacimiento = calcularNacimiento(minim, maxim);
            Period edad = calcularEdad(nacimiento);
            
            directTec = new DirectorTecnico(titulos, name, id, apellido, foto, nacimiento, edad.getYears());
            
            dic.add(directTec);
        }
        
        //Creacion de equipos
        System.out.println("\n\nEquipos\n\n");
        for(int i = 0; i < 16; i++){
            
            ArrayList<Jugador> jugadores = new ArrayList();
            
            String nombre = nomEquip.get(i);
            
            long min = LocalDate.of(1800, 1, 1).toEpochDay();
            long max = LocalDate.of(1950, 1, 1).toEpochDay();
            long naci = ThreadLocalRandom.current().nextLong(min , max);
            LocalDate fun = LocalDate.ofEpochDay(naci);
            String fundacion = fun.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            
            
            String esc = banderas.get(i);
            ImageIcon escudo = new ImageIcon(esc);
            
            
            //Agregar director y portero
            DirectorTecnico dirIndx = dic.get(i);
            jugadores.add(port.get(i));
            
            //Agrega defensas
            for(j = aux2; j < aux; j++){
                System.out.println(j);
                jugadores.add(defe.get(j));
                
            }   
            if(aux != 64){
                aux2 = aux;
                aux+=4; 
            }
            
            //Agrega medios al equipo    
            for(m = ax2; m < ax; m++){
                jugadores.add(mid.get(m));
                
            }
            if(ax != 48){
                ax2 = ax;
                ax+=3;
            }
            
            //Agrega Delanteros
            for(d = tmp2; d < tmp; d++){
                jugadores.add(del.get(d));
            }
            if(tmp != 48){
                tmp2 = tmp;
                tmp+=3;
            }
            
            
            equipo = new Equipo(nombre, fundacion, escudo, dirIndx, jugadores, 0, 0, 0, 0, 0, 0);
            
            System.out.println(equipo);
            
            equip.add(equipo);
            
        }
        
        int nombreIndxM = random.nextInt(15);
        String nameMund = nomEquip.get(nombreIndxM);
        
        //crear grupos
        for(int i = 0; i < 4; i++ ){
            grupoA.add(equip.get(i));
            grupoB.add(equip.get(i+4));
            grupoC.add(equip.get(i+8));
            grupoD.add(equip.get(i+12));
        } 
        
        System.out.println("\nGrupo A");       
        for(int i = 0; i < 4; i++){
            
            System.out.println(grupoA.get(i).getNombre());
        }
        System.out.println("\nGrupo B");
        for(int i = 0; i< 4; i++){
            System.out.println(grupoB.get(i).getNombre());
        }    
        System.out.println("\nGrupo C");    
        for(int i = 0; i < 4;i++){
            System.out.println(grupoC.get(i).getNombre());
        }    
        System.out.println("\nGrupo D");    
        for(int i = 0; i < 4; i++){
            System.out.println(grupoD.get(i).getNombre());
        }
        
        //Partidos por grupos
        
        System.out.println("\n\nFase de grupos\n");
        
        System.out.println("Grupo A\n++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(grupoA.get(0).getNombre() +" vs "+ grupoA.get(1).getNombre());
        crearPartidos(grupoA.get(0), grupoA.get(1));
        System.out.println(grupoA.get(0).getNombre() +" vs "+ grupoA.get(2).getNombre());
        crearPartidos(grupoA.get(0), grupoA.get(2));
        System.out.println(grupoA.get(0).getNombre() +" vs "+ grupoA.get(3).getNombre());
        crearPartidos(grupoA.get(0), grupoA.get(3));
        System.out.println(grupoA.get(1).getNombre() +" vs "+ grupoA.get(2).getNombre());
        crearPartidos(grupoA.get(1), grupoA.get(2));
        System.out.println(grupoA.get(1).getNombre() +" vs "+ grupoA.get(3).getNombre());
        crearPartidos(grupoA.get(1), grupoA.get(3));
        System.out.println(grupoA.get(2).getNombre() +" vs "+ grupoA.get(3).getNombre());
        crearPartidos(grupoA.get(2), grupoA.get(3));
        
        //Desempate en caso de que los puntos sean iguales
        for(int i = 1; i <= 3; i++){
            
            if(grupoA.get(0).getPuntos() == grupoA.get(i).getPuntos()){
                calcularPuntos(grupoA.get(0), grupoA.get(i));
            }
        }
        for(int i = 2; i <= 3; i++){
            if(grupoA.get(1).getPuntos() == grupoA.get(i).getPuntos()){
                calcularPuntos(grupoA.get(1), grupoA.get(i));
            }
        }
        if(grupoA.get(2).getPuntos() == grupoA.get(3).getPuntos()){
            calcularPuntos(grupoA.get(2), grupoA.get(3));
        }
        if(grupoA.get(2).getPuntos() == grupoA.get(1).getPuntos()){
            calcularPuntos(grupoA.get(2), grupoA.get(1));
        }
        if(grupoA.get(2).getPuntos() == grupoA.get(0).getPuntos()){
            calcularPuntos(grupoA.get(2), grupoA.get(0));
        }
        for(int i = 2; i >= 0; i-- ){
            if(grupoA.get(3).getPuntos() == grupoA.get(i).getPuntos()){
                calcularPuntos(grupoA.get(3), grupoA.get(i));
            }
        }
        
        //Estadisticas grupo A
        for(int i = 0; i < 4;i++){
            System.out.println("\n" + grupoA.get(i).getNombre());
            System.out.println("Goles a favor: " + grupoA.get(i).getGolesAFavor());
            System.out.println("Goles en contra: " + grupoA.get(i).getGolesEnContra());
            System.out.println("Partidos jugados: " + grupoA.get(i).getPartidosJugados());
            System.out.println("Partidos ganados: " + grupoA.get(i).getPartidosGanados());
            System.out.println("Partidos empatados: " + grupoA.get(i).getPartidosEmpatados());
        }

        System.out.println("\nGrupo B++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println(grupoB.get(0).getNombre() +" vs "+ grupoB.get(1).getNombre());
        crearPartidos(grupoB.get(0), grupoB.get(1));
        System.out.println(grupoB.get(0).getNombre() +" vs "+ grupoB.get(2).getNombre());
        crearPartidos(grupoB.get(0), grupoB.get(2));
        System.out.println(grupoB.get(0).getNombre() +" vs "+ grupoB.get(3).getNombre());
        crearPartidos(grupoB.get(0), grupoB.get(3));
        System.out.println(grupoB.get(1).getNombre() +" vs "+ grupoB.get(2).getNombre());
        crearPartidos(grupoB.get(1), grupoB.get(2));
        System.out.println(grupoB.get(1).getNombre() +" vs "+ grupoB.get(3).getNombre());
        crearPartidos(grupoB.get(1), grupoB.get(3));
        System.out.println(grupoB.get(2).getNombre() +" vs "+ grupoB.get(3).getNombre());
        crearPartidos(grupoB.get(2), grupoB.get(3));
        
        //Desempate en caso de que los puntos sean iguales
        for(int i = 1; i <= 3; i++){
            
            if(grupoB.get(0).getPuntos() == grupoB.get(i).getPuntos()){
                calcularPuntos(grupoB.get(0), grupoB.get(i));
            }
        }
        for(int i = 2; i <= 3; i++){
            if(grupoB.get(1).getPuntos() == grupoB.get(i).getPuntos()){
                calcularPuntos(grupoB.get(1), grupoB.get(i));
            }
        }
        if(grupoB.get(2).getPuntos() == grupoB.get(3).getPuntos()){
            calcularPuntos(grupoB.get(2), grupoB.get(3));
        }
        if(grupoB.get(2).getPuntos() == grupoB.get(1).getPuntos()){
            calcularPuntos(grupoB.get(2), grupoB.get(1));
        }
        if(grupoB.get(2).getPuntos() == grupoB.get(0).getPuntos()){
            crearPartidos(grupoB.get(2), grupoB.get(0));
        }
        for(int i = 2; i >= 0; i-- ){
            if(grupoB.get(3).getPuntos() == grupoB.get(i).getPuntos()){
                calcularPuntos(grupoB.get(3), grupoB.get(i));
            }
        }
        
        //Estadisticas grupo B
        for(int i = 0; i < 4;i++){
            System.out.println("\n" + grupoB.get(i).getNombre());
            System.out.println("Goles a favor: " + grupoB.get(i).getGolesAFavor());
            System.out.println("Goles en contra: " + grupoB.get(i).getGolesEnContra());
            System.out.println("Partidos jugados: " + grupoB.get(i).getPartidosJugados());
            System.out.println("Partidos ganados: " + grupoB.get(i).getPartidosGanados());
            System.out.println("Partidos empatados: " + grupoB.get(i).getPartidosEmpatados());
        }
        
        System.out.println("\nGrupo C++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println(grupoC.get(0).getNombre() +" vs "+ grupoC.get(1).getNombre());
        crearPartidos(grupoC.get(0), grupoC.get(1));
        System.out.println(grupoC.get(0).getNombre() +" vs "+ grupoC.get(2).getNombre());
        crearPartidos(grupoC.get(0), grupoC.get(2));
        System.out.println(grupoC.get(0).getNombre() +" vs "+ grupoC.get(3).getNombre());
        crearPartidos(grupoC.get(0), grupoC.get(3));
        System.out.println(grupoC.get(1).getNombre() +" vs "+ grupoC.get(2).getNombre());
        crearPartidos(grupoC.get(1), grupoC.get(2));
        System.out.println(grupoC.get(1).getNombre() +" vs "+ grupoC.get(3).getNombre());
        crearPartidos(grupoC.get(1), grupoC.get(3));
        System.out.println(grupoC.get(2).getNombre() +" vs "+ grupoC.get(3).getNombre());
        crearPartidos(grupoC.get(2), grupoC.get(3));
        
        //Desempate en caso de que los puntos sean iguales
        for(int i = 1; i <= 3; i++){
            
            if(grupoC.get(0).getPuntos() == grupoC.get(i).getPuntos()){
                calcularPuntos(grupoC.get(0), grupoC.get(i));
            }
        }
        for(int i = 2; i <= 3; i++){
            if(grupoC.get(1).getPuntos() == grupoC.get(i).getPuntos()){
                calcularPuntos(grupoC.get(1), grupoC.get(i));
            }
        }
        if(grupoC.get(2).getPuntos() == grupoC.get(3).getPuntos()){
            calcularPuntos(grupoC.get(2), grupoC.get(3));
        }
        if(grupoC.get(2).getPuntos() == grupoC.get(1).getPuntos()){
            calcularPuntos(grupoA.get(2), grupoC.get(1));
        }
        if(grupoC.get(2).getPuntos() == grupoC.get(0).getPuntos()){
            crearPartidos(grupoC.get(2), grupoC.get(0));
        }
        for(int i = 2; i >= 0; i-- ){
            if(grupoC.get(3).getPuntos() == grupoC.get(i).getPuntos()){
                calcularPuntos(grupoC.get(3), grupoC.get(i));
            }
        }
        
        //Estadisticas grupo C
        for(int i = 0; i < 4;i++){
            System.out.println("\n" + grupoC.get(i).getNombre());
            System.out.println("Goles a favor: " + grupoC.get(i).getGolesAFavor());
            System.out.println("Goles en contra: " + grupoC.get(i).getGolesEnContra());
            System.out.println("Partidos jugados: " + grupoC.get(i).getPartidosJugados());
            System.out.println("Partidos ganados: " + grupoC.get(i).getPartidosGanados());
            System.out.println("Partidos empatados: " + grupoC.get(i).getPartidosEmpatados());
        }
        
        
        System.out.println("\nGrupo D++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println(grupoD.get(0).getNombre() +" vs "+ grupoD.get(1).getNombre());
        crearPartidos(grupoD.get(0), grupoD.get(1));
        System.out.println(grupoD.get(0).getNombre() +" vs "+ grupoD.get(2).getNombre());
        crearPartidos(grupoD.get(0), grupoD.get(2));
        System.out.println(grupoD.get(0).getNombre() +" vs "+ grupoD.get(3).getNombre());
        crearPartidos(grupoD.get(0), grupoD.get(3));
        System.out.println(grupoD.get(1).getNombre() +" vs "+ grupoD.get(2).getNombre());
        crearPartidos(grupoD.get(1), grupoD.get(2));
        System.out.println(grupoD.get(1).getNombre() +" vs "+ grupoD.get(3).getNombre());
        crearPartidos(grupoD.get(1), grupoD.get(3));
        System.out.println(grupoD.get(2).getNombre() +" vs "+ grupoD.get(3).getNombre());
        crearPartidos(grupoD.get(2), grupoD.get(3));
        
        //Desempate en caso de que los puntos sean iguales
        for(int i = 1; i <= 3; i++){
            if(grupoD.get(0).getPuntos() == grupoD.get(i).getPuntos()){
                calcularPuntos(grupoD.get(0), grupoD.get(i));
            }
        }
        for(int i = 2; i <= 3; i++){
            
            if(grupoD.get(1).getPuntos() == grupoD.get(i).getPuntos()){
                calcularPuntos(grupoD.get(1), grupoD.get(i));
            }
        }
        if(grupoD.get(2).getPuntos() == grupoD.get(3).getPuntos()){
            calcularPuntos(grupoD.get(2), grupoD.get(3));
        }
        if(grupoD.get(2).getPuntos() == grupoD.get(1).getPuntos()){
            crearPartidos(grupoD.get(2), grupoD.get(1));
        }
        if(grupoD.get(2).getPuntos() == grupoD.get(0).getPuntos()){
            calcularPuntos(grupoD.get(2), grupoD.get(0));
        }
        for(int i = 2; i >= 0; i-- ){
            if(grupoD.get(3).getPuntos() == grupoD.get(i).getPuntos()){
                calcularPuntos(grupoD.get(3), grupoD.get(i));
            }
        }
        
        //Estadisticas grupo D
        for(int i = 0; i < 4;i++){
            System.out.println("\n" + grupoD.get(i).getNombre());
            System.out.println("Goles a favor: " + grupoD.get(i).getGolesAFavor());
            System.out.println("Goles en contra: " + grupoD.get(i).getGolesEnContra());
            System.out.println("Partidos jugados: " + grupoD.get(i).getPartidosJugados());
            System.out.println("Partidos ganados: " + grupoD.get(i).getPartidosGanados());
            System.out.println("Partidos empatados: " + grupoD.get(i).getPartidosEmpatados());
        }
        
        //Fase cuartos y grupos
        crearCuartos(grupoA);
        crearCuartos(grupoB);
        crearCuartos(grupoC);
        crearCuartos(grupoD);
        

        //Equipos que pasaron a cuartos
        System.out.println("\n\nCuartos+++++++++++++++++++++++++++++++++++++++++++\n\n");
        contiendas(faseCuar);
        
        //Estadisticas cuartos
        for(int i = 0; i < 8;i++){
            System.out.println("\n" + faseCuar.get(i).getNombre());
            System.out.println("Goles a favor: " + faseCuar.get(i).getGolesAFavor());
            System.out.println("Goles en contra: " + faseCuar.get(i).getGolesEnContra());
            System.out.println("Partidos jugados: " + faseCuar.get(i).getPartidosJugados());
            System.out.println("Partidos ganados: " + faseCuar.get(i).getPartidosGanados());
            System.out.println("Partidos empatados: " + faseCuar.get(i).getPartidosEmpatados());
        }
        
        //Equipos que pasaron a la semifinal
        System.out.println("\n\nSemi-finales+++++++++++++++++++++++++++++++++++++++\n\n");
        contiendasSemi(faseSemiFinales);
        
        //Estadisticas Semifinales
        for(int i = 0; i < 4;i++){
            System.out.println("\n" + faseSemiFinales.get(i).getNombre());
            System.out.println("Goles a favor: " + faseSemiFinales.get(i).getGolesAFavor());
            System.out.println("Goles en contra: " + faseSemiFinales.get(i).getGolesEnContra());
            System.out.println("Partidos jugados: " + faseSemiFinales.get(i).getPartidosJugados());
            System.out.println("Partidos ganados: " + faseSemiFinales.get(i).getPartidosGanados());
            System.out.println("Partidos empatados: " + faseSemiFinales.get(i).getPartidosEmpatados());
        }
        
        //Equipos que pasaron a la final
        System.out.println("\n\nFinal+++++++++++++++++++++++++++++++++++++++++++++\n\n");
        contiendaFinal(faseFinales);
        
        //Estadisticas Finales
        for(int i = 0; i < 2;i++){
            System.out.println("\n" + faseFinales.get(i).getNombre());
            System.out.println("Goles a favor: " + faseFinales.get(i).getGolesAFavor());
            System.out.println("Goles en contra: " + faseFinales.get(i).getGolesEnContra());
            System.out.println("Partidos jugados: " + faseFinales.get(i).getPartidosJugados());
            System.out.println("Partidos ganados: " + faseFinales.get(i).getPartidosGanados());
            System.out.println("Partidos empatados: " + faseFinales.get(i).getPartidosEmpatados());
        }
        
        //Campeon
        mundial = new Mundial(nameMund, campeon, equip, partidos);
        System.out.println("\n\nGanador del mundial de " + mundial.getNombre());
        System.out.println(campeon);
        
    } 
    
    
    
    public static void main(String[] args) {
        
           new TestMundial().crearEquipos();
          
    }   
    
    //Tiempo
    public LocalDate calcularNacimiento(long min, long max){
        
        long naci = ThreadLocalRandom.current().nextLong(min , max);
        LocalDate nacimiento = LocalDate.ofEpochDay(naci);
        
        return nacimiento;
    }
    
    public Period calcularEdad(LocalDate nacimiento){
        
        LocalDate hoy = LocalDate.now();
        return Period.between(nacimiento, hoy);
    }
    
    
    //Partidos
    public void crearPartidos(Equipo a, Equipo b){
        int golesB = (int)(Math.random() * 10);
        int golesA = (int)(Math.random() * 10);
        int pWin = 0;
        int pWinB = 0;
        int pEmp = 0;
        int pE = 0;
        int pJ = 0;
        
        if(golesA > golesB){
            System.out.println("Ganador del partido: " + a.getNombre());
            pWin++;
            //goles a favor A
            int sumaGf = a.getGolesAFavor() + golesA;
            a.setGolesAFavor(sumaGf);
            //goles en contra B
            int sumaGc = b.getGolesEnContra() + golesA;
            b.setGolesEnContra(sumaGc);
            //partidos ganados A
            int sumapG = a.getPartidosGanados() + pWin;
            a.setPartidosGanados(sumapG);
            //se agregan los puntos
            pE+=3;
            int puntajeA = a.getPuntos() + pE;
            a.setPuntos(puntajeA);
            
        }else if(golesB > golesA){
            System.out.println("Ganador del partido: " + b.getNombre());
            pWinB++;
            //goles a favor B
            int sumaGf2 = b.getGolesAFavor() + golesB;
            b.setGolesAFavor(sumaGf2);
            //goles en contra  A
            int sumaGc2 = a.getGolesEnContra() + golesB;
            a.setGolesEnContra(sumaGc2);
            //partidos ganados B
            int sumapG2 = b.getPartidosGanados() + pWinB;
            b.setPartidosGanados(sumapG2);
            //se agregan los puntos
            pE+=3;
            int puntajeB = b.getPuntos() + pE;
            b.setPuntos(puntajeB);
            
        }else{
            System.out.println("****Empate****");
            pEmp++;
            int sumEmp1 = a.getPartidosEmpatados() + pEmp;
            int puntajeA = a.getPuntos() + pEmp;
            a.setPartidosEmpatados(sumEmp1); a.setPuntos(puntajeA);
            
            int sumEmp2 = b.getPartidosEmpatados() + pEmp;
            int puntajeB = b.getPuntos() + pEmp;
            b.setPartidosEmpatados(sumEmp2); b.setPuntos(puntajeB);
        }
        //partidos jugados
        pJ++;
        int sumapJ = a.getPartidosJugados()+ pJ;
        a.setPartidosJugados(sumapJ);
        
        int sumapJ2 = b.getPartidosJugados() + pJ;
        b.setPartidosJugados(sumapJ2);
        
        //datos del partido
        idp++;
        
        long minim = LocalDate.of(2019, 6, 14).toEpochDay();
        long maxim = LocalDate.of(2019, 6, 28).toEpochDay();
        long naci = ThreadLocalRandom.current().nextLong(minim , maxim);
        LocalDate fecha = LocalDate.ofEpochDay(naci);
        
        int nameIndex = random.nextInt(11);
        String estadio = estadios.get(nameIndex);
        
        String local = a.getNombre();
        String visitante = b.getNombre();
        
        partido = new Partido(idp, fecha, estadio, "Fase de grupos", local, visitante, golesA, golesB);
        
        partidos.add(partido);
 
    }
    
    public void calcularPuntos(Equipo a, Equipo b){
        int golesB = (int)(Math.random() * 10);
        int golesA = (int)(Math.random() * 10);
        int pWin = 0;
        int pWinB = 0;
        int pEmp = 0;
        int pE = 0;
        int pJ = 0;
        System.out.println("Desempate\n");
        
        if(golesA > golesB){
            System.out.println("Ganador del partido: " + a.getNombre());
            pWin++;
            //goles a favor A
            int sumaGf = a.getGolesAFavor() + golesA;
            a.setGolesAFavor(sumaGf);
            //goles en contra B
            int sumaGc = b.getGolesEnContra() + golesA;
            b.setGolesEnContra(sumaGc);
            //partidos ganados A
            int sumapG = a.getPartidosGanados() + pWin;
            a.setPartidosGanados(sumapG);
            //se agregan los puntos
            pE+=3;
            int puntajeA = a.getPuntos() + pE;
            a.setPuntos(puntajeA);
            
        }else if(golesB > golesA){
            System.out.println("Ganador del partido: " + b.getNombre());
            pWinB++;
            //goles a favor B
            int sumaGf2 = b.getGolesAFavor() + golesB;
            b.setGolesAFavor(sumaGf2);
            //goles en contra  A
            int sumaGc2 = a.getGolesEnContra() + golesB;
            a.setGolesEnContra(sumaGc2);
            //partidos ganados B
            int sumapG2 = b.getPartidosGanados() + pWinB;
            b.setPartidosGanados(sumapG2);
            //se agregan los puntos
            pE+=3;
            int puntajeB = b.getPuntos() + pE;
            b.setPuntos(puntajeB);
            
        }else{
            System.out.println("****Empate****");
            pEmp++;
            int sumEmp1 = a.getPartidosEmpatados() + pEmp;
            int puntajeA = a.getPuntos() + pEmp;
            a.setPartidosEmpatados(sumEmp1); a.setPuntos(puntajeA);
            
            int sumEmp2 = b.getPartidosEmpatados() + pEmp;
            int puntajeB = b.getPuntos() + pEmp;
            b.setPartidosEmpatados(sumEmp2); b.setPuntos(puntajeB);
        }
        //Partidos jugados
        pJ++;
        int sumapJ = a.getPartidosJugados()+ pJ;
        a.setPartidosJugados(sumapJ);
        
        int sumapJ2 = b.getPartidosJugados() + pJ;
        b.setPartidosJugados(sumapJ2);
        
        //datos del partido
        idp++;
        
        long minim = LocalDate.of(2019, 6, 14).toEpochDay();
        long maxim = LocalDate.of(2019, 6, 28).toEpochDay();
        long naci = ThreadLocalRandom.current().nextLong(minim , maxim);
        LocalDate fecha = LocalDate.ofEpochDay(naci);
        
        int nameIndex = random.nextInt(11);
        String estadio = estadios.get(nameIndex);
        
        String local = a.getNombre();
        String visitante = b.getNombre();
        
        partido = new Partido(idp, fecha, estadio, "Fase de grupos", local, visitante, golesA, golesB);
        
        partidos.add(partido);
    }
    
    public void crearCuartos(ArrayList<Equipo> grupo){
        int[] puntos = new int[4];
        
        
        for(int i = 0; i < 4; i++ ){
            puntos[i] = grupo.get(i).getPuntos();
        }
        
        
        Arrays.sort(puntos);
         
        int primero = puntos[3];
        int segundo = puntos[2];
        
        for (Equipo equipos : grupo) {
            int puntos2 = equipos.getPuntos();            
            
            if(puntos2 == primero)
                faseCuar.add(equipos);
            if(puntos2 == segundo)
                faseCuar.add(equipos);
        }
    
    }
    
    public void contiendas (ArrayList<Equipo> equipo){
        System.out.println("\nCuartos");
        System.out.println(equipo.get(0).getNombre() +" vs "+ equipo.get(2).getNombre());
        crearPartidosCuar(equipo.get(0), equipo.get(2));
        System.out.println(equipo.get(1).getNombre() +" vs "+ equipo.get(3).getNombre());
        crearPartidosCuar(equipo.get(1), equipo.get(3));
        System.out.println(equipo.get(4).getNombre() +" vs "+ equipo.get(6).getNombre());
        crearPartidosCuar(equipo.get(4), equipo.get(6));
        System.out.println(equipo.get(5).getNombre() +" vs "+ equipo.get(7).getNombre());
        crearPartidosCuar(equipo.get(5), equipo.get(7));
    }
    
    public void crearPartidosCuar(Equipo a, Equipo b){
        int golesB = (int)(Math.random() * 10);
        int golesA = (int)(Math.random() * 10);
        int pWin = 0;
        int pWinB = 0;
        int pJ = 0;
        
        if(golesA > golesB){
            System.out.println("Ganador del partido: " + a.getNombre());
            faseSemiFinales.add(a);
            pWin++;
            //goles a favor A
            int sumaGf = a.getGolesAFavor() + golesA;
            a.setGolesAFavor(sumaGf);
            //goles en contra B
            int sumaGc = b.getGolesEnContra() + golesA;
            b.setGolesEnContra(sumaGc);
            //partidos ganados A
            int sumapG = a.getPartidosGanados() + pWin;
            a.setPartidosGanados(sumapG); 
        }else if(golesB > golesA){
            System.out.println("Ganador del partido: " + b.getNombre());
            faseSemiFinales.add(b);
            pWinB++;
            //goles a favor B
            int sumaGf2 = b.getGolesAFavor() + golesB;
            b.setGolesAFavor(sumaGf2);
            //goles en contra  A
            int sumaGc2 = a.getGolesEnContra() + golesB;
            a.setGolesEnContra(sumaGc2);
            //partidos ganados B
            int sumapG2 = b.getPartidosGanados() + pWinB;
            b.setPartidosGanados(sumapG2);
        }else{
            penalesCuar(a, b);
        }
        //partidos jugados
        pJ++;
        int sumapJ = a.getPartidosJugados()+ pJ;
        a.setPartidosJugados(sumapJ);
        
        int sumapJ2 = b.getPartidosJugados() + pJ;
        b.setPartidosJugados(sumapJ2);
        
        //datos del partido
        idp++;
        
        long minim = LocalDate.of(2019, 7, 1).toEpochDay();
        long maxim = LocalDate.of(2019, 7, 4).toEpochDay();
        long naci = ThreadLocalRandom.current().nextLong(minim , maxim);
        LocalDate fecha = LocalDate.ofEpochDay(naci);
        
        int nameIndex = random.nextInt(11);
        String estadio = estadios.get(nameIndex);
        
        String local = a.getNombre();
        String visitante = b.getNombre();
        
        partido = new Partido(idp, fecha, estadio, "Cuartos", local, visitante, golesA, golesB);
        
        partidos.add(partido);
    }
    
    public void contiendasSemi(ArrayList<Equipo> equipo){
        System.out.println("\nSemi Finales");
        System.out.println(equipo.get(0).getNombre() +" vs "+ equipo.get(1).getNombre());
        crearPartidosSemi(equipo.get(0), equipo.get(1));
        System.out.println(equipo.get(2).getNombre() +" vs "+ equipo.get(3).getNombre());
        crearPartidosSemi(equipo.get(2), equipo.get(3));
    }
    
    public void crearPartidosSemi(Equipo a, Equipo b){
        int golesB = (int)(Math.random() * 10);
        int golesA = (int)(Math.random() * 10);
        int pWin = 0;
        int pWinB = 0;
        int pEmp = 0;
        int pJ = 0;
        
        if(golesA > golesB){
            System.out.println("Ganador del partido: " + a.getNombre());
            faseFinales.add(a);
            pWin++;
            //goles a favor A
            int sumaGf = a.getGolesAFavor() + golesA;
            a.setGolesAFavor(sumaGf);
            //goles en contra B
            int sumaGc = b.getGolesEnContra() + golesA;
            b.setGolesEnContra(sumaGc);
            //partidos ganados A
            int sumapG = a.getPartidosGanados() + pWin;
            a.setPartidosGanados(sumapG); 
        }else if(golesB > golesA){
            System.out.println("Ganador del partido: " + b.getNombre());
            faseFinales.add(b);
            pWinB++;
            //goles a favor B
            int sumaGf2 = b.getGolesAFavor() + golesB;
            b.setGolesAFavor(sumaGf2);
            //goles en contra  A
            int sumaGc2 = a.getGolesEnContra() + golesB;
            a.setGolesEnContra(sumaGc2);
            //partidos ganados B
            int sumapG2 = b.getPartidosGanados() + pWinB;
            b.setPartidosGanados(sumapG2);
        }else{
            penalesSemi(a, b);
        }
        //partidos jugados
        pJ++;
        int sumapJ = a.getPartidosJugados()+ pJ;
        a.setPartidosJugados(sumapJ);
        
        int sumapJ2 = b.getPartidosJugados() + pJ;
        b.setPartidosJugados(sumapJ2);
        
        //datos del partido
        idp++;
        
        long minim = LocalDate.of(2019, 7, 7).toEpochDay();
        long maxim = LocalDate.of(2019, 7, 8).toEpochDay();
        long naci = ThreadLocalRandom.current().nextLong(minim , maxim);
        LocalDate fecha = LocalDate.ofEpochDay(naci);
        
        int nameIndex = random.nextInt(11);
        String estadio = estadios.get(nameIndex);
        
        String local = a.getNombre();
        String visitante = b.getNombre();
        
        partido = new Partido(idp, fecha, estadio, "Semi Final", local, visitante, golesA, golesB);
        
        partidos.add(partido);
    }
    
    public void contiendaFinal(ArrayList<Equipo> equipo){
        System.out.println("\nFinal");
        System.out.println(equipo.get(0).getNombre() +" vs "+ equipo.get(1).getNombre());
        crearPartidoFinal(equipo.get(0), equipo.get(1));
    }
    
    public void crearPartidoFinal(Equipo a, Equipo b){
        int golesB = (int)(Math.random() * 10);
        int golesA = (int)(Math.random() * 10);
        int pWin = 0;
        int pWinB = 0;
        int pJ = 0;
        
        if(golesA > golesB){
            System.out.println("Ganador del partido: " + a.getNombre());
            campeon = a;
            pWin++;
            //goles a favor A
            int sumaGf = a.getGolesAFavor() + golesA;
            a.setGolesAFavor(sumaGf);
            //goles en contra B
            int sumaGc = b.getGolesEnContra() + golesA;
            b.setGolesEnContra(sumaGc);
            //partidos ganados A
            int sumapG = a.getPartidosGanados() + pWin;
            a.setPartidosGanados(sumapG); 
        }else if(golesB > golesA){
            System.out.println("Ganador del partido: " + b.getNombre());
            campeon = b;
            pWinB++;
            //goles a favor B
            int sumaGf2 = b.getGolesAFavor() + golesB;
            b.setGolesAFavor(sumaGf2);
            //goles en contra  A
            int sumaGc2 = a.getGolesEnContra() + golesB;
            a.setGolesEnContra(sumaGc2);
            //partidos ganados B
            int sumapG2 = b.getPartidosGanados() + pWinB;
            b.setPartidosGanados(sumapG2);
        }else{
            penalesFinal(a, b);
        }
        //partidos jugados
        pJ++;
        int sumapJ = a.getPartidosJugados()+ pJ;
        a.setPartidosJugados(sumapJ);
        
        int sumapJ2 = b.getPartidosJugados() + pJ;
        b.setPartidosJugados(sumapJ2);
        
        //datos del partido
        idp++;
        
        long minim = LocalDate.of(2019, 7, 7).toEpochDay();
        long maxim = LocalDate.of(2019, 7, 8).toEpochDay();
        long naci = ThreadLocalRandom.current().nextLong(minim , maxim);
        LocalDate fecha = LocalDate.ofEpochDay(naci);
        
        int nameIndex = random.nextInt(11);
        String estadio = estadios.get(nameIndex);
        
        String local = a.getNombre();
        String visitante = b.getNombre();
        
        partido = new Partido(idp, fecha, estadio, "Final", local, visitante, golesA, golesB);
        
        partidos.add(partido);
    
    }
    
    public void penalesCuar (Equipo c,Equipo d){
        int golesB = (int)(Math.random() * 5);
        int golesA = (int)(Math.random() * 5);
        int pWin = 0;
        int pWinB = 0;
        
        System.out.println("Penales");
        
        if(golesA > golesB){
            System.out.println("Ganador del partido: " + c.getNombre());   
            faseSemiFinales.add(c);
            pWin++;
            //goles a favor A
            int sumaGf = c.getGolesAFavor() + golesA;
            c.setGolesAFavor(sumaGf);
            //goles en contra B
            int sumaGc = d.getGolesEnContra() + golesA;
            d.setGolesEnContra(sumaGc);
            //partidos ganados A
            int sumapG = c.getPartidosGanados() + pWin;
            c.setPartidosGanados(sumapG);
        }else if(golesB > golesA){
            System.out.println("Ganador del partido: " + d.getNombre());
            faseSemiFinales.add(d);
            pWinB++;
            //goles a favor B
            int sumaGf2 = d.getGolesAFavor() + golesB;
            d.setGolesAFavor(sumaGf2);
            //goles en contra  A
            int sumaGc2 = c.getGolesEnContra() + golesB;
            c.setGolesEnContra(sumaGc2);
            //partidos ganados B
            int sumapG2 = d.getPartidosGanados() + pWinB;
            d.setPartidosGanados(sumapG2);  
        }else if(golesA == golesB){
            penalesCuar(c, d);
        }   
    
    }
    
    public void penalesSemi (Equipo c,Equipo d){
        int golesB = (int)(Math.random() * 5);
        int golesA = (int)(Math.random() * 5);
        int pWin = 0;
        int pWinB = 0;
        
        System.out.println("Penales");
        
        if(golesA > golesB){
            System.out.println("Ganador del partido: " + c.getNombre());   
            faseFinales.add(c);
            pWin++;
            //goles a favor A
            int sumaGf = c.getGolesAFavor() + golesA;
            c.setGolesAFavor(sumaGf);
            //goles en contra B
            int sumaGc = d.getGolesEnContra() + golesA;
            d.setGolesEnContra(sumaGc);
            //partidos ganados A
            int sumapG = c.getPartidosGanados() + pWin;
            c.setPartidosGanados(sumapG);
        }else if(golesB > golesA){
            System.out.println("Ganador del partido: " + d.getNombre());
            faseFinales.add(d);
            pWinB++;
            //goles a favor B
            int sumaGf2 = d.getGolesAFavor() + golesB;
            d.setGolesAFavor(sumaGf2);
            //goles en contra  A
            int sumaGc2 = c.getGolesEnContra() + golesB;
            c.setGolesEnContra(sumaGc2);
            //partidos ganados B
            int sumapG2 = d.getPartidosGanados() + pWinB;
            d.setPartidosGanados(sumapG2);  
        }else if(golesA == golesB){
            penalesSemi(c, d);
        }   
    
    }
    
    public void penalesFinal (Equipo c,Equipo d){
        int golesB = (int)(Math.random() * 10);
        int golesA = (int)(Math.random() * 10);
        int pWin = 0;
        int pWinB = 0;
        
        System.out.println("Penales");
        
        if(golesA > golesB){
            System.out.println("Ganador del partido: " + c.getNombre());   
            campeon = c;
            pWin++;
            //goles a favor A
            int sumaGf = c.getGolesAFavor() + golesA;
            c.setGolesAFavor(sumaGf);
            //goles en contra B
            int sumaGc = d.getGolesEnContra() + golesA;
            d.setGolesEnContra(sumaGc);
            //partidos ganados A
            int sumapG = c.getPartidosGanados() + pWin;
            c.setPartidosGanados(sumapG);
        }else if(golesB > golesA){
            System.out.println("Ganador del partido: " + d.getNombre());
            campeon = d;
            pWinB++;
            //goles a favor B
            int sumaGf2 = d.getGolesAFavor() + golesB;
            d.setGolesAFavor(sumaGf2);
            //goles en contra  A
            int sumaGc2 = c.getGolesEnContra() + golesB;
            c.setGolesEnContra(sumaGc2);
            //partidos ganados B
            int sumapG2 = d.getPartidosGanados() + pWinB;
            d.setPartidosGanados(sumapG2);  
        }else if(golesA == golesB){
            penalesFinal(c, d);
        }   
    
    }
}