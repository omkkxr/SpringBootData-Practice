package com.ok.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.ok.entity.CoronaVaccine;

public interface ICoronaVaccineRepository extends PagingAndSortingRepository<CoronaVaccine, Long> {

}
