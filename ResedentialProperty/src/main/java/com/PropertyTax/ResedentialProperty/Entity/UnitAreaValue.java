package com.PropertyTax.ResedentialProperty.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="unitareavalue")
public class UnitAreaValue {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long id;
	
	@Column(name="category")
	public String category;
	
	@Column(name="description")
	public String description;
	
	@Column(name="status")
	public String status;
	
	@Column(name="zone")
	public String zone;
	 
	@Column(name="unitarea")
	public double unitarea;
	
	
	public UnitAreaValue() {
		super();
	}
	
	public UnitAreaValue(long id,String category,String description,String status,String zone,double unitarea) {
		this.id=id;
		this.category=category;
		this.description=description;
		this.status=status;
		this.zone=zone;
		this.unitarea=unitarea;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public double getUnitarea() {
		return unitarea;
	}

	public void setUnitarea(double unitarea) {
		this.unitarea = unitarea;
	}

	@Override
	public String toString() {
		return "UnitAreaValue [id=" + id + ", category=" + category + ", description=" + description + ", status="
				+ status + ", zone=" + zone + ", unitarea=" + unitarea + "]";
	}
	
}
