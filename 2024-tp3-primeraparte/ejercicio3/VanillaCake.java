/**
 * Clase que representa un pastel de vainilla.
 * Implementa los pasos específicos para preparar y decorar este tipo de pastel.
 */
public class VanillaCake extends Cake {

    /**
     * Prepara los ingredientes específicos para un pastel de vainilla.
     */
    @Override
    protected void prepareIngredients() {
        System.out.println("Preparando los ingredientes para el pastel de vainilla: harina, azúcar, huevos, esencia de vainilla.");
    }

    /**
     * Decora el pastel de vainilla.
     */
    @Override
    protected void decorateCake() {
        System.out.println("Decorando el pastel de vainilla con crema batida y fresas.");
    }
}
