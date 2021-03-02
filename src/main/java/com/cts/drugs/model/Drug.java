package com.cts.drugs.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Drug {
	
	@Id
	private int id;
	private String name;
	private String manufacturer;
	private Date manufacturedDate;
	private Date expiryDate;
	private int packageUnits;
	private double costPerPackage;
	
	@OneToMany(mappedBy = "drug")
	private List<DrugLocation> locations;
	

}
