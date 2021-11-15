package principios.composicion.transporte;

public class TestTransport
{
    public static void main(String[] args) {
        Engine engine = new ElectricEngine();
        Driver driver = new Robot();
        Engine fusionEngine = new FusionEngine();
        Robot bender = new Robot();
        Engine electricEngine = new ElectricEngine();

        Transport transport = new Transport(engine, driver);
        transport.deliver("Merida", "Libros");

        Transport transport2 = new Transport(fusionEngine, driver);
        transport2.deliver("Merida", "Libros");
        
        Transport transport3 = new Transport(electricEngine, bender);
        transport3 .deliver("pizza","Nueva Nueva York");
    }
}
