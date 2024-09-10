/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_14_califas;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA1_14_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cali;
        Scanner captu;
        captu = new Scanner(System.in);
        
        System.out.println("Captura tu calificacion del 0 al 100 :");
        cali = captu.nextInt();
        
        if (cali >= 70){
            System.out.println("Tu calificacion es aprobatoria");
        }else{
            System.out.println("NA");
        }
    }
    
}
