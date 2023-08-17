package holamundo;

//@author LC

import java.util.Scanner;



public class HolaMundo {
//debemos definir primero Java
    public static void main(String[] args) {
        // TODO code application logic here
//         System.out.println("Hola mundo desde JAVA");    
         
         Scanner leer = new Scanner(System.in);
         
         System.out.println("Ingresar tu nombre");
         //String nombre = sc.nextLine();
         String nombre = leer.nextLine();
         System.out.println("Hola, bienvenido "+nombre+ ", es un gusto saludarte");
         
         
    }

}
