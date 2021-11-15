package principios.encapsulacion.clase;

public class TestOrder {
    public static void main(String[] args) {
        Item funkoPopMarx = new Item(1, 569.90, 2);
        Item funkoPopHegel = new Item(2, 450.50, 3);
        Item videoGame05 = new Item(3,1350,1); 

        Order order = new Order("MX");
        order.addItem(funkoPopMarx);
        order.addItem(funkoPopHegel);
        order.addItem(videoGame05);

        System.out.println("Total a pagar en MX: " + order.getTotal());

        order.setCountry("US");
        System.out.println("Total a pagar en US: " + order.getTotal());

        order.setCountry("EU");
        System.out.println("Total a pagar en EU: " + order.getTotal());
        
        order.setCountry("JP");
        System.out.println("Total a pagar en Japón: " + order.getTotal());
        
        order.setCountry("AR"); //otro país que no esta registrado
        System.out.println("Total a pagar en otro país: " + order.getTotal());
    }
}
