package principios.solid.inversionDeDependencia;

public class MongoDB implements Database{
	   MySQLConnection connection;

	    public void connect(String database) {
	        connection = new MySQLConnection(database);
	    }

	    public void insert(Entity entity) {
	        System.out.println("Inserting " + entity + " in MongoDB using " + connection.getDatabase());
	    }

	    public void update(Entity entity) {
	        System.out.println("Updating " + entity + " in MongoDB using " + connection.getDatabase());
	    }

	    public void delete(Entity entity) {
	        System.out.println("Deleting " + entity + " in MongoDB using " + connection.getDatabase());
	    }

	    public void disconnect() {
	        connection = null;
	    }
}
