package principios.composicion.transporte;

public class Human implements Driver
{
    @Override
    public void navigate()
    {
        System.out.println("Human Drive");
    }
}
