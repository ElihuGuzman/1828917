
package senasalud;

import java.util.Scanner;

public class SENASalud {

    
    public static void main(String[] args) {
        
        String Nomb,Apel,Edad,DinoFav;
        Scanner nombre = new Scanner (System.in);
        System.out.println("Indique su nombre");
        Nomb = nombre.next();
        System.out.println("Su nombre es: "+Nomb);
        
        Scanner apellido = new Scanner (System.in);
        System.out.println("Indique su apellido");
        Apel = apellido.next();
        System.out.println("Su apellido es: "+Apel);
        
        Scanner edad = new Scanner (System.in);
        System.out.println("Indique su edad");
        Edad = apellido.next();
        System.out.println("Su edad es: "+Edad);
        
        Scanner dinof = new Scanner (System.in);
        System.out.println("Indique su dinosaurio favorito");
        DinoFav = apellido.next();
        System.out.println("Su dinosaurio favorito es: "+DinoFav);
    }
    
}
        
