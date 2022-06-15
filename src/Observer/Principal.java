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
public class Principal {
    public static void main(String[] args) {
        Alarma alarma = new Alarma();
        alarma.attach(new Compra());
        alarma.attach(new Gestion());
        alarma.attach(new Stock());
        
        Libro libro = new Libro();
        libro.setEstadoLibro("Malo");
        
        Biblioteca biblio = new Biblioteca ();
        biblio.devolucion(libro);
    }
}
