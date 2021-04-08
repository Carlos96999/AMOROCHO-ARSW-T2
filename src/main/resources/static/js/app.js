var app = (() => {
	
	var datos = {
		nombre: null,
		id: null,
		visibilidad: null,
		tiempo: null,
		temperaturaMax: null,
		temperaturaMin: null,
		pais: null,
		longitud: null,
		latitud: null
	}
	
	function mapData(data){
		console.log(data);
		$("#lblname").text("City: "+data.name);
		datos = data;
		console.log("Datos");
		console.log(datos);
		visibilidad = datos.visibility;
        console.info(data.visibility);
		console.info(data.timezone);
		console.info(data.main);
		console.info(data.clouds);
		console.info(data.coord);
		console.info(data.name);
		console.info(datos[0]);
		console.info(datos.humidity);
		console.info(datos.main.humidity);
		console.info(data.name);
        document.getElementById("datos").textContent = "City: "+data.name+
        "\r\nId: "+data.id+
        "\r\nVisibility: "+data.visibility+
        "\r\nTimezone: "+data.timezone+
        "\r\nHumidity: "+data.main.humidity+
        "\r\nTemperatura Maxima: "+data.main.temp+
        "\r\nTemperatura Minima: "+data.main.temp_min+
        "\r\nCountry: "+data.sys.country+
        "\r\nLongitud: "+data.coord.lon+
        "\r\nLatitud: "+data.coord.lat;
        /*$("#nombreCiudad").text("Datos sobre el clima en la ciudad: "+ data.name);
        $("#datosClimaHumedad").text("Humedad atmosférica: "+ data.main.humidity);
        $("#datosClimaPresion").text("Presión atmosférica: "+ data.main.pressure);
        $("#datosClimaTempProm").text("Temperatura atmosférica promedio: "+ data.main.temp);
        $("#datosClimaTempMax").text("Temperatura atmosférica máxima: "+ data.main.temp_max);
        $("#datosClimaTempMin").text("Temperatura atmosférica mínima: "+ data.main.temp_min);
        $("#datosClimaSensación").text("Sensación atmosférica: "+ data.main.feels_like);
        $("#coordenadasLat").text("Coordenadas de latitud: "+ data.coord.lat);
        $("#coordenadasLon").text("Coordenadas de longitud: "+ data.coord.lon);
        $("#clima").text("Descripción del clima: "+ data.weather.description);
        $("#vientoSpeed").text("Velocidad del viento: "+ data.wind.speed);
        $("#vientoDeg").text("Ángulo del viento: "+ data.wind.deg);
        $("#visibilidad").text("Visibilidad atmosférica: "+ data.visibility);

        //para pintar con el marcador
        //plotMarkers(data.coordenadas);*/
    }
	
    function consultarCiudad(name){
        apiClient.getCities(name, mapData);
    }

    return {
        consultarCiudad:consultarCiudad,
    }

})();

/*let app = (() => {
	

    var buscar = function (data) {
        $("#lblname").text("City: "+data.name);
        console.info(data);
        document.getElementById("datos").textContent = "City: "+data.name+
        "\r\nId: "+data.id+
        "\r\nVisibility: "+data.visibility+
        "\r\nTimezone: "+data.timezone+
        "\r\nHumidity: "+data.main.humidity+
        "\r\nTemperatura Maxima: "+data.main.temp+
        "\r\nTemperatura Minima: "+data.main.temp_min+
        "\r\nCountry: "+data.sys.country+
        "\r\nLongitud: "+data.coord.lon+
        "\r\nLatitud: "+data.coord.lat
        ;
    }

	function consultarCiudad(nombre){
        apiClient.getCities(nombre);
    }

    return {
		consultarCiudad: consultarCiudad
    }

})();*/