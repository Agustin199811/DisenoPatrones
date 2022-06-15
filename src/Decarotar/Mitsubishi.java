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
public class Mitsubishi extends Automovil {
    

    public Mitsubishi(String modelo, String rines, String color, String tipoEstereo) {
        super(modelo, rines, color, tipoEstereo);
    }

    
    @Override
    public String getDescripcion() {
        return "Mitsubishi Montero Sport 2022";
    }

    @Override
    public int getPrecio() {
        return 250000;
    }
    
}
