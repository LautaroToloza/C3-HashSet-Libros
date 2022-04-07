package ar.com.lautaro.test;

import ar.com.lautaro.interfaz.IPromedioTres;
import java.util.Random;

/**
 * @author Lautaro Toloza
 */
public class testPromedio {

    public static void main(String[] args) {

        /*
        Crear una interfaces promedioTres
        que tiene como metodo promedio 
        retornar un double que va a ser el proemdio de las 3 notas que recibe 
        generar en una clase principal 
        un metodo estatico que utilze un lambda de la interfaz promedioTres
        y el metodo sea un void que muestre el  promedio final
        las 3 notas se cargan aleotarias 
        hay que mostrar las 3 notas  
         */
        Random r1 = new Random();
        promedioFinal(r1.nextInt(1, 11), r1.nextInt(1, 11), r1.nextInt(1, 11));

    }

    private static void promedioFinal(int n1, int n2, int n3) {
//        IPromedioTres promedio = new IPromedioTres(){};
        IPromedioTres promedio = (x, y, z) -> ((double) x + y + z) / 3;

//        return (n1+n2+n3)/3;
        System.out.println("Nota 1: " + n1 + "\n" + "Nota 2: " + n2 + "\n" + "Nota 3: " + n3);
        // nombreVariableInterfaz.nombreMetodoInterfaz
        System.out.println("El promedio final: " + promedio.promedio(n1, n2, n3));
    }
}
