package edu.escuelaing.co.AMOROCHOARSWT2.service.impl;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.escuelaing.co.AMOROCHOARSWT2.apiExternal.impl.IExternalApiImpl;
import edu.escuelaing.co.AMOROCHOARSWT2.cache.impl.IWeatherCacheImpl;
import edu.escuelaing.co.AMOROCHOARSWT2.service.IWeatherServices;

/**
 * Clase del servicio del clima que se encarga de verificar el cache para futuras busquedas
 * y comunicarse con el api externo para obtener la información requerida
 * @author Carlos Amorocho
 */
@Service
public class IWeatherServicesImpl implements IWeatherServices 
{	
	@Autowired
	IWeatherCacheImpl cache;
	@Autowired
	IExternalApiImpl api;
	
	/**
	 * Se comunica con el api externo para obtener los datos requeridos y revisa si esta en cache
	 * para no tener que bsucar más, en dado caso que lo este
	 * @param ciudad Ciudad escogida por el usuario
	 * @return respuesta Objeto JSON que tiene la información requerida por el usuario
	 */
	@Override
	public JSONObject clima(String ciudad) 
	{
		JSONObject respuesta = null;
		
		if(cache.esCiudad(ciudad)) respuesta = cache.getCiudadJson(ciudad);
		else
		{
			respuesta = api.climaCiudad(ciudad);
			cache.guardar(ciudad, respuesta);
		}
		
		return respuesta;
	}

}
