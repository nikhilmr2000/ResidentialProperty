package com.PropertyTax.ResedentialProperty.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.PropertyTax.ResedentialProperty.Entity.PropertyTaxForm;
import com.PropertyTax.ResedentialProperty.Entity.UnitAreaValue;
import com.PropertyTax.ResedentialProperty.Entity.ZonalWiseReport;
import com.PropertyTax.ResedentialProperty.Repository.PropertyTaxFormRepo;
import com.PropertyTax.ResedentialProperty.Repository.UnitAreaValueRepo;
import com.PropertyTax.ResedentialProperty.Repository.ZonalWiseReportRepo;

@Service
public class UnitAreaValueService {
	
	@Autowired
	public UnitAreaValueRepo unitRepo;
	
	@Autowired
	public PropertyTaxFormRepo propertyRepo;
	
	@Autowired
	public ZonalWiseReportRepo zonalwiseReportRepo;
	
	
	public UnitAreaValue defaultUnitAreaValueSetup() {
		
		UnitAreaValue unitValue1=new UnitAreaValue();
		UnitAreaValue unitValue2=new UnitAreaValue();
		UnitAreaValue unitValue3=new UnitAreaValue();
		UnitAreaValue unitValue4=new UnitAreaValue();
		UnitAreaValue unitValue5=new UnitAreaValue();
		UnitAreaValue unitValue6=new UnitAreaValue();
		UnitAreaValue unitValue7=new UnitAreaValue();
		UnitAreaValue unitValue8=new UnitAreaValue();
		UnitAreaValue unitValue9=new UnitAreaValue();
		UnitAreaValue unitValue10=new UnitAreaValue();
		UnitAreaValue unitValue11=new UnitAreaValue();
		UnitAreaValue unitValue12=new UnitAreaValue();
		UnitAreaValue unitValue13=new UnitAreaValue();
		UnitAreaValue unitValue14=new UnitAreaValue();
		UnitAreaValue unitValue15=new UnitAreaValue();
		UnitAreaValue unitValue16=new UnitAreaValue();
		UnitAreaValue unitValue17=new UnitAreaValue();
		UnitAreaValue unitValue18=new UnitAreaValue();
		
		
		if(unitRepo.count()==0) {
			
			
			unitValue1.setCategory("I");
			unitValue1.setDescription("RCC buildings");
			unitValue1.setStatus("Tenanted");
			unitValue1.setZone("Zone A");
			unitValue1.setUnitarea(5.00);
			
			unitRepo.save(unitValue1);
			
			
			unitValue2.setCategory("I");
			unitValue2.setDescription("RCC buildings");
			unitValue2.setStatus("Tenanted");
			unitValue2.setZone("Zone B");
			unitValue2.setUnitarea(4.00);
			
			unitRepo.save(unitValue2);
			
			unitValue3.setCategory("I");
			unitValue3.setDescription("RCC buildings");
			unitValue3.setStatus("Tenanted");
			unitValue3.setZone("Zone C");
			unitValue3.setUnitarea(3.60);
			
			unitRepo.save(unitValue3);
			
		
			unitValue4.setCategory("I");
			unitValue4.setDescription("RCC buildings");
			unitValue4.setStatus("Owner");
			unitValue4.setZone("Zone A");
			unitValue4.setUnitarea(2.50);
			
			unitRepo.save(unitValue4);
			
			unitValue5.setCategory("I");
			unitValue5.setDescription("RCC buildings");
			unitValue5.setStatus("Owner");
			unitValue5.setZone("Zone B");
			unitValue5.setUnitarea(2.00);
			
			unitRepo.save(unitValue5);
			
			unitValue6.setCategory("I");
			unitValue6.setDescription("RCC buildings");
			unitValue6.setStatus("Owner");
			unitValue6.setZone("Zone C");
			unitValue6.setUnitarea(1.80);
			
			unitRepo.save(unitValue6);
			
			unitValue7.setCategory("II");
			unitValue7.setDescription("RCC buildings with cement of red-oxide floorings");
			unitValue7.setStatus("Tenanted");
			unitValue7.setZone("Zone A");
			unitValue7.setUnitarea(4.00);
			
			unitRepo.save(unitValue7);
			
			unitValue8.setCategory("II");
			unitValue8.setDescription("RCC buildings with cement of red-oxide floorings");
			unitValue8.setStatus("Tenanted");
			unitValue8.setZone("Zone B");
			unitValue8.setUnitarea(3.50);
			
			
			unitRepo.save(unitValue8);
			
			unitValue9.setCategory("II");
			unitValue9.setDescription("RCC buildings with cement of red-oxide floorings");
			unitValue9.setStatus("Tenanted");
			unitValue9.setZone("Zone C");
			unitValue9.setUnitarea(3.00);
			
			unitRepo.save(unitValue9);
			
			unitValue10.setCategory("II");
			unitValue10.setDescription("RCC buildings with cement of red-oxide floorings");
			unitValue10.setStatus("Owner");
			unitValue10.setZone("Zone A");
			unitValue10.setUnitarea(1.80);
			
			unitRepo.save(unitValue10);
			
			unitValue11.setCategory("II");
			unitValue11.setDescription("RCC buildings with cement of red-oxide floorings");
			unitValue11.setStatus("Owner");
			unitValue11.setZone("Zone B");
			unitValue11.setUnitarea(1.60);
			

			unitRepo.save(unitValue11);
			
			unitValue12.setCategory("II");
			unitValue12.setDescription("RCC buildings with cement of red-oxide floorings");
			unitValue12.setStatus("Owner");
			unitValue12.setZone("Zone C");
			unitValue12.setUnitarea(1.20);
			
			unitRepo.save(unitValue12);
			
			unitValue13.setCategory("III");
			unitValue13.setDescription("Tiled/Sheet of all kinds");
			unitValue13.setStatus("Tenanted");
			unitValue13.setZone("Zone A");
			unitValue13.setUnitarea(3.00);
			
			unitRepo.save(unitValue13);
			
			unitValue14.setCategory("III");
			unitValue14.setDescription("Tiled/Sheet of all kinds");
			unitValue14.setStatus("Tenanted");
			unitValue14.setZone("Zone B");
			unitValue14.setUnitarea(2.50);
			
			unitRepo.save(unitValue14);
			
			unitValue15.setCategory("III");
			unitValue15.setDescription("Tiled/Sheet of all kinds");
			unitValue15.setStatus("Tenanted");
			unitValue15.setZone("Zone C");
			unitValue15.setUnitarea(2.00);
			
			unitRepo.save(unitValue15);
			
			unitValue16.setCategory("III");
			unitValue16.setDescription("Tiled/Sheet of all kinds");
			unitValue16.setStatus("Owner");
			unitValue16.setZone("Zone A");
			unitValue16.setUnitarea(1.25);
			
			unitRepo.save(unitValue16);
			
			unitValue17.setCategory("III");
			unitValue17.setDescription("Tiled/Sheet of all kinds");
			unitValue17.setStatus("Owner");
			unitValue17.setZone("Zone B");
			unitValue17.setUnitarea(1.00);
			
			unitRepo.save(unitValue17);
			
			unitValue18.setCategory("III");
			unitValue18.setDescription("Tiled/Sheet of all kinds");
			unitValue18.setStatus("Owner");
			unitValue18.setZone("Zone C");
			unitValue18.setUnitarea(0.75);
			
			unitRepo.save(unitValue18);
			
			
		}
		
		return unitValue1;
		
	}
	
	public UnitAreaValue saveUnitAreaValue(UnitAreaValue unitArea) {
		
		UnitAreaValue unitAreaValue=unitRepo.save(unitArea);
		return unitAreaValue;		
		
	}
	
	public double getPropertyTaxForm(PropertyTaxForm propertyForm) {
		 
		List<UnitAreaValue> allUnitAreaValues=unitRepo.findAll();
		
		for(UnitAreaValue unitValue : allUnitAreaValues) {
			if(unitValue.getDescription().equals(propertyForm.getDescription()) && unitValue.getStatus().
					equals(propertyForm.getStatus()) && unitValue.getZone().equals(propertyForm.getZone())) {
				
				
				
				double unitValues=unitValue.getUnitarea();
				
				
				//Steps to calculate the total property tax
				
				double total_1=propertyForm. getBuildarea()* unitValues *10;
				
				
				long yearsconstructed=propertyForm.getYear()-propertyForm.getBuildyear();
				
				if(yearsconstructed<0) {
					yearsconstructed=0;
				}
				
				double depreciation=0;
				
				if(yearsconstructed>=60) {
					depreciation=60;
				}
				else {
					depreciation=yearsconstructed;
				}
				
				double total_2=total_1 - (depreciation/100);
				
				double total_3=total_2 * (0.2);
					
				double total_4=total_3 *(0.24);
				
				double total_5=total_3 + total_4;
				
				return total_5;
				
			}
			
		}
		return 0;
		
	}
	
	public PropertyTaxForm savePropertyFormTax(PropertyTaxForm propertyTax,double tax) {
	
		propertyTax.setTax(tax);
		
		PropertyTaxForm propertyTaxForm=propertyRepo.save(propertyTax);
		
		
		
			ZonalWiseReport zone=new ZonalWiseReport();
		
			zone.setZone(propertyTax.getZone());
			zone.setAmount(propertyTax.getTax());
			zone.setYear(propertyTax.getYear());
			zone.setStatus(propertyTax.getStatus());

			zonalwiseReportRepo.save(zone);
			
		
		
		return propertyTaxForm;
		
	}
	
	
	//Zonal Wise Calculation based on years
	
	public List<PropertyTaxForm> getAllPropertyTaxForm(){
		
		List<PropertyTaxForm> allTaxForms=propertyRepo.findAll();
		
		return allTaxForms;
		
	}
	
	
	
	public List<Long> getAllYears(){

		List<PropertyTaxForm> allProperty=propertyRepo.findAll();
		
		
		List<Long> allYears=new ArrayList<>();
		
		
		for(PropertyTaxForm years: allProperty) {
			if(allYears.size()==0) {
				allYears.add(years.getYear());
			}
			else {
				
				boolean exist=false;
				
				for(Long num:allYears) {
					if(num==years.getYear()) {
						exist=true;
						break;
					}
				}
				
				if(exist==false) {
					allYears.add(years.getYear());
				}
			}
		}
		
		return allYears;
		
	}
	
	
	public List<ZonalWiseReport> allZonalWiseReport(){
		
		return zonalwiseReportRepo.findAll();
		
	}
	
}

