package mates;
// importar generador de números aleatorios desde java .uitl libarys
import java.util.Random;


public class Matematicas{
    /**
     * * Genera una aproximación al número Pi mediante el método de
     * * Montecarlo. El parámetro `pasos` indica el número de puntos
     * * generado.
     * */

    public static double generarNumeroPiIterativo(long pasos){

    // init Radom instancia
         Random rand = new Random(); 

    // crear contador para realizar un seguimiento de los puntos internos
        int points_inside_circle = 0;
        // crear bucle para crear tantas coordenadas x e y aleatorias como lo soliciten los "pasos" 
        
        for (int i = 0; i < pasos; i++) {
            double x = rand.nextDouble();
            double y = rand.nextDouble();

            //valida si xey están dentro o fuera de las bases en los cálculos de monte carlo
            if (x * x + y * y <= 1){
                points_inside_circle ++;

            }


         }
         // calcula el pastel aproximado multiplicando por el resto de los cuadrantes
         double aprox_pi= 4.0*(points_inside_circle/pasos);

    
         // devuelve el valor de o pastel aporx
        return aprox_pi;
    }
}
