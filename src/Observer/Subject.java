/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author Agustin
 */
public interface Subject {
    public void attach(IEstadoLibro observer);
    public void dettach(IEstadoLibro observer);
    public void notifyObservers();
}
