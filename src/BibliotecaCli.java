import java.util.Scanner;

public class BibliotecaCli {

    public static void iniciar() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                === Biblioteca Personal ===
                1. Registrar libro
                2. Buscar libro
                3. Contar libros
                4. Listar libros
                5. Salir

                Seleccione una opción: """);

        String entrada = scanner.nextLine();

        while (!entrada.equals("1")
                && !entrada.equals("2")
                && !entrada.equals("3")
                && !entrada.equals("4")
                && !entrada.equals("5")) {

            System.out.print("Ingrese una opción válida: ");
            entrada = scanner.nextLine();
        }

        int opcion = Integer.parseInt(entrada);

        switch (opcion) {
            case 1:
                System.out.println("Registrar libro");
                break;
            case 2:
                System.out.println("Buscar libro");
                break;
            case 3:
                System.out.println("Contar libros");
                break;
            case 4:
                System.out.println("Listar libros");
                break;
            case 5:
                System.out.println("Saliendo...");
                break;
        }

        scanner.close();
    }
}