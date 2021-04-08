package edu.escuelaing.co.AMOROCHOARSWT2.cache;

import org.json.JSONObject;

public interface IWeatherCache 
{
	public void guardar(JSONObject json, String ciudad);
	
	public boolean esCiudad(String ciudad);
	
	public JSONObject getCiudadJson(String ciudad);
}
