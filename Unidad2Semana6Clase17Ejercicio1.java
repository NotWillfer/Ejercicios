package unidad2semana6clase17ejercicio1;
import java.util.Scanner;
public class Unidad2Semana6Clase17Ejercicio1 {
    public static void main(String[] args) {
        Scanner Ingresar = new Scanner (System.in);
        int n1, n2, resultado , opcion;
        System.out.println("Ingrese el primer numero: ");
        n1 = Ingresar.nextInt();
        System.out.println("Ingresar el segundo numero: ");
        n2 = Ingresar.nextInt();
        System.out.println("+++++ Menú de opciones +++++ ");
        System.out.println(" Para sumar los dos numeros digite 1");
        System.out.println("Para restar los dos numeros digite 2");
        System.out.println("Para elevarlos al cuadrado digite 3");
        System.out.println("Para multiplicarlos digite 4");
     opcion = Ingresar.nextInt();
     
     switch(opcion){
         case 1:{
             resultado = n1 + n2;
             System.out.println("El resultado de la suma es:"+ resultado);
        break;
        }
         case 2:{
             resultado = n1 - n2;
             System.out.println("El resultado de la resta es: "+ resultado);
             break;
        }
         case 3:{
             System.out.println("El resultado de elevar al cuadrado"+ n1 +"es"+ Math.pow(n1, 2));
             System.out.println("El resultado de elevar al ucadrado"+ n2 +"es"+ Math.pow(n2, 2));
             break;      
       }
         case 4:{
             resultado = n1 * n2;
             System.out.println("El resultado de multiplicarlos es: "+ resultado);
            }
         default:{
             System.out.println("Seleccione una opcion correcta");
         break;
         }
     }
     
    }
    
}
