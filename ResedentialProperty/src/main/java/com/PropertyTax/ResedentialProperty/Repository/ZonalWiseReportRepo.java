package com.PropertyTax.ResedentialProperty.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PropertyTax.ResedentialProperty.Entity.ZonalWiseReport;

@Repository
public interface ZonalWiseReportRepo extends JpaRepository<ZonalWiseReport,Long>{
	
	
}
