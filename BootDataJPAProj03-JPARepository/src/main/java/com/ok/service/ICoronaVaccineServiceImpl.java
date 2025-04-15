package com.ok.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.ok.entity.CoronaVaccine;
import com.ok.repo.IJPARepository;

@Service
public class ICoronaVaccineServiceImpl implements ICoronaVaccineService {

	@Autowired
	private IJPARepository repo;
	
	@Override
	public List<CoronaVaccine> searchVaccineByGivenData(CoronaVaccine vc, Boolean asc, String... properties) {
		Example<CoronaVaccine> example=Example.of(vc);
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC,properties);
		List<CoronaVaccine> cvv=repo.findAll(example, sort);
		return cvv;
	}


}
