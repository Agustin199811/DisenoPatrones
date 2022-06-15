/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author Agustin
 */
public class FactoryLcdAzul extends TvAbstractFactory {
    @Override
    public Tv createTV() {
        return new LCD();
    }
    @Override
    public Color createColor() {
        return new Azul();
    }   
}
