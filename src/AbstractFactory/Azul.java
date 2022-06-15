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
public class Azul extends Color {

    private boolean esPrimario;

    public void colorea(Tv tv) {
        System.out.println("Pintando de azul el " + tv.getDescripcion());
    }

    public boolean isEsPrimario() {
        return esPrimario;
    }

    public void setEsPrimario(boolean esPrimario) {
        this.esPrimario = esPrimario;
    }
    
}
