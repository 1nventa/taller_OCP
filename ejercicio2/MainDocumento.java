package taller_OCP.ejercicio2;

public class MainDocumento {
    public static void main(String[] args) {
        Documento documentoPDF = new DocumentoPDF();
        documentoPDF.exportar();
        Documento documentoWord = new DocumentoWord();
        documentoWord.exportar();
    }
}