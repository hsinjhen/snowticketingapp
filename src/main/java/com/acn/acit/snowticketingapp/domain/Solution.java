package com.acn.acit.snowticketingapp.domain;

import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "solutions")
public class Solution {
	
	@Id
	private String id;
	
	@Size(max = 5)
	@Field("confidence")
	private String confidence;
	
	@Size(max = 5)
	@Field("process")
	private String process;
	
	@Size(max = 1000)
	@Field("resolution")
	private String resolution;
	
	@Size(max = 5)
	@Field("score")
	private String score;
	
	@Size(max = 5)
	@Field("tablesort")
	private String tableSort;
	
	@Size(max = 50)
	@Field("topic")
	private String topic;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getConfidence() {
		return confidence;
	}

	public void setConfidence(String confidence) {
		this.confidence = confidence;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getTableSort() {
		return tableSort;
	}

	public void setTableSort(String tableSort) {
		this.tableSort = tableSort;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "Solution [id=" + id + ", confidence=" + confidence + ", process=" + process + ", resolution="
				+ resolution + ", score=" + score + ", tableSort=" + tableSort + ", topic=" + topic + "]";
	}

}
