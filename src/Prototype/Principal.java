/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author Agustin
 */
public class Principal {
    public static void main(String[] args) {
        GestorEnemigo objGP = new GestorEnemigo();
         Enemigo g1 = objGP.getEnemigo("Jett");
        System.out.println("==============================");
        System.out.println("El Guerrero original se llama [" + g1.getNombre() + "]");
        System.out.println("Su arma es [" + g1.getArma() + "]");
        System.out.println("==============================");
        Enemigo g2 = objGP.getClon("Jett");
        System.out.println("Clon del Guerrero creado:");
        System.out.println("Su nombre es [" + g2.getNombre() + "]");
        System.out.println("Su arma es [" + g2.getArma() + "]");
        System.out.println("==============================");
        g2.setNombre("Phenix");
        g2.setArma("Hacha");
        System.out.println("Tras modificar el clon, ahora se llama [" + g2.getNombre() + "]");
        System.out.println("Su arma es [" + g2.getArma() + "]\n");
        System.out.println("El nombre del Guerrero original es [" + g1.getNombre() + "]");
        System.out.println("Su arma es [" + g1.getArma() + "]");
        System.out.println("==============================");
        g1.setNombre("Gigante");
        g1.setArma("Mazo");
        System.out.println("Tras modificar el original, ahora es [" + g1.getNombre() + "]");
        System.out.println("Su arma es [" + g1.getArma() + "]\n");
        System.out.println("El nombre del clon es [" + g2.getNombre() + "]");
        System.out.println("Su arma es [" + g2.getArma() + "]");
    }
    

}
