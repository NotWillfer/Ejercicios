package unidad3semana4clase12ejercicio1;
import java.util.Scanner;
public class Unidad3Semana4Clase12Ejercicio1 {

    public static void main(String[] args) {
        Scanner ingresar = new Scanner (System.in);
    int suma = 0, cant = 0, valor, promedio;
    do {
      System.out.println ("Ingrese 0 para salir");
      System.out.println ("Ingrese el valor");
      valor = ingresar.nextInt ();
      if (valor != 0){
        suma = suma + valor;
        cant = cant + 1;
      }
    } while (valor != 0);
    if (cant != 0){
      promedio = suma / cant;
      System.out.println ("El promedio es: "+promedio);
    } else {
      System.out.println ("No se ingresaron valores");
    }
  }
}
