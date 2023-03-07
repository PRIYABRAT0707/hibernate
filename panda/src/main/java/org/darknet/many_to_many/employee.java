package org.darknet.many_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class employee {

	@Id
	private int eid;
	
	private String name;
	
	@ManyToMany
 private List<project> ll;	
	
	
	@Override
	public String toString() {
		return "employee [eid=" + eid + ", name=" + name + ", ll=" + ll + "]";
	}
	public List<project> getLl() {
	return ll;
}
public void setLl(List<project> ll) {
	this.ll = ll;
}
	public int getEid() {
		return eid;
	}
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
