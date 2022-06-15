/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decarotar;

/**
 *
 * @author Agustin
 */
public class Principal {

    public static void main(String[] args) {
        Venta auto1 = new Mercedes("", "", "", "");
        auto1 = new Mp3Player(auto1);
        auto1 = new AireAcondicionado(auto1);

        System.out.println(auto1.getDescripcion());
        System.out.println("\t Su precio es: " + auto1.getPrecio());

        Venta auto2 = new Mitsubishi("", "", "", "");
        auto2 = new Mp3Player(auto2);
        auto2 = new AireAcondicionado(auto2);
        System.out.println(auto2.getDescripcion());
        System.out.println("\t Su precio es: " + auto2.getPrecio());
    }

}
