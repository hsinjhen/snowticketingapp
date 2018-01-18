(function () {
    'use strict';

    angular
        .module('snowticketingappApp')
        .factory('Solution', Solution);

    Solution.$inject = ['$resource'];

    function Solution($resource) {
        var service = $resource('api/incidents/solution', {}, {
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
