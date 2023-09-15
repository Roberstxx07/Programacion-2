
//pactica1//

public class Computadora { // se cambió "privado" a "público"//

	int discoDuro;
	float velocidadProcesador; //se cambio el tipo de variable//
	Par computador;
	Sistema de cuerdas Operativo;
	nombre de cadena;
	Cadena[] memoria; // se movió "String[] memoria" fuera del constructor//

	public Computadora(String nombreEquipo) { //  cambio a "public Computadora"//
		discoDuro = 640;
		velocidadProcesador = 3.1f; // se cambió "3.1" a "3.1f" para indicar que es un número flotante//
		sistemaOperativo = "Microsoft Windows 7";
		nombre = nombreEquipo;
		memoria = nueva cadena[10]; // Inicializa  "memoria" con un nuevo array de String//
	}

	public void encender() {
		JOptionPane.showMessageDialog(null, nombre + ": Iniciando Windows...");
		memoria[0] = sistemaOperativo;
		JOptionPane.showMessageDialog(null, nombre + ":Bienvenido");
	}

	public boolean ejecutar(String programa, int posicion) {
		si (posicion != 0) {
			memoria[posicion] = programa;
			JOptionPane.showMessageDialog(null, nombre + ": Ejecutando el programa " + programa);
			devolver verdadero;
		}
		falso retorno; // se le agregó un return false para cubrir todos los casos//
	}

	public void recibirDatos(String mensaje) {
		JOptionPane.showMessageDialog(null, peer.nombre + "dice:" + mensaje);
	}

	public int enviarDatos() { // Cambiado "void" a "int" y eliminado el "return 0;"//
		peer.recibirDatos(JOptionPane.showInputDialog("Escribe el dato a enviar"));
		devolver 0;
	}

	public void conectar(Computadora c) {
		este.par = c;
		c.peer = esto;
		JOptionPane.showMessageDialog(null, nombre + ": Conectado a " + peer.nombre);
	}

	public void desconectar() {
		JOptionPane.showMessageDialog(null, nombre + ": Desconectado de " + peer.nombre);
		par.peer = nulo;
		this.peer = nulo;
	}

	vacío público apagar() {
		JOptionPane.showMessageDialog(null, "Cerrando sesión...");
		para (int i = 1; i < 11; i++) {
			memoria[i] = nulo;
		}
		JOptionPane.showMessageDialog(null, nombre + ": Windows se está cerrando");
		memoria[0] = nulo;
	}

	vacío estático público aumentarDiscoDuro() {
		// Cambiado el método "aumentarDiscoDuro" a no estático y corregido el error en el acceso a "discoDuro"//
		discoDuro = 1000;
	}

	público estático vacío principal (String [] argumentos) {
		Computadora portatil = nueva Computadora("Laptop");
		portátil.encender();
		laptop.ejecutar("Windows Live Messenger", 1);

		Computadora tableta = nueva Computadora("Tableta");
		tableta.encender();
		tablet.ejecutar("Windows Live Messenger", 1);

		laptop.conectar(tableta);
		laptop.enviarDatos();
		laptop.desconectar();

		tableta.apagar();
		laptop.apagar();
	}
}