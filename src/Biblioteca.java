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

    public static void buscarLibro() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del libro a buscar:");
        String nombre = sc.nextLine();

        for (Libro l : libros) {
            if (l.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Encontrado: " + l);
                return;
            }else {
                System.out.println("libro no encontrado ingrese nombre correcto");
            }
        }

    }
}