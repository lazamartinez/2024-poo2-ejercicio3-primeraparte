/**
 * Cliente que utiliza el patrón Template Method para fabricar diferentes tipos de pasteles.
 */
public class CakeShopClient {

    /**
     * Método principal que crea y fabrica pasteles de chocolate y vainilla.
     *
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Crear pastel de chocolate
        Cake chocolateCake = new ChocolateCake();
        System.out.println("Fabricando pastel de chocolate:");
        chocolateCake.makeCake();

        // Crear pastel de vainilla
        Cake vanillaCake = new VanillaCake();
        System.out.println("\nFabricando pastel de vainilla:");
        vanillaCake.makeCake();
    }
}
