package com.onesoft.firstproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "Car_details")
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	
	private String brand;
	private int price;
//	@Transient
	private String color;
	private boolean isPetrol;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPetrol() {
		return isPetrol;
	}

	public void setPetrol(boolean isPetrol) {
		this.isPetrol = isPetrol;
	}

}
