package patrones.creacional.metodoFabrica.logistica;

public class Airplane implements Transport
{
    public void deliver()
    {
        System.out.println("Delivering by air in an envelope.");
    }
}
