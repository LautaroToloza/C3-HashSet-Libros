package ar.com.lautaro.test;

import ar.com.lautaro.clases.Libros;
import java.util.*;

public class testLibros {

    public static void main(String[] args) {
        /*
        Construir la clase libros
        la clase libros debe tener los campos
        String autor
        String titulo
        int ISBN
        testUno:
        Carguen un hashSet con libros sin repeticionies->ISBN int
        testDos:
        Cargen un List con libros Ordenado por autor->Usen lambda
         */

        // Listas Creadas
        Set<Libros> libro = new HashSet<>();
        List<Libros> libro_a = new ArrayList<>();

        // Muestra de resultados
        testUno(libro);
        testDos(libro_a);

    }

    private static void testUno(Set libro) {
        System.out.println("Lista sin repeticiones por ISBN:");
        System.out.println("-------------------------------------------\n");
        libro.add(new Libros("J. K. Rowling", "Harry Potter y la piedra filosofal", 15593));
        libro.add(new Libros("J. K. Rowling", "Harry Potter y la camara secreta", 17969));
        libro.add(new Libros("J. K. Rowling", "Harry Potter y el prisionero de azkaban", 12543));
        libro.add(new Libros("J. K. Rowling", "Harry Potter y la piedra filosofal", 15593));
        libro.add(new Libros("J. K. Rowling", "Harry Potter y el cáliz de fuego", 14793));
        libro.add(new Libros("J. K. Rowling", "Harry Potter y la orden de fenix", 23579));
        libro.add(new Libros("J. K. Rowling", "Harry Potter y la piedra filosofal", 15593));
        libro.add(new Libros("J. K. Rowling", "Harry Potter y el misterio del principe", 19997));
        libro.add(new Libros("J. K. Rowling", "Harry Potter y las reliquias de la muerte", 27049));
        libro.add(new Libros("J. K. Rowling", "Harry Potter y el cáliz de fuego", 14793));
        libro.add(new Libros("J. K. Rowling", "Harry Potter y el cáliz de fuego", 14793));
        libro.forEach((l) -> System.out.println(l));

    }

    private static void testDos(List libro) {
        System.out.println("\nLista ordenada por autor:");
        System.out.println("-------------------------------------------\n");
        libro.add(new Libros("J. K. Rowling", "Harry Potter y la piedra filosofal", 15593));
        libro.add(new Libros("George Orwell", "1984", 21217));
        libro.add(new Libros("Facundo Manes", "El cerebro del futuro", 31903));
        libro.add(new Libros("Walter Sosa Escudero", "Big data", 05046));
        libro.add(new Libros("Hugo Brunetta", "La experiencia del cliente", 15403));
        Collections.sort(libro, (Libros o1, Libros o2) -> o1.getAutor().toLowerCase().compareTo(o2.getAutor().toLowerCase()));
        libro.forEach((l) -> System.out.println(l));
    }
}
