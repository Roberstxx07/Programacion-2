package Alumno;

class Telefono {
    private String pais;
    private String lada;
    private String numero;

    public Telefono(String pais, String lada, String numero) {
        this.pais = pais;
        this.lada = lada;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Teléfono: " + pais + " " + lada + " " + numero;
    }
}
