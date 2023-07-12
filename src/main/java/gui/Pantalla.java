package gui;



import java.io.IOException;
import javax.swing.JOptionPane;


import valoresConvertibles.Monedas;
import controles.tiposConversion;
import controles.divisas;
import controles.longitudes;
import controles.volumen;
import controles.masa;
import controles.area;


public class Pantalla {
	public static void main(String[] args) {

		// Variables
		Object tipoOriginal = null, tipoDestino = null;
		double valorConvertido = 0.0;
		
		// Construccion y muestra de opciones para el usuario Origen
		JOptionPane mipanel = new JOptionPane();
		
		// Opciones del menu conversor
		Object[] tiposConversiones = tiposConversion.getTiposConversion();

		int statusRespuesta = 0;
		
		//Mensaje
		mipanel.showMessageDialog(mipanel, "Bienvenido al Conversor Alura - Alex Suárez");

		while (statusRespuesta == 0) {
			
			
			
			String tipoConversion = mipanel.showInputDialog(null, "Elige un parametro de conversión", "Input", JOptionPane.INFORMATION_MESSAGE,null, tiposConversiones, mipanel).toString();
			
			// Ingresar el valor a convertir
			Object valorEntrada = JOptionPane.showInputDialog("Ingresa el valor a convertir");
			
			
			
			// MONEDAS, LONGITUDES, VOLUMENES, MASAS, AREAS
			switch (tipoConversion) {

			case "MONEDAS":
					Object[] divisa = divisas.getDivisas();
					// Muestra las opciones de conversión disponibles
					tipoOriginal = mipanel.showInputDialog(null, "Elige conversion original", "Input", JOptionPane.INFORMATION_MESSAGE, null, divisa, mipanel);
	
					// Muestra las opciones de conversión disponibles
					tipoDestino = mipanel.showInputDialog(null, "Elige conversion destino","Input", JOptionPane.INFORMATION_MESSAGE, null, divisa, mipanel);
					 
					// Crear objeto moneda para ejecutar método covertir
					Monedas conversor = new Monedas();
					  try { 
						  valorConvertido = conversor.convierte(tipoOriginal, tipoDestino,valorEntrada);
					  
					  } catch (IOException e) { // TODO Auto-generated catch block
					  e.printStackTrace(); }
					 
			break;
			
		
			case "LONGITUDES":
					Object[] longitud = longitudes.getLongitudes();
					// Muestra las opciones de conversión disponibles
					tipoOriginal = mipanel.showInputDialog(null, "Elige conversion original", "Input", JOptionPane.INFORMATION_MESSAGE, null, longitud, mipanel);
	
					// Muestra las opciones de conversión disponibles
					tipoDestino = mipanel.showInputDialog(null, "Elige conversion destino","Input", JOptionPane.INFORMATION_MESSAGE, null, longitud, mipanel);
					
					valorConvertido = longitudes.convierte(tipoOriginal, tipoDestino,valorEntrada);
			break;
			
			case "VOLUMENES":
					Object[] volumenes = volumen.getVolumenes();
					// Muestra las opciones de conversión disponibles
					tipoOriginal = mipanel.showInputDialog(null, "Elige conversion original", "Input", JOptionPane.INFORMATION_MESSAGE, null, volumenes, mipanel);
	
					// Muestra las opciones de conversión disponibles
					tipoDestino = mipanel.showInputDialog(null, "Elige conversion destino","Input", JOptionPane.INFORMATION_MESSAGE, null, volumenes, mipanel);
					
					valorConvertido = volumen.convierte(tipoOriginal, tipoDestino,valorEntrada);
			break;
			
			case "MASAS":
					Object[] masas = masa.getMasa();
					// Muestra las opciones de conversión disponibles
					tipoOriginal = mipanel.showInputDialog(null, "Elige conversion original", "Input", JOptionPane.INFORMATION_MESSAGE, null, masas, mipanel);
	
					// Muestra las opciones de conversión disponibles
					tipoDestino = mipanel.showInputDialog(null, "Elige conversion destino","Input", JOptionPane.INFORMATION_MESSAGE, null, masas, mipanel);
					
					valorConvertido = masa.convierte(tipoOriginal, tipoDestino,valorEntrada);
					
			break;
			
			case "AREAS":
					Object[] areas = area.getAreas();
					// Muestra las opciones de conversión disponibles
					tipoOriginal = mipanel.showInputDialog(null, "Elige conversion original", "Input", JOptionPane.INFORMATION_MESSAGE, null, areas, mipanel);
	
					// Muestra las opciones de conversión disponibles
					tipoDestino = mipanel.showInputDialog(null, "Elige conversion destino","Input", JOptionPane.INFORMATION_MESSAGE, null, areas, mipanel);
					
					valorConvertido = area.convierte(tipoOriginal, tipoDestino,valorEntrada);
					
					
			break;
			
			
			default:
			break;

			}

			

			

			

			// Salida de datos procesados
			 mipanel.showMessageDialog(mipanel, "Resultado de "+valorEntrada+" de "+tipoOriginal+" a "+tipoDestino+" es: "+ valorConvertido);

			// Pregunta para continuar o salir
			statusRespuesta = JOptionPane.showConfirmDialog(mipanel, "Desea continuar");

		}

	}

}