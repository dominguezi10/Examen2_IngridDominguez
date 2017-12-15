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
public class Expedicion implements Runnable, Serializable {

    private static final long SerialVersionUID = 777L;
    private boolean avanzar;
    private boolean vivir;

    public Expedicion() {
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVivir() {
        return vivir;
    }

    public void setVivir(boolean vivir) {
        this.vivir = vivir;
    }
    
    

    @Override
    public void run() {
        while (avanzar == true) {
            while (vivir == true) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                   // Logger.getLogger(HiloLLuvia.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }// fin de avanzar
    }

}
