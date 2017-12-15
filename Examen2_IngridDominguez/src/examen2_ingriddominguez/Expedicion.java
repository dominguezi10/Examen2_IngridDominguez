/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_ingriddominguez;

import java.io.Serializable;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author 1234
 */
public class Expedicion implements Runnable, Serializable {

    private static final long SerialVersionUID = 777L;
    private boolean avanzar;
    private boolean vivir;
    private JProgressBar ida;
    private JProgressBar regreso;
    private JFrame este;

    private int recorrer;
    private int elregreso;

    public Expedicion() {
    }

    public Expedicion(boolean avanzar, boolean vivir, JProgressBar ida, JProgressBar regreso, int recorrer, int elregreso, JFrame este) {
        this.avanzar = avanzar;
        this.vivir = vivir;
        this.ida = ida;
        this.regreso = regreso;
        this.recorrer = recorrer;
        this.elregreso = elregreso;
        this.este = este;
    }

    
    
    public int getElregreso() {
        return elregreso;
    }

    public void setElregreso(int elregreso) {
        this.elregreso = elregreso;
    }

    

    public JProgressBar getIda() {
        return ida;
    }

    public void setIda(JProgressBar ida) {
        this.ida = ida;
    }

    public JProgressBar getRegreso() {
        return regreso;
    }

    public void setRegreso(JProgressBar regreso) {
        this.regreso = regreso;
    }

    public int getRecorrer() {
        return recorrer;
    }

    public void setRecorrer(int recorrer) {
        this.recorrer = recorrer;
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
            int cont = 0;
            int segundo = 0;
            while (vivir == true) {

                if (cont < recorrer) {
                    ida.setValue(cont + 20);
                    cont++;
                }else{
                    regreso.setValue(segundo +20);
                    segundo= segundo +20;
                    System.out.println("entres "+regreso.getValue());
                    if(segundo == elregreso){
                        avanzar = false;
                        JOptionPane.showMessageDialog(este, "Llego");
                    }
                }


                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    // Logger.getLogger(HiloLLuvia.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }// fin del vivi

        }// fin de avanzar
    }

}
