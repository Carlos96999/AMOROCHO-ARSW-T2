package edu.escuelaing.co.AMOROCHOARSWT2.cache.impl;

import java.util.HashMap;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import edu.escuelaing.co.AMOROCHOARSWT2.cache.IWeatherCache;

@Service
public class IWeatherCacheImpl implements IWeatherCache 
{
	HashMap<String, JSONObject> cache = new HashMap<String, JSONObject>();
	
	/**
	 * En dado caso que no se haya realizado la busqueda anteriormente, se guarda para futuras referencias
	 * @param ciudad Ciudad solicitada por el usuario, llave de nuestra busqueda JSON 
	 * @param json Objeto obtenido por la busqueda mediante el api externo
	 */
	@Override
	public void guardar(String ciudad, JSONObject json) 
	{
		cache.put(ciudad, json);
	}

	/**
	 * Saber si la ciudad solicitada ya se encuentra en nuestro cache
	 * @param ciudad Ciudad donde usuario desea conocer el clima
	 * @return Boolean
	 */
	@Override
	public boolean esCiudad(String ciudad) 
	{
		boolean respuesta = false;
		
		if(cache.containsKey(ciudad)) respuesta = true;

		return respuesta;
	}

	/**
	 * Obtener la información sobre la ciudad deseada
	 * @param ciudad donde usuario desea conocer el clima
	 * @return JSONObject Objeto con la información solicitada
	 */
	@Override
	public JSONObject getCiudadJson(String ciudad) 
	{
		JSONObject ciudadRespuesta = cache.get(ciudad);

		return ciudadRespuesta;
	}

}
