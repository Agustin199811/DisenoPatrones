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
public class Carne implements IPreparar {

    public Carne() {
    }

    @Override
    public void procesar() {
        System.out.println("\tParrillada con carne+chorizo+choclo+papa+pollo elaborada");
    }
    
}
