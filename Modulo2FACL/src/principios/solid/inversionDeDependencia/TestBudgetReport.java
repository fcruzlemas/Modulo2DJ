package principios.solid.inversionDeDependencia;

public class TestBudgetReport
{
    public static void main(String[] args) {
    	
    	MongoDB mongodb = new MongoDB();
    	
        BudgetReport budgetReport = new BudgetReport(mongodb);
        budgetReport.save();
    }
}
