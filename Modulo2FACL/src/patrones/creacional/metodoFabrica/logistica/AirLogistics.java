package patrones.creacional.metodoFabrica.logistica;

public class AirLogistics extends Logistics
{
    public void planDelivery() {
    Airplane airplane = new Airplane();
    System.out.println("Setting the plan."); ////
    airplane.deliver();
}
}
