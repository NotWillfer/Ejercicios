package unidad2semana2clase4ejercicio1;
import java.util.Scanner;
public class Unidad2Semana2Clase4Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
  int day;
  String dayString;
  System.out.println ("Ingrese el número: ");
  day = entrada.nextInt ();

    switch (day) {
      case 1: dayString = "Lunes";
        break;
      case 2: dayString = "Martes";
        break;
      case 3: dayString = "Miércoles";
        break;
      case 4: dayString = "Jueves";
        break;
      case 5: dayString = "Viernes";
        break;
      case 6: dayString = "Sábado";
        break;
      case 7: dayString = "Domingo";
        break;
      default: dayString = "Día inválido";
        break;
    }
    System.out.println (dayString);
  }
}
