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
public class ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   int aumento = 3;
        int contador = 2;
        String cadena = "";
        while(contador<=37){ //2<=37 | verdadero kl
            cadena=String.format("%s%s ",cadena,contador);
            contador+=aumento; //contador<-- 2 +=3
            aumento+=2;
        }
        System.out.printf("%s", cadena);
    }

}