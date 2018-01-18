(function() {
    'use strict';

    angular
        .module('snowticketingappApp')
        .controller('IncidentDetailController', IncidentDetailController);

    IncidentDetailController.$inject = ['$scope', 'Incident','$state', '$stateParams', '$location'];

    function IncidentDetailController ($scope, Incident, $state, $stateParams, $location) {
    	var vm = this;

    	$scope.baseURL = $location.$$protocol + '://' + $location.$$host + ':' + $location.$$port + '/';
    	
        vm.loadDetails = loadDetails;
        vm.incident = {};
        vm.loadDetails($stateParams.id);
        vm.checkSolutions = checkSolutions;
        vm.resolveTicket = resolveTicket;
        vm.go = go;
        
        function loadDetails(id) {
        	 Incident.get({id: id}, function(result) {
                 vm.incident = result;
             });
        }
        
        function onSuccess(data, headers) {
            vm.incident = data;
        }

        function onError(error) {
            AlertService.error(error.data.message);
        }
        
        function checkSolutions(){
        	go('/incident-solution');
        }
        
        function go(path){
        	$location.path(path);
        }
        
        function resolveTicket(){
        	alert("resolve ticket");
        }
    }
    
})();
