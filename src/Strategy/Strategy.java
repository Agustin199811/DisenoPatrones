/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author Agustin
 */
public class Strategy {
    private IMatematicaBasica strategy;

    public Strategy(IMatematicaBasica strategy) {
        this.strategy = strategy;
    }
    public int procesar (int a , int b){
        return strategy.operacion(a, b);
    }
    
}
