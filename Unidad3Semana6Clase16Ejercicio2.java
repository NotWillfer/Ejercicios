package unidad3semana6clase16ejercicio2;
import java.util.Scanner;
public class Unidad3Semana6Clase16Ejercicio2 {
    public static void main(String[] args) {
        Scanner ingresar = new Scanner (System.in);
    String contra1, contra2;
    do {
      System.out.println ("Ingrese la contraseña: ");
      contra1 = ingresar.nextLine ();
      System.out.println ("Ingrese la contraseña: ");
      contra2 = ingresar.nextLine ();
    }
     while  (contra1 != contra2);
  }
}