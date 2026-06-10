import java.util.Scanner;

public class BibliotecaCli {


    private Biblioteca biblioteca = new Biblioteca();
    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        int opcion = 0;
        do {
            System.out.println("\n=== MENÚ DE LA BIBLIOTECA ===");
            System.out.println("3. Contar libros");
            System.out.println("5. Salir");
            System.out.print("\nSeleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcion = 0;
            }

            switch (opcion) {
                case 3:

                    int total = biblioteca.obtenerCantidadLibros();
                    System.out.println("\n=== MÓDULO 3: CANTIDAD DE LIBROS ===");
                    System.out.println("Actualmente hay un total de " + total + " libro(s) en la biblioteca.");
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }
}