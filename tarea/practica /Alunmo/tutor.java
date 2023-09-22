package Alumno;

class Tutor {
    private String nombre;
    private int edad;
    private Telefono telefono;

    public Tutor(String nombre, int edad, Telefono telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Tutor: " + nombre + ", Edad: " + edad + ", " + telefono.toString();
    }
}
