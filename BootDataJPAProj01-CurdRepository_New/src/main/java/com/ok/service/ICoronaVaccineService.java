package com.ok.service;

import java.util.Optional;


import com.ok.entity.CoronaVaccine;


public interface ICoronaVaccineService {
	/*-----------------Finder Methods---------------------------------*/
	public Optional<CoronaVaccine> fetchDetailById(long ID); 
	public Iterable<CoronaVaccine> fetchAllDetails();
	public Iterable<CoronaVaccine> fetchAllByIds(Iterable<Long> ids);
	public boolean CheckRecordAvailability(Long id);
	public Long GetTotalRowCount();
	
	/*-----------------Delete Methods---------------------------------*/
	public String deleteVaccineById(Long id);
	public String deleteVaccineByEntity(CoronaVaccine cv);
	public String deleteVaccineByIds(Iterable<Long> id);
	public String deleteVaccineByEntities(Iterable<CoronaVaccine> vaccine);
	public String deleteAllRecords();
}
