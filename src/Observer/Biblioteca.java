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
public class Biblioteca {
    public void devolucion(Libro libro){
        if(libro.getEstadoLibro().equals("Malo")){
            Alarma alarma = new Alarma();
            alarma.notifyObservers();
            
        }
    
                
    }
}
