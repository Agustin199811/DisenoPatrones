/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *
 * @author Agustin
 */
public abstract class PrepararComida {

    IPreparar implementar;

    public IPreparar getImplementar() {
        return implementar;
    }

    public void setImplementar(IPreparar implementar) {
        this.implementar = implementar;
    }

    public abstract void tener();
}
