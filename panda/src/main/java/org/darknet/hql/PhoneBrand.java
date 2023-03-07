package org.darknet.hql;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
//import org.hibernate.annotations.CascadeType;

@Entity
public class PhoneBrand {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	
	private String phoneBrand;
	private String OriginPlace;
	private int marketposition;
	
	@OneToMany(mappedBy="pb",fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	private List<ModelDetail> lis;
	

	public List<ModelDetail> getLis() {
		return lis;
	}
	public void setLis(List<ModelDetail> lis) {
		this.lis = lis;
	}
	public int getMarketposition() {
		return marketposition;
	}
	public void setMarketposition(int marketposition) {
		this.marketposition = marketposition;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPhoneBrand() {
		return phoneBrand;
	}
	public void setPhoneBrand(String phoneBrand) {
		this.phoneBrand = phoneBrand;
	}
	public String getOriginPlace() {
		return OriginPlace;
	}
	public void setOriginPlace(String originPlace) {
		OriginPlace = originPlace;
	}

	

}
