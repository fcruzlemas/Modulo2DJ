package principios.abstraccion.gato;

import java.util.Date;

public class Kibble implements Food{
    private double nutrition;
    private String size;
    private Date expiration;

    public Kibble(double nutrition, String size, Date expiration)
    {
        this.nutrition = nutrition;
        this.size = size;
        this.expiration = expiration;
    }

    public double getNutrition()
    {
        return nutrition;
    }

    public void setNutrition(double nutrition)
    {
        this.nutrition = nutrition;
    }

    public String getSize()
    {
        return size;
    }

    public void setColour(String size)
    {
        this.size = size;
    }

    public Date getExpiration()
    {
        return expiration;
    }

    public void setExpiration(Date expiration)
    {
        this.expiration = expiration;
    }
}
