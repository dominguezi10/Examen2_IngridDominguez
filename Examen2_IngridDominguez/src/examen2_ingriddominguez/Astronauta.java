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
public class Astronauta implements Serializable {
    private static final long SerialVersionUID  = 777L;
    private String nombre;
    private String nacionalidad;
    private double sueldo;
    private String experiencia;
    private boolean sexo;
    private int peso;

    public Astronauta() {
    }

    public Astronauta(String nombre, String nacionalidad, double sueldo, String experiencia, boolean sexo, int peso) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.sueldo = sueldo;
        this.experiencia = experiencia;
        this.sexo = sexo;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
