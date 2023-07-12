package valoresConvertibles;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Monedas {

	//Método get---------------------
	private double getValor(Object origen, Object destino, double valor) throws IOException{
		OkHttpClient client = new OkHttpClient().newBuilder().build();
		
		Request request = new Request.Builder()
				.url("https://api.apilayer.com/currency_data/convert?to="+destino.toString()+"&from="+origen.toString()+"&amount="+valor)
				.addHeader("apikey", "xxxxxxxxxxxxxx")
				.method("GET", null).build();
		
		Response response = client.newCall(request).execute();
		
		Gson gson = new Gson();
		JsonElement jsonElement = gson.fromJson(response.body().charStream(), JsonElement.class);
		
		JsonObject jsonObject = jsonElement.getAsJsonObject();
		double valorC = Double.parseDouble(jsonObject.get("result").toString());
		
		
		
		return valorC;
		
		
	}
	

	//Método convierte---------------------
	public double convierte(Object origen, Object destino, Object numero) throws IOException {
		
		double nuevoValor = Double.parseDouble(numero.toString());

		
		return getValor(origen,destino,nuevoValor);
	}
}
