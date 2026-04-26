
public class claseAnidada {
    /**
	 * 
	 */
	private final FicheroAleatorioVentana ventanaPrincipal;
	/**
	 * @param ficheroAleatorioVentana
	 */
	claseAnidada(FicheroAleatorioVentana ficheroAleatorioVentana) {
		ventanaPrincipal = ficheroAleatorioVentana;
	}
	void entrada() {
        System.out.println("Método entrada.");
    }
    String salida (int d) {
        System.out.println("Salida.");
        return "Salida el " + d;
    }
} // fin clase anidada