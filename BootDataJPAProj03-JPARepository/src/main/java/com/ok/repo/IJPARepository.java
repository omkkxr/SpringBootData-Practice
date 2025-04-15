package com.ok.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ok.entity.CoronaVaccine;

public interface IJPARepository extends JpaRepository<CoronaVaccine, Long> {

}
