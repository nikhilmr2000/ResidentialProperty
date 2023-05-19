package com.PropertyTax.ResedentialProperty.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PropertyTax.ResedentialProperty.Entity.UnitAreaValue;

@Repository
public interface UnitAreaValueRepo extends JpaRepository<UnitAreaValue,Long>{
	
}
