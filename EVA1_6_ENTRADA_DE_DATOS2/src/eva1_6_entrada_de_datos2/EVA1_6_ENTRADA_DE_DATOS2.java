/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_6_entrada_de_datos2;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_6_ENTRADA_DE_DATOS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARACION DE VARIABLES
        String nombre;
        String curp;
        int edad;
        double promedio;
        //CREAR NUESTRO SCANNER
        Scanner captu;
        captu = new Scanner (System.in);
        
        //CAPTURAR:
        System.out.println("Captura tu nombre completo: ");
        nombre = captu.nextLine();
        System.out.println("Captura tu curp: ");
        curp = captu.nextLine();
        System.out.println("Captura la edad: ");
        edad = captu.nextInt();
        System.out.println("Captura el promedio");
        promedio = captu.nextDouble();
        
        //IMPRESION:
        System.out.println("SELECCION DE IMPRESION DE DATOS: ");
        System.out.println(nombre);
        System.out.println(curp);
        System.out.println(edad);
        System.out.println(promedio);
        
    }
    
}
