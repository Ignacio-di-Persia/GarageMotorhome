package garagemotohome;

public abstract class Personas {
   private String nombre;
   private int DNI;
   private int Telefono;
   private final Domicilios domicilio;
   private int codigo;

    public Personas(String nombre, int DNI, int Telefono, Domicilios domicilio) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.Telefono = Telefono;
        this.domicilio = domicilio;
        this.codigo = crearCodigo();
    }

    
    //Getter & Setters
    public String getNombre() {    
        return nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public Domicilios getDomicilio() {
        return domicilio;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public abstract int crearCodigo(); 

    @Override
    public String toString() {
        return "\n-Datos:\n  " 
                + "+Codigo: " + codigo + "\n  "
                + "+Nombre: " + nombre + "\n  "
                + "+DNI: " + DNI + "\n  "
                + "+Telefono: " + Telefono + "\n  "
                + domicilio ;
    }

    
   
   void ingresarDatos (String nombre, int DNI, int Telefono, String direccion, int codigo){
       
   }
   

}
