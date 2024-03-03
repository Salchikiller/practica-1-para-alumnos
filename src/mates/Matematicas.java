package mates;

import java.util.Random;

public class Matematicas {

    /**
     * Genera una aproximación al número Pi mediante el método de Montecarlo.
     * El parámetro `pasos` indica el número de puntos generado.
     *
     * @param pasos El número de pasos para generar puntos.
     * @return Una aproximación del número Pi.
     */
    public static double generarPiRecursivamente(long pasos) {
        // Se llama al método auxiliar para generar la aproximación recursivamente
        Random rand = new Random(); // Se crea una instancia de Random
        return generarPiRecursivamenteWorker(pasos, pasos, 0, rand);
    }
    
    /**
     * Método auxiliar que genera recursivamente una aproximación de Pi mediante el método de Montecarlo.
     * 
     * @param pasos El número total de pasos.
     * @param remainingPasos El número de pasos restantes en la recursión.
     * @param puntosDentroCirculo El número de puntos dentro del círculo.
     * @param rand La instancia de Random para generar números aleatorios.
     * @return Una aproximación del número Pi.
     */
    private static double generarPiRecursivamenteWorker(long pasos, long remainingPasos, int puntosDentroCirculo, Random rand) {
        // Si no quedan pasos restantes, se calcula la aproximación de Pi y se devuelve
        if (remainingPasos == 0) {
            return 4.0 * ((double) puntosDentroCirculo / pasos);
        }
    
        // Se generan coordenadas aleatorias x e y
        double x = rand.nextDouble();
        double y = rand.nextDouble();
    
        // Si el punto está dentro del círculo, se incrementa el contador de puntos dentro del círculo
        if (x * x + y * y <= 1) {
            puntosDentroCirculo++;
        }
    
        // Se realiza una llamada recursiva con un paso menos
        return generarPiRecursivamenteWorker(pasos, remainingPasos - 1, puntosDentroCirculo, rand);
    }
}
