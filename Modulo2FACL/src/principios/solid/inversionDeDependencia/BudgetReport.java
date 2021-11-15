package principios.solid.inversionDeDependencia;

public class BudgetReport implements Entity
{
    private Database database;

    public BudgetReport(Database database)
    {
        this.database = database;
        database.connect("projects");
    }

    public void save() {
        database.insert(this);
    }
}
