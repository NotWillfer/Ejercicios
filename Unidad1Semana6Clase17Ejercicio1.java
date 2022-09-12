package unidad1semana6clase17ejercicio1;
import java.util.Scanner;
public class Unidad1Semana6Clase17Ejercicio1 {
    public static void main(String[] args) {
         String nombre,clave;
 Scanner Entrada = new Scanner (System.in);
  System.out.println("Ingrese el nombre del usuario: ");
  nombre = Entrada.nextLine();
System.out.println("Ingrese clave del usuario: ");
clave = Entrada.nextLine();
if (nombre.equals("Kaily") && clave.equals("123456")){
System.out.println("Bienvenido al Sistema");
 }
else{
 System.out.println("Nombre de usuario o contraseña incorrecto");
        }
    }
}