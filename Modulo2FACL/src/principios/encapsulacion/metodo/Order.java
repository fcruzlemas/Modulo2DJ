package principios.encapsulacion.metodo;

import java.util.ArrayList;

public class Order {
    private ArrayList<Item> items = new ArrayList<>();
    private String country;

    public Order(String country) {
        this.country = country;
    }

    public double getTotal() {
        double total = 0;

        for (Item item: items) {
            total += item.getPrice() * item.getQuantity();
        }

        total += total * getTaxRate(this.country);

        return total;
    }
    
    public double getTaxRate(String country) {
    	
    	double impuesto = 0;
    	
    	switch(country) {
    		case "MX":
    			impuesto = 0.16;
    			break;
    		case "US":
    			impuesto = 0.07;
    			break;
    		case "EU":
    			System.out.println("Estre aqui");
    			impuesto = 0.20;
    			break;
    		case "JP":
    			impuesto = 0.10;
    			break;
    		default:
    			impuesto = 0.0;
    			break;
    	}
    	return impuesto;
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
