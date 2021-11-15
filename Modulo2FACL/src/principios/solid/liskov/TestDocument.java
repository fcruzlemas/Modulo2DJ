package principios.solid.liskov;

public class TestDocument
{
    public static void main(String[] args) {
        Project project = new Project();
        Document actaProyecto = new Document("actaProyecto");
        actaProyecto.setData("Representa el acta del proyecto");
        Document especificacionRequerimientos = new WritableDocument("especificacionRequerimientos");
        especificacionRequerimientos.setData("Especifica los requerimeintos");
        Document especificacionArquitectonica = new WritableDocument("especificacionArquitectonica");
        especificacionArquitectonica.setData("Especificaciónes de la arquitectura ");

        project.addDocument(actaProyecto);
        project.addDocument(especificacionArquitectonica);
        project.addDocument(especificacionRequerimientos);
        project.openAll();
        project.saveAll();
    }
}
