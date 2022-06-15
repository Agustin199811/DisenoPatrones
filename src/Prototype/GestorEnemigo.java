/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import java.util.Hashtable;

/**
 *
 * @author Agustin
 */
public class GestorEnemigo {

    private Hashtable hEnemigos = new Hashtable();

    public GestorEnemigo() {
        Enemigo h1 = new Hechicero();
        h1.setNombre("Phenix");
        this.addEnemigo(h1.getNombre(), h1);

        Enemigo g1 = new Guerrero();
        g1.setNombre("Jett");
        g1.setArma("Espada");

        this.addEnemigo(g1.getNombre(), g1);
    }

    public void addEnemigo(String nombre, Enemigo objEnemigo) {
        this.hEnemigos.put(nombre, objEnemigo);
    }
    
       public Enemigo getEnemigo( String nombre ){
        Enemigo objPrototipo = (Guerrero) hEnemigos.get( nombre );
        return objPrototipo;
    }
       
      public Enemigo getClon( String nombre ){
   
         Enemigo objPrototipo = (Guerrero) hEnemigos.get( nombre );
 
         try {
             return (Enemigo) objPrototipo.clonar();
         } catch( CloneNotSupportedException e ) {
 
             System.out.println("Error al crear el clon, salimos del programa.");
             System.exit(0);
         }
        return null;
    }  

}
