package com.ok.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.ok.entity.CoronaVaccine;
import com.ok.service.ICoronaVaccineService;

@Component
public class CurdRepositoryRunner implements CommandLineRunner {

	@Autowired
	private ICoronaVaccineService service;
	
	@Override
	public void run(String... args) throws Exception {
		try {
		CoronaVaccine vaccine=new CoronaVaccine();
		vaccine.setCompany("Russie");
		vaccine.setPrice(527.8);
		service.searchVaccineByGivenData(vaccine,false,"price").forEach(System.out::println);;
		}catch (DataAccessException e) {
			e.printStackTrace();
		}
	}

	
}
