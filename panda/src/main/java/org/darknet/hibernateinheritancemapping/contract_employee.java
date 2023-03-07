package org.darknet.hibernateinheritancemapping;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("contractemployee")

public class contract_employee extends employee {
	
	@Column(name="daily_wages")
	private double pay_per_hour;
	@Column(name="durationofwork")
	private double duration_of_work;
	@Override
	public String toString() {
		return "contract_employee [pay_per_hour=" + pay_per_hour + ", duration_of_work=" + duration_of_work + "]";
	}
	public double getPay_per_hour() {
		return pay_per_hour;
	}
	public void setPay_per_hour(double pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}
	public double getDuration_of_work() {
		return duration_of_work;
	}
	public void setDuration_of_work(double duration_of_work) {
		this.duration_of_work = duration_of_work;
	}
	

}
