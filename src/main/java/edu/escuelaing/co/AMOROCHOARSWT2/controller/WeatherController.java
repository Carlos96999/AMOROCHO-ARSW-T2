package edu.escuelaing.co.AMOROCHOARSWT2.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import edu.escuelaing.co.AMOROCHOARSWT2.service.impl.IWeatherServicesImpl;

@RestController
@CrossOrigin(origins="*", methods = {RequestMethod.GET})
@RequestMapping("/clima")
public class WeatherController 
{
	@Autowired
	IWeatherServicesImpl weatherServices;
	
	@GetMapping("/ciudad/{ciudad}")
	public String getClima(@PathVariable ("ciudad") String ciudad)
	{
		JSONObject clima = weatherServices.clima(ciudad);
		String climaString = clima.toString();
		
		return climaString;
	}
}
