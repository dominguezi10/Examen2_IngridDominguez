/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_ingriddominguez;

import java.util.ArrayList;

/**
 *
 * @author 1234
 */
public class Tripulada extends Nave {

    private String lugarDespeje;
    private ArrayList<Astronauta> astronautas = new ArrayList();

    public Tripulada() {
    }

    public Tripulada(String lugarDespeje, int numeroSerie, Planeta planetaDestino, int velocidad) {
        super(numeroSerie, planetaDestino, velocidad);
        this.lugarDespeje = lugarDespeje;
    }

    public String getLugarDespeje() {
        return lugarDespeje;
    }

    public void setLugarDespeje(String lugarDespeje) {
        this.lugarDespeje = lugarDespeje;
    }

    public ArrayList<Astronauta> getAstronautas() {
        return astronautas;
    }

    public void setAstronautas(ArrayList<Astronauta> astronautas) {
        this.astronautas = astronautas;
    }

    @Override
    public String toString() {
        return "Tripulada{" + "lugarDespeje=" + lugarDespeje + ", astronautas=" + astronautas + '}';
    }

    @Override
    public double[] polimorfo() {
        // primero sera ida 
        // segundo sera regreso
        double[] velocidades = new double[2];
        double distancia = super.getPlanetaDestino().getDistancia();
        double pesos = 0;
        for (int i = 0; i < astronautas.size(); i++) {
            pesos  += astronautas.get(i).getPeso();
        }
        
        double peso1 = (pesos * pesos);
        
        double ida = (distancia / (super.getVelocidad() *( peso1/ 100)  ));
        double regreso = ( distancia / ( super.getVelocidad() * pesos ));

        velocidades[0] = ida;
        velocidades[1] = regreso;

        return velocidades;
    }

}
