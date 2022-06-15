/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author Agustin
 */
public class Pizza {

    private String masa ;
    private String salsa ;
    private String relleno;

    public Pizza() {
    }

    public Pizza(String masa, String salsa, String relleno) {
        this.masa = masa;
        this.salsa = salsa;
        this.relleno = relleno;
    }

    public String getMasa() {
        return masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public String getRelleno() {
        return relleno;
    }
    

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    @Override
    public String toString() {
        return "Pizza{" + "\nmasa=" + masa + ", \nsalsa=" + salsa + ", \nrelleno=" + relleno + '}'+"\n\n";
    }
    
    

}
