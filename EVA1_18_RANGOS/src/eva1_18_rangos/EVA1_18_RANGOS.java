/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_rangos;
import java.util.Scanner;

/**
 *
 * @author EdiX
 */
public class EVA1_18_RANGOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int Cali;
        System.out.println("Introduce tu calificacion");
        Cali = captu.nextInt();
        
        if(Cali >= 0 && Cali <= 100){
            System.out.println("Calificacion Valida");
            
        }else{
            System.out.println("Calificaion no valida");
        }
    }
    
}
