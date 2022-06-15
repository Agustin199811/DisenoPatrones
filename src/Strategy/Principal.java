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
public class Principal {
    public static void main(String[] args) {
        Strategy st;
        
        st= new Strategy(new Suma());
        int suma = st.procesar(10, 4);
        
        st= new Strategy(new Resta());
        int resta= st.procesar(20, 3);
        
        st= new Strategy(new Multiplicar());
        int multp = st.procesar(5, 6);
        
        
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicacion: "+multp);
    }

}
