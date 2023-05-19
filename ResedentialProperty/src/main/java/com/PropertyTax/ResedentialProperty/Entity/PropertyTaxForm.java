package com.PropertyTax.ResedentialProperty.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PropertyTaxForm")
public class PropertyTaxForm {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long id;
	
	@Column(name="year")
	public long year;
	
	@Column(name="name")
	public String name;
	
	@Column(name="email")
	public String email;
	
	@Column(name="address")
	public String address;
	
	@Column(name="zone")
	public String zone;
	
	@Column(name="description")
	public String description;
	
	@Column(name="status")
	public String status;
	
	@Column(name="buildyear")
	public long buildyear;
	
	@Column(name="buildarea")
	public double buildarea;
	
	@Column(name="tax")
	public double tax;
	
	public PropertyTaxForm() {
		super();
	}
	
	public PropertyTaxForm(long id,long year,String name,String email,String address,String zone,String description,String status,
			long buildyear,double buildarea,double tax) {
		this.id=id;
		this.year=year;
		this.name=name;
		this.email=email;
		this.address=address;
		this.zone=zone;
		this.description=description;
		this.status=status;
		this.buildyear=buildyear;
		this.buildarea=buildarea;
		this.tax=tax;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getBuildyear() {
		return buildyear;
	}

	public void setBuildyear(long buildyear) {
		this.buildyear = buildyear;
	}

	public double getBuildarea() {
		return buildarea;
	}

	public void setBuildarea(double buildarea) {
		this.buildarea = buildarea;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "PropertyTaxForm [id=" + id + ", year=" + year + ", name=" + name + ", email=" + email + ", address="
				+ address + ", zone=" + zone + ", description=" + description + ", status=" + status + ", buildyear="
				+ buildyear + ", buildarea=" + buildarea + ", tax=" + tax + "]";
	}

}
