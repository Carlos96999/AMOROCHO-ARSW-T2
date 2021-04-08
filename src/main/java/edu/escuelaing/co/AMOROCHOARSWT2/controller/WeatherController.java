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

/**
 * Controlador que recibe la información enviada por el Front-end al Bakc-end
 * @author Carlos Amorocho
 */
@RestController
@CrossOrigin(origins="*", methods = {RequestMethod.GET})
@RequestMapping("/clima")
public class WeatherController 
{
	@Autowired
	IWeatherServicesImpl weatherServices;
	
	/**
	 * Método al cual se comunica el front para obtener la información deseada
	 * @param ciudad Ciudad escogida por el usuario
	 * @return String El objeto JSON en forma de cadena para ser leído en la página
	 */
	@GetMapping("/ciudad/{ciudad}")
	public String getClima(@PathVariable ("ciudad") String ciudad)
	{
		JSONObject clima = weatherServices.clima(ciudad);
		String climaString = clima.toString();
		
		return climaString;
	}
}
