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
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TvAbstractFactory f1 = new FactoryLcdAzul();
        EnsamblajeTv e = new EnsamblajeTv(f1);
        
        TvAbstractFactory f2 = new FactoryPlasmaAmarillo();
        EnsamblajeTv e2 = new EnsamblajeTv(f2);
        
        
    }
    
}
