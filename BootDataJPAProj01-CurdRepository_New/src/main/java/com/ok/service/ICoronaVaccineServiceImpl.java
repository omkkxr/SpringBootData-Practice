package com.ok.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ok.entity.CoronaVaccine;
import com.ok.repo.CoronaVaccineRepo;

@Service
public class ICoronaVaccineServiceImpl implements ICoronaVaccineService {

	@Autowired
	private CoronaVaccineRepo repo;

	@Override
	public Optional<CoronaVaccine> fetchDetailById(long ID) {
		Optional<CoronaVaccine> opt=repo.findById(ID);
				return opt;
	}
	@Override
	public Iterable<CoronaVaccine> fetchAllDetails() {
		return repo.findAll();
	}
	@Override
	public Iterable<CoronaVaccine> fetchAllByIds(Iterable<Long> ids) {
		return repo.findAllById(ids);
	}
	@Override
	public boolean CheckRecordAvailability(Long id) {
		return repo.existsById(id);
	}
	@Override
	public Long GetTotalRowCount() {
		return repo.count();
	}
	/*----------------------------------Delete Methods----------------------------------*/
	@Override
	public String deleteVaccineById(Long id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "Record deleted with id : "+id;
		}else {
			return "Record not found with id : "+id;
		}
	}
	@Override
	public String deleteVaccineByEntity(CoronaVaccine cv) {
		if(repo.existsById(cv.getRegNo())) {
			repo.delete(cv);
			return "Record deleted with id  : "+cv.getRegNo();
		}else {
			return "Record not found with id  : "+cv.getRegNo();
		}
	}
	@Override
	public String deleteVaccineByIds(Iterable<Long> id) {
		int count=((List<Long>)id).size();
		Iterable<CoronaVaccine> listEntites=repo.findAllById(id);
		if(((List<CoronaVaccine>)listEntites).size()==count){
			repo.deleteAllById(id);
			return count+"Record are deleted";
		}else {
			return "problem in Finding records";
		}
	}
	@Override
	public String deleteVaccineByEntities(Iterable<CoronaVaccine> vaccine) {
		int count=((List<CoronaVaccine>) vaccine).size();
		int  counter=0;
		for(CoronaVaccine vac : vaccine) {
			Long reg=vac.getRegNo();
			if(repo.existsById(reg)) {
				counter++;
			}
		}
		if(count==counter) {
			repo.deleteAll(vaccine);
			return count+" no of records are deleted.";
		}else {
			return "Problem in finding all the records";
		}
	}
	@Override
	public String deleteAllRecords() {
		Long count=repo.count();
		repo.deleteAll();
		return count+" records are deleted";
	}
}
