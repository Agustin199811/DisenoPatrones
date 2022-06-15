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
public class CarnesPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildMasa() {
        pizza.setMasa("ligera");
    }
       

    @Override
    public void buildSalsa() {
        pizza.setSalsa("Tomate");
    }

    @Override
    public void buildRelleno() {
        pizza.setRelleno("pepperoni+salchicha+chorizo");
    }
    
}
