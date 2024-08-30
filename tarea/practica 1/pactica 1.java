
//pactica1//

import javax.swing.JOptionPane;

public class Computadora {
    
    int discoDuro;
    float velocidadProcesador;
    Computadora peer;
    String sistemaOperativo;
    String nombre;
    String[] memoria; // Mover la declaración aquí para que sea accesible en toda la clase

    public Computadora(String nombreEquipo) {
        discoDuro = 640;
        velocidadProcesador = 3.1f;
        sistemaOperativo = "Microsoft Windows 7";
        nombre = nombreEquipo;
        memoria = new String[10];
    }

    public void encender() {
        JOptionPane.showMessageDialog(null, nombre + ": Iniciando Windows...");
        memoria[0] = sistemaOperativo;
        JOptionPane.showMessageDialog(null, nombre + ": Bienvenido");
    }

    public boolean ejecutar(String programa, int posicion) {
        if (posicion >= 0 && posicion < memoria.length) { // Verificar posición válida
            memoria[posicion] = programa;
            JOptionPane.showMessageDialog(null, nombre + ": Ejecutando el programa " + programa);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, nombre + ": Posición inválida");
            return false;
        }
    }

    public void recibirDatos(String mensaje) {
        if (peer != null) {
            JOptionPane.showMessageDialog(null, peer.nombre + " dice: " + mensaje);
        } else {
            JOptionPane.showMessageDialog(null, "No hay una computadora conectada");
        }
    }

    public void enviarDatos() {
        if (peer != null) {
            String dato = JOptionPane.showInputDialog("Escribe el dato a enviar");
            peer.recibirDatos(dato);
        } else {
            JOptionPane.showMessageDialog(null, "No hay una computadora conectada para enviar datos");
        }
    }

    public void conectar(Computadora c) {
        this.peer = c;
        c.peer = this;
        JOptionPane.showMessageDialog(null, nombre + ": Conectado a " + peer.nombre);
    }

    public void desconectar() {
        if (peer != null) {
            JOptionPane.showMessageDialog(null, nombre + ": Desconectado de " + peer.nombre);
            peer.peer = null;
            this.peer = null;
        } else {
            JOptionPane.showMessageDialog(null, "No hay una computadora conectada para desconectar");
        }
    }

    public void apagar() {
        JOptionPane.showMessageDialog(null, "Cerrando sesión...");
        for (int i = 1; i < memoria.length; i++) {
            memoria[i] = null;
        }
        JOptionPane.showMessageDialog(null, nombre + ": Windows se está cerrando");
        memoria[0] = null;
    }

    public void aumentarDiscoDuro(int nuevoTamano) {
        discoDuro = nuevoTamano;
    }

    public static void main(String[] args) {
        Computadora laptop = new Computadora("Laptop");
        laptop.encender();
        laptop.ejecutar("Windows Live Messenger", 1);

        Computadora tablet = new Computadora("Tablet");
        tablet.encender();
        tablet.ejecutar("Windows Live Messenger", 1);

        laptop.conectar(tablet);
        laptop.enviarDatos();
        laptop.desconectar();

        tablet.apagar();
        laptop.apagar();
    }
}
