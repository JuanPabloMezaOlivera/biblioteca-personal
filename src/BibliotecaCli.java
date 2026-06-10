import java.util.Scanner;

public class BibliotecaCli {
    private Biblioteca biblioteca;
    private Scanner scanner;

    public BibliotecaCli() {
        this.biblioteca = new Biblioteca();
        this.scanner = new Scanner(System.in);
    }

    public void iniciar() {
        int opcion = 0;
        do {
            System.out.println("\n=== Biblioteca Personal ===");
            System.out.println("1. Registrar libro");
            System.out.println("2. Buscar libro");
            System.out.println("3. Contar libros");
            System.out.println("4. Listar libros");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.println("Opcion 1 - Registrar (Por implementar por Integrante 1).");
                        break;
                    case 2:
                        System.out.println("Opcion 2 - Buscar (Por implementar por Integrante 2).");
                        break;
                    case 3:
                        System.out.println("Total de libros registrados: " + biblioteca.contarLibros());
                        break;
                    case 4:
                        biblioteca.listarLibros();
                        break;
                    case 5:
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opcion no valida. Intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor, ingrese un numero entero.");
            }
        } while (opcion != 5);
    }
}