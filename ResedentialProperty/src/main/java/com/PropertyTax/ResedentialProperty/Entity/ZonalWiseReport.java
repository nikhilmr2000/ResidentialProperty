package com.PropertyTax.ResedentialProperty.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="zonalwise")
public class ZonalWiseReport {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long id;
	
	@Column(name="name")
	public long year;
	
	@Column(name="zone")
	public String zone;
	
	@Column(name="status")
	public String status;
	
	@Column(name="amount")
	public double amount;
	
	
	public ZonalWiseReport() {
		super();
	}
	
	public ZonalWiseReport(long id,long year,String status,String zone,double amount) {
		this.id=id;
		this.year=year;
		this.status=status;
		this.zone=zone;
		this.amount=amount;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getYear() {
		return year;
	}

	public void setYear(long year) {
		this.year = year;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ZonalWiseReport [id=" + id + ", year=" + year + ", status=" + status + ", amount=" + amount + "]";
	}
	
	
	
}
