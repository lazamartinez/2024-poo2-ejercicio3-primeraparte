import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un directorio en el sistema de archivos.
 * Puede contener archivos y otros directorios. Extiende de FileSystemComponent.
 */
public class Directory extends FileSystemComponent {

    private List<FileSystemComponent> components;

    /**
     * Constructor de la clase Directory.
     * Inicializa el nombre del directorio y una lista de componentes (archivos y directorios).
     *
     * @param name El nombre del directorio.
     */
    public Directory(String name) {
        super(name);
        this.components = new ArrayList<>();
    }

    /**
     * Agrega un componente (archivo o directorio) al directorio.
     *
     * @param component El componente que se va a agregar.
     */
    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    /**
     * Elimina un componente (archivo o directorio) del directorio.
     *
     * @param component El componente que se va a eliminar.
     */
    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    /**
     * Muestra los detalles del directorio, listando recursivamente su contenido.
     */
    @Override
    public void showDetails() {
        System.out.println("Directorio: " + name);
        for (FileSystemComponent component : components) {
            component.showDetails(); // Llama recursivamente a showDetails para listar contenido
        }
    }
}
