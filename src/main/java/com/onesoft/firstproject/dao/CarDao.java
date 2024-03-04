package com.onesoft.firstproject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onesoft.firstproject.entity.Car;
import com.onesoft.firstproject.repository.CarRepository;

@Repository
public class CarDao {

	@Autowired
	CarRepository cr;

	public String setData(Car e) {
		cr.save(e);
		return "save successfully";
	}
	
	public List<Car> getalldetails() {
		return cr.findAll();
	}

	public String setAllData(List<Car> a) {
		cr.saveAll(a);
		return "saveAll successfully";
	}
	
	public List<Car> updatedprice(List<Car> b) {
	return	cr.saveAll(b);
	}
	
	public String setlist(List<Car> a) {
		return "list saved successfully";
	}
	
	
	public Car gettingId(int a) {
		return cr.findById(a).get();
	}
	
	public String updateddata(Car a) {
		 cr.save(a);								
		return"yeah the data got updated";
	}

	public String patchedprice(int a, Car a1) {
		Car a2= cr.findById(a).get();
		a2.setPrice(a1.getPrice());
		cr.save(a2);
		return "patched successfully";
		
	}

	
	
	}
