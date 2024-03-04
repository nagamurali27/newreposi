package com.onesoft.firstproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PatchExchange;

import com.onesoft.firstproject.entity.Car;
import com.onesoft.firstproject.exception.ColorException;
import com.onesoft.firstproject.service.CarService;

@RestController
public class CarController {
	@Autowired
	CarService cs;

	@PostMapping(value = "/Savedata")
	public String setData(@RequestBody Car e) {
		return cs.setData(e);
	}
	
	@GetMapping(value="/getalldetails")
	public List<Car> getalldetails() {
		return cs.getalldetails();
	}
	
	@PostMapping("setAllData")
	public String setAllData(@RequestBody List<Car> a) {
		return cs.setAllData(a);
	}
	
	@GetMapping("getbrand/{brand}")
	public List<Car> getbrand(@PathVariable String brand) {
		return cs.getbrand(brand);
	}
	
	@GetMapping("getcolor/{color}")
	public List<Car> getcolor(@PathVariable String color) throws ColorException {
		return cs.getcolor(color);
	}
	
	@GetMapping("getprice/{price}")
	public List<Car> getprice(@PathVariable int price) {
		return cs.getprice(price);
	}
	
	@GetMapping("getmax")
	public Car max() {
		return cs.max();
	}
	
	@PutMapping("updated/{price}")
	public List<Car> updatedprice(@PathVariable int price) {
		return cs.updatedprice(price);
	}
	
	@PatchMapping("/patchupdate/{a}")
	public String patchedprice(@PathVariable int a, @RequestBody Car a1){
		return cs.patchedprice(a,a1);
	}
	
	@PostMapping("setting_as_list1") 
	public String setlist(@RequestBody List<Car> a) {
		return cs.setlist(a);
	}
	
	@GetMapping("findingbyId/{a}")
	public Car gettingId(@PathVariable int a) {
		return cs.gettingId(a);
	}
	
	@PutMapping("updated_data")
	public String updateddata(@RequestBody Car a) {
		return cs.updateddata(a);
	}
	
	

}
