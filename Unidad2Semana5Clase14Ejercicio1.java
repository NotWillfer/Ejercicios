package unidad2semana5clase14ejercicio1;
import java.util.Scanner;
public class Unidad2Semana5Clase14Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        int numLados;
       
        System.out.println("Número de lados: ");
        numLados = entrada.nextInt();
        
        switch (numLados){
            case 1:
                System.out.println("No hay figura ");
                break;
            case 2:
                System.out.println("No hay figura ");
                break;
            case 3:
                System.out.println("Triangulo ");
                break;
            case 4:
                System.out.println("Cuadrado o rectangulo ");
                break;
            case 5:
                System.out.println("Pentagono ");
        break;
            case 6:
                System.out.println("Hexagono ");
        break;
            case 8:
                System.out.println("Octagono ");
        break;
            default:
                System.out.println("No registrada ");
        }    
    }
}