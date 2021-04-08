apiClient = (function () {


    function getCities(ciudad,callback){

        var get = $.getJSON(`/clima/ciudad/$ {ciudad}`);
            $.when (get).done(function (data) {
                callback(data);
				});
    }

    return {
        getCities:getCities
    }
})();