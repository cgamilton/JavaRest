package com.acg.site.model;

import org.codehaus.jackson.map.annotate.JsonSerialize;

public class News {

	String title;
	String description;

	public News(String title, String description) {
		this.title = title;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "News [title=" + title + ", description=" + description + "]";
	}

}
