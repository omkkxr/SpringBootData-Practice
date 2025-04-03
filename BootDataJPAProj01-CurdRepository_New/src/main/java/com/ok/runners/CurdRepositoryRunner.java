package com.ok.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.ok.entity.CoronaVaccine;
import com.ok.repo.CoronaVaccineRepo;
import com.ok.service.ICoronaVaccineService;

@Component
public class CurdRepositoryRunner implements CommandLineRunner {

	@Autowired
	ICoronaVaccineService service;
	@Autowired
	CoronaVaccineRepo repo;

	@Override
	public void run(String... args) throws Exception {
		/* --------------------------------findById(ID id)------------------------------------- 
		  try { 
		 Long id = 1L;
		 Optional<CoronaVaccine> opt = service.fetchDetailsById(id); 
		 if(opt.isPresent()) { 
		 System.out.println(opt.get()); 
		 } else {
		  System.out.println("No record found with ID : " + id); 
		  }
		  } catch(DataAccessException dae) { 
		  dae.printStackTrace(); 
		  }*/

		/*--------------------------------findAll()------------------------------------
		  try { 
		  service.fetchAllDetails().forEach(System.out::println); 
		  }catch (DataAccessException dae) { 
		  dae.printStackTrace();
		   }*/

		/* --------------------------------findAllById(Iterable<ID> id)------------------------------------- 
		  try {
		   service.fetchAllByIds(List.of(1L,2L,3L,5L,6L)).forEach(System.out::println);
		  }catch(DataAccessException dae){ 
		  dae.printStackTrace();
		    }*/
		
		/* --------------------------------exitsById(ID id)------------------------------------- 
		 try {
		 if(service.CheckRecordAvailability(2L)) {
		  System.out.println("Record found with ID : "+2); 
		  }else {
		  System.out.println("Record not found with ID : "+2); 
		  }
		  }catch(DataAccessException dae) { 
		  dae.printStackTrace(); 
		  }*/
		
		/* --------------------------------count()-------------------------------------
		 try { 
		 System.out.println(service.GetTotalRowCount());
		  }catch(DataAccessException dae) { 
		  dae.printStackTrace(); 
		  }*/
		
		/* --------------------------------deleteByeId(ID id)------------------------------------- 
		 try {
		  System.out.println(service.deleteVaccineById(4L)); 
		  }catch(DataAccessException dae) { 
		  dae.printStackTrace(); 
		  } */
    
		/* --------------------------------delete(T entity)------------------------------------- 
		 try { 
		 CoronaVaccine cv = new CoronaVaccine(6L,null,null,null,400.0,3);
		 System.out.println(service.deleteVaccineByEntity(cv)); 
		  } catch(DataAccessException dae) { 
		  dae.printStackTrace(); 
		  }
		 */
		/*--------------------------------delete(Iterable<? extends ID>ids)------------------------------------- 
		  try {
		 System.out.println(service.deleteVaccineByIds(List.of(6L,5L,4L)));
		  }catch(DataAccessException dae) { 
		  dae.printStackTrace(); 
		  } */
		/*--------------------------------deleteAll(Iterable<? extends T> entities)------------------------------------- 
		 try { 
		  CoronaVaccine cv1=newCoronaVaccine(); 
		  cv1.setRegNo(5L); 
		  CoronaVaccine cv2=new CoronaVaccine();
		  cv2.setRegNo(6L); 
		  CoronaVaccine cv3=new CoronaVaccine(); 
		  cv3.setRegNo(9L);
		  System.out.println(service.deleteVaccineByEntities(List.of(cv1,cv2,cv3)));
		  }catch(DataAccessException dae) { 
		  dae.printStackTrace(); 
		  }*/
		/* --------------------------------deleteAll()----------------------------------
		 try { System.out.println(service.deleteAllRecords());
		  }catch(DataAccessException dae) { 
		  dae.printStackTrace();
		   }*/
		 
		/*-----------------------------------------insertion method-------------------------------------------
		 try {
		 
			repo.saveAll(List.of(new CoronaVaccine("sputnik1", "Russie","Russia",527.8, 2),
				                               new CoronaVaccine("pyzer1", "pyzer","USA",648.8, 2),
				                               new CoronaVaccine("moderena1", "moderena","USA",415.8, 2)));
		} catch (DataAccessException dae) {
			dae.printStackTrace();
		}*/
	}
}
