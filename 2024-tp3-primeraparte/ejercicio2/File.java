/**
 * Clase que representa un archivo en el sistema de archivos.
 * Extiende de FileSystemComponent.
 */
public class File extends FileSystemComponent {

    private int size; // Tamaño del archivo en bytes

    /**
     * Constructor de la clase File.
     * Inicializa el nombre y el tamaño del archivo.
     *
     * @param name El nombre del archivo.
     * @param size El tamaño del archivo en bytes.
     */
    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    /**
     * Muestra los detalles del archivo, incluyendo su nombre y tamaño.
     */
    @Override
    public void showDetails() {
        System.out.println("Archivo: " + name + " (" + size + " bytes)");
    }
}
