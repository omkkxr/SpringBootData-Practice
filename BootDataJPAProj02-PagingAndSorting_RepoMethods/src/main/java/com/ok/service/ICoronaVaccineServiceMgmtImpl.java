package com.ok.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.ok.entity.CoronaVaccine;
import com.ok.repo.ICoronaVaccineRepository;

@Service
public class ICoronaVaccineServiceMgmtImpl implements ICoronaVaccineServiceMgmt {

	@Autowired
	private ICoronaVaccineRepository repo;

	@Override
	public Iterable<CoronaVaccine> fetchAllDetails(Boolean asc, String... properties) {
		Sort sort = Sort.by(asc ? Direction.ASC : Direction.DESC, properties);
		return repo.findAll(sort);
	}

	@Override
	public Iterable<CoronaVaccine> fetchDetailsByPageNo(int pageNo, int pageSize, boolean asc, String... properties) {
		Pageable pagealbe = PageRequest.of(pageNo, pageSize, asc ? Direction.ASC : Direction.DESC, properties);
		Page<CoronaVaccine> page = repo.findAll(pagealbe);
		return page.getContent();
	}
	@Override
	public void fetchDetailsbyPagination(int pageSize) {

		long count=9;

		long pagesCount=count/pageSize;
		 pagesCount=count%pageSize==0?pagesCount:++pagesCount;
		 
		 for(int i=0;i<pagesCount;++i) {
			 Pageable pageable=PageRequest.of(i, pageSize);
			 Page<CoronaVaccine> page=repo.findAll(pageable);
			 page.getContent().forEach(System.out::println);
			 System.out.println("-------------"+(i+1) +"of "+page.getTotalPages()+"---------------");
		 }
	}
}
