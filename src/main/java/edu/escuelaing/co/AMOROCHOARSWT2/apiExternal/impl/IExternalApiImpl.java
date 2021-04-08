package edu.escuelaing.co.AMOROCHOARSWT2.apiExternal.impl;

import org.json.JSONObject;
import org.springframework.stereotype.Service;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.escuelaing.co.AMOROCHOARSWT2.apiExternal.IExternalApi;

/**
 * Clase que recibe la información del Back-end para comunicarse con el servicio externo de OpenWeather (implementación)
 * @author Carlos Amorocho
 */
@Service
public class IExternalApiImpl implements IExternalApi 
{
	/**
	 * Obtenemos un objeto JSON que nos da el clima de la ciudad escogida
	 * @param ciudad Ciudad escogida por el usuario
	 * @return response Objeto JSON del api rest
	 */
	@Override
	public JSONObject climaCiudad(String ciudad) 
	{
		HttpResponse<String> response = null;
		try {
			response = Unirest.get("https://api.openweathermap.org/data/2.5/weather?q="+ciudad+"&appid=215d94ce0aacb6176b1aca1bc1ed7388").asString();
			return new JSONObject(response.getBody());
		} catch (UnirestException e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return null;
	}
	
}
