import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> listaLibros = new ArrayList<>();


    public Biblioteca() {
        listaLibros.add(new Libro("El Coronel no tiene quien le escriba", "Gabriel García Márquez"));
        listaLibros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes"));
    }


    public int obtenerCantidadLibros() {
        return listaLibros.size(); // Solo calcula y retorna el número entero
    }


    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }
}