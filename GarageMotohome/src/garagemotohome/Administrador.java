
package garagemotohome;

import java.util.ArrayList;

public class Administrador extends Personas {
    private static int contador;
    private final static int prefijoAdmin=1;
    
    public Administrador(String nombre, int DNI, int Telefono, Domicilios domicilio) {
        super(nombre, DNI, Telefono, domicilio);
        contador++;
    }
    
    @Override
    public String toString() {
        return "Administrador:  " + super.toString();
    }

    // Los administrativos tendran un codigo que SIEMPRE empieza en 1
    @Override
    public int crearCodigo() {
        String numero;
        numero = String.valueOf(prefijoAdmin) +String.valueOf(contador);
        return Integer.parseInt(numero);
    }    
    
    
}
