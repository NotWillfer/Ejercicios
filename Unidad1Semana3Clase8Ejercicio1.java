package unidad1semana3clase8ejercicio1;
import java.util.Scanner;
public class Unidad1Semana3Clase8Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int numero1;
       int numero2;
       int suma; 
       
        System.out.println("Ingrese el primer numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo nuemro: ");
        numero2 = entrada.nextInt();
        
        suma = numero1 + numero2; 
        System.out.println("El resultado es: " +suma );          
    }
    
}