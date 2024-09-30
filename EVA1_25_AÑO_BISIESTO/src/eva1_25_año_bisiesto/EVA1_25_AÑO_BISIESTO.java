/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_25_año_bisiesto;
import java.util.Scanner;
/**
 *
 * @author EdiX
 */
public class EVA1_25_AÑO_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int year;
        System.out.println("Captura un año: ");
        year = captu.nextInt();
        captu.nextLine();
        
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Bisiesto");
        }else{
            System.out.println("No es bisiesto");
        }
        
    }
    
}
