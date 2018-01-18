(function() {
    'use strict';

    angular
        .module('snowticketingappApp')
        .config(stateConfig);

    stateConfig.$inject = ['$stateProvider'];

    function stateConfig($stateProvider) {
        $stateProvider
        //STATE FOR OPEN INCIDENTS
        .state('incident', {
        	parent: 'app',
            url: '/incidents',
            data: {
                authorities: ['ROLE_USER'],
                pageTitle: 'Incidents'
            },
            views: {
                'content@': {
                    templateUrl: 'app/incidents/incident.html',
                    controller: 'IncidentController',
                    controllerAs: 'vm'
                }
            }
        })
        //STATE FOR INCIDENT DETAIL
        .state('incident-detail', {
            parent: 'incident',
            url: '/incident-detail/{id}',
            data: {
                authorities: ['ROLE_USER'],
                pageTitle: 'Incident Details'
            },
            views: {
                'content@': {
                    templateUrl: 'app/incidents/incident-detail.html',
                    controller: 'IncidentDetailController',
                    controllerAs: 'vm'
                }
            }
        })
        //STATE FOR INCIDENT SOLUTION
        .state('incident-solution', {
            parent: 'app',
            url: '/incident-solution',
            data: {
                authorities: ['ROLE_USER'],
                pageTitle: 'Incident Solutions'
            },
            views: {
                'content@': {
                    templateUrl: 'app/incidents/incident-solution.html',
                    controller: 'IncidentSolutionController',
                    controllerAs: 'vm'
                }
            }
        });
    }
})();
