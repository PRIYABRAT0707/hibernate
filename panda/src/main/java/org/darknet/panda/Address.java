package org.darknet.panda;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
@Table(name="student_address")
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="address_id")
	private int addressid;
	
	@Column(length=100,name="STREET")
	private String street;
	
	@Override
	public String toString() {
		return "Address [addressid=" + addressid + ", street=" + street + ", city=" + city + ", isopen=" + isopen
				+ ", cod=" + cod + ", adddate=" + adddate + ", image=" + Arrays.toString(image) + "]";
	}
	private String city;
	
	private boolean isopen;
	
	private double cod;
	
	@Temporal(TemporalType.DATE)
	private Date adddate;
	
	@Lob
	private byte[] image;
	
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isIsopen() {
		return isopen;
	}
	public void setIsopen(boolean isopen) {
		this.isopen = isopen;
	}
	public double getCod() {
		return cod;
	}
	public void setCod(double cod) {
		this.cod = cod;
	}
	public Date getAdddate() {
		return adddate;
	}
	public void setAdddate(Date adddate) {
		this.adddate = adddate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	

}
