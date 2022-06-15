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
public class Gestion implements IEstadoLibro {

    @Override
    public void update() {
        System.out.println("Administracion: ");
        System.out.println("Envio un queja formal.....");
    }
    
}
