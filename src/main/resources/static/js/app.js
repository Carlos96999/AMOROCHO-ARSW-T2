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
        document.getElementById("datos").textContent = "City: "+data.name+
        "\r\nId: "+data.id+
        "\r\nVisibility: "+data.visibility+
        "\r\nHumidity: "+data.main.humidity+
        "\r\nTemperatura: "+data.main.temp+
        "\r\nCountry: "+data.sys.country+
        "\r\nLongitud: "+data.coord.lon+
        "\r\nLatitud: "+data.coord.lat+
		"\r\nDescripción: "+data.weather.description;
    }

    return {
		
        consultarCiudad: function(name){
			apiClient.getCities(name, mapData);
		}
    }

})();