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
public class Problematic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
     int contador = 2;
       int aumento = 4;
        String cadena= "";
        while (contador <= 100){
         cadena = String.format("%s%s ",cadena,contador);
        contador+=aumento;
        aumento+=2;
        } 
        System.out.printf("%s",cadena);
    }

}
     
    
    
   