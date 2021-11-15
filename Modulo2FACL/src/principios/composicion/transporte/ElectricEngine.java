package principios.composicion.transporte;

public class ElectricEngine extends Engine
{
    @Override
    public void move()
    {
        System.out.println("Moving whith electric energy");
    }
}
