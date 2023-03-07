package org.darknet.panda;

import javax.persistence.Id;

@javax.persistence.Entity
public class student {
	
	private String name;
	private String city;
	@Id
	private String id;
	private certificate cert;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public certificate getCert() {
		return cert;
	}
	public void setCert(certificate cert) {
		this.cert = cert;
	}
	
}
