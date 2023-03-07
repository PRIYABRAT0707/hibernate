package org.darknet.rhenyra;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "pri")
public class po {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@ElementCollection
	List <String> kk;
	String name;
	public po(int id, List<String> kk, String name) {
		super();
		this.id = id;
		this.kk = kk;
		this.name = name;
	}
	public po() {
		super();
	}
	

}
