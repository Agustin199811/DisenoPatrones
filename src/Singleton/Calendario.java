/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Agustin
 */
public class Calendario {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Ventana frame= new Ventana();
       frame.setVisible(true);
       
       Singleton s = Singleton.getSingleton();
        System.out.println(s); 
    }
    
}

