package unidad1semana6clase16ejercicio1;
import java.util.Scanner;
public class Unidad1Semana6Clase16Ejercicio1 {
    public static void main(String[] args) {
     int n1, n2, n3;
     Scanner ordena = new Scanner (System.in);
        System.out.println("Ingrese un número: ");
        n1=ordena.nextInt();
        System.out.println("Ingrese un número: ");
        n2=ordena.nextInt();
        System.out.println("Ingrese un número: ");
        n3=ordena.nextInt();
        if ((n1>n2) && (n2>n3)){
            System.out.println("El orden es: " +n1+ "," + n2 + "," +n3);
        }
        else if ((n1>n3)&&(n3>n2)){
            System.out.println("El orden es: " +n1+ "," +n3+ "," + n2);
        }
        else if ((n2>n1)&&(n1>n3)){
            System.out.println("El orden es: " +n2+ "," +n1+ "," +n3);
        }
        else if ((n2>n3)&&(n3>n1)){
            System.out.println("El orden es: " +n2+ "," +n3+ "," +n1);
        }
        else if ((n3>n2)&&(n2>n1)){
            System.out.println("El orden es: " +n3+ "," +n2+ "," +n1);
        }
        else {
            System.out.println("El orden es: " +n3+ "," +n1+ "," +n2);
        }
        }
    }
    
   