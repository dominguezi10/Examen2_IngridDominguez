/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_ingriddominguez;

/**
 *
 * @author 1234
 */
public class SondaEspacial extends Nave{
    private String material;
    private int peso;

    public SondaEspacial() {
        super();
    }

    
    
    public SondaEspacial(String material, int peso, int numeroSerie, Planeta planetaDestino, int velocidad) {
        super(numeroSerie, planetaDestino, velocidad);
        this.material = material;
        this.peso = peso;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "SondaEspacial{" + "material=" + material + ", peso=" + peso + '}';
    }
    
    
    
    
    @Override
    public double[] polimorfo() {
        // primero sera ida 
        // segundo sera regreso
        double [] velocidades = new double[2];
        double distancia = super.getPlanetaDestino().getDistancia();
        
        double ida = (distancia / super.getVelocidad());
        double regreso = ( 9.8 * ida  );
        
        velocidades[0] = ida;
        velocidades[1] = regreso;
        
        
       return velocidades;
    }

    
}
