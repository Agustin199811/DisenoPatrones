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
public class PrepararParrillada extends PrepararComida {

    public PrepararParrillada(IPreparar implementar) {
        this.setImplementar(implementar);
    }
 
    @Override
    public void tener() {
        System.out.println("Preparando Parrillada....");
        this.getImplementar().procesar();
    
    }
    
    
}
