package com.onesoft.firstproject.service;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onesoft.firstproject.dao.CarDao;
import com.onesoft.firstproject.entity.Car;
import com.onesoft.firstproject.exception.ColorException;
import com.onesoft.firstproject.repository.CarRepository;

@Service
public class CarService {
	@Autowired
	CarDao cd;

	@Autowired
	private CarRepository carRepository;

	public String setData(Car e) {

		carRepository.save(e);
		return "save successfully";
//		return cd.setData(e);
	}

	public List<Car> getalldetails() {
		return cd.getalldetails();
	}

	public String setAllData(List<Car> a) {

		return cd.setAllData(a);
	}

	public List<Car> getbrand(String brand) {
		List<Car> newCar = cd.getalldetails();
		List<Car> a = newCar.stream().filter(x -> x.getBrand().equals(brand)).collect(Collectors.toList());

		return a;
	}

	public List<Car> getcolor(String color) throws ColorException { // colorexception doubt
		List<Car> newCar = cd.getalldetails();
		List<Car> b = newCar.stream().filter(x -> x.getColor().equals(color)).collect(Collectors.toList());
		if (cd.getalldetails().isEmpty()) {
			throw new ColorException("color illai nanba");
		} else {
			return cd.getalldetails();
		}
	}

	public List<Car> getprice(int price) {
		List<Car> nwCr = cd.getalldetails();
		List<Car> c = nwCr.stream().filter(x -> x.getPrice() >= price).collect(Collectors.toList());
		return c;
	}

	public Car max() {
		List<Car> newCar = cd.getalldetails();
		Car a = newCar.stream().max(Comparator.comparingInt(Car::getPrice)).get();
		return a;
	}

	public List<Car> updatedprice(int price) {
		List<Car> newCarzz = cd.getalldetails();
		List<Car> d = newCarzz.stream().filter(x -> x.getPrice() > price)
				.peek(x -> x.setPrice(x.getPrice() - x.getPrice() * 20 / 100)).collect(Collectors.toList());
		return cd.updatedprice(d);
	}

	public String setlist(List<Car> a) {
		return cd.setlist(a);
	}

	public Car gettingId(int a) {

		return cd.gettingId(a);
	}

	public String updateddata(Car a) { // postman la varala!!!!!!!!
		return cd.updateddata(a);
	}

	public String patchedprice(int a, Car a1) {

		return cd.patchedprice(a, a1);
	}

}
