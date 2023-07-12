package controles;

import java.util.List;



import java.util.ArrayList;

public enum tiposConversion {
	MONEDAS, LONGITUDES, VOLUMENES, MASAS, AREAS;
	
	
	//Método get---------------------
	public static Object[] getTiposConversion() {
		
		Object[] tiposConversiones = new Object[5];
		
		int i = 0;
		for(tiposConversion tipo : tiposConversion.values()) {
			
			tiposConversiones[i] = tipo.name().toString();
			i++;
		}
		return tiposConversiones;	
	}
	

}
