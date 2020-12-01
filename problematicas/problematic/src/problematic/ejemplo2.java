/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problematic;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Smart
 */
public class ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaReporte = "";
        String nombreJugador;
        String posicionCampo;
        double estatura;
        int edad;
        boolean bandera = true;
        String salir;
        double sumaEdades = 0;
        double sumaEstaturas = 0.0;
        int contadorIteraciones = 0;
        double promedioEdad;
        double promedioEstatura;
        String edades = "";
        cadenaReporte = String.format("%s%s\n", cadenaReporte, 
                "Listado de Jugadores");

        do {
            System.out.println("Ingrese el nombre del Jugador: ");
            nombreJugador = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo: ");
            posicionCampo = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador: ");
            estatura = entrada.nextDouble();


            sumaEdades = sumaEdades + edad;

            sumaEstaturas = sumaEstaturas + estatura;

            contadorIteraciones = contadorIteraciones + 1;


            cadenaReporte = String.format("%s%d. %s -%s-, edad %d,  "
                    + "estatura %.2f\n",
                    cadenaReporte,
                    contadorIteraciones,
                    nombreJugador,
                    posicionCampo,
                    edad,
                    estatura);

            edades = String.format("%s%s\n", edades,edad);

            entrada.nextLine();
            System.out.println("Desea salir del ciclo; digite: si");
            salir = entrada.nextLine();
            if(salir.equals("si")){
                bandera = false;
            }
        } while (bandera);

        promedioEdad =(double) sumaEdades/contadorIteraciones;
        promedioEstatura = sumaEstaturas/contadorIteraciones;
         cadenaReporte = String.format("%sListado de edades:\n%s", 
                cadenaReporte,edades);

        cadenaReporte = String.format("%sPromedio de edades: %s\n", 
                cadenaReporte, promedioEdad);

        cadenaReporte = String.format("%sPromedio de estaturas: %.2f\n", 
                cadenaReporte, promedioEstatura);
        System.out.printf("%s\n", cadenaReporte);


    }

}