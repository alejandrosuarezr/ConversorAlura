package controles;

public enum masa {
	GRAMOS, KILOGRAMOS, LIBRAS;

	//Método get---------------------
	public static Object[] getMasa() {
		Object[] masas = new Object[3];
		int i = 0;
		for (masa mas : masa.values()) {
			masas[i] = mas.name().toString();
			i++;
		}
		return masas;
	}
	
	//Método convierte---------------------
	public static double convierte(Object tipoOriginal, Object tipoDestino, Object valorEntrada) {
		String tOriginal = tipoOriginal.toString();
		String tDestino = tipoDestino.toString();
		double vEntrada = Double.parseDouble(valorEntrada.toString());

		double aKilogramo = 0.0;
		double resultado = 0.0;
		
		
		//a Kilogramos
		switch (tOriginal) {
		case "KILOGRAMOS":
			aKilogramo = vEntrada;
		break;
		case "GRAMOS":
			aKilogramo = vEntrada / 1000.0;
		break;
		case "LIBRAS":
			aKilogramo = vEntrada * 0.45359237;
		break;
		
		default:
		break;
		}

		// Convertir a la unidad de destino
		
		switch (tDestino) {
		case "KILOGRAMOS":
			resultado = aKilogramo;
		break;
		case "GRAMOS":
			resultado = aKilogramo * 1000.0;
		break;
		case "LIBRAS":
			resultado = aKilogramo / 0.45359237;
		break;
		
		default:
		break;
		}

		return resultado;
	}

}
