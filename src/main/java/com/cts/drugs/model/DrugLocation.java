package com.cts.drugs.model;

import javax.persistence.ManyToOne;

public class DrugLocation {
	
	private int id;
	private String name;
	private int quantity;
	private int availableStock;
	
	@ManyToOne
	private Drug drug;
}
