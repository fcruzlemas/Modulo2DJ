package principios.encapsulacion.clase;

public class TaxCalculator {
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
}
