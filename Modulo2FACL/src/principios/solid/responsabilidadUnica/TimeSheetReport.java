package principios.solid.responsabilidadUnica;

public class TimeSheetReport
{
    public void print(Employee employee) {
        System.out.println("Time sheet of " + employee.getName());
        System.out.println("SSA "+employee.getSsn());
        System.out.println("RFC "+employee.getRfc());
        System.out.println("Hours worked: ...");
        System.out.println("Holidays: ...");
        System.out.println("Days off: ...");
        System.out.println("Delays...");
    }
}
