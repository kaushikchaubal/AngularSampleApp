package com.sample;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppInfo {

	private String name;
	private String version;
	private String description;

	public AppInfo(@JsonProperty("name") final String name,
			@JsonProperty("version") final String version,
			@JsonProperty("description") final String description) {
		this.name = name;
		this.version = version;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "AppInfo [name=" + name + ", version=" + version
				+ ", description=" + description + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
