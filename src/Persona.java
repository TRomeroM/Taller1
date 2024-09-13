
public abstract class Persona {
    // Atributos encapculados (encapsulation)
    protected  String nombre;
    protected  String apellido;

    //Constructor de Persona
    public Persona (String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Método abstracto
    public abstract void mostrarDatos();
}
