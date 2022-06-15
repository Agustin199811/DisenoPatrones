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
public abstract class Decorator implements Venta{
     private Venta venta;

    public Decorator(Venta venta) {
        setVenta(venta);
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

}
