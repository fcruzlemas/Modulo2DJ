package principios.encapsulacion.clase;

import java.util.ArrayList;

public class Order {
    private ArrayList<Item> items = new ArrayList<>();
    private String country;
    private TaxCalculator cal;

    public Order(String country) {
        this.country = country;
        this.cal = new TaxCalculator();
    }

    public double getTotal() {
        double total = 0;

        for (Item item: items) {
            total += item.getPrice() * item.getQuantity();
        }
        
        total += total * cal.getTaxRate(this.country);

        return total;
    }
    
    public void addItem(Item item) {
        items.add(item);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
