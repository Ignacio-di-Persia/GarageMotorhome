package garagemotohome;

import java.util.Scanner;

public interface Menu {
    public void Menu(); 
    BaseDeDatos db = new BaseDeDatos();
    public Scanner scanner = new Scanner(System.in);
    
    public default int solicitarCodigo(String rol){
        System.out.println("Porfavor ingrese su codigo de "+rol+":");
        return scanner.nextInt();
    }
}
