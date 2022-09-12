package unidad3semana3clase8ejercicio1;
import java.util.Scanner;
public class Unidad3Semana3Clase8Ejercicio1 {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner (System.in);
    String quieroJugar = "si";
    while (quieroJugar.equals("si")){
      System.out.println ("¿Quieres seguir jugando?");
      quieroJugar = ingresar.next ();
    }
  }
}
