package org.darknet.hql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class item {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int iid;
	private double price;
	private String imei;
	private String processor;
	private int battery;
	private int cameraspecs;
	private double displaysize;
	private boolean havingStreoSpeaker;
	private boolean havingSecondaryMicrophone;
	private int androidVersion;
	public int getIid() {
		return iid;
	}
	public void setIid(int iid) {
		this.iid = iid;
	}
	@Override
	public String toString() {
		return "item [iid=" + iid + ", price=" + price + ", imei=" + imei + ", processor=" + processor + ", battery="
				+ battery + ", cameraspecs=" + cameraspecs + ", displaysize=" + displaysize + ", havingStreoSpeaker="
				+ havingStreoSpeaker + ", havingSecondaryMicrophone=" + havingSecondaryMicrophone + ", androidVersion="
				+ androidVersion + "]";
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImei() {
		return imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	public int getCameraspecs() {
		return cameraspecs;
	}
	public void setCameraspecs(int cameraspecs) {
		this.cameraspecs = cameraspecs;
	}
	public double getDisplaysize() {
		return displaysize;
	}
	public void setDisplaysize(double displaysize) {
		this.displaysize = displaysize;
	}
	public boolean isHavingStreoSpeaker() {
		return havingStreoSpeaker;
	}
	public void setHavingStreoSpeaker(boolean havingStreoSpeaker) {
		this.havingStreoSpeaker = havingStreoSpeaker;
	}
	public boolean isHavingSecondaryMicrophone() {
		return havingSecondaryMicrophone;
	}
	public void setHavingSecondaryMicrophone(boolean havingSecondaryMicrophone) {
		this.havingSecondaryMicrophone = havingSecondaryMicrophone;
	}
	public int getAndroidVersion() {
		return androidVersion;
	}
	public void setAndroidVersion(int androidVersion) {
		this.androidVersion = androidVersion;
	}
	
	

}
