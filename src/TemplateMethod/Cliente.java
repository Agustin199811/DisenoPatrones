/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethod;

/**
 *
 * @author Agustin
 */
public class Cliente extends Persona {

    private int numeroCliente;

    public Cliente(int numeroCliente) {
        setNumeroCliente(numeroCliente);
    }

    @Override
    protected String getTipoId() {

        return "numero de cliente";
    }

    @Override
    protected String getIdentificacion() {
        return String.valueOf(numeroCliente);
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

}
