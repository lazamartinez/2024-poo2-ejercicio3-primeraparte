/**
 * Cliente que permite crear y mostrar una estructura jerárquica de archivos y directorios.
 */
public class FileSystemClient {

    /**
     * Método principal que crea una estructura de directorios y archivos, y muestra los detalles.
     *
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Crear archivos
        File file1 = new File("archivo1.txt", 500);
        File file2 = new File("archivo2.jpg", 1200);
        File file3 = new File("documento.docx", 300);

        // Crear directorios
        Directory dir1 = new Directory("Directorio1");
        Directory dir2 = new Directory("Directorio2");
        Directory rootDir = new Directory("Raíz");

        // Agregar archivos y directorios
        dir1.addComponent(file1);
        dir1.addComponent(file2);
        dir2.addComponent(file3);

        rootDir.addComponent(dir1);
        rootDir.addComponent(dir2);

        // Mostrar detalles de la estructura
        rootDir.showDetails();
    }
}
