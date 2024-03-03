package aplicacion;
// importa las matemáticas hechas en la función Matematicas
import mates.Matematicas;

public class Principal{
    public static void main(String[] args){
        System.out.println("El número PI es " +
                Matematicas.generarPiRecursivamente(Integer.parseInt(args[0])));
    }
}
