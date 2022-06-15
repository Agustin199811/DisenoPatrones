/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author Agustin
 */
public class Covertidor extends CajaDolares implements IAdaptador{
    

    @Override
    public void sacarPesetas(double pesetas) {
        double dolares = pesetas /155.216;
        this.sacarDolares(dolares);
    }

    @Override
    public void ingresoPesetas(double pesetas) {
         double dolares1 = pesetas /155.216;
         this.ingresoDolares(dolares1);
    }
}
