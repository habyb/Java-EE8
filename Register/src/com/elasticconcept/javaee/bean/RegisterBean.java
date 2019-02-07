package com.elasticconcept.javaee.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.elasticconcept.javaee.model.Language;

@Named("register")
@RequestScoped
public class RegisterBean implements Serializable {

	private String name;
	private String email;
	private String pass1;
	private String pass2;
	private Character gender;
	private Boolean receiveEmails;
	private String comments;
	private Integer[] languages;

	public Language[] getListLanguages() {
		return Language.LANGUAGES;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass1() {
		return pass1;
	}

	public void setPass1(String pass1) {
		this.pass1 = pass1;
	}

	public String getPass2() {
		return pass2;
	}

	public void setPass2(String pass2) {
		this.pass2 = pass2;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public Boolean getReceiveEmails() {
		return receiveEmails;
	}

	public void setReceiveEmails(Boolean receiveEmails) {
		this.receiveEmails = receiveEmails;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer[] getLanguages() {
		return languages;
	}

	public void setLanguages(Integer[] languages) {
		this.languages = languages;
	}
	
	public String getLanguagesAsString() {
		String str = "";
		boolean first = true;
		for (Integer language : languages) {
			if (!first) {
				str += ", ";
			}
			str += language;
			first = false;
		}
		return str;
	}

}
