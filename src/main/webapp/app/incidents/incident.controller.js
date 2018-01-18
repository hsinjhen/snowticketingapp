(function() {
    'use strict';

    angular
        .module('snowticketingappApp')
        .controller('IncidentController', IncidentController);

    IncidentController.$inject = ['$scope', 'Incident','$state'];

    function IncidentController($scope, Incident, $state) {
       	 var vm = this;
       	 vm.incidents = [];
       	 vm.loadAll = loadAll;
       	 vm.loadAll();
       	 
    	 function loadAll() {
    		 Incident.query({		 
             }, onSuccess, onError);
         }
    	 
    	 function onSuccess(data, headers) {
    		 vm.incidents = data;
         }
    	 
    	 function onError(error) {
             AlertService.error(error.data.message);
    	 }
    }
    
})();
