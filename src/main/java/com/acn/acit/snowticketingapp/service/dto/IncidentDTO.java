package com.acn.acit.snowticketingapp.service.dto;

import javax.validation.constraints.Size;

import org.springframework.data.mongodb.core.mapping.Field;

public class IncidentDTO {

	private String id;

	@Size(max = 100)
	@Field("short_desc")
	private String shortDescription;

	@Size(max = 50)
	@Field("priority")
	private String priority;

	@Size(max = 100)
	@Field("state")
	private String state;

	@Size(max = 100)
	@Field("assignedto")
	private String assignedTo;

	@Size(max = 100)
	@Field("company")
	private String company;

	@Size(max = 100)
	@Field("close_notes")
	private String closeNotes;

	@Size(max = 100)
	@Field("assigngroup")
	private String assignGroup;

	@Size(max = 100)
	@Field("close_code")
	private String closeCode;

	@Size(max = 100)
	@Field("caller")
	private String caller;

	@Size(max = 100)
	@Field("created")
	private String dateCreated;

	public IncidentDTO() {
		super();
	}

	public IncidentDTO(String id, String shortDescription, String priority, String state, String assignedTo,
			String company, String closeNotes, String assignGroup, String closeCode, String caller,
			String dateCreated) {
		super();
		this.id = id;
		this.shortDescription = shortDescription;
		this.priority = priority;
		this.state = state;
		this.assignedTo = assignedTo;
		this.company = company;
		this.closeNotes = closeNotes;
		this.assignGroup = assignGroup;
		this.closeCode = closeCode;
		this.caller = caller;
		this.dateCreated = dateCreated;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCloseNotes() {
		return closeNotes;
	}

	public void setCloseNotes(String closeNotes) {
		this.closeNotes = closeNotes;
	}

	public String getAssignGroup() {
		return assignGroup;
	}

	public void setAssignGroup(String assignGroup) {
		this.assignGroup = assignGroup;
	}

	public String getCloseCode() {
		return closeCode;
	}

	public void setCloseCode(String closeCode) {
		this.closeCode = closeCode;
	}

	public String getCaller() {
		return caller;
	}

	public void setCaller(String caller) {
		this.caller = caller;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		return "IncidentDTO [id=" + id + ", shortDescription=" + shortDescription + ", priority=" + priority
				+ ", state=" + state + ", assignedTo=" + assignedTo + ", company=" + company + ", closeNotes="
				+ closeNotes + ", assignGroup=" + assignGroup + ", closeCode=" + closeCode + ", caller=" + caller
				+ ", dateCreated=" + dateCreated + "]";
	}

}
