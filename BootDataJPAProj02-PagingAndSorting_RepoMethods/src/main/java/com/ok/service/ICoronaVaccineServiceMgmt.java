package com.ok.service;


import com.ok.entity.CoronaVaccine;

public interface ICoronaVaccineServiceMgmt {
	public Iterable<CoronaVaccine> fetchAllDetails(Boolean asc,String ...properties);
	public Iterable<CoronaVaccine> fetchDetailsByPageNo(int pageNo,int pageSize,boolean asc,String... properties);
	public void fetchDetailsbyPagination(int pageSize) ;
}
