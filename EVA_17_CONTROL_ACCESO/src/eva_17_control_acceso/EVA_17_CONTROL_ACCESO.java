/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva_17_control_acceso;
import java.util.Scanner;
/**
 *
 * @author EdiX
 */
public class EVA_17_CONTROL_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        String Usu, Contra;
        
        System.out.println("Escribe el usuario: ");
        Usu = captu.nextLine();
        System.out.println("Escribe la contraseña: ");
        Contra = captu.nextLine();
        
        if (Usu.equals("Admin") && Contra.equals("1234")){
            System.out.println("Acceso Correcto");
        }else{
            System.out.println("Usuario y/o Contraseña no validos");
        }
        
        
    }
    
}
