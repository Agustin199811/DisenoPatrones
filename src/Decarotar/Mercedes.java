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
public class Mercedes extends Automovil {

    public Mercedes(String modelo, String rines, String color, String tipoEstereo) {
        super(modelo, rines, color, tipoEstereo);
    }

    @Override
    public String getDescripcion() {
        return "Mercedes Benz modelo 2022";
    }

    @Override
    public int getPrecio() {
        return 129990;
    }
    
}
