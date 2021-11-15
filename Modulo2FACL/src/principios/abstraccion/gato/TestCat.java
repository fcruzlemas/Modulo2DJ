package principios.abstraccion.gato;

import java.util.Date;

public class TestCat
{
    public static void main(String[] args) {
    	
        Cat topCat = new Cat("topCat");
        Date expiration = new Date();
        Kibble kibble = new Kibble(5.2, "medium", expiration);
        Sausage sausage = new Sausage(2.3, "medium", expiration);

        System.out.println("Top Cat no ha comido: " + topCat.getEnergy());
        topCat.eat(kibble);
        topCat.eat(sausage);
        System.out.println("Top Cat ya ha comido: " + topCat.getEnergy());
    }
}
