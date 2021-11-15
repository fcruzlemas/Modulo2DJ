package principios.solid.responsabilidadUnica;

public class TestEmployee
{
    public static void main(String[] args) {
        Employee paco = new Employee("Paco");
        paco.setRfc("CULC812011");
        paco.setSsn("10240210A");
        TimeSheetReport timeSheetReport = new TimeSheetReport();
        timeSheetReport.print(paco);
    }
}
