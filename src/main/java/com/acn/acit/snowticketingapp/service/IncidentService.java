package com.acn.acit.snowticketingapp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.acn.acit.snowticketingapp.service.util.WatsonConstants;
import com.ibm.watson.developer_cloud.discovery.v1.Discovery;
import com.ibm.watson.developer_cloud.discovery.v1.model.query.QueryRequest;
import com.ibm.watson.developer_cloud.discovery.v1.model.query.QueryResponse;


@Service
public class IncidentService {
	
	private final static Logger log = LoggerFactory.getLogger(IncidentService.class);
	
	public static Discovery setConfiguration() {
		Discovery discovery = new Discovery(WatsonConstants.DISCOVERY_VERSION);
		discovery.setEndPoint(WatsonConstants.DISCOVERY_API);
		discovery.setUsernameAndPassword(WatsonConstants.DISCOVERY_USERNAME, WatsonConstants.DISCOVERY_PASSWORD);
		return discovery;
	}

	public QueryResponse getAllIncidents(){
		QueryRequest.Builder queryBuilder = new QueryRequest.Builder(WatsonConstants.DISCOVERY_ENVIRONMENT_ID, WatsonConstants.DISCOVERY_COLLECTION_ID);
		queryBuilder.query("");
		QueryResponse queryResponse = setConfiguration().query(queryBuilder.build()).execute();
		return queryResponse;
	}
	
	public QueryResponse getIncidentById(String id) {
		QueryRequest.Builder queryBuilder = new QueryRequest.Builder(WatsonConstants.DISCOVERY_ENVIRONMENT_ID, WatsonConstants.DISCOVERY_COLLECTION_ID);
		queryBuilder.query("inc_number::"+id+"");
		QueryResponse queryResponse = setConfiguration().query(queryBuilder.build()).execute();
		return queryResponse;
	}

	public QueryResponse getOpenIncidentTickets() {
		QueryRequest.Builder queryBuilder = new QueryRequest.Builder(WatsonConstants.DISCOVERY_ENVIRONMENT_ID, WatsonConstants.DISCOVERY_COLLECTION_ID);
		queryBuilder.query("state::Open");
		QueryResponse queryResponse = setConfiguration().query(queryBuilder.build()).execute();
		return queryResponse;
	}
	
}
