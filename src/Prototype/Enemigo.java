/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author Agustin
 */
public abstract class Enemigo implements Cloneable {
    private String nombre ="";
    private String arma = "navaja";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
    public Enemigo clonar() throws CloneNotSupportedException{
           return (Enemigo) this.clone() ;
    }
    public abstract void atacar();
    public abstract void detener();
}
