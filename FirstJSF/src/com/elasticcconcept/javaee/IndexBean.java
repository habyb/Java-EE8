package com.elasticcconcept.javaee;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("bean")
@RequestScoped
public class IndexBean implements Serializable {

	public String getMessage() {
		return "This is a message from the Bean 2!";
	}
}
