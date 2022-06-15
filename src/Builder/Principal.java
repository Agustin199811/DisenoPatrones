/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author Agustin
 */
public class Principal {
     public static void main(String[] args) {
        // TODO code application logic here
        Cocina co = new Cocina();
        co.setPizzaBuilder(new CarnesPizzaBuilder());
        co.elaboracionPizza();
        System.out.println(co.getPizza());
        
        System.out.println("=================");
        co.setPizzaBuilder(new VegetarianaPizzaBuilder());
        co.elaboracionPizza();
        System.out.println(co.getPizza());
     }
}
