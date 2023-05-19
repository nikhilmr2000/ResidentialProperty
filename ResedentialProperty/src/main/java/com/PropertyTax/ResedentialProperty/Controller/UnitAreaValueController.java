package com.PropertyTax.ResedentialProperty.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PropertyTax.ResedentialProperty.Entity.PropertyTaxForm;
import com.PropertyTax.ResedentialProperty.Entity.UnitAreaValue;
import com.PropertyTax.ResedentialProperty.Entity.ZonalWiseReport;
import com.PropertyTax.ResedentialProperty.Service.UnitAreaValueService;

@RestController
public class UnitAreaValueController {
	
	@Autowired
	public UnitAreaValueService unitAreaService;
	

	@PostMapping("/saveUnitArea")
	public UnitAreaValue saveUnitAreaValue(@RequestBody UnitAreaValue unitAreaValue) {
		
		UnitAreaValue unitArea=unitAreaService.saveUnitAreaValue(unitAreaValue);
		return unitArea;
		
	}
	
	@PostMapping("/getPropertyTax")
	public double getPropertyTaxForm(@RequestBody PropertyTaxForm propertyTaxForm) {
		double property=unitAreaService.getPropertyTaxForm(propertyTaxForm);
		return property; 
	}
	
	@PostMapping("/savePropertyTax/{tax}")
	public PropertyTaxForm savePropertyTaxForm(@RequestBody PropertyTaxForm property,@PathVariable double tax) {
		
		PropertyTaxForm saveProperty=unitAreaService.savePropertyFormTax(property,tax);
		return saveProperty;
		
	}
	
	@GetMapping("/getAllTaxForms")
	public List<PropertyTaxForm> getAllTaxForms(){
		return unitAreaService.getAllPropertyTaxForm();
	}
	
	@GetMapping("/allzonalReport")
	public List<ZonalWiseReport> getAllZonalWiseReport(){
		return unitAreaService.allZonalWiseReport();
	}
	
}
