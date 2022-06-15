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
public class Empleado extends Persona {

    private String archivo;

    public Empleado(String archivo) {
        setArchivo(archivo);

    }

    @Override
    protected String getTipoId() {
        return "Numero de archivo";
    }

    @Override
    protected String getIdentificacion() {
        return archivo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
    

}
