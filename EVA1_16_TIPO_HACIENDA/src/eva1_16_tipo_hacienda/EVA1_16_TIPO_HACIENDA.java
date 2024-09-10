/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_16_tipo_hacienda;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA1_16_TIPO_HACIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char tipo;
        Scanner captu = new Scanner(System.in);
        System.out.println("Tipo de persona Fisica = F, Moral = M");
        tipo = captu.nextLine().charAt(0);
        System.out.println(tipo);
        
        //Imprimir tipo de persona "" Cadena de texto '' Caracter
        
        if (tipo == 'F'){
            System.out.println ("Persona Fisica");
        }else if (tipo == 'M'){
            System.out.println ("Persona Moral");
        }else{
            System.out.println("Caracter no valido");
        }
        }
    }
    

