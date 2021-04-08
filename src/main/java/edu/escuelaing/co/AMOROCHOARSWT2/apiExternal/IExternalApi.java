package edu.escuelaing.co.AMOROCHOARSWT2.apiExternal;
import org.json.JSONObject;

/**
 * Interfaz de la parte encargada entre la comunicación del back-end y el servicio externo de OpenWeather
 * @author Carlos
 */
public interface IExternalApi 
{
	/**
	 * Obtenemos un objeto JSON que nos da el clima de la ciudad escogida
	 * @param ciudad Ciudad escogida por el usuario 
	 * @return JSONObject con la respuesta del clima de esa ciudad
	 */
	public JSONObject climaCiudad(String ciudad);
}
