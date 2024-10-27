/**
 * Clase que representa un pastel de chocolate.
 * Implementa los pasos específicos para preparar y decorar este tipo de pastel.
 */
public class ChocolateCake extends Cake {

    /**
     * Prepara los ingredientes específicos para un pastel de chocolate.
     */
    @Override
    protected void prepareIngredients() {
        System.out.println("Preparando los ingredientes para el pastel de chocolate: harina, cacao, azúcar, huevos.");
    }

    /**
     * Decora el pastel de chocolate.
     */
    @Override
    protected void decorateCake() {
        System.out.println("Decorando el pastel de chocolate con cobertura de chocolate y trozos de cacao.");
    }
}
