package patrones.creacional.metodoFabrica.botone;

public class VentanaMac extends Ventana{
	public Boton crearBoton() {
		return new BotonMac();
	}
}
