(function() {
	'use strict';

	angular.module('snowticketingappApp').controller(
			'IncidentSolutionController', IncidentSolutionController);

	IncidentSolutionController.$inject = [ '$scope', 'Solution', '$state',
			'$stateParams', '$location' ];

	function IncidentSolutionController($scope, Solution, $state, $stateParams,
			$location) {
		 var vm = this;
       	 vm.solutions = [];
       	 vm.loadSolutions = loadSolutions;
       	 vm.submitRating = submitRating;
       	 vm.useSolutions = useSolutions;
       	 vm.loadSolutions();

       	 function loadSolutions() {
    		 Solution.query({		 
             }, onSuccess, onError);
         }
    	 
    	 function onSuccess(data, headers) {
    		 vm.solutions = data;
         }
    	 
    	 function onError(error) {
             AlertService.error(error.data.message);
    	 }
    	 
    	 function submitRating(){
    		 alert("Submit Rating");
    	 }
    	 
    	 function useSolutions(){
    		 alert("use solutions...")
    	 }

	}

})();
