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
public class EnsamblajeTv {
    public EnsamblajeTv(TvAbstractFactory factory){
        Color color =factory.createColor();
        Tv tv = factory.createTV();
        color.colorea(tv);
    }
}
