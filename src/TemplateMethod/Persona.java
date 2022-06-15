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
public abstract class Persona {
    private String nombre;
    private String cedula;
    
    public String indentificate(){
        String frase = "Me identifico con: ";
        frase= frase+getTipoId();
        frase=frase+ ". El numero es: ";
        frase = frase + getIdentificacion();
        return frase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    protected abstract String getTipoId();
    protected abstract String getIdentificacion();
}
