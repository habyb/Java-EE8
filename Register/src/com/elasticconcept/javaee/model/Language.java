package com.elasticconcept.javaee.model;

public class Language {

	private Integer id;
	private String name;
	
	public static final Language[] LANGUAGES;
	
	static {
		LANGUAGES = new Language[5];
		LANGUAGES[0] = new Language(1, "Java");
		LANGUAGES[1] = new Language(2, "iOS");
		LANGUAGES[2] = new Language(3, "C++");
		LANGUAGES[3] = new Language(4, "C#");
		LANGUAGES[4] = new Language(5, "PHP");
	}

	public Language(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
