import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<String> listaLibros;

    public Biblioteca() {
        this.listaLibros = new ArrayList<>();

        this.listaLibros.add("Clean Code");
        this.listaLibros.add("Java Basico");
        this.listaLibros.add("Estructuras de Datos");
    }

    public int contarLibros() {
        return this.listaLibros.size();
    }

    public void listarLibros() {
        if (this.listaLibros.isEmpty()) {
            System.out.println("La biblioteca no tiene libros registrados.");
        } else {
            System.out.println("Listado de libros:");
            for (String libro : this.listaLibros) {
                System.out.println("- " + libro);
            }
        }
    }
}