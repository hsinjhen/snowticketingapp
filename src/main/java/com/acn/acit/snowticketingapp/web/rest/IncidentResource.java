package com.acn.acit.snowticketingapp.web.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acn.acit.snowticketingapp.domain.Solution;
import com.acn.acit.snowticketingapp.service.IncidentService;
import com.acn.acit.snowticketingapp.service.SolutionService;
import com.codahale.metrics.annotation.Timed;
import com.ibm.watson.developer_cloud.discovery.v1.model.query.QueryResponse;

@RestController
@RequestMapping("/api")
public class IncidentResource {
	
	private Logger log = LoggerFactory.getLogger(IncidentResource.class);
	
	public IncidentService incidentService;
	public SolutionService solutionService;
	
	public IncidentResource(IncidentService incidentService, SolutionService solutionService) {
		this.incidentService = incidentService;
		this.solutionService = solutionService;
	}
	
	@GetMapping("/incidents")
    @Timed
    public ResponseEntity<Object> getAllIncidents() {
		QueryResponse qr = incidentService.getAllIncidents();
		return new ResponseEntity<Object>(qr.getResults(), HttpStatus.OK);
    }
	
	@GetMapping("/incidents/open/{id}")
    public ResponseEntity<Object> getIncidentById(@PathVariable String id) {
		QueryResponse qr = incidentService.getIncidentById(id);
        return new ResponseEntity<Object>(qr.getResults(), HttpStatus.OK);
    }
	
	@GetMapping("/incidents/open")
    @Timed
    public ResponseEntity<Object> getAllOpenIncidents() {
		QueryResponse qr = incidentService.getOpenIncidentTickets();
		return new ResponseEntity<Object>(qr.getResults(), HttpStatus.OK);
    }
	
	@GetMapping("/incidents/solution")
	public ResponseEntity<Object> getAllSolutions(){
		List<Solution> listSolutions = solutionService.getAllSolutions();
		return new ResponseEntity<Object>(listSolutions, HttpStatus.OK);
	}
}
