package com.endava.springMvcToDoApp.rootContext.dao;

import com.endava.springMvcToDoApp.rootContext.entities.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface RecordDao extends JpaRepository<Record, Long> {

}
