package net.atos.apirest.model.request;

import javax.validation.constraints.Size;

public class UserRequest {
	
	@Size(min=7, max=7)
	String username;
	@Size(min=2, max=50)
	String name;
	String email;
	String document;
	java.sql.Date date;
	
	public UserRequest() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public java.sql.Date getDate() {
		return date;
	}

	public void setDate(java.sql.Date date) {
		this.date = date;
	}
	

	

}
