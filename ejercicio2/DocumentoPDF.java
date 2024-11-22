package taller_OCP.ejercicio2;

public class DocumentoPDF extends Documento {
    @Override
    public void exportar() {
        System.out.println("Exportando documento a PDF.");
    }
}