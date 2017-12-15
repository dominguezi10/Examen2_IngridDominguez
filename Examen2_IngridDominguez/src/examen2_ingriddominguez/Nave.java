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
public abstract class Nave implements Serializable {
    private static final long SerialVersionUID  = 777L;
    private int numeroSerie;
    private Planeta planetaDestino;
    private int velocidad;

    public Nave() {
    }

    public Nave(int numeroSerie, Planeta planetaDestino, int velocidad) {
        this.numeroSerie = numeroSerie;
        this.planetaDestino = planetaDestino;
        this.velocidad = velocidad;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Planeta getPlanetaDestino() {
        return planetaDestino;
    }

    public void setPlanetaDestino(Planeta planetaDestino) {
        this.planetaDestino = planetaDestino;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return ""+numeroSerie;
    }
    
    
    public abstract int [] polimorfo();
    
}
