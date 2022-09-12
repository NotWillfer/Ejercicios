package unidad2semana1clase1ejercicio1;
import java.util.Scanner;
public class Unidad2Semana1Clase1Ejercicio1 {

    public static void main(String[] args) {
        int categoria;
        double sueldo, nsueldo;
      
        Scanner Entrada = new Scanner (System.in);
        System.out.println("Ingrese 1 para la categoria de 0.15");
        System.out.println("Ingrese 2 para la categoria de 0.1");
        System.out.println("Ingrese 3 para la categoria de 0.08");
        System.out.println("Ingrese 4 para la categoria de 0.07");
        System.out.println("Ingrese el numero de la categoria: ");
        categoria = Entrada.nextInt();
        System.out.println("Ingrese el sueldo: ");
        sueldo = Entrada.nextDouble();
        
        if (sueldo > 0){
        switch (categoria){
            case 1:{
                nsueldo = sueldo + (sueldo * 0.15);
                 System.out.println("El nuevo salario es: " + nsueldo);
            break;
           }
            case 2:{
            nsueldo = sueldo + (sueldo * 0.1); 
                System.out.println("El nuevo sueldo es: " + nsueldo);
                break; 
            }
            case 3:{
            nsueldo = sueldo + (sueldo * 0.08);
                System.out.println("El nuevo sueldo es " + nsueldo);
            break;
            }
            case 4:{
            nsueldo = sueldo + (sueldo * 0.07);
                System.out.println("El nuevo sueldo es: " + nsueldo);
            break;
            }
            default :{
                System.out.println("categoria invalida");
                break; 
            }
        }
        }
        else {
            System.out.println("El sueldo debe ser mayor que cero");
        }
               
    }
    
}