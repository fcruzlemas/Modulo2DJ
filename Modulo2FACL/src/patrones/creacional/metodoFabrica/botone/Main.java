package patrones.creacional.metodoFabrica.botone;

public class Main {
	public static void main(String[] args) {
		Ventana ventana = new VentanaLinux();
		ventana.dibujar();	
		
		Ventana ventana2 = new VentanaMac();
		ventana2.dibujar();
	}
}
