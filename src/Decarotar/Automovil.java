/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decarotar;

/**
 *
 * @author Agustin
 */
public abstract class Automovil implements Venta {
    private String modelo;
    private String rines;
    private String color;
    private String tipoEstereo;

    public Automovil(String modelo, String rines, String color, String tipoEstereo) {
        this.modelo = modelo;
        this.rines = rines;
        this.color = color;
        this.tipoEstereo = tipoEstereo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getRines() {
        return rines;
    }

    public void setRines(String rines) {
        this.rines = rines;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoEstereo() {
        return tipoEstereo;
    }

    public void setTipoEstereo(String tipoEstereo) {
        this.tipoEstereo = tipoEstereo;
    }
    
}
