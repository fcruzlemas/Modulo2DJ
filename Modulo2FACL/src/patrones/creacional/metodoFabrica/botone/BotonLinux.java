package patrones.creacional.metodoFabrica.botone;

public class BotonLinux implements Boton{
	public boolean onClick() {
		System.out.println("Estoy haceindo click Troval");
		return true;
	}
	
	public boolean disable() {
		return false;
		
	}
	
	public boolean enable() {
		return false;
	}
	
}
