package com.capgemini.inheritanceconcrete.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="contractTable")
@AttributeOverrides({
		@AttributeOverride(name="id",column=@Column(name="id")),
		@AttributeOverride(name="name",column=@Column(name="name"))
})
public class ContractEmployee extends Employee {

	@Column(name="Pay_per_Hour")
	private float payHour;
	
	@Column(name="duration")
	private float duration;

	public ContractEmployee(int id, String name,float payHour, float duration) {
		super(id,name);
		this.payHour = payHour;
		this.duration = duration;
	}

	public ContractEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public float getPayHour() {
		return payHour;
	}

	public void setPayHour(float payHour) {
		this.payHour = payHour;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "ContractEmployee [payHour=" + payHour + ", duration=" + duration + "]";
	}
	
	
}
