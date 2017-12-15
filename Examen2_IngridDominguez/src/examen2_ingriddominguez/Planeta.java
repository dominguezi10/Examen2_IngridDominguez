/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_ingriddominguez;

import java.io.Serializable;

/**
 *
 * @author 1234
 */
public class Planeta implements Serializable{
     private static final long SerialVersionUID  = 777L;
    private String nombre;
    private int temperatura;
    private boolean anillos;
    private String superficie;
    private int distancia;

    public Planeta() {
    }

    public Planeta(String nombre, int temperatura, boolean anillos, String superficie, int distancia) {
        this.nombre = nombre;
        this.temperatura = temperatura;
        this.anillos = anillos;
        this.superficie = superficie;
        this.distancia = distancia;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isAnillos() {
        return anillos;
    }

    public void setAnillos(boolean anillos) {
        this.anillos = anillos;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
