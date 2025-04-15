package com.ok.service;

import java.util.List;

import com.ok.entity.CoronaVaccine;

public interface ICoronaVaccineService {
	public List<CoronaVaccine>  searchVaccineByGivenData(CoronaVaccine vc,Boolean asc,String... properties);
}
