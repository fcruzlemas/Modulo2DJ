package patrones.creacional.metodoFabrica.botone;

public class BotonMac implements Boton{

	@Override
	public boolean onClick() {
		System.out.println("Estoy haceindo click Steve");
		return true;
	}

	@Override
	public boolean disable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean enable() {
		// TODO Auto-generated method stub
		return false;
	}

}
