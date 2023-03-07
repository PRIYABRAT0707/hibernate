package org.darknet.hql;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class ModelDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int modelid;
	private String modelname;
	private int quantity;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private PhoneBrand pb;
	
	
	public PhoneBrand getPb() {
		return pb;
	}
	public void setPb(PhoneBrand pb) {
		this.pb = pb;
	}
	@OneToOne(cascade = CascadeType.ALL)
	private item item;
	
	public int getModelid() {
		return modelid;
	}
	public item getItem() {
		return item;
	}
	public void setItem(item item) {
		this.item = item;
	}
	public void setModelid(int modelid) {
		this.modelid = modelid;
	}
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
