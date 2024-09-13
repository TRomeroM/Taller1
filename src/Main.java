import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Crear un Bibliotecario y un Usuario
        Bibliotecario bibliotecario = new Bibliotecario("Laura", "Gómez", 202);
        Usuario usuario1 = new Usuario("Tatiana", "Romero", 101);
        Usuario usuario2 = new Usuario("Carlos", "Martínez", 102);

        // Crear algunos libros
        Libro libro1 = new Libro ("Algebra de Baldor", "Aurelio Baldor", "967854123");
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "987654321");
        Libro libro3 = new Libro("Don Quijote", "Miguel de Cervantes", "567891234");
        Libro libro4 = new Libro("La Odisea", "Homero", "432156789");

        // Lista de libros prestados
        List<Libro> libros = new ArrayList<>();

        // Prestar libros a usuario1
        bibliotecario.prestarLibro(libro1, usuario1);
        libros.add(libro1); // Añadir libro prestado a la lista

        bibliotecario.prestarLibro(libro2, usuario1);
        libros.add(libro2);

        bibliotecario.prestarLibro(libro3, usuario1);
        libros.add(libro3);

        // Intentar prestar un cuarto libro (usuario1 ya tiene 3 préstamos)
        bibliotecario.prestarLibro(libro4, usuario1); // Debería fallar porque ya tiene 3 libros prestados

        // Devolver un libro
        bibliotecario.devolverLibro(libro1, usuario1);
        libros.remove(libro1); // Quitar libro devuelto de la lista

        // Prestar el libro devuelto a usuario2
        bibliotecario.prestarLibro(libro1, usuario2);
        libros.add(libro1); // Añadir libro prestado por usuario2

        // Mostrar los datos de los usuarios
        usuario1.mostrarDatos();
        usuario2.mostrarDatos();

        // Mostrar los datos del bibliotecario
        bibliotecario.mostrarDatos();

        // Contar el total de libros prestados (Programación Orientada a Objetos)
        System.out.println("Total de libros prestados (POO): " + libros.size());

        // Contar el total de libros prestados usando Programación Funcional
        long totalPrestados = libros.stream().filter(libro -> !libro.isDisponible()).count();
        System.out.println("Total de libros prestados (Funcional): " + totalPrestados);
    }
}