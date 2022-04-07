package ar.com.lautaro.test;

import ar.com.lautaro.clases.Autos;
import ar.com.lautaro.clases.Motos;
import java.util.*;

public class testVehiculos {

    public static void main(String[] args) {

        // Lista Autos
        System.out.println("Lista autos: \n");
        Set<Autos> auto = new HashSet<>();
        ListaAutos(auto);

        // Lista Motos
        System.out.println("\nLista Motos:\n");
        Set<Motos> moto = new HashSet<>();
        ListaMotos(moto);
    }

    public static void ListaAutos(Set auto) {
        auto.add(new Autos(20059, "ARG79"));
        auto.add(new Autos(50507, "HIJ93"));
        auto.add(new Autos(50507, "HIJ93"));
        auto.add(new Autos(19348, "LTT21"));
        auto.add(new Autos(20059, "ARG79"));
        auto.add(new Autos(20060, "ARG79"));
        auto.add(new Autos(20059, "ARG79"));
        // Muestra lista..
        auto.forEach((a) -> System.out.println(a));
    }

    public static void ListaMotos(Set moto) {
        // Con el HashCode evitamos la repetición de los datos repetidos,
        // si cambiamos el número de chasis aparecera nuevamente.
        moto.add(new Motos(5091, "FRM23"));
        moto.add(new Motos(3007, "MLA23"));
        moto.add(new Motos(2893, "JLM23"));
        moto.add(new Motos(5095, "FRM23"));
        moto.add(new Motos(5091, "FRM23"));
        moto.add(new Motos(3017, "MLA23"));
        moto.add(new Motos(3007, "MLA23"));
        // Muestra lista...
        moto.forEach((m) -> System.out.println(m));
    }
}
