/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosenteros;
import java.util.Scanner;
/**
 *+
 * 
 * @author chuPac
 */
public class NumerosEnteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el 1er numero entero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el 2do numero entero");
        int num2 = leer.nextInt();

        if (num2 > 25 && num1 > 25) {
            System.out.println("Ambos numeros son mayores a 25");
        }
            else if (num1 > 25 || num2 > 25){
            
                System.out.println("Uno de los numeros ingresados es mayor a 25");
            }
            else if (num1 < 25 && num2 < 25){
            
                System.out.println("Ninguno de los numeros es mayor a 25");
            }
        }
        
    }
    
}
