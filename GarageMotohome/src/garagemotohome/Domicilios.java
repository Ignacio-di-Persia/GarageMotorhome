
package garagemotohome;

public class Domicilios {
    protected String calle;
    protected int altura;
    protected String barrio;

    public Domicilios(String calle, int altura, String barrio) {
        this.calle = calle;
        this.altura = altura;
        this.barrio = barrio;
    }

    //Getter & Setters
    public String getCalle() {
        return calle;
    }

    public int getAltura() {
        return altura;
    }

    public String getBarrio() {
        return barrio;
    }
    

    @Override
    public String toString() {
        return "-Domicilio:\n  " 
                + "+calle: " + calle + "\n  "
                + "+altura: " + altura + "\n  "
                + "+barrio: " + barrio + "\n";
    }
    
    
}
