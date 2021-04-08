package edu.escuelaing.co.AMOROCHOARSWT2.service;
import org.json.JSONObject;

/**
 * Interfaz para la implementación del servicio del clima
 * @author Carlos Amorocho
 *
 */
public interface IWeatherServices 
{
	/**
	 * Se comunica con el api externo para obtener los datos requeridos y revisa si esta en cache
	 * para no tener que bsucar más, en dado caso que lo este.
	 * @param ciudad Ciudad escogida por el usuario.
	 * @return respuesta Objeto JSON que tiene la información requerida por el usuario.
	 */
	public JSONObject clima(String ciudad);
}
