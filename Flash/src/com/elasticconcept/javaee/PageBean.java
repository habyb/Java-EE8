package com.elasticconcept.javaee;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.Flash;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class PageBean implements Serializable {

	@Inject
	private Flash flash;
	
	private String name;
	
	public String process() {
		//Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
		flash.put("userName", name);
		
		return "result?faces-redirect=true";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
