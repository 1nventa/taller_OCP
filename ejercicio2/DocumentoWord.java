package taller_OCP.ejercicio2;

public class DocumentoWord extends Documento {
    @Override
    public void exportar() {
        System.out.println("Exportando documento a Word.");
    }
}