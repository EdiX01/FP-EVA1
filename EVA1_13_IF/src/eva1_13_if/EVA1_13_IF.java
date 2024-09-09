/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_13_if;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CAPTUREN LA EDAD
        int edad;
        Scanner captu;
        captu = new Scanner(System.in);
        
        System.out.println("Capture su edad: ");
        edad = captu.nextInt();
        
        //INSTRUCCION IF
        //SI ALGO SE CUMPLE ES VERDADERO
        // QUE HAGO SI SE CUMPLE
        //SI NO SE CUMPLE (OPCIONAL) ES FALSO
        // QUE HAGO SI NO SE CUMPLE
        
        if (edad >= 18){ //BLOQUE DE VERDADERO
            //aqui van las instrucciones si la evaluacion es verdadero
        System.out.println("Eres mayor de edad");
        }else{ //BLOQUE DE FALSO
            System.out.println("Eres menor de edad");
        }
        
    }
    
}
