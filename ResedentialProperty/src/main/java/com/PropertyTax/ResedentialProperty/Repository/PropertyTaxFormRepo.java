
package com.PropertyTax.ResedentialProperty.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PropertyTax.ResedentialProperty.Entity.PropertyTaxForm;

@Repository
public interface PropertyTaxFormRepo extends JpaRepository<PropertyTaxForm,Long>{

}
