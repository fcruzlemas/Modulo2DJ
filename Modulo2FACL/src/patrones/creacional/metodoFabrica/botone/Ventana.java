package patrones.creacional.metodoFabrica.botone;

public abstract class Ventana {
	public abstract Boton crearBoton();
	
	public String dibujar() {
		Boton boton = crearBoton();
		boton.onClick();
		
		return "Crea un Boton";
	}
}
