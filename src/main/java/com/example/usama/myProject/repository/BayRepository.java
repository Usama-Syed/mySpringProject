package com.example.usama.myProject.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.usama.myProject.bean.BayBean;
import com.example.usama.myProject.entity.Bay;

@Repository
public interface BayRepository extends CrudRepository<Bay, Long> {
	
	@Query("select new com.example.usama.myProject.bean.BayBean(bay.bayCod, bay.baySeq) " +
				"from Bay bay " +
			    " where bay.bayId = :bayId")
	BayBean getBayMainInfo(Long bayId);
	
}
