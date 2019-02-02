package com.elasticconcept.javaee;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;

import javax.inject.Named;

@Named
@RequestScoped
public class PageBean implements Serializable {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
