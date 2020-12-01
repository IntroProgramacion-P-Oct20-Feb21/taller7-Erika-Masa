/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problematic;

/**
 *
 * @author Smart
 */
public class ejemplo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int contador = 1;
        int numerador = 1;
        int denominador = 1;
        double divicion;
        double diviciones = 0;
        String cadena = "";
        while (denominador <= 15) {
            divicion = numerador / denominador;
            if ((contador % 2) == 0) {

                cadena = String.format("%s-%s/%s ", cadena, numerador, denominador);
                diviciones = divicion;

            } else {
                cadena = String.format("%s+%s/%s ", cadena, numerador, denominador);
                diviciones += divicion;
            
            contador += 1;
            denominador += 2;
       cadena = String.format("%s\nResultado: %s", cadena, diviciones);
      
        System.out.println(cadena );
    }
   }
        
      }  
}   

        
        