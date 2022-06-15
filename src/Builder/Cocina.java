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
public class Cocina {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb) {
        this.pizzaBuilder = pb;
    }
    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }
    
    public void elaboracionPizza(){
        pizzaBuilder.crearNuevaPizza();
        pizzaBuilder.buildMasa();
        pizzaBuilder.buildSalsa();
        pizzaBuilder.buildRelleno();
    }
}
