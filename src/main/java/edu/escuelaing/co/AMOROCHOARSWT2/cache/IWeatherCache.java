package edu.escuelaing.co.AMOROCHOARSWT2.cache;

import org.json.JSONObject;

/**
 * Interfaz para la implementación del cache de la página
 * @author Carlos Amorocho
 *
 */
public interface IWeatherCache 
{
	/**
	 * En dado caso que no se haya realizado la busqueda anteriormente, se guarda para futuras referencias
	 * @param ciudad Ciudad solicitada por el usuario, llave de nuestra busqueda JSON 
	 * @param json Objeto obtenido por la busqueda mediante el api externo
	 */
	public void guardar(String ciudad, JSONObject json);
	
	/**
	 * Saber si la ciudad solicitada ya se encuentra en nuestro cache
	 * @param ciudad Ciudad donde usuario desea conocer el clima
	 * @return Boolean
	 */
	public boolean esCiudad(String ciudad);
	
	/**
	 * Obtener la información sobre la ciudad deseada
	 * @param ciudad donde usuario desea conocer el clima
	 * @return JSONObject Objeto con la información solicitada
	 */
	public JSONObject getCiudadJson(String ciudad);
}
