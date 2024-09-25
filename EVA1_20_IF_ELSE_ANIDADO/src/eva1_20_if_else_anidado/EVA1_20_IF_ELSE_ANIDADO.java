/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_if_else_anidado;
import java.util.Scanner;
/**
 *
 * @author EdiX
 */
public class EVA1_20_IF_ELSE_ANIDADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int DiaSe;
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura el dia de la semana (1 al 7)");
        DiaSe = captu.nextInt();
        captu.nextLine();
        
        if(DiaSe == 1){
            System.out.println("Domingo");
        }else if(DiaSe == 2){
            System.out.println("Lunes");
        }else if(DiaSe == 3){
            System.out.println("Martes");
        }else if(DiaSe == 4){
            System.out.println("Miercoles");
        }else if(DiaSe == 5){
            System.out.println("Jueves");
        }else if(DiaSe == 6){
            System.out.println("Viernes");
        }else if(DiaSe == 7){
            System.out.println("Sabado");
        }else{
            System.out.println("Dia no encontrado");
        }
    }
    
}
