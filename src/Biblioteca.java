import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {

    private static ArrayList<Libro> libros = new ArrayList<>();

    public static void registrarLibro() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del libro:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el autor del libro:");
        String autor = sc.nextLine();

        Libro libro = new Libro(nombre, autor);
        libros.add(libro);

        System.out.println("Libro registrado correctamente ✔");
    }

    public static void listarLibros() {

        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados.");
            return;
        }

        for (Libro l : libros) {
            System.out.println(l);
        }
    }



}