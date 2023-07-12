package controles;

public enum longitudes {
	MILIMETRO, CENTIMETRO, METRO, KILOMETRO;
	
	//Método get---------------------
	public static Object[] getLongitudes() {
		Object[] tiposLongitudes = new Object[4];
		int i = 0;
		for (longitudes divs : longitudes.values()) {
			tiposLongitudes[i] = divs.name().toString();
			i++;
		}
		return tiposLongitudes;
	}
	
	//Método convierte---------------------
	public static double convierte(Object tipoOriginal, Object tipoDestino, Object valorEntrada) {
		String tOriginal = tipoOriginal.toString();
		String tDestino = tipoDestino.toString();
		double vEntrada = Double.parseDouble(valorEntrada.toString());
		
		double aMetros = 0.0;
		double resultado = 0.0;
		
		//convertir a metros
		switch (tOriginal) {
			
			
			case "MILIMETRO":
				aMetros = (double)vEntrada/1000.0;
			break;
			
			case "CENTIMETRO":
				aMetros = (double)vEntrada/100.0;
		    break;
			
			case "METRO":
				aMetros = (double)vEntrada;
			break;	
			
			case "KILOMETRO":
				aMetros = (double)vEntrada*1000.0;
			break;

			default:
			break;
		}		
		
		//convertir resultado
		switch (tDestino) {
			
			
			case "MILIMETRO":
				resultado = aMetros*1000.0;
			break;
			
			case "CENTIMETRO":
				resultado = aMetros*100.0;
		    break;
			
			case "METRO":
				resultado = aMetros;
			break;	
			
			case "KILOMETRO":
				resultado = aMetros/1000.0;
			break;

			default:
			break;
		}	
		return resultado;
	
}
	
}
