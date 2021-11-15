package patrones.creacional.metodoFabrica.logistica;
import java.util.Scanner;

public class Application
{
    public static void main(String[] args) {
    	
    	Scanner leerDato = new Scanner(System.in);
    	Logistics logistics; 
    	
        System.out.println("Proporciona el tipo de logistica (road/air)");
    	String seleccion = leerDato.nextLine();
    	
    	
    	switch(seleccion) {
    	
    		case("road"): logistics = new RoadLogistics();
            			  logistics.planDelivery();
            			  break;
            			  
    		case("air"):logistics = new AirLogistics();
			  			logistics.planDelivery();
			  			break;
			  			
			default:System.out.println("Unsupported Logistics"); 
    	
    	}
    	leerDato.close();
    }
}
