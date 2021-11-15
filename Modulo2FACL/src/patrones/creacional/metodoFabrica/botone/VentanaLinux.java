package patrones.creacional.metodoFabrica.botone;

public class VentanaLinux extends Ventana{
	public Boton crearBoton() {
		return new BotonLinux();
	}
}
