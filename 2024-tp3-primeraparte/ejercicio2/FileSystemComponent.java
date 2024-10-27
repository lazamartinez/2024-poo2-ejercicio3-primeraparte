/**
 * Clase base abstracta que representa un componente en el sistema de archivos.
 * Puede ser un archivo o un directorio.
 */
public abstract class FileSystemComponent {

    protected String name;

    /**
     * Constructor que inicializa el nombre del componente del sistema de archivos.
     *
     * @param name El nombre del archivo o directorio.
     */
    public FileSystemComponent(String name) {
        this.name = name;
    }

    /**
     * Método abstracto que debe ser implementado por las clases que heredan.
     * Muestra los detalles del componente (nombre, tamaño, etc.).
     */
    public abstract void showDetails();
}
