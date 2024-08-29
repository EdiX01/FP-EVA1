

package eva1_7_captura_auto;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA1_7_CAPTURA_AUTO {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //VEHICULOS
        String marca;
        String modelo;
        int year; //la ñ en otros lenguajes no es aceptada
        double precio;
        Scanner captu;
        captu = new Scanner(System.in);
        
        //CAPTURAR
        System.out.println("Captura la marca: ");
        marca = captu.nextLine();
        System.out.println("Captura el modelo: ");
        modelo =captu.nextLine();
        System.out.println("Captura el año: ");
        year = captu.nextInt();
        System.out.println("Captura el precio: ");
        precio = captu.nextDouble();
        
        System.out.println("Datos del automovil: ");
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(year);
        System.out.println(precio);
    }
    
}
