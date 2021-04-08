package edu.escuelaing.co.AMOROCHOARSWT2.service.impl;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.escuelaing.co.AMOROCHOARSWT2.apiExternal.impl.IExternalApiImpl;
import edu.escuelaing.co.AMOROCHOARSWT2.cache.impl.IWeatherCacheImpl;
import edu.escuelaing.co.AMOROCHOARSWT2.service.IWeatherServices;

public class IWeatherServicesImpl implements IWeatherServices 
{	
	@Autowired
	IWeatherCacheImpl cache;
	@Autowired
	IExternalApiImpl api;
	
	@Override
	public JSONObject clima(String ciudad) 
	{
		JSONObject respuesta = null;
		
		if(cache.esCiudad(ciudad)) respuesta = cache.getCiudadJson(ciudad);
		else
		{
			respuesta = api.climaPais(ciudad);
			cache.guardar(respuesta, ciudad);
		}
		
		return respuesta;
	}

}
