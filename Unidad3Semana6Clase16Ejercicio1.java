package unidad3semana6clase16ejercicio1;
import java.util.Scanner;
public class Unidad3Semana6Clase16Ejercicio1 {
    public static void main(String[] args) {
         Scanner ingresar = new Scanner (System.in);
    int pass;
    do {
      System.out.println ("Introduzca la conrtaseña:");
      pass = ingresar.nextInt ();
      if (pass != 1234)
        System.out.println ("Contraseña inválida");
    } while (pass != 1234);
      System.out.println ("Usuario logeado correctamente");
  }
}
