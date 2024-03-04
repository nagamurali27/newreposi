package com.onesoft.firstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onesoft.firstproject.entity.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {

}
