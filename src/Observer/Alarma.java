/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;

/**
 *
 * @author Agustin
 */
public class Alarma implements Subject {

    private static ArrayList<IEstadoLibro> observers = new ArrayList<IEstadoLibro>();

    @Override
    public void attach(IEstadoLibro observer) {
        observers.add(observer);
    }

    @Override
    public void dettach(IEstadoLibro observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update();
            
        }
    }

}
