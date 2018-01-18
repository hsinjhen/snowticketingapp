(function () {
    'use strict';

    angular
        .module('snowticketingappApp')
        .factory('Incident', Incident);

    Incident.$inject = ['$resource'];

    function Incident($resource) {
        var service = $resource('api/incidents/open/:id', {}, {
        	'query': {method: 'GET', isArray: true},
        	'get': {
	            method: 'GET',
	            transformResponse: function (data) {
	                data = angular.fromJson(data);
	                return data;
	            },
        		isArray: true
        	}
        });

        return service;
    }
})();
