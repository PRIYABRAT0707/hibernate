package org.darknet.hibernateinheritancemapping;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("regularemployee")
public class regular_employee extends employee {
	
	@Column(name="employee_salary")
	private double salary;
	
	@Column(name="employee_bonus")
	private double bonus;

	@Override
	public String toString() {
		return "regular_employee [salary=" + salary + ", bonus=" + bonus + "]";
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	

}
