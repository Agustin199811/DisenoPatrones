/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *
 * @author Agustin
 */
public class Principal {
    public static void main(String[] args) {
        PrepararComida parrillada = new PrepararParrillada(new Carne());
        parrillada.tener();
        
        parrillada.setImplementar(new Marisco());
        parrillada.tener();
    }

}
