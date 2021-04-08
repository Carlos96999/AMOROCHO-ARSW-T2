package edu.escuelaing.co.AMOROCHOARSWT2.cache.impl;

import java.util.HashMap;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

import edu.escuelaing.co.AMOROCHOARSWT2.cache.IWeatherCache;

public class IWeatherCacheImpl implements IWeatherCache 
{
	HashMap<String, JSONObject> cache = new HashMap<String, JSONObject>();
	
	@Override
	public void guardar(JSONObject json, String ciudad) 
	{
		cache.put(ciudad, json);
	}

	@Override
	public boolean esCiudad(String ciudad) 
	{
		boolean respuesta = false;
		
		if(cache.containsKey(ciudad)) respuesta = true;

		return respuesta;
	}

	@Override
	public JSONObject getCiudadJson(String ciudad) 
	{
		JSONObject ciudadRespuesta = cache.get(ciudad);

		return ciudadRespuesta;
	}

}
