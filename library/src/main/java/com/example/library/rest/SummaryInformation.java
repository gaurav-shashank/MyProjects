package com.example.library.rest;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SummaryInformation {
	@JsonProperty("channelInformation")
	private List<Summary> summaryList;
	

	public List<Summary> getSummaryList() {
		return summaryList;
	}

	public void setSummaryList(List<Summary> summaryList) {
		this.summaryList = summaryList;
	}
	

}
