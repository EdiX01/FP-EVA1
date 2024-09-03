/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_9_operaciones;

/**
 *
 * @author invitado
 */
public class EVA1_9_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OPERACIONES ARITMETICAS
        //inicializacion de una variable
        int x = 10; //declaracion y asignacion
        int y = 5;
        //si necesitan muchas variables:
        int suma, resta, mult, div, pot, raiz;
        //suma y resta
        suma = x + y; //operador de suma +
        System.out.println("La suma de x + y: "+ suma);
        
        resta = x - y;
        System.out.println("Resta de x - y: "+ resta);
        //MULTIPLICACION
        mult = x * y; //operador de multiplicacion *
        System.out.println("La multiplicacion de x * y: "+ mult);
        //DIVISION
        //En Java, las praciones dependen del tipo de dato
        //divides entero, Java da como resultado entero
        div = x / y; //operador de division /
        System.out. println("El resultado de la division de x(10) / y(5): "+div);
        x = 5;
        y = 2;
        System.out.println("Division de x(5) / y (2):"+div);
        
        //division con numero con punto flotante
        double val1 = 5;
        double val2 = 2;
        double resu;
        resu = val1 / val2;
        System.out.println("Division de val1 y val2: "+resu);
    }
    
}
