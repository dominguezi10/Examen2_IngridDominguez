/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_ingriddominguez;

import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author 1234
 */
public class administrador implements Serializable{
    private File archivo = null;
    private static final long SerialVersionUID = 777L;
    ArrayList<Object> todo = new ArrayList();

    public administrador(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Object> getTodo() {
        return todo;
    }

    public void setTodo(ArrayList<Object> todo) {
        this.todo = todo;
    }
    
    public void cargar(){
        try {
            todo = new ArrayList();
            Object comp;

            if (archivo.exists()) { // si existe
                FileInputStream LaEntrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(LaEntrada);

                try {
                    while ((comp = (Component) objeto.readObject()) != null) {
                        todo.add(comp);
                        System.out.println("eestoy ");
                    }// fin del while
                } catch (Exception e) {
                }

                
                objeto.close();
                LaEntrada.close();
                
            }// fin del if

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    
}
