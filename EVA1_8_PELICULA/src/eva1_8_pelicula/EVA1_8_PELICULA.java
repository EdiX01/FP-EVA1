/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_8_pelicula;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_8_PELICULA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nombre;
        String Genero;
        int Duracion;
        String Reparto;
        String Clasificacion;
        Scanner captu;
        captu = new Scanner(System.in);

        System.out.println("Captura el nombre de la pelicula: ");
        Nombre = captu.nextLine();
        System.out.println("Captura el genero de la pelicula: ");
        Genero = captu.nextLine();
        System.out.println("Captura la duracion en segundos de la pelicula: ");
        Duracion = captu.nextInt();
        captu.nextLine();
        //captu.nextLine(); //Solo cuando hay problemas con el enter del Int
        System.out.println("Captura el reparto de la pelicula: ");
        Reparto = captu.nextLine();
        System.out.println("Captura la clasificacion de la pelicula: ");
        Clasificacion = captu.nextLine();
        
        System.out.println("Captura de datos");
        System.out.println(Nombre);
        System.out.println(Genero);
        System.out.println(Duracion);
        System.out.println(Reparto);
        System.out.println(Clasificacion);
        
    }
    
}
