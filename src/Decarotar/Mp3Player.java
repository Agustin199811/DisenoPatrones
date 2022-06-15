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
public class Mp3Player extends Decorator {

    public Mp3Player(Venta venta) {
        super(venta);
    }

    @Override
    public String getDescripcion() {
        return getVenta().getDescripcion()+" + MP3 Player";
    }

    @Override
    public int getPrecio() {
            return getVenta().getPrecio()+1200;
    }
    
}
