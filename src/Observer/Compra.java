/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author Agustin
 */
public class Compra implements IEstadoLibro {

    @Override
    public void update() {
        System.out.println("Compra: ");
        System.out.println("Solicito nueva cotizacion....");
    }
    
}
