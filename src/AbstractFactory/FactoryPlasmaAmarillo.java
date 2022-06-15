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
public class FactoryPlasmaAmarillo extends TvAbstractFactory{

    @Override
    public Tv createTV() {
        return new Plasma();
    }
    
    @Override
    public Color createColor() {
        return new Amarillo();
    }
    
}
