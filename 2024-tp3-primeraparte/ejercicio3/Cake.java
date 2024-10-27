/**
 * Clase abstracta que define el proceso general para hacer un pastel.
 * Utiliza el patrón Template Method para asegurar que los pasos sigan
 * una secuencia fija, aunque los detalles puedan variar.
 */
public abstract class Cake {

    /**
     * Método template que define la secuencia para hacer un pastel.
     * Este método no debe ser modificado por las subclases.
     */
    public final void makeCake() {
        prepareIngredients();
        bakeCake();
        decorateCake();
        packageCake();
    }

    /**
     * Método abstracto para preparar los ingredientes del pastel.
     * Debe ser implementado por las subclases.
     */
    protected abstract void prepareIngredients();

    /**
     * Método abstracto para decorar el pastel.
     * Debe ser implementado por las subclases.
     */
    protected abstract void decorateCake();

    /**
     * Método concreto para hornear el pastel. Este paso es común para todos los pasteles.
     */
    protected void bakeCake() {
        System.out.println("Horneando el pastel...");
    }

    /**
     * Método concreto para empaquetar el pastel. Este paso es común para todos los pasteles.
     */
    protected void packageCake() {
        System.out.println("Empaquetando el pastel...");
    }
}
