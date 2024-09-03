/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_10_operaciones2;

/**
 *
 * @author invitado
 */
public class EVA1_10_OPERACIONES2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONCATENACION CADENAS:
        //OPERADOR DE CONCATENACION +
        //Mismo simbolo con diferentes usos:
        //sobrecarga de operadores
        String nombre = "Carlos";
        String apellido = "Gobea";
        String nomComp;
        //concatenar: unir cadenas de texto
        nomComp = nombre + " " + apellido;
        //imprimir los datos:
        System.out.println("Nombre del usuario: "+nombre);
        System.out.println("Apellido del usuario: "+apellido);
        System.out.println("Nombre completo del usuario: "+nomComp);
    }
    
}
