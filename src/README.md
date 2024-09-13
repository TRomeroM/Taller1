Sistema de Gestión de Biblioteca


Este proyecto es un sistema básico un sistema de gestión de una biblioteca en Java, en el que se aplican los principios
de Programación Orientada a Objetos. Este sistema permite que el bibliotecario pueda prestar y devolver libros a los usuarios.

Funciona de la siguiente manera:

Se crea una clase base abstracta llamada Persona, que tiene los atributos nombre, apellido, y un método abstracto mostrarDatos().
Luego se crean dos clases que hereden de Persona:

■ Usuario: representa a los clientes que pueden pedir préstamos de libros.

Atributos:

    idUsuario: Identificador único del usuario.
    librosPrestados: Número de libros prestados actualmente.

Métodos:

    incrementarLibrosPrestados(): Incrementa el número de libros prestados.
    decrementarLibrosPrestados(): Decrementa el número de libros prestados.
    mostrarDatos(): Muestra los datos del usuario.

■ Bibliotecario : representa al empleado que gestiona el
sistema).

Atributos:

    idEmpleado: Identificador único del bibliotecario.

Métodos:

    prestarLibro(): Permite prestar un libro a un usuario.
    devolverLibro(): Permite que el usuario devuelva un libro.

En ambas clases se implementa el método mostrarDatos() de tal manera que se puede visualizar información personalizada dependiendo de si es un Usuario o un
Bibliotecario.

■Por otro lado, se crea una clase Libro que tiene los atributos privados titulo, autor, isbn y disponible (booleano).
Se implementan los métodos get y set para todos los atributos y se crean métodos adicionales como prestar() y devolver(), los cuales
cambian el estado de disponibilidad del libro, validando si el libro está disponible o no.


■ Se sobrecarga el método prestar() en la clase Bibliotecario para que
pueda recibir un Usuario como parámetro, registrando qué usuario solicitó el libro, este método sirve para validar si el Usuario ya tiene el
máximo de préstamos permitidos, que en este caso son 3 libros.


■ Se crea una interfaz Gestionable que contiene los métodos prestarLibro() y devolverLibro() y luego se implementa esta interfaz en la clase Bibliotecario, con el fin de  definir la
lógica para gestionar los préstamos y devoluciones de libros.

■ Por último se crea un método main que simula el proceso de gestión del sistema de biblioteca.


Este archivo README.md proporciona una descripción del proyecto y de cómo funciona. ¡Espero que sea útil!