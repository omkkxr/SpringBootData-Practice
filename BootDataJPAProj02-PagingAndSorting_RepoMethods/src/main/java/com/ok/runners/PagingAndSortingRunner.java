package com.ok.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.ok.entity.CoronaVaccine;
import com.ok.service.ICoronaVaccineServiceMgmt;

@Component
public class PagingAndSortingRunner implements CommandLineRunner {

	@Autowired
	private ICoronaVaccineServiceMgmt service;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * try {
			Iterable<CoronaVaccine> listEntities=service.fetchAllDetails(true,"price","name");
			listEntities.forEach(System.out::println);
		}catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		*/
		
		/*
		try {
			service.fetchDetailsByPageNo(3, 2, true, "price").forEach(System.out::println);
			
		}catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		*/
		try {
			service.fetchDetailsbyPagination(3);
		}catch(DataAccessException dae) {
			dae.printStackTrace();
		}
	}

}
