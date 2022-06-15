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
public abstract class Tv implements Cloneable {

    private String marca;
    private int pulgadas;
    private String color;
    private String descripcion;
    private double precio;

    public Tv() {
    }

    public Tv(String marca, int pulgadas, String color, String descripcion, double precio) {
        setMarca(marca);
        setPulgadas(pulgadas);
        setPrecio(precio);
        setColor(marca);
    }
    
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public String getMarca() {
        return marca;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public String getColor() {
        return color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
