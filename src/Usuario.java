public class Usuario extends Persona{
    private int idUsuario;
    private int librosPrestados;// Cantidad de libros prestados

    //Constructor
    public Usuario (String nombre, String apellido, int idUsuario) {
        super(nombre, apellido);
        this.idUsuario = idUsuario;
        this.librosPrestados = 0;
    }
    public int getLibrosPrestados() {
        return librosPrestados;
    }
    public void incrementarLibrosPrestados() {
        this.librosPrestados++;

    }
    public void decrementarLibrosPrestados() {
        this.librosPrestados--;
    }
    // Implementación del método mostrarDatos()
    @Override
    public void mostrarDatos() {

        System.out.println("Usuario: " + nombre + " " + apellido);
        System.out.println("ID de Usuario: " + idUsuario);
        System.out.println("Libros prestados: " + librosPrestados);
    }

}
