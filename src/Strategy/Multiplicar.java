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
public class Multiplicar implements IMatematicaBasica{
    
    public Multiplicar(){
        
    }

    @Override
    public int operacion(int a, int b) {
        return a*b;
    }
    
}
