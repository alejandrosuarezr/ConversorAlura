package controles;

public enum volumen {
	MILILITROS,
	LITROS,
	METROS3;
	
	//Método get---------------------
	public static Object[] getVolumenes() {
		Object[] volumenes = new Object[3];
		int i = 0;
		for(volumen vol : volumen.values()) {
			volumenes[i] = vol.name().toString();
			i++;
		}
		return volumenes;
	}
	
	//Método convierte---------------------
	public static double convierte(Object tipoOriginal, Object tipoDestino, Object valorEntrada) {
		String tOriginal = tipoOriginal.toString();
		String tDestino = tipoDestino.toString();
		double vEntrada = Double.parseDouble(valorEntrada.toString());
		
		double aLitros = 0.0;
		double resultado = 0.0;
		
		//convertir a litros
		switch (tOriginal) {
			
			
			case "LITROS":
				aLitros = (double)vEntrada;
			break;
			
			case "MILILITROS":
				aLitros = (double)vEntrada/1000.0;
		    break;
			
			case "METRO3":
				aLitros = (double)vEntrada*1000.0;
			break;	
			
			default:
			break;
		}		
		
		//convertir resultado
		switch (tDestino) {
			
			
			case "LITROS":
				resultado = aLitros;
			break;
			
			case "MILILITROS":
				resultado = aLitros*1000.0;
		    break;
			
			case "METRO3":
				resultado = aLitros/1000.0;
			break;	
			
			default:
			break;
		}	
		return resultado;
	}
	
}
