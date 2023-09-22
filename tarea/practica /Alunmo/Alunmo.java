package Alumno;

class Alumno {
    private String nombre;
    private String carrera;
    private String matricula;
    private String grado;
    private String grupo;
    private Tutor tutor;

    public Alumno() {
        // Constructor vacío
    }

    public Alumno(String nombre, String carrera, String matricula, String grado, String grupo, Tutor tutor) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.matricula = matricula;
        this.grado = grado;
        this.grupo = grupo;
        this.tutor = tutor;
    }

    public Tutor getTutor() {
        return tutor;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Carrera: " + carrera + ", Matrícula: " + matricula + ", Grado: " + grado + ", Grupo: " + grupo + "\n" + tutor.toString();
    }
public static void main(String[] args) {
        Telefono telefonoTutor = new Telefono("+52", "981", "111-3777");
        Tutor tutor = new Tutor("Maria", 39, telefonoTutor);
        Alumno pepito = new Alumno("Roberto", "ISC", "71315", "3ro", "B", tutor);

        System.out.println(Robert.toString());
    }
}
