package controles;

public enum area {
	METRO_CUADRADO, CENTIMETRO_CUADRADO, MILIMETRO_CUADRADO;

	//Método get---------------------
	public static Object[] getAreas() {
		Object[] areas = new Object[3];
		int i = 0;
		for (area ars : area.values()) {
			areas[i] = ars.name().toString();
			i++;
		}
		return areas;
	}
	
	//Método convierte---------------------
	public static double convierte(Object tipoOriginal, Object tipoDestino, Object valorEntrada) {
		String tOriginal = tipoOriginal.toString();
		String tDestino = tipoDestino.toString();
		double vEntrada = Double.parseDouble(valorEntrada.toString());

		double aMetrosCuadrados = 0.0;
		double resultado = 0.0;

		// convertir a metros2		
		switch (tOriginal) {

		case "METRO_CUADRADO":
			aMetrosCuadrados = (double) vEntrada;
			break;

		case "CENTIMETRO_CUADRADO":
			aMetrosCuadrados = (double) vEntrada / 10000.0;
			break;

		case "MILIMETRO_CUADRADO":
			aMetrosCuadrados = (double) vEntrada / 1000000.0;
			break;

		default:
			break;
		}

		// convertir resultado
		switch (tDestino) {

		case "METRO_CUADRADO":
			resultado = aMetrosCuadrados;
			break;

		case "CENTIMETRO_CUADRADO":
			resultado = aMetrosCuadrados * 10000.0;
			break;

		case "MILIMETRO_CUADRADO":
			resultado = aMetrosCuadrados * 1000000.0;
			break;

		default:
			break;
		}
		return resultado;
	}

}
