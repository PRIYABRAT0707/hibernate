package org.darknet.many_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class project {
	
	@Id
 private int pid;
	
 private String projectname;
 
 @ManyToMany(mappedBy="ll")
 private List<employee> liw;

@Override
public String toString() {
	return "project [pid=" + pid + ", projectname=" + projectname + ", liw=" + liw + "]";
}


public List<employee> getLiw() {
	return liw;
}

public void setLiw(List<employee> liw) {
	this.liw = liw;
}

public int getPid() {
	return pid;
}

public void setPid(int pid) {
	this.pid = pid;
}

public String getProjectname() {
	return projectname;
}

public void setProjectname(String projectname) {
	this.projectname = projectname;
}
}
